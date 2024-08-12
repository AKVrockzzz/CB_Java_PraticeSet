package Oops_Concept;

public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Raj", 22);
//		System.out.println(p.name);
//		System.out.println(p.age);
		Person p1 = new Person("Pooja", 21);
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		Person p2 = new Person("Shivani", 45);
		p2.setAge(19);
		System.out.println(p2.getAge());
		
	}

}
