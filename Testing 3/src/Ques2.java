import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2 {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("/home/vageesha/eclipse-workspace/Testing 3/src/config.properties");
		prop.load(ip);
		System.setProperty("webdriver.chrome.driver","/home/vageesha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver d= new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		
		d.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(prop.getProperty("fname"));
		d.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(prop.getProperty("lname"));
		d.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(prop.getProperty("address"));
		d.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(prop.getProperty("email"));
	    d.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(prop.getProperty("phone"));
		d.findElement(By.xpath("//input[@value='FeMale']")).click();
		d.findElement(By.id("checkbox2")).click();
		d.findElement(By.id("msdd")).click();
		d.findElement(By.xpath("//li[@class='ng-scope'][16]")).click();
		d.findElement(By.xpath("//option[@value='Java']")).click();
		d.findElement(By.id("countries")).click();
		d.findElement(By.xpath("//option[@value='India']")).click();
		d.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
		d.findElement(By.xpath("(//option[@value='India'])[2]")).click();
		d.findElement(By.id("yearbox")).click();
		d.findElement(By.xpath("//option[@value='1998']")).click();
		d.findElement(By.xpath("//select[@ng-model='monthbox']")).click();
		d.findElement(By.xpath("//option[@value='May']")).click();
		d.findElement(By.id("daybox")).click();
		d.findElement(By.xpath("//option[@value='26']")).click();
		d.findElement(By.id("firstpassword")).sendKeys("1234");
		d.findElement(By.id("secondpassword")).sendKeys("1234");
	}
}
