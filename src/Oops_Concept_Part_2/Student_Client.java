package Oops_Concept_Part_2;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Raj", 19);
		System.out.println(s.getAge());
		s.setAge(9);
		System.out.println(s.getAge());
		System.out.println("Hey");
	}

}
