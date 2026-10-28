package supervariable;
	class Grandparent {
	    void familyName() {
	        System.out.println("Family Surname: Johnson");
	    }
	}

	class Parent extends Grandparent {
	    void houseLocation() {
	        System.out.println("House Location: New York");
	    }
	}

	class Child extends Parent {
	    void hobby() {
	        System.out.println("Hobby: Photography");
	    }
	}

	public class MultilevelDemo {
	    public static void main(String[] args) {
	        Child child = new Child();
	        
	        // Accessing methods from all 3 levels
	        child.familyName();
	        child.houseLocation();
	        child.hobby();
	    }
	
}
