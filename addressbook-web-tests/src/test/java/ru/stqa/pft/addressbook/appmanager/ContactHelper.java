package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactFieldsData;

import java.util.NoSuchElementException;

public class ContactHelper extends HelperBase {
    public ContactHelper (WebDriver driver) {
        super(driver);
    }

    public void initContactCreation() {

        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.linkText("add new")).click();
    }
    public void editContact() {
        clickXpath ("(.//*[normalize-space(text()) and normalize-space(.)='Test1Test1Test1Test1'])[1]/following::img[2]");
    }
    public void submitContactModification() {
        clickName ("update");
    }
    public void fillContactForm(ContactFieldsData contactFieldsData, boolean creation) {
        type(By.name("firstname"), contactFieldsData.getContactFirstname());
        type(By.name("middlename"), contactFieldsData.getContactMiddlename());
        type(By.name("lastname"), contactFieldsData.getContactLastname());
        type(By.name("nickname"), contactFieldsData.getContactNickname());
        type(By.name("title"), contactFieldsData.getContactTitle());
        type(By.name("company"), contactFieldsData.getContactCompany());
        type(By.name("address"), contactFieldsData.getContactAddress());
        type(By.name("home"), contactFieldsData.getContactHome());
        type(By.name("mobile"), contactFieldsData.getContactMobile());
        type(By.name("work"), contactFieldsData.getContactWork());
        type(By.name("fax"), contactFieldsData.getContactFax());
        type(By.name("email"), contactFieldsData.getContactEmail());
        type(By.name("email2"), contactFieldsData.getContactEmail2());
        type(By.name("email3"), contactFieldsData.getContactEmail3());
        type(By.name("homepage"), contactFieldsData.getContactHomepage());
        type(By.name("bday"),contactFieldsData.getContactBday(),By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[1]/following::option[19]"));
        type(By.name("bmonth"),contactFieldsData.getContactBmonth(),By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[1]/following::option[45]"));
        type(By.name("byear"), contactFieldsData.getContactByear());
        type(By.name("aday"),contactFieldsData.getContactAday(),By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Anniversary:'])[1]/following::option[45]"));
        type(By.name("amonth"),contactFieldsData.getContactAmonth(),By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Anniversary:'])[1]/following::option[45]"));
        type(By.name("ayear"), contactFieldsData.getContactAyear());
        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactFieldsData.getContactGroup());
        } /*else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }*/
        type(By.name("address2"), contactFieldsData.getContactAddress2());
        type(By.name("phone2"), contactFieldsData.getContactPhone2());
        type(By.name("notes"), contactFieldsData.getContactNotes());

        }


    /*public void fillContactForm(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String home, String mobile, String work, String fax, String email, String email2, String email3, String homepage, String bday, String bmonth, String byear, String aday, String amonth, String ayear, String new_group, String address2, String phone2, String notes) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.name("middlename")).click();
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys(middlename);
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(lastname);
        driver.findElement(By.name("nickname")).click();
        driver.findElement(By.name("nickname")).clear();
        driver.findElement(By.name("nickname")).sendKeys(nickname);
        driver.findElement(By.name("title")).click();
        driver.findElement(By.name("title")).clear();
        driver.findElement(By.name("title")).sendKeys(title);
        driver.findElement(By.name("company")).click();driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys(company);
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys(home);
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys(mobile);
        driver.findElement(By.name("work")).click();
        driver.findElement(By.name("work")).clear();
        driver.findElement(By.name("work")).sendKeys(work);
        driver.findElement(By.name("fax")).click();
        driver.findElement(By.name("fax")).clear();
        driver.findElement(By.name("fax")).sendKeys(fax);
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("email2")).click();
        driver.findElement(By.name("email2")).clear();
        driver.findElement(By.name("email2")).sendKeys(email2);
        driver.findElement(By.name("email3")).click();
        driver.findElement(By.name("email3")).clear();
        driver.findElement(By.name("email3")).sendKeys(email3);
        driver.findElement(By.name("homepage")).click();
        driver.findElement(By.name("homepage")).clear();
        driver.findElement(By.name("homepage")).sendKeys(homepage);
        driver.findElement(By.name("bday")).click();
        new Select(driver.findElement(By.name("bday"))).selectByVisibleText(bday);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[1]/following::option[19]")).click();
        driver.findElement(By.name("bmonth")).click();
        new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(bmonth);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[1]/following::option[45]")).click();
        driver.findElement(By.name("byear")).click();
        driver.findElement(By.name("byear")).clear();
        driver.findElement(By.name("byear")).sendKeys(byear);
        driver.findElement(By.name("aday")).click();
        new Select(driver.findElement(By.name("aday"))).selectByVisibleText(aday);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Anniversary:'])[1]/following::option[18]")).click();
        driver.findElement(By.name("amonth")).click();
        new Select(driver.findElement(By.name("amonth"))).selectByVisibleText(amonth);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Anniversary:'])[1]/following::option[45]")).click();
        driver.findElement(By.name("ayear")).click();
        driver.findElement(By.name("ayear")).clear();
        driver.findElement(By.name("ayear")).sendKeys(ayear);
        driver.findElement(By.name("new_group")).click();
        new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(new_group);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Group:'])[1]/following::option[2]")).click();
        driver.findElement(By.name("address2")).click();
        driver.findElement(By.name("address2")).clear();
        driver.findElement(By.name("address2")).sendKeys(address2);
        driver.findElement(By.name("phone2")).click();
        driver.findElement(By.name("phone2")).clear();
        driver.findElement(By.name("phone2")).sendKeys(phone2);
        driver.findElement(By.name("notes")).click();
        driver.findElement(By.name("notes")).clear();
        driver.findElement(By.name("notes")).sendKeys(notes);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]")).click();
    }*/
}

