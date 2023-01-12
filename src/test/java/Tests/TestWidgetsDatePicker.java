package Tests;

import org.junit.jupiter.api.Test;

public class TestWidgetsDatePicker extends BaseTest{
    @Test
    public void testWidgetsDatePicker(){
        datePicker.transitionDatePicker();
        datePicker.inputDate("September 26 2007 14:30","September 26, 2007 2:30 PM");
        datePicker.inputDate("26/09/2002/00:00","February 1, 2023 12:00 AM");
        datePicker.inputDate("qwertyzxcv","");
        datePicker.inputDate("+++++----","");
    }
}
