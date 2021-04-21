package day29_nestedLoop_arrays;

public class CountChartNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int outer = 0; outer < word.length(); outer++) {
            System.out.println("outer:" + word.charAt(outer));
            for (int inner = 0; inner < word.length(); inner++) {
                System.out.println("outer:" + word.charAt(outer));
                System.out.println(word.charAt(inner));
            }
        }

    }
}
