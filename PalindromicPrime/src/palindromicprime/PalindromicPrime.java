/*
 Created by Michael Kibler
Last edit 7-24-2017
 */
package palindromicprime;


public class PalindromicPrime {

    public static void main(String[] args) {
       
        
        
        
        int nums = 100;

        System.out.println("Palindromic prime numbers: ");
        System.out.println("==========================");
        
        printNumbers(nums);

    }//==========================End of main====================================
    
 
    public static void printNumbers(int primeNumbers) {
        final int numPerLine = 10;        
        int count = 0, number = 2;      

        while (count < primeNumbers) {
            if (isPalindrome(number) && isPrime(number)) {
                count++;

                if (count % numPerLine == 0) {
                    System.out.println("\t" + number);
                } 
                else 
                    System.out.println("\t" + number);
                
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    } 

// ==========================End of Prime number================================

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return number == reverse;
    }  //=====================End palindromic number============================
}
