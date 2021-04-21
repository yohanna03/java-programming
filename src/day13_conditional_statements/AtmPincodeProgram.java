package day13_conditional_statements;

public class AtmPincodeProgram {
    public static void main(String[] args) {
        System.out.println("****** WELCOME TO TD BANK ATM ******");
        int secrretPincode = 2233;
        int inputPincode = 2233;

        if (secrretPincode == inputPincode  ){
            System.out.println("Welcome to your account!");
            System.out.println("you can withdraw, check your balance, deposit");
        }else{
            System.out.println("Incorrect pincode!" + inputPincode);
            System.out.println("Please try again");

        }
        System.out.println("Thank you for using TD Bank ATM! ");





    }
}
