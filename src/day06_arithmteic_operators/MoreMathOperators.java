package day06_arithmteic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas =  431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        int totalCarsInparking =  toyotas + hondas + vw + tesla + nissan + bmw;

        System.out.println("There are "+ totalCarsInparking + " car in parking lot");
        String pizza = "hawaiian";
        int slices = 8;
        int people =4;
        int slicesPerPerson = slices/people;
        // There are 2 slices for per person
        System.out.println("There are " + slicesPerPerson + " slices per person");
        // We ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each.
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, " +  people + " people ate " + slicesPerPerson + " slicesPerPerson each." );

    }

}
