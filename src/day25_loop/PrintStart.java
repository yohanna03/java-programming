package day25_loop;

public class PrintStart {
    public static void main(String[] args) {
        for (int start = 1; start <= 15; start++) {
            System.out.print(" \uD83C\uDF1F ");
        }
        System.out.println();
        String myStart = "";
        //for loop: fill 5 starts to myStart variable
        for (int start = 1; start <= 5; start++) {
            //myStart = myStart +"*";
            myStart += "* ";
        }
        System.out.println("my Start = " + myStart.trim());
    }
}
