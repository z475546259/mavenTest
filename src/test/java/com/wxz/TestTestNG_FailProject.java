package com.wxz;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

import org.testng.Assert;


public class TestTestNG_FailProject {

    WebDriver driver;
    
    @BeforeTest
    public void Init(){
    	System.out.println("begin");
        //如果火狐浏览器没有默认安装在C盘，需要制定其路径
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); 
        driver = new FirefoxDriver();
    }
    
    @Test
    public void helloWorld() throws Exception {        
    	
        driver.get("http://www.baidu.com/");
        
        driver.manage().window().maximize();
        
        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys("Glen");
        
        WebElement btn = driver.findElement(By.id("su"));
        btn.click();
                
        String expectedTitle = "Glen_百度";
        String actualTitle = driver.getTitle();
        
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    
    @AfterTest
    public void tearDown(){
        driver.quit();
        System.out.println("close");
    }

}