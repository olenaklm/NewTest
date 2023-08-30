package ua.ithillel.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class SecondTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("SecondTest beforeMethod()");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("SecondTest afterMethod()");
    }

    @Test
    public void Test_1() {
        System.out.println("SecondTest Test_1()");
        Assert.assertTrue(true);
    }

    @Test
    public void Test_2() {
        System.out.println("SecondTest Test_2()");
        Assert.assertFalse(false);
    }

}
