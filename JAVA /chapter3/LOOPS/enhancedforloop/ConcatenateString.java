package enhancedforloop;

public class ConcatenateString {

	
	    public static void main(String[] args) {
	        String[] words = {"Java", "is", "Easy"};
	        String result = "";

	        for (String word : words) {
	            result += word + " ";
	        }

	        System.out.println(result);
	    }
	}
