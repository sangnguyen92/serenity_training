package serenity;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

/*@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features", glue="serenity.v2.defs")*/
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features")
public class MyTestSuite {}
