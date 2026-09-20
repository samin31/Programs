package list;

	import java.util.Stack;

	public class StackExample {

	    public static void main(String[] args) {

	        Stack<String> stack = new Stack<>();

	        // Add elements
	        stack.push("Java");
	        stack.push("Python");
	        stack.push("C++");

	        System.out.println("Stack: " + stack);

	        // View top element
	        System.out.println("Top element: " + stack.peek());

	        // Remove top element
	        System.out.println("Removed: " + stack.pop());

	        System.out.println("Stack after pop: " + stack);

	        // Check whether stack is empty
	        System.out.println("Is stack empty? " + stack.isEmpty());
	    
	}}
