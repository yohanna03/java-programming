package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyRate = scan.nextDouble(); hourlyRate = 53.0;
        double hourlyRater = 50.0;
        double weeklyPay = hourlyRater * 40;
        double monthlyPay = weeklyPay * 52 /12;
        double annualPay =  monthlyPay * 12;

        System.out.println("weekly pay: " + weeklyPay);
        System.out.println("monthly pay: " + monthlyPay);
        System.out.println("annualPay = " + annualPay);
    }
}
