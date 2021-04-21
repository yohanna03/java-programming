package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score1 = 75;
        String result1;
        if (score1 > 60){
            result1 = "Past";
        }else{
            result1 = "Fail";
        }
        System.out.println("result1 = " + result1);
        
        int score = 88;
        String result = (score > 60) ? "Pass" :"Fail";
        System.out.println("result = " + result);

        String quality = "bad";
        System.out.println(quality.equals("good")? 100 : 0);
        int rating = quality. equals ("bad") ? 100 : 0;
        System.out.println("rating = " + rating);

        int score3 = 100;
        char grade = (score3 > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);

        int hourlyRater = 35;

        String reply = (hourlyRater > 45 ) ? "accept" : " reject";
        System.out.println("reply = " + reply);

        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Saim|Murodil" : "Nadir";
        System.out.println("Today's teacher = " + teacher);

        boolean isEligibleToDrive  = false ;
        String driving = isEligibleToDrive ? "yes, have DL, can drive" : "No Dl, canot Dr";
        System.out.println("driving = " + driving);




    }
}
