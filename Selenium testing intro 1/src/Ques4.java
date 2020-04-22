import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/vageesha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.tothenew.com/");
		WebElement w=driver.findElement(By.xpath("(//a[@id='h-contact-us'])[2]"));
	    w.click();
	}
}
