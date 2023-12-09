package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomeUserUI;

public class AddNewToDo {
  
  
  public static void as(WebDriver webDriver, String newTodo) {
    Enter.text(webDriver, HomeUserUI.newTodoTextAra, newTodo);
    Click.on(webDriver, HomeUserUI.addNewTodoButton);
  }
}
