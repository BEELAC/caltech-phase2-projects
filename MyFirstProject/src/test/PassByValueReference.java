package test;

class Student {
	int id;
	String name;
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class PassByValueReference {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		String name = new String("John");
		
		Student student = new Student(1, "John");
		
		System.out.println("Before method call: " + num);
		System.out.println("Before method call: " + name);
		System.out.println("Before method call: " + student);
		
		modifyPrimitiveValue(num);
		modifyPredefinedNonPrimitiveValue(name);
		modifyCustomNonPrimitiveValue(student);
		
		System.out.println("After method call: " + num);
		System.out.println("After method call: " + name);
		System.out.println("Before method call: " + student);
	}
	
	public static void modifyPrimitiveValue(int num) {
		num = 20; // here the local copy is modified. not the original.
	}
	
	public static void modifyPredefinedNonPrimitiveValue(String name) {
		name = "Sam"; // here the local copy is modified. not the original.
	}
	
	public static void modifyCustomNonPrimitiveValue(Student student) {
		
		/*
		 * student = new Student(2,"Sam"); // here the local copy is modified. not
		 * the original.
		 */	
		student.id = 2;
		student.name = "Sam";
		System.out.println("Inside modify function: " + student);
	}
}
