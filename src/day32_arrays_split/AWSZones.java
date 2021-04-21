package day32_arrays_split;
import java.util.Arrays;
public class AWSZones {
    public static void main(String[] args) {
       String app = "etsy";
       String zones = "us-east-1,-us-west-2,us-west-1";
        System.out.println("----starting depoyment of etsy app to AWS zone......");
        String[] zoneToDeploy = zones.split (",");
        for (String eachZone : zoneToDeploy) {

            System.out.println("Deploying["+app+"] to" + eachZone + ".....");
        }
        System.out.println("--- All deployments complete, traffic enabled ----");

    }
}
