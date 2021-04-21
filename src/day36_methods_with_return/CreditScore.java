package day36_methods_with_return;

public class CreditScore {
    /**
     *
     * add new package day36_methods_with_return
     * add new class CreditScore
     *
     * method name:
     *     checkEligible
     * input/parameter:
     *     int creditScore
     *
     * if creditScore is 700 or more
     *     you are eligible for leasing this car
     * otherwise
     *     Sorry, you are not eligible for leasing this cars
     */
    public static void main(String[] args) {
        checkEligible(815);
        checkEligible(700);
        checkEligible(659);
//        System.out.println(checkEligible(711)); //Error - can not print void method
        System.out.println(getCreditScore());
        System.out.println("Score = " + getCreditScore());

    }
    public static void checkEligible( int creditScore) {
        if (creditScore <= 700){
            System.out.println("Eligible for leasing this car");
        }else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
    }
    public static int getCreditScore () {
        return 800;

    }

}
