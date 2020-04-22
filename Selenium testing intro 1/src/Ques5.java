import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/vageesha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.tothenew.com/");
		driver.findElement(By.xpath("(//a[@id='h-contact-us'])[2]")).click();
	    System.out.println(driver.getTitle());
	}

}
