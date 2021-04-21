package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13,18));
        System.out.println(result.substring(13));
        //find the index Of
        System.out.println(result.indexOf(":"));
        int colonIndex =result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));
        //now we can combin them into 1 statement
        System.out.println(result.substring(result.indexOf(":")+1));
        /**
         * find indexof
         * find indeof
         * provide them asstart.end
         */

        String today = "i learned [java] today";
        System.out.println(today.indexOf("]"));
        System.out.println(today.indexOf("[")+1);
        //System.out.println(today.substring());


    }
}
