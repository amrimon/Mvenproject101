import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class From {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demoqa.com/");
         Thread.sleep(2000);
         JavascriptExecutor jse = (JavascriptExecutor)driver;
         jse.executeScript("window.scrollBy(0,1000)");      	

         driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='card-body'])[2]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("(//span[text()='Practice Form'])")).click();
         Thread.sleep(2000);
         driver.findElement(By.id("firstName")).sendKeys("Mukith");
         Thread.sleep(2000);
        driver.findElement(By.id("lastName")).sendKeys("Rimon");
        Thread.sleep(2000);
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
         driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
         Thread.sleep(2000);
         //driver.findElement(By.xpath("//label[text()='Sports']")).click();
         Thread.sleep(5000);
         jse.executeScript("window.scrollBy(0,2000)");
        // driver.findElement(By.xpath("//label[text()='Sports']")).click();
        // Thread.sleep(2000);
        //driver.findElement(By.id("hobbies-checkbox-2")).click();
        // Thread.sleep(2000);
         Thread.sleep(2000);
 		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
 		Thread.sleep(2000);

         driver.findElement(By.id("currentAddress")).sendKeys("103 28 ozone park");
         Thread.sleep(2000);
         driver.findElement(By.id("state")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='Rajasthan']")).click();
         
         //driver.findElement(By.id("")).sendKeys("103 28 ozone park");
         //Thread.sleep(2000);
        // WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
        // fileInput.sendKeys("C:\\Users\\amrim\\Desktop\\test.docx");
         //driver.findElement(By.xpath("//label[text()='Select picture']")).sendKeys("");
         //Thread.sleep(2000);
         //driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
         //JavascriptExecutor jse1 = (JavascriptExecutor)driver;
         //jse1.executeScript("document.getElementById('currentAddress').click();");
         Thread.sleep(2000);
         //driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[8]")).sendKeys("103");
         //Thread.sleep(2000);
	}

}
