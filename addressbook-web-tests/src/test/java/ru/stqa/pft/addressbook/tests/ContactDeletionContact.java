package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;


public class ContactDeletionContact extends TestBase {

    
    @Test
    public void testContactDeletionContact() {
        app.getContactsHelper().SelectContactToRemove();
        app.getContactsHelper().RemoveSelectedContact();
    }


}
