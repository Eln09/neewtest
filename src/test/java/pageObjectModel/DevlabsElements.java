package pageObjectModel;

import org.openqa.selenium.By;

public class DevlabsElements {

    public By DevlabsLogo() {

        By a = By.xpath("//img[@alt='DevLabs Alliance Logo']");
        return a;
    }

    public By Devlabsloginbtn() {

        By a = By.xpath("//button[@id='header_Button']");
        return a;
    }

    public By Emailbox() {
        By a = By.xpath("//input[@name='email']");
        return a;
    }

    public By Passwordbox() {
        By a = By.xpath("//input[@id='outlined-adornment-password']");
        return a;
    }

    public By ToLoginButton() {
        By a = By.xpath("//button[@type='submit']");
        return a;
    }
}


