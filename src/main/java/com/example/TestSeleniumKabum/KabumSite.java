package com.example.TestSeleniumKabum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class KabumSite extends Page{

    public KabumSite() {
        super();
        driver.get("https://www.kabum.com.br/");
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    public WebElement getElementById(String id) {
        return driver.findElement((By.id(id)));
    }

    public WebElement getElementByClass(String className) {
        return driver.findElement(By.className(className));
    }
    @Override
    public void closed() {
        driver.close();
    }
}
