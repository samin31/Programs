package arrays;

public class Question2 {
	    public static String reverseString(String text) {
	        String reversed = "";
	        for (int i = text.length() - 1; i >= 0; i--) {
	            reversed += text.charAt(i);
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	        String name = "Samin";
	        String result = reverseString(name);
	        
	        System.out.println("Original: " + name);
	        System.out.println("Reversed Output: " + result);
	    }
	
}
