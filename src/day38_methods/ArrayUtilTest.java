package day38_methods;

import day31_arrays.ArraysUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int [] nums = {5,23,1,543,90};
        ArrayUtil.printArray(nums);
        ArrayUtil.printArray(new int[]{23,64,23,534,234,45,234,45});

        System.out.println("sum = " + ArrayUtil.sum(nums));
        System.out.println("sum = "+ ArrayUtil.sum(new int[]{64,23,534,234,4523,64,23}));

        int [] nums2 = {4,1,5,8};

        System.out.println("5 found = " + ArrayUtil.contains(nums2,5));
        System.out.println("10 found = " + ArrayUtil.contains(nums2,10));

}
}
