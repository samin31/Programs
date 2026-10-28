package chapter4;
	class Teacher {
	    String name;
	    String subject;

	    void setDetails(String n, String s) {
	        name = n;
	        subject = s;
	    }

	    void displayDetails() {
	        System.out.println("Teacher Name: " + name + ", Subject: " + subject);
	    }

	    public static void main(String[] args) {
	        Teacher t = new Teacher();
	        t.setDetails("Dr. Smith", "Computer Science");
	        t.displayDetails();
	    
	}
}
