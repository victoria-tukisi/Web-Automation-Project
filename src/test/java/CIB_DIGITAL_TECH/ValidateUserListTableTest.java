package CIB_DIGITAL_TECH;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.UserListTablePage;
import resources.base;

public class ValidateUserListTableTest extends base
{
	WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = InitializeDriver();
		System.out.println("Driver is initialized");
		//Test case 1: Navigate to the website using URL (http://www.way2automation.com/angularjs-protractor/webtables/)
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void validateByUserNameColumn()
	{	
		UserListTablePage userList = new UserListTablePage(driver);
		//Test case 2: Validate that you are on User List Table via "User Name" column. I Use two methods for validation:
		
		//Method 1: Comparing that a particular text from the "User List Table" exists (Expected versus Actual)
		Assert.assertEquals("User Name123", userList.getUserName().getText()); 
		System.out.println("Validation method 1 passed");		
		
		//Method 2: Verify that the "User Name" column is displayed in the "User List Table"
		Assert.assertTrue(userList.getUserName().isDisplayed());
		System.out.println("Validation method 2 passed");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;  
	}
}
