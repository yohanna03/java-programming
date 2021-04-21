package day14_multi_branch_is_statements;
/**
 num1, num2
 char operator -> -, +, *, /

 when operator: + : add num1, num2
 when operator: - : minus num1, num2
 when operator: * : multiply num1, num2
 when operator: / : divide num1, num2
 any other: "invalid operator"
 */
import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 number");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Enter operator: -,+,*,/");
        char operator = scan.next() .charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        }else if (operator == '-') {
            System.out.println(num1 - num2);
        }else if (operator == '*') {
            System.out.println(num1 * num2);
        }else if (operator == '/') {
            System.out.println(num1 / num2);
        }else {
            System.out.println("Invalid operator - " + operator);
        }
    }
}


