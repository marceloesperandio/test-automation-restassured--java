package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import logger.Log;

import java.io.IOException;

public class Hooks {

    @Before()
    public void afterScenario(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {
            Log.ERROR("Scenario: " + scenario.getName() + " failed");
        } else {
            Log.INFO("Scenario: " + scenario.getName() + " passed");
        }
    }

    @After()
    public void beforeScenario(Scenario scenario) throws IOException {
        Log.INFO("Scenario: " + scenario.getName() + " started");
    }

    @BeforeAll
    public static void prepareAllureReport() {
        System.out.println("<=========================Generate Report=========================>");

    }
}
