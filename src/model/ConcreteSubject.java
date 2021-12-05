package model;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the ConcreteSubject class for the 
 * Observer design pattern.
 */
public class ConcreteSubject implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();

	/**
	 * This method adds an observer to the observers
	 * list as post-condition given an observer as pre-condition.
	 * @param obs is the Observer to add.
	 */
	@Override
	public void addObserver(Observer obs) {
		observers.add(obs);
	}

	/**
	 * This method removes an observer from the observers
	 * list as post-condition given an observer as pre-condition.
	 * @param obs is the Observer to add.
	 */
	@Override
	public void removeObserver(Observer obs) {
		observers.remove(obs);	
	}

	/**
	 * This method notifies observer in the observers list.
	 */
	@Override
	public void notifyObservers() {
		for (Observer obs : observers) {
			obs.update();
		}
	}
	
	
	/**
	 * Method to obtain current value saved.
	 * @return the cm input.
	 */
	public double getInput() {
		return ValueToConvert.getSavedInput();
	}


}
