package day37_methods_overoading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,200,300);
        addNumbers(23,45,67,78,43,454,44,57,85,43,56,87,856,89,3,23,55);
        addNumbers(784,334,65,54,232,5);

        //int... myNumber = 10,4; Error, var args can only be used as a method parameter
    }
    //varargs

    public static void addNumbers(int...nums){
        // inside the methode, it is used as regular array
        int sum = 0;
        for (int n : nums) {
            sum += n;

        }
        System.out.println("sum = " + sum);
    }
}
