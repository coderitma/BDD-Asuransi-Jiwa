package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
  public static final int LICENSE_FULL = 1;
  public static final int LICENSE_PROVISIONAL = 2;
  WebDriver driver;
  By selectUserTitle = By.xpath("//select[@id=\"user_title\"]");
  By inputFirstName = By.xpath("//input[@id='user_firstname']");
  By inputSurname = By.xpath("//input[@id='user_surname']");
  By inputPhone = By.xpath("//input[@id='user_phone']");
  By selectDOBYear = By.xpath("//select[@id='user_dateofbirth_1i']");
  By selectDOBMonth = By.xpath("//select[@id='user_dateofbirth_2i']");
  By selectDOBDate = By.xpath("//select[@id='user_dateofbirth_3i']");
  By inputLicenceTypeT = By.xpath("//input[@id='licencetype_t']");
  By inputLicenceTypeF = By.xpath("//input[@id='licencetype_f']");
  By selectLicensePeriod = By.xpath("//select[@id='user_licenceperiod']");
  By selectOccupation = By.xpath("//select[@id='user_occupation_id']");
  By inputStreet = By.xpath("//input[@id='user_address_attributes_street']");
  By inputCity = By.xpath("//input[@id='user_address_attributes_city']");
  By inputCountry = By.xpath("//input[@id='user_address_attributes_county']");
  By inputPostCode = By.xpath("//input[@id='user_address_attributes_postcode']");
  By inputEmail = By.xpath("//input[@id='user_user_detail_attributes_email']");
  By inputPassword = By.xpath("//input[@id='user_user_detail_attributes_password']");
  By inputConfirmPassword = By.xpath("//input[@id='user_user_detail_attributes_password_confirmation']");
  By btnReset = By.xpath("//input[@id='resetform']");
  By btnCreate = By.xpath("//input[@name='submit']");
  
  RegisterPage(WebDriver driver) {
    this.driver = driver;
  }

  public void setSelectUserTitle(String title) {
    Select selectUserTitles = new Select(driver.findElement(selectUserTitle));
    selectUserTitles.selectByVisibleText(title);
  }

  public void setInputFirstName(String firstName) {
    driver.findElement(inputFirstName).sendKeys(firstName);
  }

  public void setInputSurname(String surename) {
    driver.findElement(inputSurname).sendKeys(surename);
  }

  public void setInputPhone(String phone) {
    driver.findElement(inputPhone).sendKeys(phone);
  }

  public void setSelectDOBYear(String year) {
    Select selectDOBYears = new Select(driver.findElement(selectDOBYear));
    selectDOBYears.selectByVisibleText(year);
  }

  public void setSelectDOBMonth(String month) {
    Select selectDOBMonths = new Select(driver.findElement(selectDOBMonth));
    selectDOBMonths.selectByVisibleText(month);
  }

  public void setSelectDOBDate(String date) {
    Select selectDOBDates = new Select(driver.findElement(selectDOBDate));
    selectDOBDates.selectByVisibleText(date);
  }

  public void setInputLicenceType(int licenseType) {
    if (RegisterPage.LICENSE_FULL == licenseType) {
      driver.findElement(inputLicenceTypeT).click();
    } else if (RegisterPage.LICENSE_PROVISIONAL == licenseType) {
      driver.findElement(inputLicenceTypeF).click();
    } else {
      throw new Error("Pilihan tidak sesuai!");
    }
  }

  public void setSelectLicensePeriod(String period) {
    Select selectLicensePeriods = new Select(driver.findElement(selectLicensePeriod));
    selectLicensePeriods.selectByVisibleText(period);
  }

  public void setSelectOccupation(String occupation) {
    Select selectOccupations = new Select(driver.findElement(selectOccupation));
    selectOccupations.selectByVisibleText(occupation);
  }

  public void setInputStreet(String street) {
    driver.findElement(inputStreet).sendKeys(street);
  }

  public void setInputCity(String city) {
    driver.findElement(inputCity).sendKeys(city);
  }

  public void setInputCountry(String country) {
    driver.findElement(inputCountry).sendKeys(country);
  }

  public void setInputPostCode(String postCode) {
    driver.findElement(inputPostCode).sendKeys(postCode);
  }

  public void setInputEmail(String email) {
    driver.findElement(inputEmail).sendKeys(email);
  }

  public void setInputPassword(String password) {
    driver.findElement(inputPassword).sendKeys(password);
  }

  public void setInputConfirmPassword(String confirmPassword) {
    driver.findElement(inputConfirmPassword).sendKeys(confirmPassword);
  }

  public void setBtnReset() {
    driver.findElement(btnReset).click();
  }

  public void setBtnCreate() {
    driver.findElement(btnCreate).click();
  }


 
  
  
}
