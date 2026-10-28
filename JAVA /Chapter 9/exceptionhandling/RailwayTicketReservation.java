package exceptionhandling;
	import java.util.Scanner;
	import java.util.Random;

	// User-defined exception for invalid train number
	class InvalidTrainException extends Exception {
	    public InvalidTrainException(String message) {
	        super(message);
	    }
	}

	// User-defined exception for invalid age
	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	// User-defined exception for ticket limit
	class TicketLimitException extends Exception {
	    public TicketLimitException(String message) {
	        super(message);
	    }
	}

	// User-defined exception for invalid seat preference
	class InvalidSeatException extends Exception {
	    public InvalidSeatException(String message) {
	        super(message);
	    }
	}

	public class RailwayTicketReservation {

	    // Method to validate train number
	    static void validateTrain(int trainNumber)
	            throws InvalidTrainException {

	        // Example: valid train numbers are between 10000 and 99999
	        if (trainNumber < 10000 || trainNumber > 99999) {
	            throw new InvalidTrainException(
	                    "Invalid Train Number! Enter a 5-digit train number."
	            );
	        }
	    }

	    // Method to validate passenger age
	    static void validateAge(int age)
	            throws InvalidAgeException {

	        if (age < 5) {
	            throw new InvalidAgeException(
	                    "Passenger age must be at least 5 years."
	            );
	        }
	    }

	    // Method to validate number of tickets
	    static void validateTickets(int tickets)
	            throws TicketLimitException {

	        if (tickets <= 0 || tickets > 6) {
	            throw new TicketLimitException(
	                    "You can book a maximum of 6 tickets."
	            );
	        }
	    }

	    // Method to validate seat preference
	    static void validateSeat(String seat)
	            throws InvalidSeatException {

	        if (!(seat.equalsIgnoreCase("Window")
	                || seat.equalsIgnoreCase("Middle")
	                || seat.equalsIgnoreCase("Aisle"))) {

	            throw new InvalidSeatException(
	                    "Invalid seat! Choose Window, Middle or Aisle."
	            );
	        }
	    }

	    // Generate random PNR number
	    static String generatePNR() {
	        Random random = new Random();
	        return "PNR" + (100000 + random.nextInt(900000));
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {

	            System.out.println("======================================");
	            System.out.println("      RAILWAY TICKET RESERVATION");
	            System.out.println("======================================");

	            // Passenger details
	            System.out.print("Enter Passenger Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Age: ");
	            int age = sc.nextInt();

	            System.out.print("Enter Train Number: ");
	            int trainNumber = sc.nextInt();

	            System.out.print("Enter Number of Tickets: ");
	            int tickets = sc.nextInt();

	            sc.nextLine(); // clear buffer

	            System.out.print("Enter Seat Preference "
	                    + "(Window/Middle/Aisle): ");
	            String seat = sc.nextLine();

	            // Validation
	            validateAge(age);
	            validateTrain(trainNumber);
	            validateTickets(tickets);
	            validateSeat(seat);

	            // Fare calculation
	            double pricePerTicket = 250.0;
	            double totalFare = pricePerTicket * tickets;

	            // Discount idea
	            double discount = 0;

	            if (age >= 60) {
	                discount = totalFare * 0.20;
	            }

	            double finalFare = totalFare - discount;

	            // Generate PNR
	            String pnr = generatePNR();

	            // Display booking confirmation
	            System.out.println("\n======================================");
	            System.out.println("       BOOKING CONFIRMED!");
	            System.out.println("======================================");

	            System.out.println("PNR Number       : " + pnr);
	            System.out.println("Passenger Name   : " + name);
	            System.out.println("Age              : " + age);
	            System.out.println("Train Number     : " + trainNumber);
	            System.out.println("Tickets          : " + tickets);
	            System.out.println("Seat Preference  : " + seat);
	            System.out.println("--------------------------------------");
	            System.out.println("Price/Ticket     : Rs. " + pricePerTicket);
	            System.out.println("Total Fare       : Rs. " + totalFare);
	            System.out.println("Discount         : Rs. " + discount);
	            System.out.println("Final Fare       : Rs. " + finalFare);
	            System.out.println("======================================");
	            System.out.println("Thank you for booking!");
	            System.out.println("Have a safe journey 🚆");
	            System.out.println("======================================");

	        }

	        // Handling user-defined exceptions
	        catch (InvalidAgeException e) {
	            System.out.println("\nBooking Failed!");
	            System.out.println("Error: " + e.getMessage());

	        }

	        catch (InvalidTrainException e) {
	            System.out.println("\nBooking Failed!");
	            System.out.println("Error: " + e.getMessage());

	        }

	        catch (TicketLimitException e) {
	            System.out.println("\nBooking Failed!");
	            System.out.println("Error: " + e.getMessage());

	        }

	        catch (InvalidSeatException e) {
	            System.out.println("\nBooking Failed!");
	            System.out.println("Error: " + e.getMessage());

	        }

	        // Predefined exception
	        catch (java.util.InputMismatchException e) {
	            System.out.println("\nInvalid Input!");
	            System.out.println("Please enter numbers correctly.");

	        }

	        finally {
	            System.out.println("\nProgram execution completed.");
	            sc.close();
	        }
	    }
	}

