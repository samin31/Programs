package list;
	import java.util.ArrayList;

	public class Arraylist {

	    public static void main(String[] args) {

	        ArrayList<String> list = new ArrayList<>();

	        // Add elements
	        list.add("Samin");
	        list.add("Sathik");
	        list.add("Nuzair");
	        list.add("Sabrin");

	        // Display list
	        System.out.println("ArrayList: " + list);

	        // Access element
	        System.out.println("First element: " + list.get(0));

	        // Change element
	        list.set(3, "Kuthbudeen");

	        System.out.println("Updated List: " + list);

	        // Size
	        System.out.println("Size: " + list.size());
	    }
	}

