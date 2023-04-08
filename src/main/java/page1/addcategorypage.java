package page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class addcategorypage extends Basepage {
	WebDriver driver;
	public addcategorypage(WebDriver driver) {
		this.driver =driver;
	}
	
	@FindBy(how = How.XPATH , using ="//*[@id=\"extra\"]/input[1]") WebElement ADDCATEGORY_ELEMENT;
	@FindBy(how = How.XPATH , using ="//*[@id=\"extra\"]/input[2]") WebElement ADDCATEGORYCLICK_ELEMENT;
	@FindBy(how = How.XPATH , using ="//*[@id=\"extra\"]/select[3]") WebElement MONTHDROPDOWN_ELEMENT;
	
public void validateAddcategorypage() {
	
	
}
public void AddCategoryElement() {
	generateRandomNum(999);
	
	ADDCATEGORY_ELEMENT.sendKeys("sultana"+ generateRandomNum(999));
}
public void AddCategoryClickElement() {
	ADDCATEGORYCLICK_ELEMENT.click();
}

}


