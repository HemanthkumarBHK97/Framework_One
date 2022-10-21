package Git_Frame_One;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FrameWork_Git {
	
	@Test
	public void Frame() {

		String key ="webdriver.chrome.driver";
		String value="./chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		
		
		System.Out.println("Hello");
	}
}
