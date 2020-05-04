import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TipsToLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 To check what devices are connected, use in cmd:
			adb devices    
				if unauthorized
						do adb kill-server
						   adb start-server
            adb devices
              */

		/*
//		To scroll down
		JavascriptExecutor jse =  (JavascriptExecutor) driver;
		jse.executeScript("window.scrollby(0,480)", "");
		Assert.assertTrue(driver.findElementByXpath().getAttribute("class").contains("header"));
	}
	
	*/
		
		
		//Frames   -robot captcha
		
		public static int frameNumber (WebDriver driver, By by) {
			int i;
			int frameCount =  driver.findElements(By.tagName("iFrame")).size();
			//This is helpful when we have frame inside frame
			for(i=0;i<=frameCount;i++) {
				driver.switchTo().frame(i);
				int count =  driver.findElements(by).size();	//do not use isDisplayed, use instead size();			
				if (count>0) {
					driver.findElement(By.xpath("checkbox")).click();
					break;
				}

			
				}
			//This is helpful when multiple frames within the window and 
			// to switch to another frame, via default is must 
			driver.switchTo().defaultContent();
			return  i;
			}
			
			
			
		}
	
	

}
