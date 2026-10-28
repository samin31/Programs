package chapter4;
	class StudentMarks {
	    double m1 = 85, m2 = 90, m3 = 80;

	    void calculate() {
	        double total = m1 + m2 + m3;
	        double average = total / 3.0;
	        System.out.println("Total Marks: " + total);
	        System.out.println("Average Marks: " + average);
	    }

	    public static void main(String[] args) {
	        StudentMarks sm = new StudentMarks();
	        sm.calculate();
	    }
	}
