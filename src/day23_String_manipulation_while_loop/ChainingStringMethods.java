package day23_String_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = " woo den sp oon";
        System.out.println(word.toUpperCase().toLowerCase().length());

        // remove space first then print everything uppercase
        System.out.println(word.replace(" "," ").toUpperCase());

       // selenium.findElement(By.id("hi")).click();
        String city = "ISTANBUL";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

     //.isEmpty().toUpperCase() does not work since isEmpty is boolean



    }
}
