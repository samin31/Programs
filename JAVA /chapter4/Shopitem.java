package chapter4;
	class ShopItem {
	    String itemName = "Keyboard";
	    int quantity = 3;
	    double price = 29.99;

	    void calculateTotalCost() {
	        double total = quantity * price;
	        System.out.println("Item: " + itemName + " | Total Cost: $" + total);
	    }

	    public static void main(String[] args) {
	        ShopItem item = new ShopItem();
	        item.calculateTotalCost();
	    }
	
}
