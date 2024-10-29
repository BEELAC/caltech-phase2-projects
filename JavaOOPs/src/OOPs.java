import java.util.Date;

/*Object - Multi-value container (Homo - Same types / Hetro - Diff types)
Class - Textual representation of an Object. Also known as blueprint or template of objects

OOPs Principles:
1. Identify the Object and write the attributes associated to it
2. Create a Class that will define the Object
3. From Class we can create the real Objects in the memory*/

/*Identified Object to be created
Attributes: name, phone, email, gender, birthDate, password
Now create the class*/

class User{
	//Non-parameterized Constructor to give default values to User attributes
	User(){
		name = "";
		phone = "";
		email = "";
		gender = "";
		birthDate = new Date();
		password = "";
	}
	
	//Parameterized Constructor
	public User(String name, String phone, String email, String gender, Date birthDate, String password) {
		// "super" calls to parent class of the object
		super();
		// We use 'this' key word when parameter names match attribute names
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.birthDate = birthDate;
		this.password = password;
	}
	
	//Attributes of Object
	String name;
	String phone;
	String email;
	String gender;
	Date birthDate;
	String password;
}


public class OOPs {

	public static void main(String[] args) {
		// Creating real Objects in the memory from User Class
		User user1 = new User();
		User user2 = new User();
		
		System.out.println("User 1: " + user1);
		System.out.println("User 2: " + user2);
		
		// Reference Copy Operation
		User user3 = user1;
		System.out.println("User 3: " + user3);
		
		
		// Let's perform the write/update set operation on the User Objects
		
		// Sets the name for User 1 and 3 reference
		user1.name = "John";
		
		user2.name = "Sam";
		// Updates name for User 1 and 3 references
		user3.name = "Charlie";
		
		user1.email = "charlie1234@gmail.com";
		user1.phone = "+1(954)3337777";
		user1.gender = "Male";
		user1.birthDate = new Date();
		user1.password = "charlie92!";
		
		user2.email = "sam1234@gmail.com";
		user2.phone = "+1(954)4447777";
		user2.gender = "Female";
		user2.birthDate = new Date();
		user2.password = "sam92!";
		
		// Reassigning a new Object to User 3 reference
		user3 = new User();
		
		// Initializing all attribute values within Parameterized Constructor during the Object creation
		User user4 = new User("James", "1+(305)5558888","james1234@gmail.com", "Male", new Date(), "james57!");
		
		System.out.println("Reading Data From User 1: ");
		System.out.println(user1.name + " with DOB of " + user1.birthDate + " can be called at " + user1.phone + " and can be emailed at "+ user1.email);
		
		System.out.println("Reading Data From User 2: ");
		System.out.println(user2.name + " with DOB of " + user2.birthDate + " can be called at " + user2.phone + " and can be emailed at "+ user2.email);
		
		System.out.println("Reading Data From User 3: ");
		System.out.println(user3.name + " with DOB of " + user3.birthDate + " can be called at " + user3.phone + " and can be emailed at "+ user3.email);
		
		System.out.println("Reading Data From User 4: ");
		System.out.println(user4.name + " with DOB of " + user4.birthDate + " can be called at " + user4.phone + " and can be emailed at "+ user4.email);
		
		// Deleting unreferenced objects from data happens automatically through Java's Garbage Collection Process as long as you have deleted the references
		// Can also be triggered with the help of .gc below
		//System.gc();
		// But this cannot guarantee the Garbage collector will run the moment you run this
	}

}
