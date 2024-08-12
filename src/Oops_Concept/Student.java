package Oops_Concept;

public class Student {
	String name;
	int age;
	
	public void Intro_yourSelf() {
		System.out.println("My name is " + name + " and age is " + age);
	}
	
	public void SayHey(String name) {
		System.out.println(this.name + " Say Hey " + name);
	}
	
	public static void MentorName() {
		System.out.println("Mentor name is Monu Kumar");
	}
	
	static {
		System.out.println("Static block in Student Class");
	}
}
