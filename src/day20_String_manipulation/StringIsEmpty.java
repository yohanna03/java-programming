package day20_String_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length()==0);
        if (jobTitle.isEmpty()) {
            System.out.println("jobTitle  is missing, please resend");
        }else {
            System.out.println("jobTitle is not empty");
        }
        if (jobTitle.length()==0){
            System.out.println("jobTitle is empty");
        }else {
            System.out.println("jobTitle is not empty");

        }
        System.out.println(jobTitle.equals(""));
        if ("". equals(jobTitle)) {
            System.out.println("jobTitle is empty");
        }else{
            System.out.println("jobTitle is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());
        //if veggie is not empty, print we have carrot

        if (!veggie.isEmpty()) {
            System.out.println("we have " + veggie);
        }


    }
}
