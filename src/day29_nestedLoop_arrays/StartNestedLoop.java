package day29_nestedLoop_arrays;

public class StartNestedLoop {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int  outer = 1; outer <= 10; outer++ ){
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int  outer = 1; outer <= 10; outer++ ){
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
