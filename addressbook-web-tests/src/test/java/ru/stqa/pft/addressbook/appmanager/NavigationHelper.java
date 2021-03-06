package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{


  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGrouppage() {
      click(By.linkText("groups"));
  }

  public void gotoNewContactPage() {
    wd.findElement(By.linkText("add new")).click();
  }
}
