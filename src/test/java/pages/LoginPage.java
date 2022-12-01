package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  WebDriver driver;
  By inputEmail = By.xpath("//input[@id=\"email\"]");
  By inputPasswod = By.xpath("//input[@id=\"password\"]");
  By btnLogin = By.xpath("//input[@name=\"submit\"]");
  
  LoginPage(WebDriver driver) {
    this.driver = driver;
  }
  
  public void isiEmail(String email) {
    driver.findElement(inputEmail).sendKeys(email);
  }
  
  public void isiPassword(String password) {
    driver.findElement(inputPasswod).sendKeys(password);
  }
  
  public void clickLogin() {
    driver.findElement(btnLogin).click();
  }
}
