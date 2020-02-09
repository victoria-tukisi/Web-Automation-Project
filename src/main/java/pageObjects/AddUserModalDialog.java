package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddUserModalDialog {
	
public WebDriver driver;
public WebElement company;
	
By firstName = By.xpath("//input[@name='FirstName']");
By lastName = By.xpath("//input[@name='LastName']");
By userName = By.xpath("//input[@name='UserName']");
By password = By.xpath("//input[@name='Password']");
By allCompanies = By.tagName("label");
By role = By.xpath("//select[@name='RoleId']");
By email = By.xpath("//input[@name='Email']");
By cellPhone = By.xpath("//input[@name='Mobilephone']");
By save = By.cssSelector(".btn-success");


	public AddUserModalDialog(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getFirstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement getLasttName()
	{
		return driver.findElement(lastName);
	}
	
	public WebElement getUserName()
	{
		return driver.findElement(userName);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public void getCustomer(String customerCompany)
	{
		int count = driver.findElements(allCompanies).size();
		String customer = null;
		
		for (int i = 0; i < count; i++) 
		{
			 company = driver.findElements(allCompanies).get(i);
			customer = driver.findElements(allCompanies).get(i).getText();
			//System.out.println("Customer "+customer);
			
			if(customer.equals(customerCompany))
			{
				 company.click();
			}
			
		}		
	}
	
	public Select getRole()
	{
		Select s = new Select(driver.findElement(role));
		return s;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getCellPhone()
	{
		return driver.findElement(cellPhone);
	}
	
	public WebElement SaveRecord()
	{
		return driver.findElement(save);
	}
}
