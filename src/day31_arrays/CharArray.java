package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        // print each letter using a loop

        for (char each : letters) {
            System.out.print(each + " ");
        }
        String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);

        String item =  "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());

        String[] fruits= {"bannas" , "apples" , "kiwi" , "mango", "papaya", "strawberry "};
        String fruitStr ="";
        for (String each : fruits) {
            System.out.print(each + "-");
            fruitStr += each + "-";
        }
        System.out.println("\nfruitStr = " + fruitStr);

        // new
         String[] languages = {"java", "python", "c++", "sql", "ruby" ,"javascript"};
        System.out.println( String.join("I",languages));
        System.out.println( String.join("##",languages));
        String joinedLanguages = String.join("<>", languages);
        System.out.println("joinedLanguage = "+joinedLanguages);



    }
}

