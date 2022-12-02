package authentication;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginTest {
  WebDriver driver;
  private WebDriverWait wait;
  private LoginPage loginPage;
  
  @Given("masuk ke halaman login {string}")
  public void masuk_ke_halaman_login(String string) {
    System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
    driver = new ChromeDriver();
    
    driver.get(string);
    driver.manage().window().maximize();
    loginPage = new LoginPage(driver);
    wait = new WebDriverWait(driver, Duration.ofSeconds(40));
  }

  @When("mengisi email {string}")
  public void mengisi_email(String string) {
      loginPage.setEmail(string);
  }

  @When("mengisi password {string}")
  public void mengisi_password(String string) {
      loginPage.setPassword(string);
  }

  @When("klik login")
  public void klik_login() {
      loginPage.clickLogin();
  }

  @Then("berada di halaman dashboard {string}")
  public void berada_di_halaman_dashboard(String string) {
      String actual = loginPage.getWelcome();
      assertEquals(actual, string);
      driver.close();
  }
}
