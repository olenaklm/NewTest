package ua.ithillel.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite()");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite()");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("FirstTest beforeMethod()");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("FirstTest afterMethod()");
    }

    @Test
    public void Test_1() {
        System.out.println("FirstTest Test_1()");
        Assert.assertTrue(true);
    }

    @Test
    public void Test_2() {
        System.out.println("FirstTest Test_2()");
        Assert.assertFalse(false);
    }

}
