package day28_loop;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(71);
            System.out.print(source.charAt(index));
            //System.out.println(random.nextInt(source.length()))
            password += source.charAt(index);

        }
        System.out.println("\nyour pasword =" + password);




    }
}
