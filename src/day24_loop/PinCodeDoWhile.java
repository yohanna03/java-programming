package day24_loop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int PinCode;
        do {
            System.out.println("Enter pin code");
            PinCode = scan.nextInt();
        } while (PinCode != secretPinCode);


        System.out.println("Welcome to your accout");
    }
}
