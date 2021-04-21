package day36_methods_with_return;

import java.util.Random;

/**
 * add new class Info
 *
 * Method name: fullName
 * No params
 * returns "Mike Smith"
 *
 * Method name: isMarried
 * return false
 *
 * method name: getAge
 * returns 35
 * You do not have permission to send messages in this channel.
 *
 */
public class Info {
    public static void main(String[] args) {
        // fullName();

        System.out.println("fullName = " + fullName());
        System.out.println("isMarried = " + isMarried());
        System.out.println("Age= " + getAge());
        System.out.println("BirthYear = "+ getRandomYear());// dynamic. differnt year each time
        
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);



    }
    public static String fullName () {
        System.out.println("inside fullName method");
        return "Mike Smith";

    }
    public static boolean isMarried () {
        return false;
    }
    public static int getAge (){
        //return 35;
        // or we can do this
        int age = 35;
        return age;
    }
    public static int getRandomYear(){
       Random  random  = new Random();
       int randomYear = random.nextInt(2021);
       return randomYear;

    }

}
