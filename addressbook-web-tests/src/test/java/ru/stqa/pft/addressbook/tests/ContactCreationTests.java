package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoNewContactPage();
    app.getContactsHelper().fillContactForm(new ContactData("Nelya", "Tairova", "n0187@test.ru"));
    app.getContactsHelper().submitContactCreation();
    app.getContactsHelper().returnToHomePage();
  }


}
