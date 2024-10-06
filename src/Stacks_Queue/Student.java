package Stacks_Queue;

public class Student {
	
	private String name = "Kaju";
	private int age = 17;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		try {
		if(age < 0) {
			 throw new Exception("bklol age -ve nhi hoti");
		}
		this.age = age;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally block");
		}
	}
	
//	public void setAge(int age) throws Exception{
//		if(age < 0) {
//			 throw new Exception("bklol age -ve nhi hoti");
//		}
//		this.age = age;
//	}
	
	

}
