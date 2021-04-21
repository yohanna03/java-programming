package day29_nestedLoop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10 ;//single variable
        int[] nums = new int[3];  // arrays
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        int i =0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);
        // how to find out the size of the array.
        System.out.println("number of elements = " + nums.length);
        //store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);
        //change value in the array:
        nums[0] = 100;
        nums[1] = 300;
        // read the value of index 1 and assign same to index 2
        nums[2] = nums[1];

        System.out.println("num[0] = " + nums[0]);
        System.out.println("num[1] = " + nums[1]);
        System.out.println("num[2] = " + nums[2]);






    }
}
