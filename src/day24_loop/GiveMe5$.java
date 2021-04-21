package day24_loop;
import java. util.*; // mac: option+enter
public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dollar = scan.nextInt();
      while (dollar != 5) {
          System.out.println("Give me 5 dollars");
          dollar = scan.nextInt();
        }
        System.out.println("Thank you for 5 dollar");
    }
}

