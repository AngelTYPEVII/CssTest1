package Interfasces;

import Steps.Xpath.Page.*;
import Steps.Xpath.Elements.ElementDatePicker;
import Steps.css.cssPage.PageButtons;
import Steps.css.cssPage.PageWebTables;

public interface EVE1 {

    PageWebTables webTables= new PageWebTables();
    PageButtons pageButtons = new PageButtons();
    PageTextBox textBox = new PageTextBox();
    PageForms forms = new PageForms();
    PageMenu menu = new PageMenu();
    ElementDatePicker datePicker = new ElementDatePicker();


}
