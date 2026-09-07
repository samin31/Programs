package thiskeyword;
	class Student {

	    void welcome() {
	        System.out.println("Welcome to Java Programming!");
	    }

	    void startLearning() {
	        this.welcome();
	        System.out.println("Let's start learning Java!");
	    }

	    public static void main(String[] args) {

	        Student s1 = new Student();

	        s1.startLearning();
	    }
	}

