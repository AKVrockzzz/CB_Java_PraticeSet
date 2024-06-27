package RevisionSet1_String;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		Integer a1 = 9;
		//autoboxing
		a1 = a;
		int b = 11;
		Integer b1 = 189;
		//unboxing
		b = b1;
		
		Integer c1 = 18;
		Integer c2 = 18;
		Integer c3 = 189;
		Integer c4 = 189;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
	}

}
