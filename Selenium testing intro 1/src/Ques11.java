import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/vageesha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		System.out.println("Validate if refresh button is disabled or not ");
        boolean refresh = driver.findElement(By.id("Button1")).isEnabled();
        System.out.println(refresh);
        if (refresh)
		    System.out.println("Button is enabled");
		else
		    System.out.println("Button is disabled");
        
        System.out.println("Validate if radio button is selected or not ");
        driver.findElement(By.xpath("//input[@value='FeMale']")).click();
        boolean radio= driver.findElement(By.xpath("//input[@value='FeMale']")).isSelected();
        if (radio)
		    System.out.println("Button is selected");
		else
		    System.out.println("Button is not selected");
        
        String header=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/h1")).getText();
        if(header.contains("Automation Demo Site")) {
        	System.out.println("correct");	
        }
        else {
        	System.out.println("wrong");
        }
        
        System.out.println(driver.getTitle());

	}

}
