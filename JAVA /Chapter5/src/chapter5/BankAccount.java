package chapter5;

	class BankAccount {
	    String accountHolder;
	    int accountNumber;
	    double balance;

	    BankAccount(String accountHolder, int accountNumber, double balance) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    // Copy constructor
	    BankAccount(BankAccount b) {
	        this.accountHolder = b.accountHolder;
	        this.accountNumber = b.accountNumber;
	        this.balance = b.balance;
	    }

	    void display() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }

	    public static void main(String[] args) {
	        BankAccount account1 =
	                new BankAccount("Samin", 12345, 10000);

	        BankAccount account2 = new BankAccount(account1);

	        account2.display();
	    }
	}
