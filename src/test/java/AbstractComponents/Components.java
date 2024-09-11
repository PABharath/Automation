package AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Components {

	WebDriver driver;
	public Components(WebDriver driver) {
		
		this.driver=driver;
	}
	
//	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#toast-container")));
//	     
//	     wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
	
	

	public void visibility(By FindBy) {
		  WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(5));
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FindBy));
		     
		 

	}
	
	public void invisibility(WebElement Ele) {
		  WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(5));
		     wait.until(ExpectedConditions.invisibilityOf(Ele));

	}
	
	

}
