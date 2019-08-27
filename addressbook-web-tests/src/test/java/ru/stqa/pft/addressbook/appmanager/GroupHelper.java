package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupFieldsData;

public class GroupHelper extends HelperBase {

    public GroupHelper (WebDriver driver) {
        super(driver);
    }
    public void submitGroupCreation() {
        clickName("submit");
    }

    public void fillGroupForm(GroupFieldsData groupFieldsData) {
        type(By.name("group_name"), groupFieldsData.getGroupName());
        type(By.name("group_header"), groupFieldsData.getGroupHeader());
        type(By.name("group_footer"), groupFieldsData.getGroupFooter());
    }

    public void initGroupCreation() {
        clickName("new");
    }

    public void deleteSelectedGroups() {

        clickName("delete");
    }

    public void selectGroup() {

        clickName("selected[]");
    }

    public void initGroupModification() {
        clickName ("edit");
    }

    public void submitGroupModification() {
        clickName ("update");
    }
}
