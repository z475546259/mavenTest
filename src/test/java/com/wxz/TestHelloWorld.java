package com.wxz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

public class TestHelloWorld {

    public static void main(String[] args) {
        
    	System.out.println("begin");
        //如果火狐浏览器没有默认安装在C盘，需要制定其路径
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); 
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com/");
        
        driver.manage().window().maximize();
        
        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys("Glen");
        
        WebElement btn = driver.findElement(By.id("su"));
        btn.click();
        
        driver.close();
        System.out.println("close");
    }

}
