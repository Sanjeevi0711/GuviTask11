package guviTask11;

public class StringIndexOutofBound {
	 public static void main(String[] args) {
	        String text = "Hello, World!";

	        try {
	            // Attempt to access a character beyond the length of the string
	            char character = text.charAt(15);
	            System.out.println("Character: " + character);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
	        }
	    }
	
}
