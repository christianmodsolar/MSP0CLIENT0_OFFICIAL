package Client0;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testnow {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
   baseUrl = "https://pit-qa003.mmodal.com/";
    //baseurl = "https://pit-qa003.mmodal.com/Catalyst/org/him3";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMMODAL2() throws Exception {
    driver.get(baseUrl + "/Catalyst/login.jsp?service=https%3A%2F%2Fpit-qa003.mmodal.com%2FCatalyst%2Forg%2Fhim3%2F&renew=true");
    driver.findElement(By.id("j_username")).clear();
    driver.findElement(By.id("j_username")).sendKeys("demo@him3");
    driver.findElement(By.id("j_password")).clear();
    driver.findElement(By.id("j_password")).sendKeys("M*Modal1710");
    driver.findElement(By.cssSelector("span")).click();
    driver.findElement(By.xpath("//div/div[3]")).click();
    driver.findElement(By.xpath("//div[3]/div")).click();
    driver.findElement(By.xpath("//td[2]/div/div/div[2]")).click();
    driver.findElement(By.cssSelector("div.html-face")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}











	}

}
