package chapter4;
	class Calculator {
	    double add(double a, double b) { return a + b; }
	    double subtract(double a, double b) { return a - b; }
	    double multiply(double a, double b) { return a * b; }
	    double divide(double a, double b) { return b != 0 ? a / b : 0; }

	    public static void main(String[] args) {
	        Calculator calc = new Calculator();
	        System.out.println("Add: " + calc.add(10, 5));
	        System.out.println("Subtract: " + calc.subtract(10, 5));
	        System.out.println("Multiply: " + calc.multiply(10, 5));
	        System.out.println("Divide: " + calc.divide(10, 5));
	    
	}
}
