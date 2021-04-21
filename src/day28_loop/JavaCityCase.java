package day28_loop;

import java.time.LocalDate;

public class JavaCityCase {
    public static void main(String[] args) {
        int totalCase = 0;

        for (int day = 1; day <= 30; day++) {
            if (day % 7 == 0) {
                totalCase += 500;
            }else {
                totalCase += 200;
            }
            System.out.println("day" + day + " | total case:" + totalCase);

        }
        System.out.println("java 03/2021 total case: " +   totalCase);

    }
}
