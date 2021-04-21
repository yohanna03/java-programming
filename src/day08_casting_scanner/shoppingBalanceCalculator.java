package day08_casting_scanner;

public class shoppingBalanceCalculator {
    public static void main(String[] args){
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 =   15;


        double remainingBalance = balance - price1 - price2 - price3;
        // double remainingBalance = balance -( prince1 + price2 + price3 );
        balance  = remainingBalance;
        System.out.println("your remainingBalace $" + remainingBalance);
        System.out.println("your initial balance : $" + balance);

        int balanceWithNoCents = (int) remainingBalance;
        System.out.println("your remaining balance with out cents: $ " + balanceWithNoCents);









    }
}

