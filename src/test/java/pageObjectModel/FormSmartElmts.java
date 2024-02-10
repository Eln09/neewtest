package pageObjectModel;

import org.openqa.selenium.By;

public class FormSmartElmts {

    //DevlabsElements for FormsSmart
    public By firstnamebox(){
        By a= By.xpath("//input[@placeholder='Your first name']");
        return a;
    }
    public By lastnamebox(){
        By a= By.xpath("//input[@placeholder='Your last name']");
        return a;
    }
    public By emailbox(){
        By a= By.xpath("//input[@placeholder='Your email address']");
        return a;
    }
    public By inquirybox(){
        By a= By.xpath("//textarea[@placeholder='Your comment']");
        return a;
    }
}

