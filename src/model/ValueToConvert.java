package model;

import view.ProgPanel;

/**
 * This class extends ConcreteSubject and acts
 * to help save cm input and notify observers of changes.
 */

public class ValueToConvert extends ConcreteSubject{

	/**
	 * An instance of ProgPanel.
	 */
	private ProgPanel panel;
	
	/**
	 * A static double field to hold the latest saved cm input.
	 */
	private static double savedInput = 0;
	
	/**
	 * A constructor for the class
	 * @param pan is a panel for the program.
	 */
	public ValueToConvert(ProgPanel pan) {
		this.panel = pan;
		//Set subject for meter and feet areas
		this.panel.getMeterConvArea().setSubject(this);
		this.panel.getFeetConvArea().setSubject(this);
		this.panel.getCMConvArea().setSubject(this);
		//add as observers
		addObserver(this.panel.getFeetConvArea());
		addObserver(this.panel.getMeterConvArea());
		addObserver(this.panel.getCMConvArea());
		notifyObservers();
	}
	
	/**
	 * A method for other classes to access the
	 * current cm input;
	 * @return Returns the cm input
	 */
	public static double getSavedInput() {
		return savedInput;
	}
	
	
	/**
	 * A method to save the current cm input of user.
	 * It clears the input if invalid.
	 * @param input is a number.
	 */
	public void save(String input) {
		//Check if proper number before saving
		try {
			ValueToConvert.savedInput = Double.parseDouble(input);
			this.panel.getCMConvArea().setText(input);
		} catch (final NumberFormatException e) {
			this.panel.getCMConvArea().setText("");
		}
		notifyObservers();
	}
	
}
