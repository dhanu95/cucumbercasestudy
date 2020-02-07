package cucumbercasestudy;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/casestudy1/reports.json"},features="src/test/resources/casestudy.feature",
tags = ("@sanity"))
public class Runnerclass1 {

}
