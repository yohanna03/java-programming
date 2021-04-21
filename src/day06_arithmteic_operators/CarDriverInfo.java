package day06_arithmteic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = "BMW";
        String driverName = "Yohanna";
        String licenseNum = "W233323";
        byte speed = 70;
        boolean isAutomatic = true;
        char licenseClass = 'd';

        System.out.println("CarModel = " + carModel);
        System.out.println("DriverName = " + driverName);
        System.out.println("licenseNum = " + licenseNum);
        System.out.println("Speed = " + speed);
        System.out.println("is car automatic = " + isAutomatic);
        System.out.println("licenseClass = " + licenseNum);

        // Yohanna is driving Dodge charger
        System.out.println(driverName + " is driving " + carModel);

        // current speed is: 55 mph
        System.out.println("current speed : " + speed + " mph");

        System.out.println( licenseClass + "  =  " + isAutomatic);
    }

}
