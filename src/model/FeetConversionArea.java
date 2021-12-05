package model;

import javax.swing.JTextArea;

/**
 * This class represents the feet conversion area and is a a type of 
 * ConcreteObserver in the implementation of the Observer Design pattern.
 */
public class FeetConversionArea extends JTextArea implements Observer {

	/**
	 * This is an instance of ConcreteSubject
	 */
	private ConcreteSubject subject;
	
	/**
	 * This is a double to store current input.
	 */
	private double input;
	
	/**
	 * This constructor sets up the JTextArea 
	 * @param text is what to display
	 * @param row is the numbe of rows
	 * @param col is the number of columns
	 */
	public FeetConversionArea(String text, int row, int col) {
		super(text,row,col);
	}
	
	/**
	 * This method helps set the subject
	 * @param sub is what to set subject as
	 */
	public void setSubject(ConcreteSubject sub) {
		this.subject = sub;
	}
	
	/**
	 * Update the area by converting input in centimeters to feet
	 */
	public void update() {
		input = subject.getInput();
		setText(Double.toString(input/30.48)+ " ft");
	} 
	
}
