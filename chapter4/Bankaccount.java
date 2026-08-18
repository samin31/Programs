package chapter4;
class BankAccount {
    double balance = 1000.0;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Final Balance: " + account.balance);
    }

	}
