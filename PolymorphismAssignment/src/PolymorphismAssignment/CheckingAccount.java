package PolymorphismAssignment;

public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	//methods
	
	public void processWithdrawal(double amount) {
		if (getBalance() >= amount) {
			withdrawal(amount);
		} else {
			withdrawal(amount);
			withdrawal(30);
			System.out.println("30 dollars over draft fee have been added to your balance.");
			System.out.println("Current balance: " + getBalance());
		}
	}
	
	public void displayAccount() {
		accountSummary();
		System.out.println("Interest Rate: " + this.interestRate);
	}
	
	//getters and setter
	public double getInterestRate() { return this.interestRate; }
	public void setInterestRate(double interestRate) { this.interestRate = interestRate; }
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
