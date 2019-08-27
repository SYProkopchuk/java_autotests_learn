package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper (WebDriver driver) {
        super(driver);

    }

    public void login(String username, String password) {
        driver.get("http://localhost:8080/addressbook/");
        type(By.name("user"), username);
        driver.findElement(By.id("content")).click();
        type(By.name("pass"), password);
        driver.findElement(By.id("LoginForm")).submit();
    }
}
/*

{
        driver.get("http://localhost:8080/addressbook/");
        type(By.name("user"), username);
        driver.findElement(By.id("content")).clickName();
        type(By.name("pass"), password);
        driver.findElement(By.id("LoginForm")).submit();
    }

    public void login(String username, String password) {
        driver.get("http://localhost:8080/addressbook/");
        type(By.name("user"), username);
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.id("content")).clickName();
        driver.findElement(By.name("pass")).clickName();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.id("LoginForm")).submit();
    }

 */