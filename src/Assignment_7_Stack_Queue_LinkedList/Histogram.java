package Assignment_7_Stack_Queue_LinkedList;
import java.util.*;
public class Histogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Area(arr));
	}
	
	public static int Area(int[] height) {
		int area = 0;
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<height.length; i++) {
			while(!st.isEmpty() && height[i] < height[st.peek()]) {
				int h = height[st.pop()];
				int r = i;
				if(!st.isEmpty()) {
					int l = st.peek();
					area = Math.max(area, h * (r-l-1));
				}
				else {
					area = Math.max(area, h * r);;
				}
			}
			st.push(i);
		}
		int r = height.length;
		while(!st.isEmpty()) {
			int h = height[st.pop()];
			if(!st.isEmpty()) {
				int l = st.peek();
				area = Math.max(area, h * (r-l-1));
			}
			else {
				area = Math.max(area, h * r);
			}
		}
		return area;
	}
}
