import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:reports/runresult.html"}
)
//@CucumberOptions(features = "src\\test\\resources\\hellocucumber", glue = {"src\\test\\java\\hellocucumber\\StepDefinition"})
public class Runner {
}