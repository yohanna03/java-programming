package day38_methods;

public class ArrayUtil {

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }

    public static boolean contains(int[] nums, int num) {
        boolean found = false;
        for (int each : nums) {
            if (each == num) {
                found = true;
                break;
            }
        }
       return found;
    }

}
