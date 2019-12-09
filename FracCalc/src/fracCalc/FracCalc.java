package fracCalc;

import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
    	Scanner userInput = new Scanner (System.in);
    	System.out.println("Enter a equation: ");
    	String input = userInput.nextLine();
    	System.out.println(produceAnswer(input));

    }

    
    public static String produceAnswer(String input) {
    	int firstSpace = input.indexOf(' ');
    	String num1 = input.substring(0, firstSpace);
    	return num1;
       //input.contentEquals("quit")
    }
	}  

    
    // TODO: Fill in the space below with any helper methods that you think you will need
    

