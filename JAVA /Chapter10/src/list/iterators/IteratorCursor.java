package iterators;
	import java.util.ArrayList;
	import java.util.Iterator;

	public class IteratorCursor {
	    public static void main(String[] args) {

	        ArrayList<String> products = new ArrayList<>();

	        products.add("Laptop");
	        products.add("Mobile");
	        products.add("Headphones");
	        products.add("Keyboard");

	        Iterator<String> iterator = products.iterator();

	        System.out.println("Cursor is at the beginning.");
	        
	        while (iterator.hasNext()) {

	            System.out.println("Cursor is before: " + iterator.next());

	            System.out.println("Cursor moved to the next position.");
	        }

	        System.out.println("Cursor reached the end.");
	    	}
}
