package day27_loop;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 's';
        int index = -1;
        for (int i = 0; i < word.length() - 1; i++) {
            System.out.println(i + "-" + word.charAt(i));
            if (word.charAt(i) == letter) ;
            index = i;
            System.out.println(letter + "is found at index" + index);
            break;
        }
        if (index == -1) {
            System.out.println(letter + " is not present");
        }

    }

}

