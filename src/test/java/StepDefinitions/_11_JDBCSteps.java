package StepDefinitions;

import Pages.DialogContent;
import Pages._Parent;
import Utilities.DBUtility;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _11_JDBCSteps {
    @Then("^Send The query the database \"([^\"]*)\" and control match$")
    public void sendTheQueryTheDatabaseAndControlMatch(String query)  {
        DialogContent dialogContent=new DialogContent();
        List<List<String>> dbList= DBUtility.getListData(query);

        List<WebElement> uiList = dialogContent.waitVisibleListAllElement(dialogContent.nameList);

        System.out.println("dbList = " + dbList);

        for (int i = 0; i < dbList.size() ; i++) {
            System.out.println("dbList= "+dbList.get(i).get(1)+"uiList = " + uiList.get(i).getText());

            Assert.assertEquals(dbList.get(i).get(1), uiList.get(i).getText());
            //dbList.get(i).get(1)  hersatırın 1 indexli elemanı alındı
            //uiList.get(i)  UI deki sadece country isimleri alındı ve karşılaştırıldı

        }

    }
}
