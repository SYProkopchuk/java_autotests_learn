package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class SuccessContactCreationCase extends TestBase {

    @Test
    public void SuccessContactCreationCase() {

       app.initContactCreation();
       app.fillContactForm("Test1", "Test1", "Test1", "Test1",
                "Test1", "Test1", "Test1", "Test1", "Test1",
                "Test1", "Test1", "Test1", "Test1", "Test1",
                "Test1", "17", "November", "1995", "16",
                "November", "1996", "Test1", "Test1",
                "Test1", "Test1");
        tearDown();

    }


}
