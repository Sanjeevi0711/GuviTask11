package guviTask11;


	
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	public class FileRead {
	    public static void main(String[] args) {
	        String fileName = "example.txt"; // Change this to your file's name

	        try {
	            // Attempt to open and read the file
	            BufferedReader reader = new BufferedReader(new FileReader(fileName));
	            
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	            reader.close();
	        } catch (FileNotFoundException e) {
	            // Handle the FileNotFoundException by displaying an error message
	            System.out.println("Error: The file '" + fileName + "' does not exist.");
	        } catch (IOException e) {
	            // Handle other IOExceptions, if any
	            System.out.println("Error: An IO error occurred while reading the file.");
	        }
	    }
	}


