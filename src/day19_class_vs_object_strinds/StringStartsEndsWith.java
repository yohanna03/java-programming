package day19_class_vs_object_strinds;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("int"));
        System.out.println(word.startsWith("in"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.startsWith("Int"));
        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));
        System.out.println(word.endsWith("A"));

        String firstName = "Dr.Nadir";
        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        }else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        }else if (firstName.startsWith("Mrs")){
            System.out.println("Married woman");
        }else if (firstName.startsWith("Ms.")) {
            System.out.println("single woman");
        }else if (firstName.startsWith("Sr.")) {
            System.out.println("seniorr");
        }else{
            System.out.println("Normal name");

            String url = "https: //www.rambler.ru";
            if (url.endsWith(".com")) {
                System.out.println("Commercial website");
            }else if (url.endsWith(".ru")) {
                System.out.println("Russian web");
            }else if (url.endsWith(".gov")) {
                System.out.println("Government web");
            }else if (url.endsWith(".org")) {
                System.out.println("Organization web");
            }else if (url.endsWith(".edu")) {
                System.out.println("educational web");
            }else {
                System.out.println("Unidentified HTTP");
            }
        }
    }
}
