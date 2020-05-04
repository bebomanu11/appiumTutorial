import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseAppium {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		File file =new File("src");
//		File fs = new File(file,"ApiDemos-debug.apk");
		File fs = new File(file,"Gaana Music Hindi Tamil Telugu MP3 Songs Online_v8.0.3_apkpure.com.apk");
	
		DesiredCapabilities  cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
		

//		****************    UDEMY Rahul Shetty Lecture 40      *******************
//		**************** For REAL ANDROID DEVICE CONFIGURATION *******************
		
/*		File appDir =new File("src");
		File app = new File(appDir,"bookmyshow-ucb.apk");
	
		DesiredCapabilities  cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"100")
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
*/		
		
		
//		**************** Some Important stuff to remember *******************
/*		To check the devices connected, use the commmand in cmd at path 
		platform-tools>adb devices
		The mobile or emulator connected will have the status as 'device' as connected, if not
		use:
			platform-tools>adb kill-server
			platform-tools>adb start-server
			
*/			
			
	}

}
