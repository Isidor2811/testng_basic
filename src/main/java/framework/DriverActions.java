package framework;

public class DriverActions {

    public static void open(String url) {
        DriverFactory.getDriver().get(url);
    }

}
