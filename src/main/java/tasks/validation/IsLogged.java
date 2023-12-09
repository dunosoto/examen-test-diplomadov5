package tasks.validation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.HomeUserUI;

public class IsLogged {
  
  
  public static boolean isLogged(WebDriver webDriver) {
    WebElement element = webDriver.findElement(HomeUserUI.logout);
    return element.isDisplayed();
  }
}
