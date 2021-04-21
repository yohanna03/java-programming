package day37_methods_overoading;

public class OverLoadMain {
    public static void main(String[] differentName) {
        System.out.println("hello From Real main method");
        main(10);

    }

    /**
     * overloading main method:
     * same name + different parameter
     * JDK does not look for this one to run
     *
     */
    public static void main(int num){
        System.out.println("num =" + num);
    }
}
