package haniPractice;

import java.util.Arrays;

public class assementReve {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        System.out.println(Arrays.toString(num));
        num[0] = 3;
        System.out.println(Arrays.toString(num));
        System.out.println("-------------------");

        String[] name= {"yohanna","hani","java","yemane"};
        int size = name.length;

        String[] words = {"yohanna","hani","javad","yemane"};
        System.out.println(words[1].toUpperCase());
        words[1]= words[1].toUpperCase();
        System.out.println(Arrays.toString(words));
        words[2].substring(0,4);
        System.out.println(Arrays.toString(words));
        words[2]=words[2].substring(0,4);
        System.out.println(Arrays.toString(words));

       char letter = words[0].charAt(1);
        System.out.println(words[0]);

        words[0] = (""+words[0].charAt(1)+letter);
        System.out.println(words[0]);
        words[0] = words[0].toUpperCase();
        System.out.println(words[0]);

        // // concatenation int with String

        String myName = "mj";
        int num3 = 12;
        myName  = myName + num3;
        int num4 = 8;
        System.out.println(num3 +num4 + myName + num3 + num4);

        String[] sentence = {"my","name","is","mohammad","!"};
        int sizeSentence = sentence.length;//5
       System.out.println(sentence[3].length());//  8 characters String(input) ==. length ==> int(output);
       // int(input) ==> substring ==>String(outPut)
        //int(input) ==> charAt ==> char(output)
        //String(input) ==> contains ==> boolean(output)
        //string(input) ==> sataWith ==> boolean(output)

        System.out.println("--------------------=-------========================");

//        int[] numArray = {1,2,3,4,5};
//        for (int i = 0; i < numArray.length; i++) {
//            System.out.println(numArray[i+1]+" ");
//
//        }
//        System.out.println(Arrays.toString(numArray));
//        System.out.println("yohanna");
//
//        System.out.println("==========================================================");

//        int[] nums = {1,2,3,4,5};
//        for (int i = 0; i <nums.length ; i++) {
//            if (i == nums.length-1) {
//                continue;
//
//            }
//            nums[i] = nums[i+1];
//
//        }
//        System.out.println(Arrays.toString(nums));
//


//    }
    int counter = 0;
    int[] nums = {1,2,3,4,5};
     for (int i = 0; i <nums.length; i++){
         if (i == 3){
             continue;

         }
      //   counter++;

    }
        System.out.println(counter);

        System.out.println("-------------------------------------------------------------");



    }
}
