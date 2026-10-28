package list;
import java.util.List;

	public class LinkedList {

	    public static void main(String[] args) {

	        linkedlist<String> list = new linkedlist<>();

	        // Add elements
	        list.add("Java");
	        list.add("Python");
	        list.add("C++");

	        System.out.println("LinkedList: " + list);

	        // Add element at first
	        list.addFirst("HTML");

	        // Add element at last
	        list.addLast("CSS");

	        System.out.println("After adding: " + list);

	        // Remove first element
	        list.removeFirst();

	        // Remove last element
	        list.removeLast();

	        System.out.println("After removing: " + list);
	    }
	
}
