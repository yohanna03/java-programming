package day30_arrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
         student1[0] = "Ad2345";
         student1[1] = "yohanna";
         student1[2] = "yemane";
         student1[3] = "B22";
         student1[4] = "202-323-2321";

         String[] student2 = {"MK4421","mike","Bloomberg","B22","703-323-4353"};
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastname = " + student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 phone num = " + student1[4]);

        System.out.println("student data length: " + student1.length);
        /**check if student1 data array contains 5 item.
         true: pass: data array has correct length.
        false: fail: data array has incorrect length.
         **/

        if ( student1.length == 5 ){
            System.out.println("pass: data array has correct length.");
        } else {
            System.out.println("fail: data array has incorrect length.");
        }

        /**
         * chec if student1 and student1 arrays have same number of data
         * true: pass: data arrays length match.
         * false : fail: data arrays length mismatch.
         */

        if ( student1.length == student2.length ) {
            System.out.println("pass: data arrays length match.");
        } else {
            System.out.println("fail: data arrays length mismatch.");

        }
        /**
         * print from array firstname and lastname in all uppercase
          YOHANNA YEMANE
         */

                // "yohanna"---->"YOHANNA"
        System.out.println(student1[1].toUpperCase()+ " " + student1[2].toUpperCase());
        String mobilenum = student1[4];
        System.out.println(mobilenum.length());
        System.out.println(mobilenum.startsWith("202"));




    }
}
