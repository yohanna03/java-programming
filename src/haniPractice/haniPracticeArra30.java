package haniPractice;

import java.util.*;

public class haniPracticeArra30 {
    public static void main(String[] args) {
       String[] student1 = new String[5];
       student1[0] = "Ab1234";
       student1[1] = "yohanna";
       student1[2] = "yemane";
       student1[3]="22";
       student1[4] = "09387474";

        String[] student2 = {"ab1234","hanna","andemicael,","22","009887474"};
        System.out.println("student1 id ="+ student1[0]);
        System.out.println("student2 id = " + student2);

        int[] nums = {22,55,11};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
           // System.out.println(nums.length);

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);

        }
         //for each loop works with
        int[] num = {33,11,64};
        for ( int eachNum : nums){
            System.out.println(eachNum);
        }
        for (int variable : nums) {
            System.out.println(variable);

        }
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
        for (int  each : data) {
            System.out.println("data = " + each);
       }
        double [] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] country =  {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil", "Portugal",
                "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia", "Philippines", "China", "Colombia",
                "Philippines", "Honduras", "Indonesia", "Brazil", "China", "United States", "Russia"};
        /**
         *  for (double price : prices ){
         *             if (price >= 10 || price <= 70 ) {
         *                 System.out.println(price + " ");
         *             }
         *
         *         }
         *         System.out.println("\n ----- count of the price that are more than 50 ---- ");
         *         // count = 7
         *         int count = 0;
         *         for (double each : prices){
         *             if (each > 50 ) {
         *                 count++;
         *
         *             }
         *         }
         *         System.out.println("count =" + count);
         *         System.out.println("\n -------countries with name length more than 7 - inclusive -----");
         *         for ( String country : countries) {
         *             if (country.length() >= 7) {
         *                 System.out.print(country + " - " + country.length() + " ");
         *             }
         */
        for (double eachprice : prices) {
            for (double price : prices) {

                if (price >= 10 || price <= 70) {
                    System.out.println(price + "");
                }
                System.out.println(price + "");
            }
            System.out.println("\n ----- count of the price that are more than 50 ---- ");

            int count = 7;
            for (double each : prices) {
                if (count > 50) {
                    count++;

                }

            }
            System.out.println("count =" + count);
            System.out.println("\n -------countries with name length more than 7 - inclusive -----");
            for (String countries : country) {
                if (countries.length() >= 7) {
                    System.out.print(countries + " - " + countries.length() + " ");
                }


            }
        }
    }
}












