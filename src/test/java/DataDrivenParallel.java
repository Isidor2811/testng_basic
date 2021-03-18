import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class DataDrivenParallel {

    @BeforeMethod(alwaysRun = true)
    public void beforeEachMethodHere(Method method) {
        System.out.println("Method [" + method.getName() + "] was run on thread with id #" + Thread.currentThread().getId());
    }

    @AfterMethod(alwaysRun = true)
    public void afterEachMethodHereClass() {
    }


    @DataProvider(parallel = true)
    public Object[][] getDataForTest() {
        return new Object[][]{{1, 2, 3}, {10, 10, 20}};
    }

    @Test(dataProvider = "getDataForTest")
    public void additionTest(int a, int b, int result) {
        Assert.assertEquals(a + b, result);
    }

    @Test
    public void regularMethod1() {
        Assert.assertEquals(2 + 2, 4);
    }

    @Test
    public void regularMethod2() {
        Assert.assertEquals(4 - 2, 2);
    }

}
