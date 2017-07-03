/*
 Created by Michael Kibler
Last edit on 7-2-2017
I was confused by what you meant by outputing the new range. I hope the hint system is what you meant.

*/
package guessmegame;

import java.util.Scanner;
public class GuessMeGame {

    
    
    private static Scanner in = new Scanner (System.in);
    public static void main(String[] args) 
    {
     
    //Variables declared    
        
    int guessCount = 1;
    int randomNumb = 1 + (int)(Math.random() * 10000);
    int guess = 0;
    int minHint = 100;
    int maxHint = 200;     
    int hintSet = randomNumb + minHint + (int)(Math.random() * maxHint);
    int hint = hintSet - minHint + (int)(Math.random() * maxHint);
    

//System asks user initial question.
    
    System.out.println("I am thinking of a number between 1 and 10,000");
    System.out.println("The number is near " + hint + ".");
    
    
    //Begin while loop
    
    while(guess != randomNumb){
        
     hintSet = randomNumb + minHint + (int)(Math.random() * maxHint);
     hint = hintSet - minHint + (int)(Math.random() * maxHint);    
        
    guess = in.nextInt();
        if(guess < 1){
            guessCount = guessCount + 1;
            minHint = minHint - 10;
            maxHint = maxHint - 10;       
            System.out.println("Please try again. You guessed a number less than 1.");
        
        } 
        else if(guess > 10000){
            guessCount = guessCount + 1;
            minHint = minHint - 10;
            maxHint = maxHint - 10;       
            System.out.println("Please try again. You guessed a number greater than 10,000.");
            
        }    
        else if(guess > randomNumb){
            guessCount = guessCount + 1;
            minHint = minHint - 10;
            maxHint = maxHint - 10;       
            System.out.println("That is incorrect. The number is lower. The number is near " + hint + ".");
        
        }
        else if(guess < randomNumb){
            guessCount = guessCount + 1;       
            System.out.println("That is incorrect. The number is higher. The number is near " + hint + ".");
        
        }
        else
            System.out.println("You are correct! You guessed " + guessCount + " time(s).");
           
        }
    //End of while loop
    }
}

