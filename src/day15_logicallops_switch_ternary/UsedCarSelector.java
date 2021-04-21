package day15_logicallops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double buget = 5000.0;
        String model = "Honda";
        double carPrice = 4999.0;
        if (carPrice <= buget && (model.equals("Toyota") || model.equals ("Honda"))) {
            System.out.println("Ready to purchase model = " + model + "price = " + carPrice);
        }else{
            System.out.println("Not interested in model =" +model + "price = " + carPrice);
        }
    }
}
