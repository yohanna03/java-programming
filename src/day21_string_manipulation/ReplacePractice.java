package day21_string_manipulation;

/**
 add new package day21_string_manipulation
 add new class ReplacePractice
 main method

 String word = "github";
 System.out.println(word.toUpperCase());
 OUTPUT:
 "GITHUB"
 You do not have permission to send messages in this channel.

 */
public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","leb"));
        System.out.println(word.replace("github","gitleb"));
        System.out.println("word = " + word);
        
        word = word.replace("hub","lab");
        System.out.println("word = " + word);

        //gitlab
        //i->0 a-i --> gotlab

        String sentence = "Java is fun!";
        String withNoSpaces = (sentence.replace(" ", ""));
        System.out.println("withNoSpaces = " + withNoSpaces);
        //"java" -> "selenium" , "fun" -> "a lot of fun" --> assign back to sentence
        sentence = sentence.replace("java","selenium").replace("fun"," a lot of fun");
        // or u can do the same thing in different way 
        sentence = sentence.replace("java","selenium");
        sentence = sentence.replace("fun"," a lot of fun");
        // or u can do the same thing in different way 
       // sentence = sentence.replace("java","selenium");
        //                    .replace("fun"," a lot of fun");
        System.out.println("sentence = " + sentence);
        
        String result = "1-48 of over 4,000 result for java book";
        result = result.replace("1-48 of over ","")
                        .replace(",","")
                        .replace("result for java book","");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);
        count++;
        if(count > 0) {
            System.out.println("Search success");
        }
    }
}
