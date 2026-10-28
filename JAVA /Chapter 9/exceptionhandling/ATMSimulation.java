package exceptionhandling;
	import java.util.Scanner;

	// User-defined exception for wrong PIN
	class InvalidPinException extends Exception {
	    public InvalidPinException(String message) {
	        super(message);
	    }
	}

	// User-defined exception for insufficient balance
	class InsufficientBalanceException extends Exception {
	    public InsufficientBalanceException(String message) {
	        super(message);
	    }
	}

	// User-defined exception for invalid withdrawal amount
	class InvalidAmountException extends Exception {
	    public InvalidAmountException(String message) {
	        super(message);
	    }
	}

	public class ATMSimulation {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int correctPin = 1234;
	        double balance = 5000;

	        try {
	            // Enter PIN
	            System.out.print("Enter PIN: ");
	            int pin = sc.nextInt();

	            // Check PIN
	            if (pin != correctPin) {
	                throw new InvalidPinException("Wrong PIN!");
	            }

	            System.out.println("\nLogin successful!");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Withdraw Money");

	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();

	            if (choice == 1) {

	                // Check balance
	                System.out.println("Your balance is: Rs. " + balance);

	            } 
	            else if (choice == 2) {

	                System.out.print("Enter withdrawal amount: ");
	                double amount = sc.nextDouble();

	                // Check withdrawal amount
	                if (amount < 100 || amount % 100 != 0) {
	                    throw new InvalidAmountException(
	                        "Amount must be at least 100 and a multiple of 100."
	                    );
	                }

	                // Check sufficient balance
	                if (amount > balance) {
	                    throw new InsufficientBalanceException(
	                        "Insufficient balance!"
	                    );
	                }

	                // Maintain minimum balance
	                if (balance - amount < 500) {
	                    throw new InsufficientBalanceException(
	                        "Minimum balance of Rs.500 must be maintained."
	                    );
	                }

	                balance = balance - amount;

	                System.out.println("\nWithdrawal successful!");
	                System.out.println("Withdrawn Amount: Rs. " + amount);
	                System.out.println("Remaining Balance: Rs. " + balance);

	            } 
	            else {
	                System.out.println("Invalid choice!");
	            }
	        }

	        // Catch wrong PIN exception
	        catch (InvalidPinException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        // Catch insufficient balance exception
	        catch (InsufficientBalanceException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        // Catch invalid amount exception
	        catch (InvalidAmountException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        // Catch other input errors
	        catch (Exception e) {
	            System.out.println("Invalid input!");
	        }

	        finally {
	            System.out.println("\nThank you for using ATM.");
	            sc.close();
	        }
	    }
	}

