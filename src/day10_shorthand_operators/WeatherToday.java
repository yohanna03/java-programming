package day10_shorthand_operators;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how is the weather today?");
        //String weather= "rainy";
        //string weather = "";
        String weather = scan.next();
        System.out.println( weather + "- is a nice day today!");


    }
}
