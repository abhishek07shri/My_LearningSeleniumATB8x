package com.thetestingacademy.ex01_18122024;

import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class SafariDriver_invoke {
    @Test
    public void test_Selenium_Safari(){
        SafariDriver driver =new SafariDriver();
        driver.get("http://app.vwo.com");

    }
}
