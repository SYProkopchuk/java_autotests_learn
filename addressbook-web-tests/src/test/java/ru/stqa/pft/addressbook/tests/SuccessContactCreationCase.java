package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactFieldsData;

public class SuccessContactCreationCase extends TestBase {

    @Test
    public void SuccessContactCreationCase() {

       app.getContactHelper().initContactCreation();
       app.getContactHelper().fillContactForm(new ContactFieldsData("Test1", "Test1",
               "Test1", "Test1", "Test1", "Test1",
               "Test1", "Test1", "Test1", "Test1",
               "Test1", "Test1", "Test1", "Test1",
               "Test1", "17","November", "1993,",
               "13","October","1992", "Test", "888",
               "qwerty"));
        tearDown();

    }


}
