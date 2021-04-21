package day15_logicallops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'D';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("pass. with Grade - " + grade);
        } else if (grade == 'D') {
            System.out.println("Qualify for retake. Grade -" + grade);
        } else if (grade == 'E') {
            System.out.println("Fail. Grade -" + grade);
        } else {
            System.out.println("Invalid Grade - " + grade);
        }
        if (grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b' || grade == 'C' || grade == 'c') {
            System.out.println("pass. with Grade - " + grade);
        } else if (grade == 'D') {
            System.out.println("Qualify for retake. Grade -" + grade);
        } else if (grade == 'E') {
            System.out.println("Fail. Grade -" + grade);
        } else {
            System.out.println("Invalid Grade - " + grade);
        }
    }
}
