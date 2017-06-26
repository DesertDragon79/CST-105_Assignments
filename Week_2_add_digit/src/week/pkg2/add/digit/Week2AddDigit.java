/*
 
Created by Michael Kibler
 
Last edit on 6-24-2017
 */
package week.pkg2.add.digit;

import java.util.Scanner;
public class Week2AddDigit {

//importing scanner
    
    private static Scanner in = new Scanner (System.in);
    public static void main(String[] args) 
    {

        System.out.println("Please input a positive number and press enter.");

//Declaring variables
        int input = in.nextInt();
        int sum = 0;
        
        //Begin While loop
        
        while (input > 0)
        {
        
            int add = input % 10;
            sum = sum + add;
            input = input / 10;
            
        }
        //End while loop
        
        System.out.println("The sum of the number's digits is:");
        System.out.println(sum);
        
    }
    
}
