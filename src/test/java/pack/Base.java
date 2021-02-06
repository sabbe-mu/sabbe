package pack;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;


	public class Base {

	public static WebDriver driver;

	@BeforeMethod
	public void avant() {
	// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\ASUS\\Desktop\\Sabrine\\Formation\\Formation Selenium\\Pilote\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	public void getscreen() throws IOException  {
	long a = System.currentTimeMillis();
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	FileUtils.copyFile(src, new File("C:\\Users\\user\\Desktop\\formation Testing\\4eme séance" +a+ "screenshot.png"));
	}


	}




