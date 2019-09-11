package hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/reports/html",
"json:target/reports/json/report.json",
"junit:target/reports/junit/report.xml"}, glue = {"hooks","hellocucumber"})
public class RunCucumberTest {
}
