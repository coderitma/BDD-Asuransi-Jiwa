package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends LoginPage {
  By h4SignedAs = By.xpath("//h4[normalize-space()='yanzen@mail.com']");
  By btnLogout = By.xpath("//input[@value='Log out']");
  By tabHome = By.xpath("//a[@href='#tabs-1']");
  By tabRequestQuotation = By.xpath("//a[@href='#tabs-2']");
  By tabRetrieveQuotation = By.xpath("//a[@href='#tabs-3']");
  By tabProfile = By.xpath("//a[@href='#tabs-4']");
  By tabEditProfile = By.xpath("//a[@href='#tabs-5']");
  
  public DashboardPage(WebDriver driver) {
    super(driver);
  }
  
  public String getSignedAs() {
    return this.driver.findElement(h4SignedAs).getText();
  }
  
  public void clickBtnLogout() {
    this.driver.findElement(btnLogout).click();
  }
  
  public void clickTabHome() {
    this.driver.findElement(tabHome).click();
  }
  
  public void clickTabRequestQuotation() {
    this.driver.findElement(tabRequestQuotation).click();
  }
  
  public void clickTabRetrieveQuotation() {
    this.driver.findElement(tabRequestQuotation).click();
  }

  public void clickTabProfile() {
    this.driver.findElement(tabEditProfile).click();
  }
  
  public void clickTabEditProfile() {
    this.driver.findElement(tabEditProfile).click();
  }
  
}
