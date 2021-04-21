package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting Etsy search smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
       // verifyResultsAreDisplayed();

    }
    public static void openBrowser(){
        System.out.println("launching chrome browser");
    }
    public static void navigateToEtsyUrl() {
        System.out.println("Navigating to https://www.esty.com/");
    }
    public static void searchForWoodenSpoon() {

    }

}
