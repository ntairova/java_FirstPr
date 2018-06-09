package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification(){
    app.getContactsHelper().SelectContactToRemove();
    app.getContactsHelper().initGroupModification();
    app.getContactsHelper().fillContactForm(new ContactData("Nelya1", "Tairova", "n0187@test.ru"));
    app.getContactsHelper().SubmitContactModification();
  }
}
