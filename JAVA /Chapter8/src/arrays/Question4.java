package arrays;

public class Question4 {

	    public static String replaceSpaces(String text) {
	        return text.replace(' ', '-');
	    }

	    public static void main(String[] args) {
	        String sentence = "Samin loves Java programming";
	        String updated = replaceSpaces(sentence);
	        
	        System.out.println("Updated String: " + updated);
	    
	}}
