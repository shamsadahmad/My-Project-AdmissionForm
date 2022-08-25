import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerAssignmentFindAllOrgNameOrNumber {

	public static void main(String[] args) {
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8888/index.php?module=Accounts&action=index");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[@class='tabUnsullected']/a[text()='Organisations No']")).click();	
		String expectedRec = "QSpiders";

		List<WebElement> allOrg = driver.findElements(By.xpath("//tr[@color='white']/td[3]"));

		for(WebElement allRecords : allOrg) {
			String actualRecord = allRecords.getText();
			System.out.println(actualRecord);
		}
		driver.close();
	}
}
