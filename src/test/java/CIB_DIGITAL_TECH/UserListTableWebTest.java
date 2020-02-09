package CIB_DIGITAL_TECH;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AddUserModalDialog;
import pageObjects.UserListTablePage;
import resources.base;

public class UserListTableWebTest extends base{
	
	WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = InitializeDriver();
	}
	
	@Test(dataProvider="getData")
	//Parameterizing method to run multiple user data at a time using TestNG (@DataProvider)
	public void testUserListTable(String firstName, String lastName, String userName, String password, String customer, String role, String email, String cellphone)
	{		
		//Test case 1: Navigate to the website using URL (http://www.way2automation.com/angularjs-protractor/webtables/)
		driver.get(prop.getProperty("url"));
		
		//Test case 3: Click Add User
		UserListTablePage userList = new UserListTablePage(driver);		
		userList.addUserButton().click();
		
		//Test case 4: Add each user with given details
		AddUserModalDialog add = new AddUserModalDialog(driver);
		add.getFirstName().sendKeys(firstName);
		add.getLasttName().sendKeys(lastName);
		add.getUserName().sendKeys(userName);
		add.getPassword().sendKeys(password);
		add.getCustomer(customer);
		add.getRole().selectByVisibleText(role);
		add.getEmail().sendKeys(email);
		add.getCellPhone().sendKeys(cellphone);		
		add.SaveRecord().click();	
		
	}	
	
	//Test case 5: Ensure that User Name (*) is unique on each run
	//One way of storing and utilizing test data
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][8];
		
		//first row data (user 1)
		data[0][0]="FName1";
		data[0][1]="LName1";
		data[0][2]="User1";
		data[0][3]="Pass1";
		data[0][4]="Company AAA";
		data[0][5]="Admin";
		data[0][6]="admin@mail.com";
		data[0][7]="082555";
				
		//second row data (user 2)
		data[1][0]="FName2";
		data[1][1]="LName2";
		data[1][2]="User2";
		data[1][3]="Pass2";
		data[1][4]="Company BBB";
		data[1][5]="Customer";
		data[1][6]="customer@mail.com";
		data[1][7]="083444";
		
		//Test case 6: Ensure that your users are added to the list
		//I noticed that on refreshing the table, the first user record is removed,
		//however on running the test, only the last user record will be displayed 
		
		return data;
	}
	
	/*@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;  // memory to not get waisted
	}*/

}
