package inheritence;
	class Vehicle {
	    void startEngine() {
	        System.out.println("Engine started.");
	    }
	}

	// Subclass 1
	class Car extends Vehicle {
	    void openTrunk() {
	        System.out.println("Car trunk opened.");
	    }
	}

	// Subclass 2
	class Bike extends Vehicle {
	    void doKickStart() {
	        System.out.println("Bike kick-started.");
	    }
	}

	public class HierarchicalInheritanceDemo {
	    public static void main(String[] args) {
	        Car myCar = new Car();
	        Bike myBike = new Bike();

	        System.out.println("--- Car Operations ---");
	        myCar.startEngine(); // Inherited method
	        myCar.openTrunk();

	        System.out.println("\n--- Bike Operations ---");
	        myBike.startEngine(); // Inherited method
	        myBike.doKickStart();
	    }
	}
