package mainPage;

import io.github.bonigarcia.wdm.WebDriverManager;import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import adding.addToCart;
import adding.loginApplication;
import adding.matchingthecart;

public class Endtoend {
	
	@Test
	public void maindata() throws InterruptedException {
		
		String ProductName="ZARA COAT 3";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/client");
		
		loginApplication login=new loginApplication(driver);

		login.logindata("Bhar@gmail.com", "Bhar@123");

		addToCart add=new addToCart(driver);
		List<WebElement>cards=add.getalldata();
		add.addtocart(ProductName);
		
		
		matchingthecart match=new matchingthecart(driver);
		List<WebElement>matches=match.getallmatchequal();
		match.getallmatchequal();
//
//	    List<WebElement> cart=driver.findElements(By.cssSelector(".cartWrap h3"));
//	     
//	  boolean match=   cart.stream().anyMatch(s->s.getText().equals(ProductName));
//	  System.out.println(match);
//	  Thread.sleep(2000);
	  

//	  
//	  WebElement element =  driver.findElement(By.cssSelector(".subtotal button"));
//
//   
//      JavascriptExecutor js = (JavascriptExecutor) driver;
//    
//     js.executeScript("arguments[0].click();", element);
	     
	}

}
