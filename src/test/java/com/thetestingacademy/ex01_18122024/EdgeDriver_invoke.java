package com.thetestingacademy.ex01_18122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeDriver_invoke {
    @Test
    public void test_Selenium_Edge(){
        EdgeDriver driver=new EdgeDriver();
        driver.get("http://app.vwo.com");
        driver.quit();
    }

}
