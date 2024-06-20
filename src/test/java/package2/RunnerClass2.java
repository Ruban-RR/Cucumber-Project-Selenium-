package package2;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features="D:\\Eclipse-Workspace\\org.selenium.cucumber\\src\\test\\java\\package2\\Feature2.feature",
		  glue="StepDef2")

public class RunnerClass2 {

}
