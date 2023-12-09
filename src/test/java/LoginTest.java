import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.Login;
import tasks.validation.IsLogged;

public class LoginTest extends BaseTest {


  @Test
  public void loginSuccessful() {
  
    Login.as(webDriver, "danielunosoto@gmail.com", "password1!");
  
    Assert.assertTrue(IsLogged.isLogged(webDriver));
  }
}
