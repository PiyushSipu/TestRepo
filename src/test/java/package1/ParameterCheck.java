package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParameterCheck {
	WebDriver driver;

	@Test
	public void parameterInsertion() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
	}
}
