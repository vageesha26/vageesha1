import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/vageesha/Downloads/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/nav/ul/li[5]/a/span/span"));
		

	}
}
