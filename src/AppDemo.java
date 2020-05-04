import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppDemo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		File file =new File("src");
		File fs = new File(file,"Raaga.apk");
	
		DesiredCapabilities  cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5);
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


//cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
//
//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");