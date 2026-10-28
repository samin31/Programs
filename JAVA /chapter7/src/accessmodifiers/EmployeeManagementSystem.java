package accessmodifiers;
//Encapsulation
import java.util.Scanner;

	class Employee {
	   
	    private String name;
	    private double salary;

	    
	    public Employee(String name, double salary) {
	        this.name = name;
	        setSalary(salary); // Use setter to enforce validation
	    }

	   
	    public String getName() {
	        return name;
	    }

	  
	    public void setName(String name) {
	        this.name = name;
	    }

	 
	    public double getSalary() {
	        return salary;
	    }

	  
	    public void setSalary(double salary) {
	        if (salary >= 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("❌ Invalid Salary! Setting default value to 0.0");
	            this.salary = 0.0;
	        }
	    }
	}

	public class EmployeeManagementSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("--- Employee Management System ---");
	        System.out.print("Enter Employee Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Employee Initial Salary: ");
	        double salary = scanner.nextDouble();

	        Employee emp = new Employee(name, salary);

	        System.out.println("\n✅ Employee Profile Created:");
	        System.out.println("Name: " + emp.getName());
	        System.out.println("Salary: $" + emp.getSalary());

	        // Demonstrating dynamic salary update
	        System.out.print("\nEnter new salary to update: ");
	        double newSalary = scanner.nextDouble();
	        emp.setSalary(newSalary);

	        System.out.println("Updated Salary: $" + emp.getSalary());

	        scanner.close();
	    
	}
}
