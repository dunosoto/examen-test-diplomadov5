import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.Logout;
import tasks.validation.IsLogout;

public class LogoutTest extends BaseTest {
  
  
  @Test
  public void logOutSuccessful() {
    Logout.as(webDriver);
  
    Assert.assertTrue(IsLogout.isLogout(webDriver));
  }
}
