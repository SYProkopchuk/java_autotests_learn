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

    public void fillContactForm(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String home, String mobile, String work, String fax, String email, String email2, String email3, String homepage, String bday, String bmonth, String byear, String aday, String amonth, String ayear, String new_group, String address2, String phone2, String notes) {
        groupHelper.driver.findElement(By.name("firstname")).click();
        groupHelper.driver.findElement(By.name("firstname")).click();
        groupHelper.driver.findElement(By.name("firstname")).clear();
        groupHelper.driver.findElement(By.name("firstname")).sendKeys(firstname);
        groupHelper.driver.findElement(By.name("middlename")).click();
        groupHelper.driver.findElement(By.name("middlename")).clear();
        groupHelper.driver.findElement(By.name("middlename")).sendKeys(middlename);
        groupHelper.driver.findElement(By.name("lastname")).click();
        groupHelper.driver.findElement(By.name("lastname")).clear();
        groupHelper.driver.findElement(By.name("lastname")).sendKeys(lastname);
        groupHelper.driver.findElement(By.name("nickname")).click();
        groupHelper.driver.findElement(By.name("nickname")).clear();
        groupHelper.driver.findElement(By.name("nickname")).sendKeys(nickname);
        groupHelper.driver.findElement(By.name("title")).click();
        groupHelper.driver.findElement(By.name("title")).clear();
        groupHelper.driver.findElement(By.name("title")).sendKeys(title);
        groupHelper.driver.findElement(By.name("company")).click();
        groupHelper.driver.findElement(By.name("company")).clear();
        groupHelper.driver.findElement(By.name("company")).sendKeys(company);
        groupHelper.driver.findElement(By.name("address")).click();
        groupHelper.driver.findElement(By.name("address")).clear();
        groupHelper.driver.findElement(By.name("address")).sendKeys(address);
        groupHelper.driver.findElement(By.name("home")).click();
        groupHelper.driver.findElement(By.name("home")).clear();
        groupHelper.driver.findElement(By.name("home")).sendKeys(home);
        groupHelper.driver.findElement(By.name("mobile")).click();
        groupHelper.driver.findElement(By.name("mobile")).clear();
        groupHelper.driver.findElement(By.name("mobile")).sendKeys(mobile);
        groupHelper.driver.findElement(By.name("work")).click();
        groupHelper.driver.findElement(By.name("work")).clear();
        groupHelper.driver.findElement(By.name("work")).sendKeys(work);
        groupHelper.driver.findElement(By.name("fax")).click();
        groupHelper.driver.findElement(By.name("fax")).clear();
        groupHelper.driver.findElement(By.name("fax")).sendKeys(fax);
        groupHelper.driver.findElement(By.name("email")).click();
        groupHelper.driver.findElement(By.name("email")).clear();
        groupHelper.driver.findElement(By.name("email")).sendKeys(email);
        groupHelper.driver.findElement(By.name("email2")).click();
        groupHelper.driver.findElement(By.name("email2")).clear();
        groupHelper.driver.findElement(By.name("email2")).sendKeys(email2);
        groupHelper.driver.findElement(By.name("email3")).click();
        groupHelper.driver.findElement(By.name("email3")).clear();
        groupHelper.driver.findElement(By.name("email3")).sendKeys(email3);
        groupHelper.driver.findElement(By.name("homepage")).click();
        groupHelper.driver.findElement(By.name("homepage")).clear();
        groupHelper.driver.findElement(By.name("homepage")).sendKeys(homepage);
        groupHelper.driver.findElement(By.name("bday")).click();
        new Select(groupHelper.driver.findElement(By.name("bday"))).selectByVisibleText(bday);
        groupHelper.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[1]/following::option[19]")).click();
        groupHelper.driver.findElement(By.name("bmonth")).click();
        new Select(groupHelper.driver.findElement(By.name("bmonth"))).selectByVisibleText(bmonth);
        groupHelper.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[1]/following::option[45]")).click();
        groupHelper.driver.findElement(By.name("byear")).click();
        groupHelper.driver.findElement(By.name("byear")).clear();
        groupHelper.driver.findElement(By.name("byear")).sendKeys(byear);
        groupHelper.driver.findElement(By.name("aday")).click();
        new Select(groupHelper.driver.findElement(By.name("aday"))).selectByVisibleText(aday);
        groupHelper.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Anniversary:'])[1]/following::option[18]")).click();
        groupHelper.driver.findElement(By.name("amonth")).click();
        new Select(groupHelper.driver.findElement(By.name("amonth"))).selectByVisibleText(amonth);
        groupHelper.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Anniversary:'])[1]/following::option[45]")).click();
        groupHelper.driver.findElement(By.name("ayear")).click();
        groupHelper.driver.findElement(By.name("ayear")).clear();
        groupHelper.driver.findElement(By.name("ayear")).sendKeys(ayear);
        groupHelper.driver.findElement(By.name("new_group")).click();
        new Select(groupHelper.driver.findElement(By.name("new_group"))).selectByVisibleText(new_group);
        groupHelper.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Group:'])[1]/following::option[2]")).click();
        groupHelper.driver.findElement(By.name("address2")).click();
        groupHelper.driver.findElement(By.name("address2")).clear();
        groupHelper.driver.findElement(By.name("address2")).sendKeys(address2);
        groupHelper.driver.findElement(By.name("phone2")).click();
        groupHelper.driver.findElement(By.name("phone2")).clear();
        groupHelper.driver.findElement(By.name("phone2")).sendKeys(phone2);
        groupHelper.driver.findElement(By.name("notes")).click();
        groupHelper.driver.findElement(By.name("notes")).clear();
        groupHelper.driver.findElement(By.name("notes")).sendKeys(notes);
        groupHelper.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]")).click();
    }

    public void initContactCreation() {

        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.linkText("add new")).click();
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
