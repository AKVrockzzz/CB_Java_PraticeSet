package RevisionSet2_String;

public class Check_Cb_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "82819";
		Substring(str);
	}
	public static void Substring(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for(int len = 1; len<=str.length(); len++) {
			for(int j=len; j<=str.length(); j++) {
				int i = j-len;
				String s = str.substring(i,j);
				if(IsCbNumber(Long.parseLong(s)) == true && IsVisited(visited, i, j-1) == true) {
					count++;
					for(int k=i; k<j; k++) {
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(count);
	}
	public static boolean IsVisited(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for(int k = i; k<=j; k++) {
			if(visited[k] == true) return false;
		}
		return true;
	}
	public static boolean IsCbNumber(long num) {
		if(num == 0 || num == 1) return false;
		int[] arr = {2,3,5,7,11,13,17,19,23,29};
		for(int i=0; i<arr.length; i++) {
			if(num == arr[i]) return true;
		}
		for(int i=0; i<arr.length; i++) {
			if(num % arr[i] == 0) return false;
		}
		return true;
	}

}
