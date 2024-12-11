package Stacks_Queue;

public class Stack {
	private int[] arr;
	private int idx = -1;
	
	public Stack() {
		arr = new int[5];
	}
	
	public Stack(int n) {
		arr = new int[n];
	}
	
	// O(1)
	public boolean isEmpty() {
		return idx == -1;
	}
	
	// O(1)
	public void push(int item) throws Exception{
		if(isFull()) {
			throw new Exception("Stacks Full Hai");
		}
		idx++;
		arr[idx] = item;
	}
	
	public int size() {
		return idx+1;
	}
	
	// O(1)
	public boolean isFull() {
		return idx == arr.length-1;
	}
	
	// O(1)
	public int pop() {
		int rv = arr[idx];
		idx--;
		return rv;
	}
	
	// O(1)
		public int peek() throws Exception{
			if(isEmpty()) {
				throw new Exception("Bklol Stacks Khali Hai");
			}
			int rv = arr[idx];
			return rv;
		}
	
	// O(N)
	public void Display() {
		for(int i=0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}