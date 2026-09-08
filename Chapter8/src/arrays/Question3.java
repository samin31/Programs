package arrays;

public class Question3 {

	    public static void compareStrings(String str1, String str2) {
	        if (str1.equals(str2)) {
	            System.out.println("Samin, both strings are EXACTLY equal!");
	        } else {
	            System.out.println("Samin, the strings are NOT equal.");
	        }
	    }

	    public static void main(String[] args) {
	        String s1 = "Java";
	        String s2 = "Java";

	        compareStrings(s1, s2);
	    }
	
}
