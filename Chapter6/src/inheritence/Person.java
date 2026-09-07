package inheritence;
	class Person {
	    String name = "Alex Smith";

	    void displayIdentity() {
	        System.out.println("Name: " + name);
	    }
	}

	// Parent class
	class Employee extends Person {
	    int employeeId = 1042;

	    void displayEmployeeInfo() {
	        System.out.println("Employee ID: " + employeeId);
	    }
	}

	// Child class
	class Manager extends Employee {
	    String department = "Engineering";

	    void manageTeam() {
	        System.out.println("Managing team members in the " + department + " department.");
	    }
	}

	public class MultilevelInheritanceDemo {
	    public static void main(String[] args) {
	        Manager mgr = new Manager();

	        // Attributes inherited from Person, Employee, and defined in Manager
	        mgr.displayIdentity();
	        mgr.displayEmployeeInfo();
	        mgr.manageTeam();
	    }
	
}
