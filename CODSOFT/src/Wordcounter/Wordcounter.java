package Wordcounter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Wordcounter {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	
	        Scanner scanner1 = new Scanner(System.in);
	        System.out.print("Enter text or file path: ");
	        String input = scanner1.nextLine();

	    
	        String text;
	        if (input.equals("")) {
	            System.out.println("Please enter text or file path.");
	            return;
	        } else if (new File(input).exists()) {
	            try {
	                text = readFile(input);
	            } catch (FileNotFoundException e) {
	                System.out.println("File not found: " + input);
	                return;
	            }
	        } else {
	            text = input;
	        }

	        String[] words = text.split("[\\s\\W]+");

	        int wordCount = 0;


	        for (String word : words) {
	            wordCount++;
	        }


	        System.out.println("The total number of words is: " + wordCount);
	    }

	    private static String readFile(String filePath) throws FileNotFoundException {
	        StringBuilder text = new StringBuilder();
	        Scanner scanner = new Scanner(new File(filePath));
	        while (scanner.hasNextLine()) {
	            text.append(scanner.nextLine() + "\n");
	        }
	        scanner.close();
	        return text.toString();
	    }
	}
