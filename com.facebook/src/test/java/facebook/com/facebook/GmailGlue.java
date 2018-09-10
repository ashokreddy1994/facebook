package facebook.com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GmailGlue {
	public WebDriver driver;
	public Scenario s;
	@Before
	public void method(Scenario s){
		this.s=s;
	}
	public void screenshot(){
		byte[] File=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		s.embed(File, "image/png");
		s.write("screenshot taken");
	}
	@Given("^launch gmail site$")
	public void luanch(){
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
	}

@Then("^title is \"(.*)\" for homepage$")
public void gettitle(String t)
{
	String title=driver.getTitle();
	if(title.equals(t)){
		System.out.println("title is verified");
	}
	screenshot();
}
@And("^close site$")
public void close(){
	driver.close();
}
@Then("^get the sourcecode$")
public void get_the_sourcecode() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    String source_code=driver.getPageSource();
    System.out.println(source_code);
}
@Then("^enter \"(.*)\" as uid$")
public void enterUid(String x) throws Exception{
	  driver.findElement(By.name("identifier")).sendKeys(x);
  	   driver.findElement(By.xpath("//*[text()='Next']")).click();
  	   Thread.sleep(2000);
}
@Then("^enter \"(.*)\" as psd$")
public void enterPsd(String y){
	  driver.findElement(By.name("password")).sendKeys(y);
}
}
