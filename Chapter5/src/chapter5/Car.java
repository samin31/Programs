package chapter5;
	class Car {
	    String model;
	    double price;

	    // Normal constructor
	    Car(String model, double price) {
	        this.model = model;
	        this.price = price;
	    }

	    // Copy constructor
	    Car(Car c) {
	        this.model = c.model;
	        this.price = c.price;
	    }

	    void display() {
	        System.out.println("Model: " + model);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {
	        Car car1 = new Car("BMW", 5000000);

	        Car car2 = new Car(car1);

	        car2.display();
	    }
	}

