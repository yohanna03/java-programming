package day15_logicallops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Honolulu";
        double salary = 120_000.0;
        boolean remote = true;
        boolean benefits = true;

        if (location.equals("Honolulu") && salary >= 120_000.0 && remote && benefits ){
            System.out.println("sure, I will accept this offer");
        }else{
            System.out.println("lets consider another offer or negotiate");
        }
    }
}
