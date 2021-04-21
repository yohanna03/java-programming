package day12_conditional_statements;
//import java.util.Scanner;
public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 45;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(speedLimit == currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding );
        System.out.println("currentSpeed = " +currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        currentSpeed += 20;

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding );
        System.out.println("currentSpeed = " +currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        double accountBalance = 250.25;
        double itemPrice = 100;
        System.out.println("can I afford? - " + (accountBalance >= itemPrice));

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford = " + canAfford);

        // decrease balance by itemPrice.using shorthand operator
        accountBalance  = accountBalance - itemPrice;
        accountBalance  -= itemPrice;

        boolean isBroke = accountBalance > speedLimit;
        System.out.println("are you speeding?-" + isSpeeding);






    }
}
