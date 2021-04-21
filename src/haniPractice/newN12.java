package haniPractice;
import java.util.*;
public class newN12 {
    public static void main(String[] args) {
      int count = 0;
        for (int i = 0; i <4 ; i++) {
            if (i == 3)continue;
            for (int j = i +1; j < 5; j++) {
                count++;
                if (j == 3) break;
            }

        }
        System.out.println(count);
    }
}



