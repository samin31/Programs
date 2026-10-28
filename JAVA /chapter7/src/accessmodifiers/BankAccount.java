package accessmodifiers;
	//Encapsulation
import java.util.Scanner;

	class BankAccount {
	    private String accountHolder;
	    private double balance; // Encapsulated private balance

	    public BankAccount(String accountHolder, double initialBalance) {
	        this.accountHolder = accountHolder;
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            this.balance = 0;
	        }
	    }

	    // Getter only — balance cannot be directly modified from outside
	    public double getBalance() {
	        return balance;
	    }

	    // Deposit method
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("💵 Successfully deposited: $" + amount);
	        } else {
	            System.out.println("❌ Deposit amount must be positive.");
	        }
	    }

	    // Withdraw method
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("🏧 Successfully withdrew: $" + amount);
	        } else if (amount > balance) {
	            System.out.println("❌ Transaction Failed! Insufficient balance.");
	        } else {
	            System.out.println("❌ Withdrawal amount must be positive.");
	        }
	    }

	    public void displaySummary() {
	        System.out.println("\n--- Account Summary ---");
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Current Balance: $" + balance);
	    }
	}

	public class BankAccount {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Account Holder Name (e.g., Samin): ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Initial Deposit: $");
	        double initialDeposit = scanner.nextDouble();

	        BankAccount account = new BankAccount(name, initialDeposit);

	        System.out.print("\nEnter amount to deposit: $");
	        double depositAmount = scanner.nextDouble();
	        account.deposit(depositAmount);

	        System.out.print("Enter amount to withdraw: $");
	        double withdrawAmount = scanner.nextDouble();
	        account.withdraw(withdrawAmount);

	        account.displaySummary();

	        scanner.close();
	    }
	}

