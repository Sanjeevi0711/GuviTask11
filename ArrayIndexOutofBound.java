package guviTask11;

public class ArrayIndexOutofBound {
	
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Access an element outside the bounds of the array
            int value = numbers[10];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}



   








