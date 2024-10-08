package Stack_Questions_1;
import java.util.*;
public class Largest_Rectangle_In_Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,4,6,1,7};
		System.out.println(Area(arr));
	}
	
	public static int Area(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int area = 0;
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if(!st.isEmpty()) {
					int l = st.peek();
					area = Math.max(area, h * (r - l - 1));
					
				}
				else {
					area = Math.max(area, h*r);
				}
			}
			st.push(i);
		}
		int r = arr.length;
		while(!st.isEmpty()) {
			int h = arr[st.pop()];
			if(!st.isEmpty()) {
				int l = st.peek();
				area = Math.max(area, h * (r - l - 1));
				
			}
			else {
				area = Math.max(area, h*r);
			}
		}
		return area;
	}

}
