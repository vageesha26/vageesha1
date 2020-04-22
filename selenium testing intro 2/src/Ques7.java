import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ques7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/vageesha/Downloads/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("https://www.myntra.com/");
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//nav//a[text()='Home & Living']"));
        actions.moveToElement(target).build().perform();
		WebElement Clock=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Clocks']")));
        Clock.click();
		System.out.println(driver.getCurrentUrl());
		}
	

	}


