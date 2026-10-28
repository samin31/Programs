package accessmodifiers;
	//encapsulation
import java.util.Scanner;

	class Person {
	    private String socialSecurityNumber;
	    protected String nationality = "Global Resident";
	    public String name;
	    public Person(String name, String ssn) {
	        this.name = name;
	        this.socialSecurityNumber = ssn;
	    }
	    public String getSocialSecurityNumber() {
	        return socialSecurityNumber;
	    }
	}

	public class Accessmodifier {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Person Name (e.g., Samin): ");
	        String userName = scanner.nextLine();

	        System.out.print("Enter Private SSN (e.g., SSN-998877): ");
	        String userSSN = scanner.nextLine();

	        Person person = new Person(userName, userSSN);

	        System.out.println("\n--- ACCESS MODIFIER TEST ---");

	        // Public field: Directly accessible
	        System.out.println("1. Public Field (name): " + person.name);

	        // Protected field: Accessible here because we are in the same package
	        System.out.println("2. Protected Field (nationality): " + person.nationality);

	        // Private field direct access attempt:
	        // System.out.println(person.socialSecurityNumber); // ❌ COMPILE ERROR! Cannot access directly.
	        System.out.println("3. Direct Private Field Access: ❌ Blocked by Java compiler!");

	        // Private field indirect access via public method:
	        System.out.println("4. Indirect Private Access via Getter: " + person.getSocialSecurityNumber() + " ✅");

	        scanner.close();
	    }
	}

