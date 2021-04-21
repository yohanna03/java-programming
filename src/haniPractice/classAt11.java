package haniPractice;

import java.util.*;

public class classAt11 {
    public static void main(String[] args){
        //Zombie Attact 1
      int[] inhabitants = {9,0,3,8,7,7,6};
      int[] zeroArray = new int[inhabitants.length];
      int day =0;
      do{
          System.out.println("Day" +day+" "+Arrays.toString(inhabitants));
          for (int i = 0; i<inhabitants.length;i++){
              inhabitants[i] = inhabitants[i]/2;
              day++;

          }
      }while(!(Arrays.toString(inhabitants).equals(Arrays.toString(zeroArray))));
        System.out.println("Day" +day+" "+Arrays.toString(inhabitants));
        System.out.println("-----EXTINCT---");
    }
}

