package arrays;

public class Question7 {
	    public static boolean checkStart(String text, String prefix) {
	        return text.startsWith(prefix);
	    }

	    public static void main(String[] args) {
	        String greeting = "Hello Samin, welcome!";
	        boolean startsWithHello = checkStart(greeting, "Hello");
	        
	        System.out.println("Does it start with 'Hello'? " + startsWithHello);
	    }
	}
