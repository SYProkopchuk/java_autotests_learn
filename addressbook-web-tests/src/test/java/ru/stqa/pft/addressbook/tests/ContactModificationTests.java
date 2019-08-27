package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactFieldsData;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification () {
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactFieldsData("Test1", "Test1",
                "Test2", "Test2", "Test2", "Test1",
                "Test1", "Test1", "Test1", "Test1",
                "Test1", "Test1", "Test1", "Test1",
                "Test1", "17","November", "1993,",
                "13","October","1992", "Test", "888",
                "qwerty"));
        app.getContactHelper().submitContactModification();
    }
}
