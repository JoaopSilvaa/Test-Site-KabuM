package com.example.TestSeleniumKabum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
    protected  WebDriver driver;

    public Page() {
        driver = new ChromeDriver();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void closed() {
        driver.close();
    }
}