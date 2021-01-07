package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:/Users/sreeraj.surendran/git/rr-eclipse-git/CucumberJava/src/test/java/Features/login.feature"
 ,glue={"StepDefinition"}
 )

public class TestRunner {

}
