package day19_class_vs_object_strinds;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "Java Is Fun";
        System.out.println(word);
        //convert word to all Lowercase
        System.out.println(word.toLowerCase());
        System.out.println("CYBERTEK".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);
        // change word to all lowercase letters. and assign back
        word = word. toLowerCase();
        System.out.println("word = "+ word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java". toUpperCase());

        //change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
