package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = " yohanna ";
        for(int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) + " ");
        }
        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }











        /**
        System.out.print(word.length());
        System.out.print(word.charAt(0));
        System.out.print(word.charAt(1));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(3));
         **/

    }
}
