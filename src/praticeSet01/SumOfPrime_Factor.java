package praticeSet01;

public class SumOfPrime_Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 378;
		int sum = 0;
		for(int i=2; i<num; i++) {
			while(num%i==0) {
				sum+=i;
				num/=i;
			}
			
		}
		System.out.println(sum);
	}

}
