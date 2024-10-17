package Stacks_Queue_Implementation;

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
	
	public boolean isempty() {
		return size == 0;
	}
	
	public void Equeue(int item) {
		int idx = (front + size) % arr.length;
		arr[idx] = item;
		size++;
	}
	
	public int getfront() {
		int rv = arr[front];
		return rv;
	}
	
	public int Dequeue() {
		int rv = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return rv;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isfull() {
		return size == arr.length;
	}
	
	public void Display() {
		for(int i=0; i<size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}
}
