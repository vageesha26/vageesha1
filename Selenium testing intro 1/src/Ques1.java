import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/vageesha/Downloads/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

	}

}
