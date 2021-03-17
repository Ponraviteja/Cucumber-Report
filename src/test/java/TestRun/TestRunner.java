package TestRun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.JvmClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources",glue="org.loginsteps.test",
	dryRun=false,plugin= {"pretty",
			"html:src\\test\\resources\\Reports",
			"json:src\\test\\resources\\Reports\\fb.json",
			"junit:src\\test\\resources\\Reports\\output.xml"})

public class TestRunner {

	@AfterClass
	public static void jvmReport() {
	
		JvmClass.generateJvmReort(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\fb.json");
}
	
	
}
