import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/vageesha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");

	}

}
