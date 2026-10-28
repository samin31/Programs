package chapter5;
	class Student {
	    String name;
	    int rollNumber;
	    double marks;

	    Student(String name, int rollNumber, double marks) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.marks = marks;
	    }

	    // Copy constructor
	    Student(Student s) {
	        this.name = s.name;
	        this.rollNumber = s.rollNumber;
	        this.marks = s.marks;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Marks: " + marks);
	    }

	    public static void main(String[] args) {
	        Student student1 = new Student("Samin", 101, 85.5);

	        Student student2 = new Student(student1);

	        student2.display();
	    }
	}

