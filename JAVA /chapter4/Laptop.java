package chapter4;
	class Laptop {
	    String brand = "Dell";
	    int ram = 16;
	    double price = 75000.0;

	    public static void main(String[] args) {
	        Laptop myLaptop = new Laptop();
	        System.out.println("Brand: " + myLaptop.brand + ", RAM: " + myLaptop.ram + "GB, Price: $" + myLaptop.price);
	    }
	
}
