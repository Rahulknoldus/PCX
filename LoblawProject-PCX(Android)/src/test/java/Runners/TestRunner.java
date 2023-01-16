package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/java/Features",
        glue={"classpath:stepDefinitions"}
        //format={"pretty", "html:test-output"}
)
public class TestRunner {

}
