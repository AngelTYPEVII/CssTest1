package Steps.css.cssPage;

import Steps.tools.Button;
import Steps.tools.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageWebTables {
    private final SelenideElement elements = $(By.cssSelector("div.category-cards > div:nth-of-type(1)"));
    private final SelenideElement webTable = $(By.cssSelector("div.accordion > div:nth-child(1) li#item-3"));
    private final Button btnAdd =new Button("addNewRecordButton");
    private final Input firstName = new Input("firstName");
    private final Input lastName = new Input("lastName");
    private final Input eMail = new  Input("userEmail");
    private final Input age = new Input("age");
    private final Input salary = new Input("salary");
    private final Input department = new Input("department");
    private final Button submit= new Button("submit");
    @Step("Переход на страницу \"Web Tables\"")
    public void transitionElements(){
        elements.should(Condition.visible).click();
        webTable.should(Condition.visible).click();
    }
    @Step("Нажатие кнопки \"Add\"")
    public void addUser(){
        btnAdd.clickBtn();
    }
    @Step("Ввод имени")
    public void inputFirstUserName(String userFirstName){
        firstName.setValueInput(userFirstName);
    }
    @Step("Ввод фамилии")
    public void inputLastUserName(String userLastName){
        lastName.setValueInput(userLastName);
    }
    @Step("Ввод почты")
    public void inputUserEmail(String userEmail){
        eMail.setValueInput(userEmail);
    }
    @Step("Ввод возраста")
    public void inputUserAge(int  userAge){
        age.setValueInput(String.valueOf(userAge));
    }
    @Step("Ввод зарплаты")
    public void inputSalary(int userSalary){
        salary.setValueInput(String.valueOf(userSalary));
    }
    @Step("Ввод департамента")
    public void inputDepartment(String userDepartment){
        department.setValueInput(String.valueOf(userDepartment));
    }
    @Step("Нажатие кнопки\"submit\"")
    public void submit(){
        submit.clickBtn();
    }

}

