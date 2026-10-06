package utilities;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	
	// 1. Select Dropdown by Value
    public void selectDropdownWithValue(WebElement element, String value) {
        Select object = new Select(element);
        object.selectByValue(value);
    }

    // 2. Select Dropdown by Index 
    public void selectDropdownWithIndex(WebElement element, int value) {
        Select object = new Select(element);
        object.selectByIndex(value);
    }
    //	3.page scroll Up 
    
    public void pageScrollUp(WebDriver driver)
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollTo(0,0);");
    }

    // 4. Page Scroll Down 
    public void pageScrollDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
    }
    
    //5. select dropdown by visible text
    
    public void selecetDropDownByVisibleText(WebElement element , String visibleText)

{
    	Select object = new Select(element);
    	object.selectByVisibleText(visibleText);
    	}


}
