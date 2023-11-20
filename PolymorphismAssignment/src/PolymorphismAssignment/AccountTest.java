package PolymorphismAssignment;

public class AccountTest {

	public static void main(String[] args) {
		BankAccount testBA = new BankAccount();
		CheckingAccount testCA = new CheckingAccount();		
		double epsilon = 0.000001;
		int totalTests = 9;
		int testPassed = 0;
		
		System.out.println("Begin Tests.");
		System.out.println();
		
		// 1. Test getBalance and that balance is initialized to 0
		if (Math.abs(testBA.getBalance()) - 0 < epsilon && Math.abs(testCA.getBalance()) - 0 < epsilon) {
			testPassed++;
		} else {
			System.out.println(" FAILED getBalance/BankAccount Default Constructor");
		}
		
		// 2. Test setFirstName and getFirstName
		testBA.setFirstName("Karen");
		testCA.setFirstName("John");
		
		if (testBA.getFirstName() == "Karen" && testCA.getFirstName() == "John") {
			testPassed++;
		} else {
			System.out.println(" FAILED setFirstName/getFirstName");
		}
		
		// 3.Test setLastName and getFirstName
		testBA.setLastName("Smith");
		testCA.setLastName("Doe");
		
		if (testBA.getLastName() == "Smith" && testCA.getLastName() == "Doe") {
			testPassed++;
		} else {
			System.out.println(" FAILED setLastName/getLastName");
		}
		
		// 4. Test setAccountID and getAccountID
		testBA.setAccountID(89);
		testCA.setAccountID(90);
		
		if (testBA.getAccountID() == 89 && testCA.getAccountID() == 90) {
			testPassed++;
		} else {
			System.out.println(" FAILED setAccountID/getAccountID");
		}
		
		// 5. Test deposit
		testBA.deposit(100);
		testCA.deposit(200);
		
		if(Math.abs(testBA.getBalance() - 100) < epsilon && Math.abs(testCA.getBalance() - 200) < epsilon) {
			testPassed++;
		} else {
			System.out.println(" FAILED deposit");
		}
		
		// 6. Test withdrawal
		testBA.withdrawal(50); // balance should be 50
		testCA.withdrawal(50); // balance should be 150
		
		if(Math.abs(testBA.getBalance() - 50) < epsilon && Math.abs(testCA.getBalance() - 150) < epsilon) {
			testPassed++;
		} else {
			System.out.println(" FAILED deposit");
		}
		
		// 7. Test processWithdrawal without overdraft
		testCA.processWithdrawal(50); // balance should now be 100
		
		if (Math.abs(testCA.getBalance() - 100) < epsilon ) {
			testPassed++;
		} else {
			System.out.println(" FAILED processWithdrawal");
		}
		
		// 8. Test processWithdrawl for overdraft
		testCA.processWithdrawal(150); // balance should now be - 80
		
		if (Math.abs(testCA.getBalance() + 80) < epsilon ) {
			testPassed++;
		} else {
			System.out.println(" FAILED processWithdrawal");
		}
		
		// 9. test getInterestRate/setInterestRate
		testCA.setInterestRate(4.2);
		
		if (Math.abs(testCA.getInterestRate()) - 4.2 < epsilon) {
			testPassed++;
		} else {
			System.out.println(" FAILED getInterestRate/setInterestRate");
		}
		
		System.out.println("So far " + testPassed + "/" + totalTests + " tests have passed");
		
		System.out.println();
		
		System.out.println("Start test for accountSummary method: ");
		System.out.println("Expected results: ");
		System.out.println("First Name: " + testBA.getFirstName());
		System.out.println("Last Name: " + testBA.getLastName());
		System.out.println("Account ID: " + testBA.getAccountID());
		System.out.println("Balance: " + testBA.getBalance());
		System.out.println();
		System.out.println("accountSummary's output: ");
		testBA.accountSummary();
		
		System.out.println();
	
		System.out.println("Start test for displayAccount method: ");
		System.out.println("Expected results: ");
		System.out.println("First Name: " + testCA.getFirstName());
		System.out.println("Last Name: " + testCA.getLastName());
		System.out.println("Account ID: " + testCA.getAccountID());
		System.out.println("Balance: " + testCA.getBalance());
		System.out.println("Interest Rate: " + testCA.getInterestRate());
		System.out.println();
		System.out.println("displayAccount's output: ");
		testCA.displayAccount();
		
		System.out.println();
		System.out.println("End Tests.");
	}

}
