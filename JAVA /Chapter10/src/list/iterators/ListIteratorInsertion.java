package iterators;
	import java.util.ArrayList;
	import java.util.ListIterator;

	public class ListIteratorInsertion {
	    public static void main(String[] args) {

	        ArrayList<String> tasks = new ArrayList<>();

	        tasks.add("Study Java");
	        tasks.add("Complete Assignment");
	        tasks.add("Practice Coding");

	        ListIterator<String> iterator = tasks.listIterator();

	        // Insert Header at index 0
	        iterator.add("Header");

	        // Move cursor to the end
	        while (iterator.hasNext()) {
	            iterator.next();
	        }

	        // Insert Footer at the end
	        iterator.add("Footer");

	        System.out.println("Final Task List:");

	        for (String task : tasks) {
	            System.out.println(task);
	        }
	    }
	}
