package supervariable;
	class Parent {
	    String name = "Parent Variable";
	}

	class Child extends Parent {
	    String name = "Child Variable";

	    void displayNames() {
	        System.out.println("Child's name: " + name);         // Accesses child variable
	        System.out.println("Parent's name: " + super.name);  // Accesses parent variable using super
	    }
	}

	public class Parentchild
	{
	    public static void main(String[] args) {
	        Child child = new Child();
	        child.displayNames();
	    }
	}

