import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"}
        , features="/Users/kavitapatial/Desktop/PROJECTS/Amazon-Project"
        , glue={"browserControl", "stepDefinitions"}
        , tags = "@SmokeTest")

public class TestRunner {

}
