package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if (first == last) {
            System.out.println("first and last letter match");
        }else {
            System.out.println("first and last letter mismatch");
        }
        if (word.charAt(0)==word.charAt(2)) {
            System.out.println("first and last letter match");
        }else {
            System.out.println("first and last letter mismatch");
        }
        String friend = "aziza";
        char firstletter = friend.charAt(0);
        char lastletter = friend.charAt(friend.length()-1);
        System.out.println(firstletter);
        System.out.println(lastletter);

        if (firstletter == lastletter) {
            System.out.println(friend + "- firsts and last match");
        }else
            System.out.println("" );

    }
}
