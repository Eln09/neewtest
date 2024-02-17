package stepDefinition;

import java.time.Duration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjectModel.DevlabsElements;
import pageObjectModel.Method;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DevLabTetImplementation {

    Method Mthd;
    DevlabsElements Elmnts;
    public WebDriver driver =null;
    WebElement Email;
    WebElement Passwrd;
    WebElement LoginButton;

    @Before
    public void launch_browser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Mthd = new Method(this.driver);
        Elmnts= new DevlabsElements();
    }
    @Given("user Launch Devlab application")
    public void user_launch_devlab_application(){
        driver.get(Mthd.read_properties_fiel("url"));
    }
    @Then("user validate the home page title")
    public void user_validate_devlab_home(){
        //code that I havent write yet
    }
    @Then("user validate Devlab logo")
    public void user_validate_devlab_logo(){
        if (Mthd.is_elem_present(Mthd.Webelem(Elmnts.DevlabsLogo()))) {
            System.out.println("logo found!");
        } else {
            System.out.println("logo not found!");
        }
    }
    @When("user click on login button")
    public void User_click_devlab_logintbn() throws Exception{
        Thread.sleep(1000);
        Mthd.clicking(Mthd.Webelem(Elmnts.Devlabsloginbtn()));
        Thread.sleep(1000L);
    }
    @Then ("login popup screen displays")
    public void popup_displays() throws Exception{
        Email = Mthd.Webelem(Elmnts.Emailbox());
        Passwrd =  Mthd.Webelem(Elmnts.Passwordbox());
        LoginButton =  Mthd.Webelem(Elmnts.ToLoginButton());
            Thread.sleep(1000);
    }
    @When("user gives input as user name and password")
    public void User_passwrd_giving()throws Exception{
        Email.sendKeys(Mthd.read_properties_fiel("email"));
        Passwrd.sendKeys(Mthd.read_properties_fiel("password"));
        Thread.sleep(5000);
    }
    @Then ("user close the login pop up")
    public void popup_closed(){
        driver.navigate().refresh();
    }
    @Then ("user close the application")
    public void close_popup(){

    }
    @After
    public void close_browser(){
        driver.close();
    }
}
