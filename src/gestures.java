import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestures extends baseAppium {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		Thread.sleep(5);
		driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		TouchAction t = new TouchAction(driver);
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
		WebElement pressLong = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
//TAPPING:
		t.tap(tapOptions().withElement(element(expandList))).perform();
//LONG PRESS:
		t.longPress(longPressOptions().withElement(element(pressLong)).withDuration(ofSeconds(2))).release().perform();

		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
		
		
		
	}

	
}
