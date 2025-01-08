package com.thetestingacademy.ex01_18122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CromeDriver_Invoke {
    @Test
    public void test_Selenium02_chrome(){
        ChromeDriver driver= new ChromeDriver();
        driver.get("http://app.vwo.com");
        driver.quit();
    }
}
