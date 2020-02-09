# Web-Automation-Project
# Public website: http://www.way2automation.com/angularjs-protractor/webtables/
Instructions to run the WEB_Automation Project:
Clone & Save the projects in a desired location on your machine e.g Desktop
Open the command prompt
Change directory to point to where the projects are located e.g C:\...\Desktop\TASK2_WEB
Run the program by using maven commands: > mvn clean
                                       : > mvn compile
                                       : > mvn test
After successfully running the tests, open the project to extract the report file:
Goto C:\...\Desktop\TASK2_WEB\test-output
Right-click on a HTLM file called ExtentReportsTestNG.html, and select a desired browser

Alternatively, Use Eclipse IDE:
Import the project in Eclipse IDE
Extract the project file and right-click on the testng.xml file to run all the tests, examine the output on the console tab

To view the reports, extract the test-output folder, right-click the ExtentReportsTestNG.html, select Properties, copy the "Location" address
Navigate any broswer and paste the copied address - examine the report and test results~

o Open Source website - http://www.way2automation.com/angularjs-protractor/webtables/
 The following test cases are perfomed:
o Validate that you are on the User List Table
o Click Add user
o Add new users
o Ensure that User Name (*) is unique on each run
o Ensure that your users are added to the list
