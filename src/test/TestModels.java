package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import view.ProgPanel;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.CentimetersConversionArea;
import model.FeetConversionArea;
import model.MeterConversionArea;

/**
 *	Class to test models and in game events
 */
public class TestModels{
	/**
	 *  Checks conversion of CentArea to String Self and 
	 */
	@Test
	@DisplayName("Test Centimeters Conversion to Feet")
	public void testCentArea(){
			ProgPanel p = new ProgPanel();
			double areaM = 0.25;
			double areaFt = 0.8202099737532809;
			double areaCm = 25.0;
			//Set subject for meter and feet area needed to do conversion test
			String feetStr = areaFt + " ft";
			String cmStr = Integer.toString((int)(areaCm));
			String mStr = areaM + " m";
			// All testing will be done as strings for absolute coverage since observer pattern makes testing difficult.
			ValueToConvert v = new ValueToConvert(p);
			v.save(cmStr);
			
			System.out.println(p.getFeetConvArea().getText());
			System.out.println(p.getMeterConvArea().getText());
			System.out.println(p.getCMConvArea().getText());
			
		assertEquals(feetStr,p.getFeetConvArea().getText());
	}
	
	
	@Test
	@DisplayName("Test Centimeters Conversion to Meters ")
	public void testCentM(){
			ProgPanel p = new ProgPanel();
			double areaM = 0.25;
			double areaFt = 0.8202099737532809;
			double areaCm = 25.0;
			//Set subject for meter and feet area needed to do conversion test
			String feetStr = areaFt + " ft";
			String cmStr = Integer.toString((int)(areaCm));
			String mStr = areaM + " m";
			// All testing will be done as strings for absolute coverage since observer pattern makes testing difficult.
			ValueToConvert v = new ValueToConvert(p);
			v.save(cmStr);
			
			System.out.println(p.getFeetConvArea().getText());
			System.out.println(p.getMeterConvArea().getText());
			System.out.println(p.getCMConvArea().getText());
			
		assertEquals(mStr,p.getMeterConvArea().getText());
	}


}
