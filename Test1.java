package Test;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test1 extends ParentClass{

	@Test

	public void hyperLink() {

		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("This is a link")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", link);

		action.moveToElement(link).build().perform();
		action.click()
		.perform();



		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void textBox() {

		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement textBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input [contains(@id,'fname')]")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", textBox);

		action.sendKeys(textBox, "Sample text" +Keys.ENTER).perform();



		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void submitButton() {

		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button [contains (@id, 'idOfButton')]")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", submitButton);

		action.moveToElement(submitButton).build().perform();
		try {
			Thread.sleep(Duration.ofSeconds(10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		action.click()
		.perform();



		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void alertBoxButton() {

		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement alertBoxButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id = 'dblClkBtn']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", alertBoxButton);

		action.moveToElement(alertBoxButton).build().perform();
		action.doubleClick()
		.perform();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert message is "+ alert.getText());
		alert.accept();


		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void radioButton() {

		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement maleButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input [@id = 'male']")));
		WebElement femaleButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input [@id = 'female']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", maleButton);
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", femaleButton);

		action.moveToElement(maleButton).build().perform();
		try {
			Thread.sleep(Duration.ofSeconds(10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		action.click()
		.perform();

		System.out.println("Male radio button is selected");


		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void checkboxButton() {

		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement checkboxButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input [contains (@type, 'checkbox') and @value ='Automation']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", checkboxButton);

		action.moveToElement(checkboxButton).build().perform();
		try {
			Thread.sleep(Duration.ofSeconds(10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		action.click()
		.perform();
		
		System.out.println("Automation checkbox is selected");



		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void dropdownButton() {

		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("testingDropdown")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", dropdownButton);

		action.moveToElement(dropdownButton).build().perform();
		action.click()
		.perform();

		Select dropdown = new Select(dropdownButton);
		dropdown.selectByContainsVisibleText("Manual Testing");
		
		System.out.println("Manual testing option is selected");
		


		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void alertButton() {

		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement alertButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Generate Alert Box']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", alertButton);

		action.moveToElement(alertButton).build().perform();
		action.click()
		.perform();

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();
		System.out.println("Alert message is "+alertText);

		alert.accept();



		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void confirmBox() {

		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Generate Confirm Box']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", confirmButton);

		action.moveToElement(confirmButton).build().perform();
		action.click()
		.perform();

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();
		System.out.println("Alert message is "+alertText);

		alert.dismiss();

		System.out.println("confirm box cancelled");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void dragAndDropButton() {

		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement dragAndDropSpace = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div [contains (@id,'targetDiv')]")));
		WebElement dragAndDropImage = wait.until(ExpectedConditions.elementToBeClickable(By.id("myImage")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({ block:'center', inline:'center'});", dragAndDropSpace);

		action.moveToElement(dragAndDropImage).build().perform();
		action.dragAndDrop(dragAndDropImage, dragAndDropSpace).perform();
		
		System.out.println("drag and drop is successful");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
