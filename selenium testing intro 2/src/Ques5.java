import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/vageesha/Downloads/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		System.out.println(driver.findElements(By.xpath("//iframe")).size()); 
	}

}
