package supervariable;

public class Singleinheritance {
	class Person {
	    String name = "Sarah Jenkins";
	    int age = 28;

	    void showPersonDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	class Employee extends Person {
	    int employeeId = 5001;
	    double salary = 65000.0;

	    void showEmployeeDetails() {
	        showPersonDetails(); // Inherited method
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Salary: $" + salary);
	    }
	}

	public class SingleInheritancePersonDemo {
	    public static void main(String[] args) {
	        Employee emp = new Employee();
	        emp.showEmployeeDetails();
	    }
	}
}
