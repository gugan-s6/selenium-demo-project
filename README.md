### Selenium-demo-project
Demo project to interact and test web elements and generating test reports using testNG.
This project demonstrates a suite of Selenium tests implemented using Java and TestNG. It is intended as a showcase for automation testing skills. 

## Features 
Automated test cases for interacting with web elements: 
- Hyperlink testing 
- Textbox interaction 
- Button clicks 
- Alert handling 
- Dropdown selection 
- Radio buttons and checkboxes 
- Drag-and-drop operations 
- Utilizes TestNG for test management. 
- Includes Maven for dependency management.

## Prerequisites
Ensure the following software is installed:
1. Java Development Kit (JDK) (version 8 or later)
2. Maven (build automation tool)
3. ChromeDriver, GeckoDriver, or other WebDriver binaries matching your browser versions.
4. A supported browser such as Chrome, Firefox, or Edge.

## Setup and Execution
1. Clone the repository:
   ```bash
      git clone https://github.com/gugan-s6/selenium-demo-project.git  
      cd selenium-demo-project

2. Install dependencies:
   ```bash
      mvn clean install

4. Run the tests:
   Execute all tests using the TestNG XML file:
      ```bash
         mvn test

5. Generate Test Reports:
   TestNG will generate default test reports in the test-output folder.
   Open test-output/index.html in a browser to view the results.

## File Structure
- ```src/test/java```: Contains the test classes.
   - ```DemoTest1.java```: Core Selenium test class demonstrating interactions with web elements.
   - ```ParentClass.java```: Base class for setting up WebDriver, common configurations, and utilities.
- ```pom.xml```: Maven configuration file for managing dependencies.
- ```testNG.xml```: TestNG configuration file for organizing and running test suites.
- ```README.md```: Documentation for the project.

## Technologies Used
- **Java:** Core language for automation scripts.
- **Selenium WebDriver:** Automation framework for interacting with browsers.
- **TestNG:** Testing framework for test case management and reporting.
- **Maven:** Build automation tool for dependency management.
- **WebDriver Manager:** Simplifies managing browser driver binaries.
  
## Example Code Snippet
Here’s an example of a test case that handles JavaScript alerts:
```java

@Test
	public void alertButton() {

		WebElement alertButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Generate Alert Box']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", alertButton);

		action.moveToElement(alertButton).build().perform();
		action.click().perform();
		System.out.println("Alert Button is clicked");

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();
		System.out.println("Alert message is "+alertText);

		alert.accept();
		System.out.println("'OK' is selected from the alert pop-up");


		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
```
## Future Enhancements
- Add more test cases for advanced interactions.
- Integrate ExtentReports for enhanced reporting.
- Include parallel test execution using TestNG.
- Enable cross-browser testing.

## Author
Gugan Subramani
Connect with me on [LinkedIn](https://www.linkedin.com/in/gugan-subramani) or visit my [Upwork Profile](https://www.upwork.com/freelancers/~01e176dd2a65070879?s=1313512633755545600).
