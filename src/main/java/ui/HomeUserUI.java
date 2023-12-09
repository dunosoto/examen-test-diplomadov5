package ui;

import org.openqa.selenium.By;

public class HomeUserUI {
  
  
  public  static By logout = By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]");
  public  static By AddNewProject = By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div");
  public  static By AddButton = By.xpath("//*[@id=\"NewProjNameButton\"]");
  public  static By insertNewProject = By.xpath("//*[@id=\"NewProjNameInput\"]");
  
  
  
  //add new todo
  public static By newTodoTextAra = By.xpath("//*[@id=\"NewItemContentInput\"]");
  public static By addNewTodoButton = By.xpath("//*[@id=\"NewItemAddButton\"]");
  
}
