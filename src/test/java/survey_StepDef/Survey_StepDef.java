package survey_StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.FormSmartElmts;
import pageObjectModel.Method;

import java.time.Duration;

public class Survey_StepDef {

    Method Mthd;
    FormSmartElmts Elmnts;
    public WebDriver driver =null;
    @Before
    public void launch_browser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Mthd = new Method(driver);
        driver.get(Mthd.read_properties_fiel("SurveyfsURL"));
        Elmnts= new FormSmartElmts();
    }

    @After
    public void close_browser(){

        driver.close();
    }

}
