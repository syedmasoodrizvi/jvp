package Lab_12;
import java.util.Scanner;
public class Task2 {
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);  
		Scanner b = new Scanner(System.in);  
		System.out.println("Enter 1st Number: ");
		int Number1 = a.nextInt(); 
		System.out.println("Number 1 is " + Number1); 
		System.out.println("Enter 2nd Number: ");
		int Number2 = b.nextInt(); 
	    System.out.println("Number 2 is " + Number2);  
	    try{
	    	System.out.println("Answer is: " + Number1/Number2);
	    	throw new ArithmeticException("Cannot take value in decimal.");
	    

	    	}
	    	catch(ArithmeticException e){
	    	System.out.println("Number should not be divided by zero.");
	    	}
	}}
