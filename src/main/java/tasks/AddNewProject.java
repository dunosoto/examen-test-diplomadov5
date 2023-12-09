package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomeUserUI;

public class AddNewProject {
  
  
  public static void as(WebDriver webDriver, String newProjectName) {
    Click.on(webDriver, HomeUserUI.AddNewProject);
    Enter.text(webDriver, HomeUserUI.insertNewProject, newProjectName);
    Click.on(webDriver, HomeUserUI.AddButton);
  }
}
