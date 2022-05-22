package Assignment2;

import java.util.*;

public class fiboSequence {

    public static int fibonacci(int seqNum) {
    	
    	if (seqNum <= 1)
    		return seqNum;

    		return fibonacci(seqNum-1) + fibonacci(seqNum-2);
}
    public static void main (String args[]) {

    	int seqNum;
    	
    	System.out.println("***FIBONACCI SEQUENCE PROGRAM***\n");
    	System.out.println("Program is starting\nPlease wait...\n");
    	@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
    	System.out.println("You may now enter a value of nth term in the Fibonnaci Sequence\nPlease type in the number here:");
    	seqNum = userInput.nextInt();
    	System.out.println("\nInput received...\nCalculating results...\n");
    	System.out.println("The "+ seqNum +"th term of the Fibonacci sequence is "+ fibonacci(seqNum) + ".");
    }
}
