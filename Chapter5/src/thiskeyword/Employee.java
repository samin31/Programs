package thiskeyword;
	class Employee {

	    String name;
	    double salary;

	    Employee(String name, double salary) {

	        this.name = name;
	        this.salary = salary;
	    }

	    void display() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Salary: " + salary);
	    }

	    public static void main(String[] args) {

	        Employee emp1 = new Employee("Samin", 25000);

	        emp1.display();
	    }
	}

