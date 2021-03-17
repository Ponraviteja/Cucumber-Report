package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmClass {
	
	public static void generateJvmReort(String json) {
	
		File l = new File(System.getProperty("user.dir")+ 
				"\\src\\test\\resources\\Reports\\CucumberReports");
		
		Configuration div = new Configuration(l, "facebook Report");

		div.addClassifications("Platform name", "Windows");
		div.addClassifications("Platform Veriosn", "10");
		div.addClassifications("Browser Name", "Chrome");
		div.addClassifications("Brower Version", "7.0");
		
		List<String> d = new ArrayList<String>();
		d.add(json);
		
		ReportBuilder r = new ReportBuilder(d, div);
		
		r.generateReports();
	}

}
