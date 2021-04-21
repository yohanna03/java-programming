package day25_loop;

/**
 *  boolean isHungry = true;
 *     int bananas = 0;
 *     int countToFull = 3;
 *
 *     it takes 3 bananas for isHungry to be set to false
 *
 *     while hungry
 *         eat banana 1
 *
 *         when bananas reaches countToFull
 *             set hungry to false
 *
 *         increase banana by 1
 */
public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        while(isHungry){
            bananas++;
            System.out.println("Eating a bonanas:" + bananas);
            if (bananas == countToFull){
                isHungry = false;

            }

        }
        System.out.println("had enough bananas, lets get back to studying");

    }

}
