package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RequestQuotationPage {
  public static final int YES = 1;
  public static final int NO = 2;
  WebDriver driver;
  By tabRequestQuotation = By.xpath("//a[@href='#tabs-2']");
  
  By selectBreakdowncover = By.xpath("//select[@id='quotation_breakdowncover']");
  By labelYes = By.xpath("//label[@for='quotation_windscreenrepair_t']");
  By labelNo = By.xpath("//label[@for='quotation_windscreenrepair_f']");
  By inputIncident = By.xpath("//input[@id='quotation_incidents']");
  By inputRegistration = By.xpath("//input[@id='quotation_vehicle_attributes_registration']");
  By inputAnnualMileage = By.xpath("//input[@id='quotation_vehicle_attributes_mileage']");
  By inputEstimatedValue = By.xpath("//input[@id='quotation_vehicle_attributes_value']");
  By selectParkingLocation = By.xpath("//select[@id='quotation_vehicle_attributes_parkinglocation']");
  By selectStartOfPolicyYear = By.xpath("//select[@id='quotation_vehicle_attributes_policystart_1i']");
  By selectStartOfPolicyMonth = By.xpath("//select[@id='quotation_vehicle_attributes_policystart_2i']");
  By selectStartOfPolicyDate = By.xpath("//select[@id='quotation_vehicle_attributes_policystart_3i']");
  By btnSaveQuotation = By.xpath("//input[@name='submit']");
  By info = By.xpath("//b[1]");
  
  public RequestQuotationPage(WebDriver driver) {
    this.driver = driver; 
  }
  
  public void clickTabRequestQuotation() {
    this.driver.findElement(tabRequestQuotation).click();
  }
  
  public void setSelectBreak(String sbreak) {
		Select selectBreakdowncovers = new Select(driver.findElement(selectBreakdowncover));
		selectBreakdowncovers.selectByVisibleText(sbreak);
	}

	public void setSelectWind(int swind) {
		 if (RequestQuotationPage.YES == swind) {
		      driver.findElement(labelYes).click();
		    } else if (RequestQuotationPage.NO == swind) {
		      driver.findElement(labelNo).click();
		    } else {
		      throw new Error("Pilihan tidak sesuai!");
		    }
	}

	public void setInputIncident(String incident) {
		driver.findElement(inputIncident).sendKeys(incident);
	}

	public void setInputRegis(String regis) {
		driver.findElement(inputRegistration).sendKeys(regis);
	}

	public void setInputAnnual(String annual) {
		driver.findElement(inputAnnualMileage).sendKeys(annual);
	}

	public void setInputEstimated(String estimated) {
		driver.findElement(inputEstimatedValue).sendKeys(estimated);
	}

	public void setSelectParking(String parking) {
		Select selectwind = new Select (driver.findElement(selectParkingLocation));
		selectwind.selectByVisibleText(parking);
	}

	public void setInputSOFyear(String SOFyear) {
		Select selectwind = new Select (driver.findElement(selectStartOfPolicyYear));
		selectwind.selectByVisibleText(SOFyear);
	}

	public void setInputSOFmonth(String SOFmonth) {
		Select selectwind = new Select (driver.findElement(selectStartOfPolicyMonth));
		selectwind.selectByVisibleText(SOFmonth);
	}

	public void setInputSOFdate(String SOFdate) {
		Select selectwind = new Select (driver.findElement(selectStartOfPolicyDate));
		selectwind.selectByVisibleText(SOFdate);
	}

	public void setBtnSave() {
		driver.findElement(btnSaveQuotation).click();;
	}
	
	public String getInfo() {
	  return driver.findElement(info).getText();
	}
}
