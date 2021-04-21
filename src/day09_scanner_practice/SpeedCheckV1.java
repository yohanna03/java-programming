package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckV1 {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 70;
        int overTheLimit = currentSpeed -speedLimit;
        System.out.println("you are driving " + overTheLimit + " mph over the limit. slow down!");

    }
}
