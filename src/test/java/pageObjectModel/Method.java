package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class Method {

    public WebDriver driver;

    public Method(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement Webelem(By by){
        WebElement a= driver.findElement(by);
        return a;
    }
    public List<WebElement> WebelemList(By by){
        List<WebElement> a= driver.findElements(by);
        return a;
    }

    public boolean is_elem_present(WebElement a) {
        boolean flag = false;

        try {
            if (a.isDisplayed()) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }

    public void clicking(WebElement a) {

        try {
            if (a.isDisplayed()) {
                a.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String read_properties_fiel(String key) {

        String flag= null;
        try {
            Properties prop= new Properties();
            prop.load(new FileInputStream(System.getProperty("user.dir")+"/Global.properties"));
            flag= prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}

