package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  WebDriver driver;
  By inputEmail = By.xpath("//input[@id=\"email\"]");
  By inputPasswod = By.xpath("//input[@id=\"password\"]");
  By btnLogin = By.xpath("//input[@name=\"submit\"]");
  By h2WelcomeMessage = By.xpath("//h2[text()='Broker Insurance WebPage']");
  
   public LoginPage(WebDriver driver) {
    this.driver = driver;
  }
  
  public void setEmail(String email) {
    driver.findElement(inputEmail).sendKeys(email);
  }
  
  public void setPassword(String password) {
    driver.findElement(inputPasswod).sendKeys(password);
  }
  
  public void clickLogin() {
    driver.findElement(btnLogin).click();
  }
  
  public String getWelcome() {
    return driver.findElement(h2WelcomeMessage).getText();
  }
  
  
}
