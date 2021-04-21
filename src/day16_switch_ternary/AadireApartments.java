package day16_switch_ternary;
/*
#### WELCOME TO ADAIRE APARTMENTS ####

        numberOfBedrooms = 0, 1, 2

        startingPrice = 0;

        when numberOfBedrooms 0:
        print: "Studio apartment selected"
        startingPrice -> 1454

        when numberOfBedrooms 1:
        print: "One bedroom apartment selected"
        startingPrice -> 1725

        when numberOfBedrooms 2:
        print: "Two bedroom apartment selected"
        startingPrice -> 2899

        ------
        "Starting price $1454"
*/

public class AadireApartments {
    public static void main(String[] args) {
        System.out.println("##### WELCOME TO ADAIRE APARTMENTS #####");
        int numberOfBedrooms = 0;
        double startingPrice = 0;

        switch(numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println(numberOfBedrooms + " bedroom currently unavailable");
                //return; exit MAIN method
        }

        System.out.println("Starting price: $" + startingPrice);
    }
}


