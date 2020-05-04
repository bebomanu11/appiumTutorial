import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.windows.PressesKeyCode;

public class miscCommands extends baseAppium {

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		Thread.sleep(5);
//   Gives you the current activity like the Dev or QA activity		
		System.out.println(driver.currentActivity());
//   Get you the type of app the user is in currently: Native or Web or hybrid app
		System.out.println(driver.getContext());
//	 Get the orientation of the phone: Landscape or Portrait		
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
//	 To hide the keyboard on device screen
//		driver.hideKeyboard();
		Thread.sleep(3);
//		To hit the Back button or Home button
//		driver.pressKeyCode(AndroidKeyCode.BACKSPACE);
		
		
	}

}
