package ru.stqa.pft.addressbook.tests;

public class ContactDATA {
  private final String firstname;
  private final String lastname;
  private final String email;

  public ContactDATA(String firstname, String lastname, String email) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getEmail() {
    return email;
  }
}
