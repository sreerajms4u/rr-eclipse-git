package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:/Users/sreeraj.surendran/workspace/CucumberJava/src/test/java/Features"
 ,glue={"StepDefinition"}
 )

public class TestRunner {

}
