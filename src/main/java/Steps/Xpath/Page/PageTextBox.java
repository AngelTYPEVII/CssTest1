package Steps.Xpath.Page;

import Persons.Person;
import Steps.tools.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class PageTextBox {
    private final SelenideElement element =  $(By.xpath("//div[@class='card-body']//h5[.='Elements']"));
    private final SelenideElement textBox = $(By.xpath("//div[@class='element-group']//span[.='Text Box']"));
    private final Input fulName = new Input("userName");
    private final Input eMail = new Input("userEmail");
    private final TextArea currentAddress = new TextArea("currentAddress");
    private final TextArea permanentAddress = new TextArea("permanentAddress");
    private final Button btnSubmit = new Button("submit");


    @Step("Перейти с домашней страницы на страницу \"Text Box\"")
    public void transitionTextBox() {
        element.should(Condition.visible).click();
        textBox.should(Condition.visible).click();

    }
    @Step("Заполнить поле \"Full Name\"")
    public void inputFullName(String name){
        fulName.setValueInput(name);
    }
    @Step("Заполнить поле \"Email\"")
    public void inputEmail(String email) {
        eMail.setValueInput(email);
    }
    @Step("Зполнить поле \"Current Address\"")
    public void inputCurrentAddress(String address) {
        currentAddress.setValueTextArea(address);
    }
    @Step("Зполнить поле \"Permanent Address\"")
    public void inputPermanentAddress(String address) {
        permanentAddress.setValueTextArea(address);
    }
    @Step("Кликнуть на  кнопку \"Submit\"")
    public void submit(){
        btnSubmit.clickBtn();
    }
}
