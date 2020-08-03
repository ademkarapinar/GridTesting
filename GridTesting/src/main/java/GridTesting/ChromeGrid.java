package GridTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGrid {

	public static void main(String[] args) throws MalformedURLException {
		//DEFINE DesiredCapabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.MAC);
		
		//CHROME OPTIONS
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubURL = "http://192.168.0.11:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubURL), options);
		
		//define URL
		driver.get("https://learnsdet.com");
		System.out.println("Your title: "+driver.getTitle());
		
//		driver.quit();

	}

}
