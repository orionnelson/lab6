package model;

/**
 * 
 * This class is the Subject interface for
 * the Observer pattern.
 * 
 */

public interface Subject {
	
	/**
	 * This method adds an observer and is left unimplemented.
	 * @param observer is the Observer to add.
	 */
	public void addObserver(Observer observer);

	/**
	 * This method removes an observer and is left unimplemented.
	 * @param observer is the Observer to remove.
	 */
	public void removeObserver(Observer observer);

	/**
	 * This method notifies observers and is left unimplemented.
	 */
	public void notifyObservers();
	
	/**
	 * A method to get the current cm value
	 * @return the current value in CentimetersConversionArea
	 */
	public abstract double getInput();

}
