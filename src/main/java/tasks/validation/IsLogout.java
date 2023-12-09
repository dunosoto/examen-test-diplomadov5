package tasks.validation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.HomePageUI;
import ui.HomeUserUI;

public class IsLogout {
  
  
  
  public static boolean isLogout(WebDriver webDriver) {
    WebElement element = webDriver.findElement(HomePageUI.loginButton);
    return element.isDisplayed();
  }
}
