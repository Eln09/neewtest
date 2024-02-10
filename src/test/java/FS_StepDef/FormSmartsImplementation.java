package FS_StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.FormSmartElmts;
import pageObjectModel.Method;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class FormSmartsImplementation {
    Method Mthd;
    FormSmartElmts Elmnts;
    public WebDriver driver =null;
    @Before
    public void launch_browser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Mthd = new Method(driver);
        driver.get(Mthd.read_properties_fiel("FSurl"));
        Elmnts= new FormSmartElmts();
    }
    @Given("user Launch formsmarts site")
    public void user_launch_formsmarts(){
       //guiven
    }
    @Then("user scrolls until contact form sample")
    public void user_validates_contact_form() throws Exception{
        driver.switchTo().frame(0);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Mthd.Webelem(Elmnts.firstnamebox()));
        Thread.sleep(3000);
    }

    @Then("fills form with {string},{string},{string},{string}")
    public void fills_form_with(String fname, String lname, String email, String inquiry) throws Exception{
        Thread.sleep(3000);
        Mthd.Webelem(Elmnts.firstnamebox()).sendKeys(fname);
        Mthd.Webelem(Elmnts.lastnamebox()).sendKeys(lname);
        Mthd.Webelem(Elmnts.emailbox()).sendKeys(email);
        Mthd.Webelem(Elmnts.inquirybox()).sendKeys(inquiry);
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }
   /*@Then ("Clicks on continuar")
    public void user_clicks_continuarBtn(){

    }*/
    @After
    public void close_browser(){
        driver.close();
    }
}
