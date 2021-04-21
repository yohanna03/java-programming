package haniPractice;

public class newDay {
    public static void main(String[] args) throws InterruptedException {
//        //loop
//        int apples = 1;
//        while (apples <= 10){
//            System.out.println("apple ="+apples);
//            apples++;
//        }
//        int seconds = 0;
//        while(seconds <= 117){
//            System.out.println("seconds ="+seconds);
//            seconds++;
//            Thread.sleep(1000);
//    }
//
//        char letters = 'A';
//        char alphabetic = 'Z';
//        while(letters <'z'){
//            letters++;
//            System.out.print(""+ letters);


//        boolean isHungry = true;
//        int bananas = 0;
//        int countToFull = 3;
//
//        while (isHungry) {
//
//            bananas++;
//            if (bananas == countToFull) {
//                isHungry = false;
//                System.out.println("has enough bananas");
//
//
//            }
//            int sum = 0;
//            for (int i = 0; i <= 5; i++) {
//                sum += 0;

//
//            }
//            System.out.println("sum = " + sum);
//
//        }
//        int even = 0;
//        int add = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i% 2 == 0) {
//                System.out.println(i+"" );
//
//            }
//            for (int j = 0; j < 100; j++) {
//                if (i % 3 == 0 && i % 5 == 0 ) {
//                    System.out.println("frizzBuzz =" + i);
//                }else if (i % 3 == 0) {
//                    System.out.println("frizz = "+i);
//                }else if (i % 5 == 0) {
//                    System.out.println("Buzz = "+ i);
//                }else {
//                    System.out.println(i + "");
//                }
//
//            }
////            int start = 3 ;
////            int end = 6;
////            for (start = 0; start <= end ; start++) {
////                System.out.println(start);
//            }
////        int start = 3 ;
////        int end = 6;
////        for (int i = start; i <= end ; i++) {
////            System.out.println(i);
////
////            }
////        int n = 2;
////        for (int i = 0; i < 10 ; i++) {
//////            System.out.println(n + "*" +i+"="+ (n*i));
////            System.out.println((n * i));
////
////        }
//
//        int n = 10;
//        int day = 1;
//        for (int i = 1; i <= n ; i++) {
//            switch (i){
//                case 1:
//                    System.out.println("monday");
//                    break;
//                case 2:
//                    System.out.println("tuesday");
//                    break;
//                default:
//                    System.out.println("no such a day");
//
//            }
//        }
        String word = "java";
        char letter = 'j';
        int count = 0;
        for (int i = 0; i <= word.length()-1;i++) {
            if (word.charAt(i)== letter){
                count++;
            }
            System.out.println("three are " + count+ " "+letter + "'a in " + word);
        }

        }

    }














