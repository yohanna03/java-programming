package day31_arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {5,1,7,0,5,44,55,-4,22};
        //print all nums in sam nums
        System.out.println(Arrays.toString(nums));
        //sort nums.
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

       // Arrays.sort(nums,collection,reverseOrder());

        String[] words = {"java" ," c# ", "c++", "kotlin" , "python", "ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(",", words) + "]");
        //sort word in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort word in reverse order
        Arrays.sort(words, Collections.reverseOrder());

        System.out.println(Arrays.toString(words));
        

    


    }
}
