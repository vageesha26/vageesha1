import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/home/vageesha/Downloads/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		String name="vageesha";
		driver.findElement(By.xpath("//button[text()= 'Click for Prompt Box']")).click();
		driver.switchTo().alert().sendKeys(name);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
}

}
