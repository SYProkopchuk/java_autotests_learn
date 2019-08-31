package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.NoSuchElementException;

public class HelperBase {

    public WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver=driver;
    }

    public void clickName(String name) {
        driver.findElement(By.name(name)).click();
    }
    public void clickXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }
    public void clickLinkText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
        driver.findElement(By.linkText(linkText)).click();
    }


    public void type(By locator, String text) {
        if (text!=null){
            String existingText = driver.findElement(locator).getAttribute("value");
            if (!text.equals(existingText)){
                driver.findElement(locator).click();
                driver.findElement(locator).clear();
                driver.findElement(locator).sendKeys(text);
            }
    }
    }


    public void type (By locator, String text, By xpath) {
        if (text!=null){
            String existingText = driver.findElement(locator).getAttribute("value");
            if (!text.equals(existingText)){
                driver.findElement(locator).click();
                new Select(driver.findElement(locator)).selectByVisibleText(text);
                driver.findElement(xpath).click();
            }
        }
    }

    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement (locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
