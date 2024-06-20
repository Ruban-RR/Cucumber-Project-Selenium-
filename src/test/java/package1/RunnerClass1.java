package package1;

import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features="D:\\Eclipse-Workspace\\org.selenium.cucumber\\src\\test\\java\\package1\\Feature1.feature",
		  glue="StepDef1")


public class RunnerClass1{
	
}



