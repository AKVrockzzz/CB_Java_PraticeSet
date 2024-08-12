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
		Student s1 = new Student();
		s1.name = "Ajay";
		s1.age = 23;
		s.Intro_yourSelf();
		s1.SayHey("Sachin");
		s1.MentorName();
	}
	
	static {
		System.out.println("Static block in Main StudentClient Class");
	}

}
