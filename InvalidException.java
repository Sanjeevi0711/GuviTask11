package guviTask11;

public class InvalidException {
	
	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	
	    public static void main(String[] args) {
	        try {
	            // Read user input for age
	            int age = readAge();

	            
	            if (age < 18) {
	                throw new InvalidAgeException("Age must be 18 or older.");
	            }

	            
	            System.out.println("Age is valid: " + age);
	        } catch (InvalidAgeException e) {
	            
	            System.out.println("Error: " + e.getMessage());
	        } catch (java.util.InputMismatchException e) {
	            // Handle input mismatch (non-integer input)
	            System.out.println("Error: Invalid input. Please enter a valid age.");
	        }
	    }

	    public static int readAge() {
	        java.util.Scanner scanner = new java.util.Scanner(System.in);
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        scanner.close();
	        return age;
	    }
	}



