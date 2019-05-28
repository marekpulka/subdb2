package marekpulka.subdb2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  dryRun = false,
  strict = true,
/*  format = { "pretty", "html:target/cucumber" },*/
  /*format = { "json:target_json/cucumber.json" },*/
  plugin = {"json:target/cucumber/report.json"},
  glue = "com.origamicode.subdb2.cucumber.steps",
  features = "classpath:cucumber"
)
public class CucumberRunner {

}
