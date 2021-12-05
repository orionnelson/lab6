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
import model.ConcreteSubject;
import model.FeetConversionArea;
import model.MeterConversionArea;
import model.ValueToConvert;

/**
 *	Class to test models and in game events
 */
public class TestModels {

	
	double areaCm = 25.0;
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
			//Carried Out By the User
			
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
			//Carried Out By the User
			
		assertEquals(mStr,p.getMeterConvArea().getText());
	}
	
	
	@Test
	@DisplayName("Test Centimeters Update ")
	public void testInput(){
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
			//Carried Out By the User
			
			
		assertEquals(cmStr,p.getCMConvArea().getText());
	}
	
	
	

	@Test
	public void testCentAreaStringToString(){
		ProgPanel p = new ProgPanel();
		double areaM = 0.25;
		
		p.getCMConvArea().setText(Double.toString(areaCm));

		assert(Double.parseDouble(p.getCMConvArea().getText()) == areaCm);
	}

}
