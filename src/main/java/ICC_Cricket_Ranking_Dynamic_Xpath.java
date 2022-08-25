import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICC_Cricket_Ranking_Dynamic_Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/test");
		driver.getTitle();
		
	}

}
