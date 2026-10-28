package supervariable;

public class Implicitsuper {
	class Parent {
	 
	    Parent() {
	        System.out.println("1. Parent default constructor executes automatically.");
	    }
	}

	class Child extends Parent {
	    Child() {
	       
	        System.out.println("2. Child constructor executes next.");
	    }
	}

	public class ImplicitSuperDemo {
	    public static void main(String[] args) {
	        Child child = new Child();
	    }
	}
}
