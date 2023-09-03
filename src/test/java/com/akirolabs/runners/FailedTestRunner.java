package com.akirolabs.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        glue = "com/akirolabs/step_definition",
        features = "@target/rerun.txt",
        dryRun = false,
        tags = ""
        //publish = false



)

public class FailedTestRunner {
}
