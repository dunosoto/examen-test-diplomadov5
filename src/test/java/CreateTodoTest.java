import base.BaseTest;
import org.testng.annotations.Test;
import tasks.AddNewProject;
import tasks.AddNewToDo;
import tasks.Login;

public class CreateTodoTest extends BaseTest {
  
  @Test
  public void createTodoSuccessful() {
  
  
    Login.as(webDriver, "danielunosoto@gmail.com", "password1!");
  
    AddNewToDo.as(webDriver, "Tarea Completada");
  }
}