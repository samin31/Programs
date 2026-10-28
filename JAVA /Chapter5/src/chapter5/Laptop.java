package chapter5;
	class Laptop {
	    String company;
	    double cost;

	    Laptop(String company, double cost) {
	        this.company = company;
	        this.cost = cost;
	    }

	    // Copy constructor
	    Laptop(Laptop l) {
	        this.company = l.company;
	        this.cost = l.cost;
	    }

	    void display() {
	        System.out.println("Company: " + company);
	        System.out.println("Cost: " + cost);
	    }

	    public static void main(String[] args) {
	        Laptop laptop1 = new Laptop("Dell", 60000);

	        Laptop laptop2 = new Laptop(laptop1);

	        laptop2.display();
	    }
	}

