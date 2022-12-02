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
import pages.RequestQuotationPage;

public class RequestQuotationTest {
  WebDriver driver;
  private WebDriverWait wait;
  private RequestQuotationPage rqp;
  private LoginPage loginPage;
  
  @Given("req quo masuk ke halaman login {string}")
  public void masuk_ke_halaman_login(String string) {
    System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get(string);
    driver.manage().window().maximize();
    loginPage = new LoginPage(driver);
    rqp = new RequestQuotationPage(driver);
    wait = new WebDriverWait(driver, Duration.ofSeconds(40));
  }

  @When("req quo mengisi email {string}")
  public void mengisi_email(String string) {
      loginPage.setEmail(string);
  }

  @When("req quo mengisi password {string}")
  public void mengisi_password(String string) {
      loginPage.setPassword(string);
  }

  @When("req quo klik login")
  public void klik_login() {
      loginPage.clickLogin();
  }

  @When("req quo berada di halaman dashboard")
  public void berada_di_halaman_dashboard() {
    
  }
  
  @When("klik tab request quotation")
  public void klik_tab_request_quotation() {
    rqp.clickTabRequestQuotation();
  }
  
  @When("pilih Breakdowncover {string}")
  public void pilih_Breakdowncover(String string) {
    rqp.setSelectBreak(string);
  }

  @When("pilih Windscreenrepair {string}")
  public void pilih_Windscreenrepair(String string) {
    rqp.setSelectWind(Integer.parseInt(string));
  }

  @When("masukan incidents {string}")
  public void masukan_incidents(String string) {
    rqp.setInputIncident(string);
  }

  @When("masukan registration {string}")
  public void masukan_registration(String string) {
    rqp.setInputRegis(string);
  }

  @When("masukan annual milegae {string}")
  public void masukan_annual_milegae(String string) {
    rqp.setInputAnnual(string);
  }

  @When("masukan estimated value {string}")
  public void masukan_estimated_value(String string) {
    rqp.setInputEstimated(string);
  }

  @When("pilih parking location {string}")
  public void pilih_parking_location(String string) {
    rqp.setSelectParking(string);
  }

  @When("pilih Start of policy tahun {string} bulan {string} tanggal {string}")
  public void pilih_Start_of_policy_tahun_bulan_tanggal(String string, String string2, String string3) {
    rqp.setInputSOFyear(string);
    rqp.setInputSOFmonth(string2);
    rqp.setInputSOFdate(string3);
  }

  @When("klik save quotation")
  public void klik_save_quotation() {
    rqp.setBtnSave();
  }

  @Then("dapat pesan {string}")
  public void dapat_pesan(String string) {
     assertEquals(rqp.getInfo(), string);
     driver.quit();
  }
}
