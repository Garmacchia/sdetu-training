package oop;

class Person {

		String name;
		String email;
		String phone;
		
		void walk() {
			System.out.println(name + " is walking");
		}
		
		void eat () {
			System.out.println(email);
		}
		
		void sleep () {
			System.out.println(name + " is sleeping");
		}
}


public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "789566322";
		
		// Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		
		/*
		// Person
		
		// Atributes, variables, adjetives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "632654698";
		
		// Action, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// What if we wanted to do this for other person
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "236456896";
		
		// Action, activity, behavior
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");	
	}
	static void walking (String name) {
		System.out.println(name + " is walking");
	*/
	}
	
}
