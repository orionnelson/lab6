package model;

import javax.swing.JTextArea;

/**
 * This class represents the cm conversion area and is a 
 * ConcreteObserver in the implementation of the Observer Design pattern.
 */
public class CentimetersConversionArea extends JTextArea implements Observer {

	/**
	 * This is an instance of ConcreteSubject
	 */
	private ConcreteSubject subject;
	
	/**
	 * This constructor sets up the JTextArea 
	 * @param text is what to display
	 * @param row is the numbe of rows
	 * @param col is the number of columns
	 */
	public CentimetersConversionArea(String text, int row, int col) {
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
	 * Unimplemented as can be changed by user.
	 */
	@Override
	public void update() {
	}

	
}
