import framework.DriverActions;
import org.testng.annotations.Test;
import pages.MainPage;

import static framework.Urls.MAIN_PAGE;

public class FirstTestClass extends BaseTest {

    @Test
    public void firstTest() {
        DriverActions.open(MAIN_PAGE);
        new MainPage().clickOnDeliveryCostButton();
    }

    @Test
    public void secondTest() {
        DriverActions.open(MAIN_PAGE);
        new MainPage().clickOnOnlineButton();
    }

    @Test
    public void thirdTest() {
        DriverActions.open(MAIN_PAGE);
        new MainPage().clickOnEstimateDateButton();
    }

    @Test
    public void fourthTest() {
        DriverActions.open(MAIN_PAGE);
        new MainPage().clickOnMapLinkButton();
    }

    @Test
    public void fifthTest() {
        DriverActions.open(MAIN_PAGE);
        new MainPage().clickOnTimetableButton();
    }

}
