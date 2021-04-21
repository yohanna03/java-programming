package day37_methods_overoading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent","abc123");//positive test / sunny day
        loginVoid("cybertekStudent","answer");//negativ test // rainy day scenair
        loginVoid("","");
        System.out.println(login("cybertekStudent","abc123"));

        if (login("cybertekStudent","abc123")) {
            System.out.println("login successfull, welcom to canvas");
            System.out.println("select the course to contine");
        }else {
            System.out.println("login failed");
            System.out.println("-----------------------------------------------");
        }
        boolean isloginSuccess = login("nadir","mountain");
        System.out.println("isloginSuccess = " + isloginSuccess);

        if (login("nadir","mountain")){
            System.out.println("welcome to canvas, select course or calendar");
        }else {
            System.out.println("login failed");
        }
        System.out.println("-----------------------------------------------");
    }
    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            System.out.println("Login successful, welcome cybertekStudent!");
        } else {
            System.out.println("Incorrect username or password");
        }
        System.out.println("-----------------------------------------------");
    }

    /**
     *Method name:
     *     login
     * Params: String userName, String password
     *
     * Return type:
     *     boolean
     *
     * in the method:
     *     Declare : String secretUsername ="cybertekStudent", secretPassword = "abc123"
     *
     * if(both match)
     *     return true
     * ELSE
     *     return false
     * You do not have permission to send messages in this channel.
     * ﻿
     *
     */
        public static boolean login (String userName,String password) {

        String secuserName = "cybertekStudent";
        String secretPassword = "abc123";
       // return userName.equalsIgnoreCase(secretPassword) && password.equalsIgnoreCase(secretPassword );
        if (userName.equalsIgnoreCase(secretPassword) && password.equalsIgnoreCase(secretPassword )){
            return true;
        }
        return false;



    }

}




