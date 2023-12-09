package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.FormSignUp;
import ui.HomePageUI;


public class SignUp {



  public static void as(WebDriver webDriver, String fullName, String email, String password) {
  
    Click.on(webDriver, HomePageUI.signUoFreeButton);
    Enter.text(webDriver, FormSignUp.fullName, fullName);
    Enter.text(webDriver, FormSignUp.email, email);
    Enter.text(webDriver, FormSignUp.password, password);
    Click.on(webDriver, FormSignUp.SignUpButton);
  }

}
