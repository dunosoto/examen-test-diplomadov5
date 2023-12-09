package ui;

import org.openqa.selenium.By;

public class FormSignUp {
  
  public  static By fullName = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]");
  public  static By email = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]");
  public  static By password = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]");
  public  static By SignUpButton = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]");
}

