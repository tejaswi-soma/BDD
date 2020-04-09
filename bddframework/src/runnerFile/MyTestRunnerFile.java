package runnerFile;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/Features", glue="stepDefination")
public class MyTestRunnerFile {

}
