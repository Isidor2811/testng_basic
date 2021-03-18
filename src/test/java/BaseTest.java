import framework.DriverFactory;
import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.testng.xml.XmlTest;

import java.lang.reflect.Method;
import java.util.Arrays;

public class BaseTest {

    @BeforeSuite
    public void beforeSuite(ITestContext iTestContext) {
        System.out.println("==== SUITE with name [" + iTestContext.getSuite().getName() + "] was started======");
    }

    @AfterSuite
    public void afterSuite(ITestContext iTestContext) {
        System.out.println("==== SUITE with name [" + iTestContext.getSuite().getName() + "] was finishes ======");
        IResultMap failedTests = iTestContext.getFailedTests();
        System.out.println("Failed tests: " + failedTests.getAllMethods());
        IResultMap passedTests = iTestContext.getPassedTests();
        System.out.println("Passed tests: " + passedTests.getAllMethods());
    }


    //    @BeforeTest(alwaysRun = true)
    @BeforeClass(alwaysRun = true)
    public void beforeTest(XmlTest xmlTest) {
        System.out.println("Initialization browser before [" + xmlTest.getName() + "] test from XML");
        DriverFactory.initDriver();
    }

    //    @AfterTest(alwaysRun = true)
    @AfterClass(alwaysRun = true)
    public void afterTest(XmlTest xmlTest) {
        System.out.println("Closing browser after [" + xmlTest.getName() + "] test from XML");
        DriverFactory.closeDriver();
    }

    @BeforeMethod
    public void beforeEachTestMethod(Method method) {
        System.out.println("Deleting all cookies before [" + method.getName() + "] test method");
        DriverFactory.getDriver().manage().deleteAllCookies();
    }

    @AfterMethod
    public void afterEachTestMethod(Method method) {
        System.out.println("Method [" + method.getName() + "] was run on thread with id #" + Thread.currentThread().getId());
    }

    @BeforeGroups(groups = {"Fast", "Super Fast"})
    public void beforeGroups(ITestContext context) {
        String[] includedGroups = context.getIncludedGroups();
        System.out.println("Following group was include to run: " + Arrays.toString(includedGroups));
    }

    @AfterGroups(groups = {"Fast", "Super Fast"})
    public void afterGroups(ITestContext context) {
        String[] excludedGroups = context.getExcludedGroups();
        System.out.println("Following group was excluded from: " + Arrays.toString(excludedGroups));
    }

}
