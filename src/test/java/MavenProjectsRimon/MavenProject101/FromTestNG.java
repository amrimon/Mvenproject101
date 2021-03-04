package MavenProjectsRimon.MavenProject101;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

		public class FromTestNG {
		public WebDriver driver;
		public JavascriptExecutor jse;
		@BeforeClass
		public void setup() {
		System.out.println("= ====test case start======");	
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        jse = (JavascriptExecutor)driver;
        driver.manage().window().maximize();
		}
		@Test
		public void Test1() throws InterruptedException {
		driver.get("https://demoqa.com/");
        Thread.sleep(2000);
		}
        @Test
		public void Test2() throws InterruptedException {
		
        jse.executeScript("window.scrollBy(0,1000)");      	

        driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='card-body'])[2]")).click();
        Thread.sleep(2000);
        }
	     @Test
	     public void Test3() throws InterruptedException {
		 driver.findElement(By.xpath("(//span[text()='Practice Form'])")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("firstName")).sendKeys("Mukith");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("lastName")).sendKeys("Rimon");
	     Thread.sleep(2000);
	     System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'col-md-9 col-sm-12')]//label)[1]")).getText());	
	     driver.findElement(By.id("userEmail")).sendKeys("mukith@gmail.com");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("userNumber")).sendKeys("2128982660");
	     Thread.sleep(2000);
	     driver.findElement(By.id("dateOfBirthInput")).click();
	     Select month = new Select(driver.findElement(By.cssSelector(".react-datepicker__month-select")));
	     month.selectByIndex(10);
	     Thread.sleep(2000);
	     Select year = new Select(driver.findElement(By.cssSelector(".react-datepicker__year-select")));
	     year.selectByValue("1998");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//div[text()='10'])[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
	     Thread.sleep(2000);
	     
	     }
	     @Test
	     public void Test4() throws InterruptedException {
	     driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
         Thread.sleep(2000);
         jse.executeScript("window.scrollBy(0,2000)");
         Thread.sleep(2000);
 		 driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
 		 Thread.sleep(2000);
	     }
         
        @Test
        public void Test5() throws InterruptedException {
        driver.findElement(By.id("currentAddress")).sendKeys("103 28 ozone park");
        Thread.sleep(2000);
        driver.findElement(By.id("state")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Rajasthan']")).click();
        Thread.sleep(2000);
        }
      @AfterClass
        public void quit() {
    	  driver.close();
    	  System.out.println("= ====test case end======");	
      }
         
	}


