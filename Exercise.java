/*
 *Author: Stephan Sommer
 *Date: 9-2-19
 *Course: COMP2243-31
 *Description:Exercise Assassignment 1
 *             
 */

         // a) Imports the class Scanner
import java.util.*;

public class Exercise{

  public static void main(String [] args){
  
  
        // b) Declare console to be a Scanner object
       Scanner console = new Scanner(System.in);
      
       // c) Declare Constants
       int SOME_VALUE = 13;
       double DISCOUNT_RATE = 7.85;
   
 
      
       // d) declare variables
      int number1,number2,number3;
      int sum;
      String itemName;
      double purchasePrice, discountAmount;
      
      
       //e) Input two integers
      System.out.println("Enter first number: ");
      number1 = console.nextInt();
      
      System.out.println("Enter second number: ");
      number2 = console.nextInt();
      
      
      // f) output the value
      System.out.println("\nThe value of number1 = " + number1 + " and the value of number2 = " + number2 + ".");
      
      
      // g) calculations
      System.out.println("\n" + number1 + " + " + number2 + " = " + (number1+number2));
      System.out.println( number1 + " - " + number2 + " = " + (number1-number2));
      System.out.println( number1 + " * " + number2 + " = " + (number1*number2));
      System.out.println( number1 + " / " + number2 + " = " + (number1/number2));
      System.out.println( number1 + " % " + number2 + " = " + (number1%number2));
      
      // h) multiply the value
      number3 = number1 * 3 + number2;
      
      // i) Output the Value of number3 
      System.out.println("\nThe value of number3 = " + number3);
      
      // j) update the value
      number3 += SOME_VALUE;
      System.out.println("The value of number3 + SOME_VALUE = " + number3);
      
      // k) output value of number3 with message
      
      // l) enter retail item name
      System.out.println("\nEnter item name");
      console.nextLine();
      itemName = console.nextLine();
      
      // m) enter decimal number
      System.out.println("Enter purchase price as a decimal number: ");
      purchasePrice = console.nextDouble();
      
      // n) multiple the value
      discountAmount = purchasePrice * DISCOUNT_RATE / 100;

      // p) output the result
      System.out.println("\nItem Name: " + itemName);
      System.out.println("Discount Rate: " + DISCOUNT_RATE);
      System.out.println("Item Price: $ " + purchasePrice);
      System.out.println("Discount Amount: $ " + purchasePrice * DISCOUNT_RATE / 100);
      System.out.println("Total Amount: " + (purchasePrice - discountAmount));
            
   } // end main


} //end class