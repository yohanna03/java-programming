package day36_methods_with_return;
/*
add new Calculations
add main method
call Calculator class methods there
 */
public class Calculation {
    public static void main(String[] args) {
        System.out.println("add 10+45 = " + Calculator.add(10,45));
        System.out.println("100-40=" + Calculator.minus(100,40));
        System.out.println("55/ 4 = " + Calculator.dived(55,4));
        System.out.println("20 * 4 = " + Calculator.multiply(20,4));

        double d1 = 234.3;
        double d2  = 321.5;
        double result = Calculator. minus(d1,d2);
        System.out.println("result =" + result);
    }

}
