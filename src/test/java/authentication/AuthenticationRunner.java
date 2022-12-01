package authentication;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
  features = "src/test/java/authentication",
  glue="authentication")
public class AuthenticationRunner extends AbstractTestNGCucumberTests {

}
