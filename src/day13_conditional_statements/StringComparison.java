package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")) {
        System.out.println("it is LA");
    }else{
        System.out.println("It is Not LA");
    }
    String weather = "sunny";
      //  if (weather == "sunny"){ <-- it works, not error,but Avoid
        if (weather.equals("sunny")) {
            System.out.println("Lets go out and code java!");
        }else{
            System.out.println("Lets stays indo0rs, and code java!");
        }


    }
}
