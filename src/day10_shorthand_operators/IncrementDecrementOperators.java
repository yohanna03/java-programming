package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        ++i;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);
        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        //increase lineOfCode by 1 , 3 different ways that we learnt today 

        linesOfCode = linesOfCode + 1;
        linesOfCode += 1;
        linesOfCode++;
        ++linesOfCode;

        System.out.println("linesOfCode = " + linesOfCode);


        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        linesOfCode --;
        --linesOfCode;

        System.out.println("linesOfCode = " + linesOfCode);
        
        char letter ='a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        
        letter --;
        System.out.println("letter = " + letter);
        
        letter--;letter--;letter--;
        System.out.println("letter = " + letter);
        letter++;letter++;letter++;
        System.out.println("letter = " + letter);
    }
}
