package Tests;

import Persons.InfoPerson;
import org.junit.jupiter.api.Test;

public class TestWebTables extends BaseTest implements InfoPerson{
    @Test
    public void testWebTables(){
        webTables.transitionElements();
        webTables.addUser();
        webTables.inputFirstUserName(person.getName());
        webTables.inputLastUserName(person.getLastName());
        webTables.inputUserEmail(person.getEmail());
        webTables.inputUserAge(person.getAge());
        webTables.inputSalary(100000);
        webTables.inputDepartment("Zxas123");
        webTables.submit();
    }
}
