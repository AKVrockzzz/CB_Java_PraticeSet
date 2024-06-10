package assignment03_Array;
import java.util.*;
public class Arrays_Target_Sum_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		Target_Sum_Triplets(arr,M);
	}

	public static void Target_Sum_Triplets(int[] arr, int M) {
        Sort(arr);
        int target = M;
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
    }
	public static void Sort(int[] arr) {
		for(int turn=1; turn<arr.length; turn++) {
			for(int i=0; i<arr.length-turn; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}

}
