package view;

import javax.swing.JFrame;

import controller.ActionListenerCommand;
import controller.ActionSave;

/**
 * Frame class for the converter application
 * that extends Jframe.
 */
public class ProgFrame extends JFrame{
	
	/**
	 * Acts as an instance of ProgPanel
	 */
	private ProgPanel panel;
	
	/**
	 * An ActionListenerCommand for saving.
	 */
	private ActionListenerCommand saveCommand;

	/**
	 * A menu which features the saveCommand.
	 */
	MenuOptions menu;

	/**
	 * A constructor for the frame. It adds the panel
	 * then sets the menu and size.
	 */
	public ProgFrame() {
		panel = new ProgPanel();
		saveCommand = new  ActionSave(panel);
		menu = new MenuOptions(saveCommand);
		add(panel);
		setJMenuBar(menu);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
}
