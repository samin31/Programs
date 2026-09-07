package thiskeyword;
	class Laptop {

	    String brand;

	    Laptop(String brand) {
	        this.brand = brand;
	    }

	    void sendLaptop(Laptop laptop) {
	        System.out.println("Laptop received: " + laptop.brand);
	    }

	    void show() {
	        sendLaptop(this);
	    }

	    public static void main(String[] args) {

	        Laptop laptop1 = new Laptop("Dell");

	        laptop1.show();
	    }
	}

