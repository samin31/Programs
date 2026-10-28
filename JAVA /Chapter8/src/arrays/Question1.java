package arrays;

public class Question1 {
	    public static int countVowels(String text) {
	        int count = 0;
	        text = text.toLowerCase();
	        
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String input = "Hello Samin";
	        int totalVowels = countVowels(input);
	        
	        System.out.println("Text: " + input);
	        System.out.println("Samin's Vowel Count: " + totalVowels);
	    }
	
}
