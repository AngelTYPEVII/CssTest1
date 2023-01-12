package Tests;

import Persons.InfoPerson;
import org.junit.jupiter.api.Test;

public class TestElementsTextBox extends BaseTest implements InfoPerson{
    @Test
    public void testElementsTextBox(){
        textBox.transitionTextBox();
        textBox.inputFullName(person.getName());
        textBox.inputEmail(person.getEmail());
        textBox.inputCurrentAddress(person.getCurrentAddress());
        textBox.inputPermanentAddress(person.getPermanentAddress());
        textBox.submit();
    }
}
