package ch.heigvd.gamification.test.spec;

import cucumber.api.CucumberOptions;
import cucumber.api.*;
import org.junit.Test;
import org.junit.runner.RunWith;


// @RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/ch/heigvd/gamification/test/scenarios/", plugin={"pretty", "html:target/cucumber"})
public class SpecificationTest {

    public SpecificationTest() {

    }

    @Test
    public void TestMaint() {

    }

}
