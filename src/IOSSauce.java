import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.ios.IOSDriver;

public class IOSSauce {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("username", "bebomanu11");
	    capabilities.setCapability("accessKey", "b6c82cbd-add8-4cc5-ae9f-9901a9666898");
	    capabilities.setCapability("browserName", "Safari");
	    capabilities.setCapability("platform", "macOS 10.13");
	    capabilities.setCapability("version", "11.1");
	    //capabilities.setCapability("name", method.getName());

	    /**
	     * In this section, we set the Remote WebDriver to run on Sauce Labs, and pass the capabilities.
	     * Then we perform some actions on an application.
	     * For this script, enter in your application's URL in place of 'https://www.saucedemo.com'. */
//	    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://ondemand.saucelabs.com:80/wd/hub"), capabilities);
	    IOSDriver driver = new IOSDriver(new URL("http://ondemand.saucelabs.com:80/wd/hub"), capabilities); 
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    driver.navigate().to("https://google.com");
	    Thread.sleep(5);
	    
	    

	}

}
