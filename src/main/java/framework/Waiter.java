package framework;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static framework.DriverFactory.getDriver;

public class Waiter {

    public static boolean waitUntilVisible(WebElement element) {
        try {
            new FluentWait<>(getDriver())
                    .withTimeout(Duration.ofSeconds(15))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }
}
