package Steps.tools;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Input {
    private final SelenideElement input;
    public Input(String id){
        input= $(By.cssSelector("input#"+id));
    }
    public void setValueInput(String value){
        input.setValue(value);
    }
    public String getValueInput(){
        return input.getValue();
    }
    public void sendKeysBackSpaseInput(){
        input.sendKeys(Keys.BACK_SPACE);
    }
    public void sendKeysEnterInput(){
        input.sendKeys(Keys.ENTER);
    }
    public void clickInput(){
        input.click();
    }
    public void uploadFileInput(File file){
        input.uploadFile(file);
    }
    public void checkTextInput(String value){
        input.should(Condition.value(value));
    }
}