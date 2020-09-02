package oop;

public class CDAccount extends BankAccount implements IRate {

		String InterestRate;
		
		void compount () {
			System.out.println("Compounding interest % " + InterestRate);
		}
}
