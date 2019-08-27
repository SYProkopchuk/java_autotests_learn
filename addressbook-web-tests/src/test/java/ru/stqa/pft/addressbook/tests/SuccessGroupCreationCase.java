package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupFieldsData;


public class SuccessGroupCreationCase extends TestBase {

    @Test
    public void successCreationCase()  {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupFieldsData("Test1", null, "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.returnToGroupPage();
    }

}
