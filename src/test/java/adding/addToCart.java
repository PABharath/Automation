package adding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.Components;

public class addToCart extends Components  {
	
	
	
	
    WebDriver driver;
	public addToCart(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

By appear=By.cssSelector("#toast-container");
     
     @FindBy(css=".mb-3")
     List<WebElement> cards;
     
     @FindBy(css=".ng-animating")
     WebElement submitcart;
     
     @FindBy(css="[routerlink*=\"/dashboard/cart\"]")
     WebElement submitcart1;
     
     public List<WebElement> getalldata() {
    	 return cards;
     }
     
     public WebElement getitem(String ProductName) {
    	 WebElement card=cards.stream().filter(s->s.findElement(By.cssSelector("b")).getText().equals(ProductName)).findFirst().orElse(null);
    	 return card;
     }
     
     public void addtocart(String ProductName) {
    	 
    	WebElement cardclick=getitem(ProductName);
    	cardclick.findElement(By.cssSelector(".card-body button:last-of-type")).click();
    	visibility(appear);
    	invisibility(submitcart);
    	submitcart1.click();
     }

}
