package adding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class matchingthecart {

	
	WebDriver driver;
	public matchingthecart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".cartWarp h3")
	List<WebElement> matches;
	
	public List<WebElement> getallmatchequal() {
		return matches;
	}
	
	public void matchesequal(String ProductName) throws InterruptedException

	{
     
  boolean match=   matches.stream().anyMatch(s->s.getText().equals(ProductName));
  System.out.println(match);
  Thread.sleep(2000);
	}

}
