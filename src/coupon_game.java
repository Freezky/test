/**
 * Assignment #1
 * Written by: Kevyn Bele-Binda 260577325 & Jamie Alexander 260706596
 * For CCCS300 - Programming techniques 1
 */

/**
 * Answers to the questions
 * a) This problem have 1 input, the number of coupon(s).
 *
 * b) There are 3 outputs required, they're required to show text to the user screen
 *
 * c) - Displaying the introduction text
 * - Asking for the user input (the number of coupons he won)
 * - Calculating how much candy bar you can have with that by dividing the input by 5
 * - Calculating the number of remaining coupons by using a modulo operator
 * - Calculating the number of free games you can get by dividing the number of remaining coupons by 3
 * - Calculating the number of spare coupons by getting the remainder of the number of remaining coupons by 3
 * - Displaying the final results in an output
 *
 *  d) Testing program algorithm with 16 coupons and 2 coupons :
 * - user input : 16
 * - Number of candy bars : 16/5 = 3.2 (only taking the integer part so 3)
 * - Number of remaining coupons : 16%5 = 1
 * - Number of free games : 1/3 = 0.33 (only taking the integer part so 0)
 * - Number of spare coupons : 1%3 = 1
 * - Exit program
 *
 * - user input : 2
 * - Number of candy bars : 2/5 = 0.4 (only taking the integer part so 0)
 * - Number of remaining coupons : 2%5 = 2
 * - Number of free games : 2/3 = 0.66 (only taking the integer part so 0)
 * - Number of spare coupons : 2%3 = 2
 * - Exit program
 */
import java.util.Scanner; // Importing the Scanner class

public class coupon_game {
    public static void main(String[] args){ // Creating the main class
        Scanner input = new Scanner(System.in); // Creating a scanner for the user input
        System.out.println("Hello, welcome to the Redeem Coupon Game's application ! \n " +
                "Presented by Kevyn Bele-Binda \n "); //Brief intro to the program
        System.out.print("Let's start by entering the number of coupon(s) you won : ");
        int numberOfCoupons = input.nextInt(); // Retrieving user input
        int numberOfCandyBars = numberOfCoupons/5;
        int numberOfRemainingCoupons = numberOfCoupons % 5;
        int numberOfFreeGames = numberOfRemainingCoupons/3;
        int spareCoupons = numberOfRemainingCoupons % 3;

        // Printing final results with the end of the program text
        System.out.println("With "+numberOfCoupons+" coupon(s) you can get up to "+numberOfCandyBars+" " +
                "Candy Bar(s) and "+numberOfFreeGames+" Free Game(s) ! You still have "+spareCoupons+" " +
                "spare coupon(s) left. \n\n The program is now over");
    }

}
