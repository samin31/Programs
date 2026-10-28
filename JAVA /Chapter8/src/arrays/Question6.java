package arrays;

public class Question6 {

	    public static String extractSub(String text) {
	        // "gram" starts at index 3 and ends before index 7
	        return text.substring(3, 7); 
	    }

	    public static void main(String[] args) {
	        String word = "Programming";
	        String extracted = extractSub(word);
	        
	        System.out.println("Extracted Word: " + extracted);
	    }
	}

