package MavenProjectsRimon.MavenProject101;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://demoqa.com/");
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='card-up'] )[1]")).click();
          Thread.sleep(2000);
          driver.findElement(By.id("item-4")).click();
          Thread.sleep(2000);
          // driver.findElement(By.id("doubleClickBtn"));
          Actions actions = new Actions(driver);
          WebElement elementLocator = driver.findElement(By.id("doubleClickBtn"));
          actions.doubleClick(elementLocator).perform();
        
          
           Actions action = new Actions(driver);
          WebElement link = driver.findElement(By.id ("rightClickBtn"));
          action.contextClick(link).perform();
          Thread.sleep(2000);
         
          driver.findElement(By.xpath("//button[text()='Click Me']")).click();
      
	}

}
