package day20_String_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));
        System.out.println(company.contains("a"));

        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word company name");
        }
        String etsyTitle = "wooden spoon | Etsy";

        if (etsyTitle.contains("|")) {
            System.out.println("pass - title check passed");
        } else {
            System.out.println("fail - title check failed");
        }

        String firstName = "ahmed";
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("both a && e are present");
        }else {
            System.out.println("a || e not present");
        }

        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("d")) {
            System.out.println("a or d is present");
        }else {
            System.out.println("a or d is not present");
        }

        String email = "hani@yahoo.com";
        if (email.contains("@") || email.endsWith(".com")) {
            System.out.println("@ or .com is present print it");
        }else {
            System.out.println("@ or .com is not present print it");
        }

    }
}
