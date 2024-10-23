package week2.day3;

public class Elements extends Button {

	public static void main(String[] args) {
	Elements ele=new Elements();
	ele.submit();
	ele.click();
	ele.setText("Hybrid Inheritance");
	
	CheckBoxButton cb=new CheckBoxButton();
	cb.clickCheckButton();
	
	RadioButton rb=new RadioButton();
	rb.selectRadioButton();
	
	TextField tf=new TextField();
	tf.getText();

	}

}
