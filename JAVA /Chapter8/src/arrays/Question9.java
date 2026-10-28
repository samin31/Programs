package arrays;

public class Question9 {

	    public static String cleanSpaces(String text) {
	        return text.trim();
	    }

	    public static void main(String[] args) {
	        String messyText = "    Hello Samin!    ";
	        String cleanedText = cleanSpaces(messyText);
	        
	        System.out.println("Before trim: '" + messyText + "'");
	        System.out.println("After trim:  '" + cleanedText + "'");
	    }
	}
