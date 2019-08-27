package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.fail;

public class ApplicationManager {
    WebDriver driver;
    private  NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    private SessionHelper sessionHelper;
    String baseUrl;
    StringBuffer verificationErrors = new StringBuffer();
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.FIREFOX)) {
            driver =  new FirefoxDriver();
        }
            else if (browser.equals(BrowserType.CHROME)) {
                driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)) {
                driver = new InternetExplorerDriver();}
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(driver);
        contactHelper = new ContactHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");

    }
    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void stop() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
