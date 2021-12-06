package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import view.ProgPanel;
import java.awt.Color;

import java.awt.Graphics;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import javax.swing.JPanel;


import model.CentimetersConversionArea;
import model.FeetConversionArea;
import model.MeterConversionArea;

/**
 *	Class to test models and in game events
 */
public class TestModels{

	/**
	 * Checks conversion of CentArea to String Self and
	 * Default Frame for testing
	 */
	ProgPanel p = new ProgPanel();

	/**
	 * Tests CM to ft
	 */
	@Test
	@DisplayName("Test Centimeters Conversion to ft")
	public void testCentArea(){
		double areaM = 0.25;
		double areaFt = 0.8202099737532809;
		double areaCm = 25.0;
		//Set subject for meter and feet area needed to do conversion test
		String feetStr = areaFt + " ft";
		String cmStr = Integer.toString((int)(areaCm));
		String mStr = areaM + " m";

		ValueToConvert v = new ValueToConvert(p);
		v.save(cmStr);

		assertEquals(feetStr,p.getFeetConvArea().getText());
	}


	/**
	 * Test conversion from cm to meters
	 */
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
	
	
	/**
	 * Test Cent Area string is updated
	 */
	@Test
	public void testCentAreaStringToString(){
		double areaM = 0.25;
		double areaFt = 0.8202099737532809;
		double areaCm = 25.0;
		//Set subject for meter and feet area needed to do conversion test
		String feetStr = areaFt + " ft";
		String cmStr = Integer.toString((int)(areaCm));
		String mStr = areaM + " m";

		p.getCMConvArea().setText(Double.toString(areaCm));

		assert(Double.parseDouble(p.getCMConvArea().getText()) == areaCm);
	}

	/**
	 * Test Cent Area string is updated to Null
	 */
	@Test
	public void testCentAreaStringForNull(){
		double areaM = 0.25;
		double areaFt = 0.8202099737532809;
		double areaCm = 25.0;
		//Set subject for meter and feet area needed to do conversion test
		String feetStr = areaFt + " ft";
		String cmStr = Integer.toString((int)(areaCm));
		String mStr = areaM + " m";

		ValueToConvert v = new ValueToConvert(p);
		v.save("Garbage Input");

		assertEquals(p.getCMConvArea().getText(), "");
	}

	/**
	 * Test remove method
	 */
	@Test
	@DisplayName("Test Concrete Class Methods")
	public void testConcreteSubject() {
		ProgPanel p = new ProgPanel();
		ValueToConvert v = new ValueToConvert(p);

		v.addObserver(p.getCMConvArea());
		v.removeObserver(p.getMeterConvArea());
	}
}

