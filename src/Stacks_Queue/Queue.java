package Stacks_Queue;

public class Queue {
	private int[] arr;
	private int front = 0;
	private int size = 0;
	
	public Queue() {
		arr = new int[5];
	}
	
	public Queue(int n) {
		arr = new int[n];
	}
	
	//O(1)
	public boolean isEmpty() {
		return size == 0;
	}
	
	//O(1)
		public boolean isFull() {
			return size == arr.length;
		}
	
	//O(1)
	public void Enqueue(int item) throws Exception{
		if(isFull()) {
			throw new Exception("Bklol Queue Full Hai");
		}
		int idx = (front + size) % arr.length;
		arr[idx] = item;
		size++;
	}
	
	//O(1)
	public int Dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Bklol Queue Khali Hai");
		}
		int rv = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return rv;
	}
	
	//O(1)
		public int getFront() throws Exception{
			if(isEmpty()) {
				throw new Exception("Bklol Queue Khali Hai");
			}
			int rv = arr[front];
			return rv;
		}
	
	//O(1)
	public int size() {
		return size;
	}
	
	//O(N)
	public void Display() {
		for(int i=0; i<size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}
}
