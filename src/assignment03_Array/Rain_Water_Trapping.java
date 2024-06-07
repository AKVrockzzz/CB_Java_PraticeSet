package assignment03_Array;
import java.util.*;
public class Rain_Water_Trapping {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();  // Corrected from arr[i] to arr[j]
            }
            System.out.println(Trapping(arr));
        }
        sc.close();
    }

    public static int Trapping(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        // Left max array
        int[] left = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }

        // Right max array
        int[] right = new int[n];
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        // Calculate the trapped water
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.min(left[i], right[i]) - arr[i];
        }
        return sum;
    }

}
