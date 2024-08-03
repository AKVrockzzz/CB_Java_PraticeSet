package Oops_Concept;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Student s = new Student();
		s.name = "Inder";
		s.age = 24;
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = "Ajay";
		s.age = 23;
		s.Intro_yourSelf();
	}

}
