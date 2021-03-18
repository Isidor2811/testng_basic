package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Waiter.waitUntilVisible;

@Getter
public class MainPage extends BasePage {

    @FindBy(xpath = "//a[@class='cost']")
    private WebElement deliveryCostButton;

    @FindBy(xpath = "//a[@class='estimatedate']")
    private WebElement estimateDateButton;

    @FindBy(xpath = "//a[contains(@class,'filial')]")
    private WebElement mapLinkButton;

    @FindBy(xpath = "//a[@class='timetable']")
    private WebElement timetableButton;

    @FindBy(xpath = "//a[@class='online']")
    private WebElement onlineButton;


    public CostPage clickOnDeliveryCostButton() {
        waitUntilVisible(deliveryCostButton);
        deliveryCostButton.click();
        return new CostPage();
    }

    public EstimateDatePage clickOnEstimateDateButton() {
        waitUntilVisible(estimateDateButton);
        estimateDateButton.click();
        return new EstimateDatePage();
    }

    public MapLinkButton clickOnMapLinkButton() {
        waitUntilVisible(mapLinkButton);
        mapLinkButton.click();
        return new MapLinkButton();
    }

    public TimeTablePage clickOnTimetableButton() {
        waitUntilVisible(timetableButton);
        timetableButton.click();
        return new TimeTablePage();
    }

    public OnlinePage clickOnOnlineButton() {
        waitUntilVisible(onlineButton);
        onlineButton.click();
        return new OnlinePage();
    }

}
