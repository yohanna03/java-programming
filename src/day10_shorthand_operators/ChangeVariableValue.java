package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);
        //add/increase cout by 2
        count = count + 2;
        System.out.println("count = " + count);
        
        int apples = 2;
        System.out.println("apple = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);
        apples = apples - 3;
        System.out.println("apples = " + apples);
        
        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        // get another whole small pizza just for you - 6 slices
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);

        int players = 10;
        System.out.println("players = " + players);
        //double the players to start the match
        players = players * 2;
        System.out.println("players = " + players);

        int centes = 568;
        System.out.println("centes = " + centes);
        //keep whole dollars portion and just assign remaining cents
        centes = centes % 100;
        System.out.println("remaining centes = " + centes);



        
    }

}
