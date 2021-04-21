package haniPractice;

public class day {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.equals("JAva"));
        //or
        if (word.equals("JAva")){
            System.out.println("word = " + word);
        }
       String expUserName = "cybertek";
        String expPassword = "Abc123";
//
       String userName = "CYBERTEK";
        String password = "Abc123";
//        if (expPassword.equals(password)) {
//            System.out.println("valid password");
//        }
//        if ()

//        System.out.println(userName.toLowerCase());
//        System.out.println(expUserName.toUpperCase());
//
//        String word1 = "java";
//        System.out.println(word.length());
//
//        String country = "USE";
//        if (country.startsWith("u is available")){
//
//        }else {
//            System.out.println("its not available");
//        }

//        String words = "selenium";
//        System.out.println(words.endsWith("nium"));
//        System.out.println(words.startsWith("sel"));

//        String word1 = );

//        String  result =  "1-48 of over 4,000 results for java book";
//        result = result.replace("1-48 of over","" );
//                       .replace("results for java book","");
//                       .replace(",","");
//        System.out.println("result = " + result);

//        String word3 = "java";
//        System.out.println(word3.charAt(3));

//        String word2 = "mom";
//        char firstchar = word.charAt(0);
//        char lastchar =word.charAt(2);
//
//        if (firstchar == lastchar) {
//            System.out.println("palindrome");
//        }
//
//        String word1 = "hello";
//        System.out.println(word1.indexOf("ell"));
//
//        if (word.indexOf("al") >=-1 || word.indexOf("el") !=-1) {
//            System.out.println("present");
//        }

        String message = "Sender: [Nadir] From Number<+1222-333-4444> Message:{Hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        String sender = message.substring(start+1,end);
        int first =message.indexOf("<");
        int last = message.indexOf(">");
        String mobile = message.substring(first+1,last);
        int firstcur =message.indexOf("<");
        int lastcur= message.indexOf(">");
        String tesxt = message.substring(firstcur+1,lastcur);

        System.out.println(sender);
        System.out.println(message);
        System.out.println();
















        }




    }
