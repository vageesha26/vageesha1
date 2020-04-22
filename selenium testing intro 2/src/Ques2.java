import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/vageesha/Downloads/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select s=new Select(driver.findElement(By.id("multi-select")));
        /*System.out.println(s.isMultiple());
		List<WebElement> list = s.getOptions();
		  for (int j = 0; j < list.size(); j++) {
		      System.out.println(list.get(j).getText());*/
		s.selectByValue("New Jersey");
		s.selectByValue("New York");
		s.selectByValue("Texas");
		System.out.println("First Option selected is: ");
		System.out.println(s.getFirstSelectedOption().getText());
	    List<WebElement> l=s.getAllSelectedOptions();
	    System.out.println("All options that are selected are: ");
	    for (int i = 0; i < l.size(); i++) {
		      System.out.println(l.get(i).getText());
		s.deselectAll();
	}
}
}


