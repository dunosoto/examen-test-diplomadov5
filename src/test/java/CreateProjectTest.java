import base.BaseTest;
import org.testng.annotations.Test;
import tasks.AddNewProject;
import tasks.Login;

public class CreateProjectTest extends BaseTest {
  
  
  @Test
  public void createProjectSuccessful() {
  
    Login.as(webDriver, "danielunosoto@gmail.com", "password1!");
  
    AddNewProject.as(webDriver, "Diplomado-V5");
  }
}