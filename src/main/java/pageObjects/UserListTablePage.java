package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserListTablePage {
	
public WebDriver driver;
By addUser = By.xpath("//button[contains(@type,'add')]");
By usernameColumn = By.xpath("//span[contains(text(),'User Name')]");
	
	public UserListTablePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getUserName()
	{
		return driver.findElement(usernameColumn);
	}

	public WebElement addUserButton()
	{
		return driver.findElement(addUser);
	}
	
}
