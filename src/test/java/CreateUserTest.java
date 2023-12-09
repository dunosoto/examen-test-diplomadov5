import base.BaseTest;
import org.testng.annotations.Test;
import tasks.SignUp;

public class CreateUserTest extends BaseTest {


  @Test
  public void createSuccessful() {
    SignUp.as(webDriver, "daniel uno soto", "unodaniel0@gmail.com", "passwork1!");
  }
}
