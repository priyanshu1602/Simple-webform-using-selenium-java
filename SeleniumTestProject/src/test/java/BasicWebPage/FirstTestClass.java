package BasicWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.xpath("//h1[contains(text(),'Web form')]"));
		String formName=we.getText();
		if(formName.equals("Web form"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.findElement(By.id("my-text-id")).sendKeys("priyanshu1602@gmail.com");
		driver.findElement(By.name("my-password")).sendKeys("Password@1602");
		driver.findElement(By.name("my-textarea")).sendKeys("This is a simple web form");
		driver.findElement(By.linkText("Return to index")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("blank.html")).click();
		//Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		//Thread.sleep(3000);
		Select sel=new Select(driver.findElement(By.name("my-select")));
		sel.selectByVisibleText("Two");
		driver.findElement(By.name("my-file")).sendKeys("/Users/priyanshu/Downloads/image.png");
		driver.findElement(By.id("my-check-1")).click();
//		Select dataList= new Select(driver.findElement(By.id("my-options")));
//		dataList.selectByVisibleText("New York");
		 Thread.sleep(3000);
		WebElement dateBox = driver.findElement(By.name("my-date"));
        dateBox.sendKeys("09/25/2013");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		WebElement w2=driver.findElement(By.xpath("//p[contains(text(),'Received')]"));
		String validateFormSubmission=w2.getText();
		if(validateFormSubmission.equals("Received!")) {
			System.out.println("Form submitted successfully");
		}
		else {
			System.out.println("Form not submitted successfully");
		}

	}

}
