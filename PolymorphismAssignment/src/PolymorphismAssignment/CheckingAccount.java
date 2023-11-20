package PolymorphismAssignment;

public class CheckingAccount extends BankAccount {
	private double interestRate;
	
	public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
		super(firstName, lastName, accountID);
		this.interestRate = interestRate;
	}
	
	// allow overdraft withdrawal and charge a fee of 30 dollars
	
	//methods
	
	public void processWithdrawal(double amount) {
		if (getBalance() >= amount) {
			withdrawal(amount);
		} else {
			withdrawal(amount);
			withdrawal(30);
			System.out.println("30 dollars have been added to your balance.");
			System.out.println("Current balance: " + getBalance());
		}
	}
	
	public void displayAccount() {
		accountSummary();
		System.out.println("Interest Rate: " + this.interestRate);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
