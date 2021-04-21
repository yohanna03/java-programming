package day24_loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println("count = " + count);
            count+=5;
        } while (count <= 100);
    }
}
