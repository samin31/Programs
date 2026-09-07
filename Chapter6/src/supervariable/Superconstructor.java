package supervariable;

public class Superconstructor {
	class BaseAccount {
	    BaseAccount() {
	        System.out.println("BaseAccount: Account security protocols initialized.");
	    }
	}

	class SavingsAccount extends BaseAccount {
	    SavingsAccount() {
	        super(); // Calls BaseAccount constructor
	        System.out.println("SavingsAccount: Savings interest features configured.");
	    }
	}

	public class SuperConstructorDemo {
	    public static void main(String[] args) {
	        SavingsAccount account = new SavingsAccount();
	    }
	}
}
