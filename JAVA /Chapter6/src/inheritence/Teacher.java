package inheritence;
	class Teacher {
	    String designation = "Teacher";
	    String schoolName = "Greenwood High";

	    void teach() {
	        System.out.println("Teaching students fundamental concepts...");
	    }
	}

	// Derived class
	class MathTeacher extends Teacher {
	    String mainSubject = "Mathematics";

	    void solveEquation() {
	        System.out.println("Solving algebra equations on the whiteboard.");
	    }
	}

	public class SingleInheritanceDemo {
	    public static void main(String[] args) {
	        MathTeacher teacher = new MathTeacher();

	        // Accessing base class fields and methods
	        System.out.println("School: " + teacher.schoolName);
	        System.out.println("Role: " + teacher.designation);
	        teacher.teach();

	        // Accessing derived class fields and methods
	        System.out.println("Subject: " + teacher.mainSubject);
	        teacher.solveEquation();
	    }
	
}
