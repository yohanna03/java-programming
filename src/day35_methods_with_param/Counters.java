package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(6);
        int num = 455;
        count(num);
        String word = "wooden spoon";
        count(word.length());

        printAge(1993);
        printAge(1991);

        int birthyear = 2021;
        printAge(birthyear);

    }

    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
    /**
     * method name: printAge
     * @param/input: intyear
     * birth year: 2984.age:38
     *
     */
    public static void printAge(int year){
        int age = 2021-year;
        System.out.println("birth year " +year + ". Age: " + age);

    }

}
