package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
        //system.out.println("
        //int static = 22; -> error, static is reserved bby java
        int static2 = 22;
        int _static = 22;
        int $static = 44;
        int staticVar = 234;

        int Salary$ =55;
        //int 1stMonthSalary = 3000; -> error, cannot start with number
        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
        //Above variables work fine, but not recommended.
        //we should use meaningful variable names
        //int number-of-friends = 400; -> ERROR
        int number_of_friends = 401; // not

    }
}
