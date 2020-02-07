package cucumbercasestudy;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/casestudy2/reports.json"},features="src/test/resources/casestudy2.feature",
tags = ("@sanity"))
public class Runnerclass2 {

}
