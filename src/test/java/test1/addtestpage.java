package test1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page1.addcategorypage;

public class addtestpage {
		WebDriver driver;
		
		@Test
		public void usershouldbeabletoaddpage() {
			driver = util1.Browserfactory.init();
			
			addcategorypage addCategorypage = PageFactory.initElements(driver, addcategorypage.class);
			addCategorypage.validateAddcategorypage();
			addCategorypage.AddCategoryElement();
			addCategorypage.AddCategoryClickElement();
			
	
	
		}
	}
	
	
	
	
	
	
	

