package day37_methods_overoading;

/**
 * add new class DaySelector
 * add new method: getDayName
 * input : int day
 * return : String
 *
 * 1 - "Monday"
 * 2 - "Tuesday"
 * ...
 * 7 - "Sunday"
 * any other:
 *     print "invalid day"
 *         return empty
 *
 * getDayName(1); => "Monday"
 * getDayName(5); => "Friday"
 * getDayName(10); => print "Invalid day" -> ""
 * You do not have permission to send messages in this channel.
 *
 */
public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(5));
        System.out.println(getDayName(10));

        // loop from 1 to 8 and call the getDayName with loop variable

        for (int i = 0; i <= 9; i++) {
            System.out.println(i+" = "+getDayName(i));

        }
        // store getDayName into variable, and print variable
        String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if (someDay == null){
            System.out.println("someDay is null for invalid day");

        }

    }
    public static String getDayName(int day ) {
        switch (day) {
            case 1:
                return "Monday";
            //break; // uunreachble code, beacuse return already exits the method
            case 2:
                return "Tuesday";
            case 3:
                return "Wendnesay";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("Invalid day - " + day);
                return null;

        }

    }
    public static String getDayNamev2(int day) {
        String dayName;
        switch(day) {
            case 1:
                dayName = "Monday";
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
               dayName = "Friday";
            case 6:
               dayName = "Saturday";
            case 7:
                dayName = "Sunday";
            default:
                System.out.println("Invalid day - " + day);
               dayName = null;
        }

        return dayName;
    }
}

