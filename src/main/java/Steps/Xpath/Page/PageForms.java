package Steps.Xpath.Page;

import Steps.tools.Button;
import Steps.tools.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.File;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;

public class PageForms {
    File file =new File("jo.jpeg");
    private final SelenideElement forms =  $(By.xpath("//div[@class='card-body']//h5[.='Forms']"));
    private final SelenideElement registrationForm = $(By.xpath("//div[@class='element-group']//span[.='Practice Form']"));
    private final Input firstName = new Input("firstName");
    private final Input lastName = new Input("lastName");
    private final Input userEmail = new Input("userEmail");
    private final SelenideElement genderMale = $(By.xpath("//label[.='Male']"));
    private final Input userNumber = new Input("userNumber");
    private final Input dateOfBirth = new Input("dateOfBirthInput");
    private final SelenideElement monthSelect = $(By.xpath("//select[@class='react-datepicker__month-select']"));
    private final SelenideElement september = $(By.xpath("//option[@value='8']"));
    private final SelenideElement yearSelect = $(By.xpath("//select[@class='react-datepicker__year-select']"));
    private final SelenideElement year2002 = $(By.xpath("//option[@value='2002']"));
    private final SelenideElement date_26_09_2002 = $(By.xpath("//div[@aria-label='Choose Thursday, September 26th, 2002']"));
    private final SelenideElement currentAddress = $(By.xpath("//textarea[@id='currentAddress']"));
    private final Button btnSubmit = new Button("submit");
    private final SelenideElement closeLargeModal =$(By.xpath("//button[@id='closeLargeModal']"));
    private final Input uploadPicture = new Input("uploadPicture");
    private final SelenideElement element = $(By.xpath("//span[@class='pr-1']"));
    private final SelenideElement scroll = $(By.xpath("//div[@class='left-pannel']"));


    @Step("Перейти с домашней страницы на страницу \"Student Registration Form\"")
    public void transitionForms(){
        forms.should(Condition.visible).click();
        registrationForm.should(Condition.visible).click();
    }
    @Step("Ввод имени в поле \"First Name\"")
    public void inputFirstName(String first_name) {
        firstName.setValueInput(first_name);
    }
    @Step("Ввод фамилии в поле \"Last Name\"")
    public void inputLastName(String last_name){
        lastName.setValueInput(last_name);
    }
    @Step("Ввод почты в поле \"Email\"")
    public void inputEmail(String email) {
        userEmail.setValueInput(email);
    }
    @Step("Выбор гендера")
    public void inputGender(){
        genderMale.click();
    }
    @Step("Ввод номера телефона в поле \"Mobile\"")
    public void inputNumber(String number){
        userNumber.setValueInput(number);
    }
    @Step("Выбор даты рождения (26/09/2002)")
    public void inputDateOfBirth() {
        dateOfBirth.clickInput();
        monthSelect.click();
        september.click();
        yearSelect.click();
        year2002.click();
        date_26_09_2002.click();
    }
    @Step("Выбор хобби")
    public void inputHobbies(String arg, String arg1, String arg2) {
        if (!Objects.equals(arg, ""))
            $(By.xpath("//label[.='"+arg+"']")).click();
        if (!Objects.equals(arg1, ""))
            $(By.xpath("//label[.='"+arg1+"']")).click();
        if (!Objects.equals(arg2, ""))
            $(By.xpath("//label[.='"+arg2+"']")).click();
    }
    @Step("Загрузка фото")
    public void avatarUpload(){
        uploadPicture.uploadFileInput(file);
    }
    @Step("Ввод адреса в поле \"Address\"")
    public void inputAddress(String address ){
        currentAddress.val(address);
    }

    @Step("Нажатие кнопки \"Submit\"")
    public void submit(){
        element.click();
        scroll.scrollTo();
        scroll.scrollIntoView(true);
        btnSubmit.clickBtn();
    }
    @Step("Нажатие кнопки \"Close\"")
    public void closeWidow(){
        closeLargeModal.click();
    }
}
