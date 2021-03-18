import framework.DriverActions;
import org.testng.annotations.Test;
import pages.MainPage;

import static framework.Urls.MAIN_PAGE;

public class FirstTestClass extends BaseTest {

    @Test(groups = "Slow")
    public void firstTest() {
        DriverActions.open(MAIN_PAGE);
        new MainPage().clickOnDeliveryCostButton();
    }

    @Test(groups = "Slow")
    public void secondTest() {
        DriverActions.open(MAIN_PAGE);
        new MainPage().clickOnOnlineButton();
    }

    @Test(groups = "Slow")
    public void thirdTest() {
        DriverActions.open(MAIN_PAGE);
        new MainPage().clickOnEstimateDateButton();
    }

    @Test(groups = "Super Fast")
    public void fourthTest() {
        DriverActions.open(MAIN_PAGE);
        new MainPage().clickOnMapLinkButton();
    }

    @Test(groups = {"Fast"})
    public void fifthTest() {
        DriverActions.open(MAIN_PAGE);
        new MainPage().clickOnTimetableButton();
    }

}
