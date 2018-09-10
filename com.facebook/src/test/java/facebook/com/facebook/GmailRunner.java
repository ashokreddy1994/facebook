package facebook.com.facebook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(features={"D:\\new eclipse\\com.facebook\\src\\test\\java\\facebook\\com\\facebook\\gmail.feature"},format={"pretty","json:target\\htmloutput1"},monochrome=true,glue="facebook.com.facebook",dryRun=false,tags={"@ashok"})
public class GmailRunner {
	

}
