import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://demoqa.com/");
           Thread.sleep(2000);
           driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='card-up'] )[1]")).click();
           Thread.sleep(2000);
           driver.findElement(By.id("item-1")).click();
          // Thread.sleep(2000);
           //driver.findElement(By.className("rct-icon rct-icon-expand-close")).click();
           Thread.sleep(2000);
           driver.findElement(By.className("rct-checkbox")).click();
           
 		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
