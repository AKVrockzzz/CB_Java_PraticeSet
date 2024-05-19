package assignment_1_Apr24_MonuSir;
import java.util.*;
public class Pattern_InvertedHourGlass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2*num-1;
		//Row Create
		while(row<=2*num+1) {
			//Star
			int i = 1;
			int count = num;
			while(i<=star) {
				System.out.print(count + " ");
				count--;
				i++;
			}
			//Space
			int j = 1;
		    while(j<=space) {
		    	System.out.print("  ");
		    	j++;
		    }
		    //Star
		    int k = 1;
		    if(row==num+1) {
		    	k=2;
		    	count=0;
		    	
		    }
		    while(k<=star) {
		    	count++;
		    	System.out.print(count + " ");
		    	k++;
		    }
		    //Mirror
		    if(row<=num) {
			    star++;
			    space-=2;
		    }else {
		    	star--;
		    	space+=2;
		    }
		    //Row Update
		    row++;
		    System.out.println();
		}
	}

}
