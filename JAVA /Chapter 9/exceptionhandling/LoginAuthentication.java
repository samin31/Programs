package exceptionhandling;
	import java.util.Scanner;

	// User-defined exception for invalid username
	class InvalidUserException extends Exception {
	    public InvalidUserException(String message) {
	        super(message);
	    }
	}

	// User-defined exception for invalid password
	class InvalidPasswordException extends Exception {
	    public InvalidPasswordException(String message) {
	        super(message);
	    }
	}

	// User-defined exception for weak password
	class WeakPasswordException extends Exception {
	    public WeakPasswordException(String message) {
	        super(message);
	    }
	}

	public class LoginAuthentication {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Stored username and password
	        String storedUsername = "admin";
	        String storedPassword = "admin1234";

	        try {
	            System.out.print("Enter Username: ");
	            String username = sc.nextLine();

	            // Check if username is empty
	            if (username == null || username.isEmpty()) {
	                throw new NullPointerException("Username cannot be empty!");
	            }

	            System.out.print("Enter Password: ");
	            String password = sc.nextLine();

	            // Check if password is empty
	            if (password == null || password.isEmpty()) {
	                throw new NullPointerException("Password cannot be empty!");
	            }

	            // Check username
	            if (!username.equals(storedUsername)) {
	                throw new InvalidUserException(
	                    "Invalid Username!"
	                );
	            }

	            // Check password length
	            if (password.length() < 8) {
	                throw new WeakPasswordException(
	                    "Password must contain at least 8 characters."
	                );
	            }

	            // Check password
	            if (!password.equals(storedPassword)) {
	                throw new InvalidPasswordException(
	                    "Invalid Password!"
	                );
	            }

	            // Login successful
	            System.out.println("\nLogin Successful!");
	            System.out.println("Welcome, " + username);

	        }

	        catch (InvalidUserException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        catch (InvalidPasswordException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        catch (WeakPasswordException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        catch (NullPointerException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        finally {
	            System.out.println("\nThank you for using Login System.");
	            sc.close();
	        }
	    }
	
}
