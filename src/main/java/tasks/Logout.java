package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomeUserUI;

public class Logout {
  
  
  public static void as(WebDriver webDriver) {
    Click.on(webDriver, HomeUserUI.logout);
  }
}
