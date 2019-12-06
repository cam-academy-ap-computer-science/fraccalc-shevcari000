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
    	
    	String num1 = input;
    	String operator = "";
    	String num2 = "";
    	int numindex = num1.indexOf("+");
    	//System.out.println(num1.substring(0,numindex));
    	System.out.println(num1.substring(numindex  + 1));
    
    	
    	return num1;
    	
    }
    }

    
    // TODO: Fill in the space below with any helper methods that you think you will need
    

