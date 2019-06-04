package Locators;

import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.PageFactory;

public class MainClasses {

  public static void loginWithPopUp (WebDriver driver, String uname, String pwd, String url){
    driver.get("https://" + uname + ":" + pwd + "@" + url);
  }
}
