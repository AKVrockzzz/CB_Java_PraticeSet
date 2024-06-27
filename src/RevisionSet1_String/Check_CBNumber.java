package RevisionSet1_String;

import java.util.Scanner;

public class Check_CBNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		print(s);

	}
	public static void print(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for(int len = 1; len<=str.length(); len++) {
			for(int j=len; j<=str.length(); j++) {
				int i = j-len;
				String s = str.substring(i,j);
				if(Is_CB_Number(Long.parseLong(s)) == true && Isvisited(visited,i,j-1) == true) {
					count++;
					for(int k=i; k<j; k++) {
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(count);
	}
	
	
	public static boolean Isvisited(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for(int k = i; k<=j; k++) {
			if(visited[k]==true) return false;
		}
		return true;
	}
	
	
	public static boolean Is_CB_Number(long num) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		//point 1
		if(num == 0 || num == 1) return false;
		// point 2
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) return true;
		}
		// point 3
		for(int i=0; i<arr.length; i++) {
			if(num % arr[i] == 0) return false;
		}
		return true;
	}

}
