package day25_loop;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println("Enter third number:");
        int num3 = scan.nextInt();
        int medium;
        if(( num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)){
            medium = num2;
        }else if (( num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2)) {
            medium = num1;
        }else {
            medium = num3;
        }
        System.out.println("medium value is: " + medium);

    }
}

