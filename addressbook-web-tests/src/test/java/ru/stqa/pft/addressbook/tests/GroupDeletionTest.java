package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGrouppage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getNavigationHelper().gotoGrouppage();
    }

}
