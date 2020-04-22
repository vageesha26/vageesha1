import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/vageesha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("vageesha");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("choudhary");
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("vageesha.choudhary@tothenew.com");
	}

}
