package day05_primitives_concatanantion;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Palo Alto Network";
        String jobDescription = "Experience in Java, Selenium, cucumber, Tomato, JUnit";
        double salary = 123000;
        byte yearExp = 3;
       boolean hasBenefits = true;

       System.out.println("Title:\t\t\t "               + title);
       System.out.println("Company:\t\t\t "             + company );
       System.out.println("Job description:\t\t"        + jobDescription);
       System.out.println("Salary:\t\t\t\t$ "           + salary);
       System.out.println("Years of experience:\t"      + yearExp);
       System.out.println("Has benefits?\t\t"           + hasBenefits);
    }
}
