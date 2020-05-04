import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
//import java.io.File;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends baseAppium{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Thread.sleep(5);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Thread.sleep(5);
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		if(driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").isEnabled()==false) {
			driver.findElementById("android:id/checkbox").click();
		}
		
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		
		driver.findElementById("android:id/edit").sendKeys("123456");
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
	}

}
