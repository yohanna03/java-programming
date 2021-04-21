package day16_switch_ternary;
/*declare
price    ->
calories ->
size could be "tall", "grade" ,"venti"

when size = "tall"
    print "Tall Cappuccino please"
    price    ->  3.69
    calories ->  90

when size = "grade"
    print "Grande Cappuccino please"
    price    ->  3.99
    calories ->  120

when size = "venti"
    print "Venti Cappuccino please"
    price    ->  4.29
    calories ->  150

any other size:
    print "We do'nt serve that size of Cappuccino"


print "Total price: $3.69"
      "You will consume 90 cal of energy"
You do not have permission to send messages in this channel.
﻿
*/
public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "venti";
        double price = 0.0;
        int calories = 0;

        if (size. equals ("tall")) {

        }
        switch(size) {
            case "xer":
                System.out.println("tall cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("grande cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("vinti cappuccino please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("we don't serve that " +size+ "cappuccino");
            break;

        }
        System.out.println("Total price: $" + price);
        System.out.println("You will consume "+ calories +" cals of energy");
    }
}
