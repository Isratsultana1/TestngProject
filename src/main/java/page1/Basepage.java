package page1;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Basepage {
		public int generateRandomNum(int boundNum) {
			Random rnd = new Random();
			int generatedNum = rnd.nextInt(boundNum);
			return generatedNum;
					
			

		}
		
		public void selectFromDropdown(WebElement element ,String visibleText) {
			Select sel = new Select(element);
			sel.selectByVisibleText(visibleText);	
	}}
	
	
	
	
	
	
	
	
	

