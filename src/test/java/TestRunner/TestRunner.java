package TestRunner;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Temp2\\Courses\\src\\test\\resource\\Features\\Courses.feature",glue="StepDefinition",
tags="@Edit_Profile" 
//plugin= {"pretty", 
//		"html:target/HTMLReports/ShikshaReport.html",	
//		"json:target/JSONReports/ShikshaReport.json",
//		"junit:target/JUNITReports/ShikshaReport.xml",
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//}
)
//plugin= {("pretty")

public class TestRunner extends AbstractTestNGCucumberTests{
	
}