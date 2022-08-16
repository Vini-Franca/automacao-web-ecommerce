package br.com.runTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * @author Vinicius
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"summary", "pretty", "html:target/report/report.html", "json:target/report/cucumber.json"},
        features = {"resources/Features"},
        glue = {"brComFrame/steps",},
        tags = "@validacao")


public class Runner {

    @BeforeClass
    public static void setup() {
        System.out.println("Run the before");
    }

    @AfterClass
    public static void report() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c mvn cluecumber-report:reporting");
    }
}
