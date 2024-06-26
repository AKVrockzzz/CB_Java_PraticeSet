package assignment04_2DArray_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Painters_Partition_Problem_Java {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // Number of painters
        int N = sc.nextInt(); // Number of boards
        int[] size = new int[N];
        for (int i = 0; i < N; i++) {
            size[i] = sc.nextInt();
        }
        System.out.println(MinimumTime(size, K, N));
    }

    public static int MinimumTime(int[] size, int k, int n) {
        int lo = 0; // Minimum possible time
        int hi = 0;
        for (int i = 0; i < n; i++) {
            hi += size[i];
        }
        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (IsPossible(size, k, n, mid)) {
                ans = mid;
                hi = mid - 1; 
            } else {
                lo = mid + 1; 
            }
        }
        return ans;
    }

    public static boolean IsPossible(int[] size, int k, int n, int mid) {
        int painters = 1;
        int boardPaint = 0;

        for (int i = 0; i < n; i++) {
        	if(size[i] > mid) return false;
            if (boardPaint + size[i] <= mid) {
                boardPaint += size[i];
            } else {
                painters++;
                boardPaint = size[i];
                if (painters > k) {
                    return false;
                }
            }
        }
        return true;
    }
	
}


