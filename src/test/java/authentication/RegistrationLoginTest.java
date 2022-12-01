package authentication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

public class RegistrationLoginTest {
  WebDriver driver;
  private WebDriverWait wait;
  private RegisterPage registerPage;
  
  @Given("Masuk ke halaman register {string}")
  public void masuk_ke_halaman_register(String string) {
    System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
    driver = new ChromeDriver();
    
    driver.get(string);
    driver.manage().window().maximize();
    registerPage = new RegisterPage(driver);
    wait = new WebDriverWait(driver, Duration.ofSeconds(40));
  }

  @When("Mengisi title {string}")
  public void mengisi_title(String string) {
    registerPage.setSelectUserTitle(string);
  }

  @When("Mengisi first name {string}")
  public void mengisi_first_name(String string) {
    registerPage.setInputFirstName(string);
  }

  @When("Mengisi surename {string}")
  public void mengisi_surename(String string) {
    registerPage.setInputSurname(string);
  }

  @When("Mengisi phone {string}")
  public void mengisi_phone(String string) {
    registerPage.setInputPhone(string);
  }

  @When("Mengisi DOB {string} dan {string} dan {string}")
  public void mengisi_DOB_dan_dan(String string, String string2, String string3) {
    registerPage.setSelectDOBYear(string);
    registerPage.setSelectDOBMonth(string2);
    registerPage.setSelectDOBDate(string3);
  }

  @When("Mengisi jenis lisensi {string}")
  public void mengisi_jenis_lisensi(String string) {
    if (RegisterPage.LICENSE_FULL == Integer.parseInt(string)) {
      registerPage.setInputLicenceType(RegisterPage.LICENSE_FULL);
    } else {
      registerPage.setInputLicenceType(RegisterPage.LICENSE_PROVISIONAL);
    }
    
  }

  @When("Mengisi periode lisensi {string}")
  public void mengisi_periode_lisensi(String string) {
    registerPage.setSelectLicensePeriod(string);
  }

  @When("Mengisi pekerjaan {string}")
  public void mengisi_pekerjaan(String string) {
    registerPage.setSelectOccupation(string);
  }

  @When("Mengisi alamat jalan {string}")
  public void mengisi_alamat_jalan(String string) {
    registerPage.setInputStreet(string);
  }

  @When("Mengisi kota {string}")
  public void mengisi_kota(String string) {
    registerPage.setInputCity(string);
  }

  @When("Mengisi Negara {string}")
  public void mengisi_Negara(String string) {
    registerPage.setInputCountry(string);
  }

  @When("Mengisi kode pos {string}")
  public void mengisi_kode_pos(String string) {
    registerPage.setInputPostCode(string);
  }

  @When("Mengisi email {string}")
  public void mengisi_email(String string) {
     registerPage.setInputEmail(string);
  }

  @When("Mengisi password {string}")
  public void mengisi_password(String string) {
    registerPage.setInputPassword(string);
  }

  @When("Konfirmasi password {string}")
  public void konfirmasi_password(String string) {
    registerPage.setInputConfirmPassword(string);
  }

  @Then("Klik create")
  public void klik_create() {
    registerPage.clickCreate();
    driver.quit();
  }
}
