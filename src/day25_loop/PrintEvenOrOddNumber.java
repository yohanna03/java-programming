package day25_loop;

public class PrintEvenOrOddNumber {
    public static void main(String[] args) {
        int sum = 0;
        for (int n = 1; n <= 100; n++) {
            if (n % 2 == 0){
                System.out.print(n + " ");
            }
            System.out.println("\n ODD NUMBER 0-100:");
            for (int k = 0; k <= 100; k++) {
                if (k % 2 != 0) {
                    System.out.println( k + "");
                }
            }
        }

    }
}
