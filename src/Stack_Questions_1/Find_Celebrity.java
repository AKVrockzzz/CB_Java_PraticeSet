package Stack_Questions_1;
import java.util.*;
public class Find_Celebrity {

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		System.out.println(Celebrity(arr));
	}

	private static int Celebrity(int[][] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			st.push(i);
		}
		while(st.size()>1) {
			int a = st.pop();
			int b = st.pop();
			
			if(arr[a][b] == 1) {
				st.push(b);
			}
			else {
				st.push(a);
			}
		}
			
			int candidate = st.pop();
			for(int i=0; i<arr.length; i++) {
				if(i == candidate) continue;
				if(arr[candidate][i] == 1 || arr[i][candidate] == 0) {
					return -1;
				}
			}
		
		return candidate;
	}

}
