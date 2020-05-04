import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSbasic {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

/*		DesiredCapabilities dc = new DesiredCapabilities().iphone();
//		dc.setCapability("testobjectApiKey","b6c82cbd-add8-4cc5-ae9f-9901a9666898");
		dc.setCapability("no",true);
		dc.setCapability("platformName", "IOS");
		dc.setCapability("PlatformVersion", "10.3");
		dc.setCapability("BrowserName", "safari");
		dc.setCapability("appiumVersion","1.11.1");
		dc.setCapability("deviceName", "iPhone 7");
		
		//When running using the real IOS device
		//IOSDriver<IOSElement> driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
		//When running using the real IOS device in Sauce lab
		IOSDriver driver = new IOSDriver(new URL("https://bebomanu11:b6c82cbd-add8-4cc5-ae9f-9901a9666898@ondemand.saucelabs.com:80/wd/hub"), dc);
		//IOSDriver driver = new IOSDriver(new URL("http://bebomanu11:b6c82cbd-add8-4cc5-ae9f-9901a9666898@ondemand.saucelabs.com:80/wd/hub"), dc);
		driver.get("http://google.com");
		Thread.sleep(5000);
		*/
		
		DesiredCapabilities dc=DesiredCapabilities.iphone();
		dc.setCapability("platformName", "iOS");
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.IOS);
		dc.setCapability("platformVersion", "7.1");
		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1");
		dc.setCapability("appiumVersion", "1.11.1");
		dc.setCapability("deviceName", "iPhone Simulator");
		dc.setCapability("browserName", "safari");
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://bebomanu11:b6c82cbd-add8-4cc5-ae9f-9901a9666898@ondemand.saucelabs.com:80/wd/hub"),dc);

		driver.get("http://google.com");
		Thread.sleep(5000);
		
	}

}
