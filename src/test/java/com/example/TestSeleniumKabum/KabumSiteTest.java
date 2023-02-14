package com.example.TestSeleniumKabum;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class KabumSiteTest {
    private void accessSite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaops\\Downloads\\chromedriver.exe");

        KabumSite page = new KabumSite();

        String title = page.getTitle();
        assertTrue(title.toLowerCase().startsWith("kabum"));

        page.closed();
    }

    private void searchItem(final String item) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaops\\Downloads\\chromedriver.exe");

        KabumSite page = new KabumSite();

        WebElement inputSearch = page.getElementById("input-busca");
        inputSearch.sendKeys(item);
        inputSearch.submit();
        WebElement nameCard = page.getElementByClass("nameCard");

        String nameFirstElement = nameCard.getText();

        assertTrue(nameFirstElement.toLowerCase().startsWith(item));

        page.closed();
    }

    private void accessItem(final String item) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaops\\Downloads\\chromedriver.exe");

        KabumSite page = new KabumSite();

        WebElement inputSearch = page.getElementById("input-busca");
        inputSearch.sendKeys(item);
        inputSearch.submit();
        WebElement imageCard = page.getElementByClass("imageCard");
        String nameCard = page.getElementByClass("nameCard").getText();

        imageCard.click();
        String nameItem = page.getElementByClass("sc-fb499f01-5").getText();

        assertEquals(nameCard, nameItem);

        page.closed();
    }

    @Test
    public void testAccesSite() {
        accessSite();
    }

    @Test
        public void testSearchItem() {
            searchItem("processador");
    }

    @Test
    public void testAccessItem() {
        searchItem("processador");
    }
}
