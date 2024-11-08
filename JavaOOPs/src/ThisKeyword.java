class Employee {
	
	static int objectSerialNumber = 0;
	
	String name;
	String email;
	String phone;
	
	Employee(){
		objectSerialNumber++;
		name = "";
		email = "";
		phone = "";
		// Here "this" is a reference variable that holds the memory of the current object/objects in action
		System.out.println("Employee Object is Constructed With Serial No:" + objectSerialNumber + " this is:" + this);
	}
	
	Employee(String name){
		if(name.isEmpty()) {
			this.name = "NA";
		}
		else {
			this.name = name;
		}
		this.name = name;
		System.out.println("inside employee single param constructor");
	}
	
	Employee(String name, String email, String phone){
		this(name); // Here "this" is calling Employee(String name) to assign name to this particular constructor. Also must be the first line in this constructor.
		this.phone = phone;
		this.email = email;
		System.out.println("inside employee 3 param constructor");
	}
	
	void show() {
		System.out.println("Employee Details: " + name + " " + email + " " + phone);
	}
}


public class ThisKeyword {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John", "john123@gmail.com", "1+9546667878");
		emp1.show();
		
//		Employee emp2 = new Employee();
//		System.out.println("Emplyee 2: " + emp2);
	}

}
