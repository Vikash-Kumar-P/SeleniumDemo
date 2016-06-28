import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class SeleDemo 
{
	
    public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle()+"\n");
		
		driver.close();
	}
	
}