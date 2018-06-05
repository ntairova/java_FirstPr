package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGrouppage();
        initGroupCreation();
        fillGroupForm(new GroupData("Bla Bla Bla", "asdad", "asdadasd"));
        submitGroupCreation();
        gotoGrouppage();
    }

}
