package PolymorphismAssignment;

public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	public BankAccount() {
		this.balance = 0;
	}
	
	// methods to implement
	// deposit
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	// withrawal
	public void withdrawal(double amount) {
		this.balance -= amount;
	}
	
	// setter and getter for firstname, lastname, and accountid
	public String getFirstName() { return this.firstName; }
	public String getLastName() { return this.lastName; }
	public int getAccountID() { return this.accountID; }
	
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setAccountID(int accountID) { this.accountID = accountID; }
	
	// getbalance
	public double getBalance() { return this.balance; }
	
	// account summary
	public void accountSummary() {
		System.out.println("Name: " + this.firstName + " " + this.lastName);
		System.out.println("AccountID: " + this.accountID);
		System.out.println("Balance: " + this.balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
