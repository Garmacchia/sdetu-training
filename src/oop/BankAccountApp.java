package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Create a new Bank account >> think instantiate an object

		BankAccount acc1 = new BankAccount();
		
		// acc1.name = "Roger Hue";
		// with Encapsulation : public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("12345678");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "01689453";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
			  
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Check Account");
		acc2.accountNumber = "01689453";
			
		/* 
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "01689453";
		acc3.checkBalance();
		
		System.out.println(acc1.routingNumber + " - " + acc1.accountNumber);
		System.out.println(acc2.routingNumber + " - " + acc2.accountNumber);
		System.out.println(acc3.routingNumber + " - " + acc3.accountNumber); 
		
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.InterestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		
		*/
	}

}
