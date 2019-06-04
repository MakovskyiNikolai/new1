import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleMainPageIsOpened {

  private WebDriver driver;

  @Before
  public void setDriver(){
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  }

  @After
  public void driverClose(){
    driver.close();
  }

  @Test
  public void checkGoogleMainPageIsOpened(){
    final String expectedTitle = "Google";
    driver.get("https://google.com");
    final String actualTitle = driver.getTitle();
    Assert.assertEquals("Incorrect page title)", expectedTitle, actualTitle);

  }

}
