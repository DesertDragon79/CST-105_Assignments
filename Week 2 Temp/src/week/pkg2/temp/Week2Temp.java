/*
Created by Michael Kibler
Last edit on 6-24-2017
 */
package week.pkg2.temp;



import java.util.Scanner;
public class Week2Temp {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       
       //Fahrenheit to Celsius.
       
       System.out.print("Enter a temperature in Fahrenheit: ");
       
       double fahrenheit = input.nextDouble();
       double celsius = (5.0 / 9) * (fahrenheit - 32);
       
       System.out.println(+ fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius.");
       
       //Celsius to Fahrenheit.
       
       System.out.print("Enter a temperature in Celsius: ");
       
       double celsius2 = input.nextDouble();
       double fahrenheit2 = (9.0 / 5) * celsius2 + 32;      
       
       
       System.out.println(+ celsius2 + " degrees celsius is " + fahrenheit2 + " degrees Fahrenheit.");
               
    }
    
}
