package Runners;

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,

        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // to generate a extend report we need this plugin
                //oluşturulacak raporun yeri ve adı veriliyor burada
        }
)

public class _05_TestRunnerExtendReport extends AbstractTestNGCucumberTests{



    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/test/java/XMLFiles/extendReportSet.xml");
        // ayarlar alındı, cucumber extend reporttan haberi oldu
        //aşağıdaki kısımlar tercihe bağlı
        Reporter.setSystemInfo("User Name","Sati Demirci");
        Reporter.setSystemInfo("Application Name","Basqar");
        Reporter.setSystemInfo("Operating System",System.getProperty("os.name"));
        Reporter.setSystemInfo("Department","QA");
        Reporter.setSystemInfo("Ek satır","Ek satır açıklama");
        Reporter.setTestRunnerOutput("Test excetuion Cucumber report");

    }
}
