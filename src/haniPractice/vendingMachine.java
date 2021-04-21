package haniPractice;
import java.util.*;
public class vendingMachine {
    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner input = new Scanner(System.in);

        int num, quarters, dimes, nickels, pennies;

        System.out.println("Enter cents:");
        num = input.nextInt();

        if (num > 0 && num < 100){
            quarters = num / 25;
            int remainingCentsQuarters = num % 25;
            dimes = remainingCentsQuarters / 10;
            int remainingCentsDimes = remainingCentsQuarters % 10;
            nickels = remainingCentsDimes / 5;
            pennies = remainingCentsDimes % 5;
            System.out.println ("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies");

        } else {
            System.out.println("Invalid cents amount");
        }
    }
}
