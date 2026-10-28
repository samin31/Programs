package chapter4;
	class Mobile {
	    String brand;
	    double price;

	    void display() {
	        System.out.println("Brand: " + brand + ", Price: $" + price);
	    }

	    public static void main(String[] args) {
	        Mobile m1 = new Mobile();
	        m1.brand = "Apple";
	        m1.price = 999.99;

	        Mobile m2 = new Mobile();
	        m2.brand = "Samsung";
	        m2.price = 799.99;

	        m1.display();
	        m2.display();
	    }
}
