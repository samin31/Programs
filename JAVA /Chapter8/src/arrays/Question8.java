package arrays;

public class Question8 {
	    public static int countWords(String text) {
	        String[] words = text.split(" ");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String phrase = "Java is fun";
	        int totalWords = countWords(phrase);
	        
	        System.out.println("Phrase: " + phrase);
	        System.out.println("Samin's Word Count: " + totalWords);
	    }
	
}
