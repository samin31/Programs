package supervariable;
	class Parent {
	    Parent(String message) {
	        System.out.println("Parent Constructor Message: " + message);
	    }
	}

	class Child extends Parent {
	    Child() {
	        super("Hello from Child via super()!"); // Calls parent parameterized constructor
	        System.out.println("Child Constructor executed.");
	    }
	}

	public class ParameterizedSuper {
	    public static void main(String[] args) {
	        Child child = new Child();
	    }
	}

