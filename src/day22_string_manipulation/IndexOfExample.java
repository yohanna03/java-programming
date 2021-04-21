package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java,html, css, selenium, testing, maven, cucumber";
        //first comma
        System.out.println(technologies.indexOf(","));
        //second comma
        System.out.println(technologies.lastIndexOf(","));
        //for middle one, we need to loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava );

        int idxOfCss = technologies.indexOf("cass");
        System.out.println("css is at index" + idxOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sq");//not present-1
        System.out.println("sql is at index"+indexOfSql);

        //technologies contains "maven"
        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        }else {
            System.out.println("maven is not present");
        }
        if (technologies.indexOf("maven")>-1) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
        String word = "hello";
        System.out.println(word.indexOf("h"));
        System.out.println(word.indexOf("el"));
        System.out.println(word.indexOf("lo"));

        String word1 = "hello";
        System.out.println(word.substring(0,2));
        System.out.println(word.substring(1,4));
        System.out.println(word.substring(2,4));


    }
}
