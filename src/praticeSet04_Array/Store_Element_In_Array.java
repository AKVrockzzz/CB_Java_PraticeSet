package praticeSet04_Array;
import java.util.*;
public class Store_Element_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Read and Print elements of an array:                                                                          
//			-----------------------------------------                                                                     
//			Input 10 elements in the array :                                                                              
//			element - 0 : 1                                                                                               
//			element - 1 : 1                                                                                               
//			element - 2 : 2                                                                                               
//			element - 3 : 3                                                                                               
//			element - 4 : 4                                                                                               
//			element - 5 : 5                                                                                               
//			element - 6 : 6                                                                                               
//			element - 7 : 7                                                                                               
//			element - 8 : 8                                                                                               
//			element - 9 : 9                                                                                               
//			                                                                                                              
//			Elements in array are: 1  1  2  3  4  5  6  7  8  9 
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
 	}

}
