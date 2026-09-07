package thiskeyword;

public class Returnthis {
	class Laptop {

	    String brand;
	    double price;

	    Laptop setBrand(String brand) {
	        this.brand = brand;
	        return this;
	    }

	    Laptop setPrice(double price) {
	        this.price = price;
	        return this;
	    }

	    void display() {
	        System.out.println("Laptop Brand: " + brand);
	        System.out.println("Laptop Price: " + price);
	    }

	    public static void main(String[] args) {

	        Laptop laptop = new Laptop();

	        laptop.setBrand("HP")
	              .setPrice(55000)
	              .display();
	    }
	}
}
