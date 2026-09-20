package list;
	import java.util.Vector;

	public class VectorExample {

	    public static void main(String[] args) {

	        Vector<String> vector = new Vector<>();

	        // Add elements
	        vector.add("Java");
	        vector.add("Python");
	        vector.add("C++");

	        System.out.println("Vector: " + vector);

	        // Access element
	        System.out.println("First element: " + vector.get(0));

	        // Change element
	        vector.set(1, "HTML");

	        // Remove element
	        vector.remove("C++");

	        System.out.println("Updated Vector: " + vector);

	        // Size
	        System.out.println("Size: " + vector.size());
	    }
	}

