package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.FormLogin;
import ui.FormSignUp;
import ui.HomePageUI;


public class Login {



  public static void as(WebDriver webDriver, String email, String password) {
  
    Click.on(webDriver, HomePageUI.loginButton);
    Enter.text(webDriver, FormLogin.email, email);
    Enter.text(webDriver, FormLogin.password, password);
    Click.on(webDriver, FormLogin.loginButton);
  }
}
