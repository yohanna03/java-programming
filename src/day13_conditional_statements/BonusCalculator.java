package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus ;
        double salesAmount = 2500.35;

        if (salesAmount <= 1000){
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50.0;
        }else {
            System.out.println("Good job, you are qualified for full bonus");
            bonus = 100.0;
        }
        System.out.println("your total bonus : $" + bonus);


    }
}