package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.CentimetersConversionArea;
import model.FeetConversionArea;
import model.MeterConversionArea;

/**
 * This class represents the panel for the program
 * with the different conversion areas. It acts as
 * a receiver for the Command design pattern.
 *
 */
public class ProgPanel extends JPanel{
	/**
	 * An instance of CentimetersConversionArea field.
	 */
	private CentimetersConversionArea cmConvArea;
	
	/**
	 * An instance of FeetConversionArea field.
	 */
	private FeetConversionArea feetConvArea;
	
	/**
	 * An instance of MeterConversionArea field.
	 */
	private MeterConversionArea meterConvArea;
	
	/**
	 * A constructor for the program.
	 */
	public ProgPanel() {
		feetConvArea = new FeetConversionArea("0 ft",15,25);
		feetConvArea.setEditable(false);
		feetConvArea.setBackground(Color.GREEN);
		add(feetConvArea);
		
		meterConvArea = new MeterConversionArea("0 m",15,25);
		meterConvArea.setEditable(false);
		meterConvArea.setBackground(Color.ORANGE);
		add(meterConvArea);
	
		cmConvArea = new CentimetersConversionArea("0",15,25);
		cmConvArea.setBackground(Color.YELLOW);
		add(cmConvArea);
	}
	
	/**
	 * A method to draw on JPanel.
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	/**
	 * A method to obtain the conversion area 
	 * for centimeters.
	 * @return conversion area for cm
	 */
	public CentimetersConversionArea getCMConvArea(){
		return cmConvArea;
	}
	
	/**
	 * A method to obtain the conversion area 
	 * for feet.
	 * @return conversion area for ft
	 */
	public FeetConversionArea getFeetConvArea() {
		return feetConvArea;
	}
	
	/**
	 * A method to obtain the conversion area 
	 * for meters.
	 * @return conversion area for m
	 */
	public MeterConversionArea getMeterConvArea(){
		return meterConvArea;
	}

	
}
