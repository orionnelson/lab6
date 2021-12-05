package controller;

import model.ValueToConvert;
import view.ProgPanel;

/**
 * 
 * This is the ConcreteCommand class to
 * implement Command design pattern.
 * 
 */
public class ActionSave implements ActionListenerCommand {
	
	/**
	 * This is a panel instance for the program.
	 */
	private ProgPanel panel;
	
	/**
	 * This is a model instance for the program.
	 */
	private ValueToConvert model;

	/**
	 * This is the constructor which assigns Receiver
	 * to the panel.
	 * @param pan is the Command design pattern Receiver class
	 */
	public ActionSave(ProgPanel pan) {
		this.panel = pan;
		this.model =  new ValueToConvert(pan);
	}

	/**
	 * Receives value in CentimetersConversionArea 
	 * to update model.
	 */
	@Override
	public void execute() {
		String CMInput = panel.getCMConvArea().getText().trim();
		model.save(CMInput);
	}
}