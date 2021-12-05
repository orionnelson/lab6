package view;

import controller.ActionListenerCommand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * This class is the MenuOptions class which acts
 * as an invoker for the Command design pattern.
 */

public class MenuOptions extends JMenuBar{
	
	/**
	 * An instance of of ActionListenerCommand to save
	 */
	private ActionListenerCommand saveCommand;
	
	
	/**
	 * Constructor for class to create menu.
	 * @param action is what to perform.
	 */
	public MenuOptions(ActionListenerCommand action) {
		super();
		this.saveCommand = action;
		JMenu updateMenu = new JMenu("Update model");
		JMenuItem saveButton = new JMenuItem("Save input centimeters");
		KeyStroke AltF = KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.ALT_MASK);
		saveButton.setAccelerator(AltF);
		saveButton.setActionCommand("save");
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clickSave();
			}
		});
		updateMenu.add(saveButton);
		super.add(updateMenu);
	}
	
	/**
	 * A method to execute saveCommand
	 */
	public void clickSave() {
		saveCommand.execute();	
	}
	

}
