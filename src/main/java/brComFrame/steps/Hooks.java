package brComFrame.steps;

import brComFrame.util.BaseTest;
import brComFrame.util.communs.Web;
import brComFrame.util.reports.GeradorWordSteps;
import brComFrame.util.reports.ReportVariables;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

    @Before()
    public void beforeScenario(Scenario scenario) {
        initializeWebApplication(Web.CHROME);
        ReportVariables.setNome_cT(scenario.getName());
        scenario.toString();
        System.out.println("Teste execução Hooks Web");
    }

    @After()
    public void afterScenario(Scenario scenario) throws Exception {
        ReportVariables.setStatus(String.valueOf(scenario.getStatus()));
        GeradorWordSteps geradorWordSteps = new GeradorWordSteps();
        closeWeb();
    }
}
