package supervariable;

public class Heirarchical {
	class Person {
	    String school = "Oakridge Academy";

	    void showSchool() {
	        System.out.println("School: " + school);
	    }
	}

	class Teacher extends Person {
	    String subject = "Physics";

	    void teach() {
	        showSchool();
	        System.out.println("Role: Teacher | Subject: " + subject);
	    }
	}

	class Student extends Person {
	    int gradeLevel = 10;

	    void study() {
	        showSchool();
	        System.out.println("Role: Student | Grade: " + gradeLevel);
	    }
	}

	class Staff extends Person {
	    String department = "Administration";

	    void work() {
	        showSchool();
	        System.out.println("Role: Staff | Department: " + department);
	    }
	}

	public class Hierarchical{
	    public static void main(String[] args) {
	        Teacher teacher = new Teacher();
	        Student student = new Student();
	        Staff staff = new Staff();

	        System.out.println("--- Teacher Info ---");
	        teacher.teach();

	        System.out.println("\n--- Student Info ---");
	        student.study();

	        System.out.println("\n--- Staff Info ---");
	        staff.work();
	    }
	}
}
