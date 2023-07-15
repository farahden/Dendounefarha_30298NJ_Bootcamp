package test_check_box;

import base.BasePage;
import org.testng.annotations.Test;
import select_check_box.CheckBoxSelect;

public class TestCheckBox extends BasePage {
  @Test
    public void testselectCheckBox() throws InterruptedException {
        CheckBoxSelect checkBoxSelect=new CheckBoxSelect();
        checkBoxSelect.selectCheckBox();
    }
}
