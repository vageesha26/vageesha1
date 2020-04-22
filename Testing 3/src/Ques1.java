import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.setProperty("webdriver.chrome.driver","/home/vageesha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ultimateqa.com/simple-html-elements-for-automation/");
		List<WebElement> AllData =driver.findElements(By.xpath("//div[@class='et_pb_module et_pb_text et_pb_text_4 et_pb_text_align_left et_pb_bg_layout_light']//table//tr//td[1]"));
				for(int i=0;i<AllData.size();i++) {
				String value = AllData.get(i).getText();
				if(value.contains("Quality Assurance Engineer")) 
				{
				String salary = driver.findElements(By.xpath("//div[@class='et_pb_module et_pb_text et_pb_text_4 et_pb_text_align_left et_pb_bg_layout_light']//table//tr//td[3]")).get(i).getText();
				System.out.println("Salary is " + salary);
	            }
                }
      }
}
