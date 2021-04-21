package day37_methods_overoading;

public class MethodOverloading {
    public static void main(String[] args) {
      MethodOverloading.sum(10,5);
      sum(10.4,12.4);
      sum(10,5.5);
      sum(4,1,2);
      sum((int)4.2,1,2);
      sum("Hello","word");



    }
    public static void sum(int num1, int num2) {
        System.out.println("sum(int num1, int num2)");
        System.out.println("result =" + (num1 + num2));
    }
    public static void sum(int num1, int num2, int num3) {
        System.out.println("sum(int num1, int num2, int num3)");
        System.out.println("result =" + (num1 +  num2 + num3));
    }
    public static void sum(int num1, int num2, int num3, int num4) {
        System.out.println("sum(int num1, int num2, int num3, int num4)");
        System.out.println("result =" + (num1+ num2+ num3+ num4));
    }
     public static void sum(double num1, double num2) {
         System.out.println("sum(double, double)");
         System.out.println("Result = " + (num1 + num2));

     }
    public static void sum(String str1, String str2) {
        System.out.println("sum(str num1, str num2)");
        System.out.println("result =" + (str1 + str2));
    }


}
