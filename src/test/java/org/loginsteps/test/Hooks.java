package org.loginsteps.test;

import org.baseclass.test.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.bytebuddy.jar.asm.Type;

public class Hooks  extends BaseClass{
	
	@Before
	public void befscenario() {
		System.out.println("..........Before Scenario.............");
}

	@After
	public void afterScenario(Scenario s) {

	if (s.isFailed()) {
		
		TakesScreenshot fd = (TakesScreenshot) driver;
		byte[] screenshotAs = fd.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshotAs, "image/png");
		
		String name = s.getName();
		String replace = name.replace(" ","_");
		
		System.out.println("Scenario failed :" + replace);
		
	}
		
		
	}
	
}
	

