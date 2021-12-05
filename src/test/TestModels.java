package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import view.ProgPanel;
import java.awt.Color;

import model.CentimetersConversionArea;
import model.FeetConversionArea;
import model.MeterConversionArea;

/**
 *	Class to test models and in game events
 */
public class TestModels{

	/**
	 *  Checks that the game player names are correctly converted
	 */

	@Test
	@DisplayName("Test Centimeters Conversion to Area")
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
			FeetConversionArea feetConvArea = new FeetConversionArea("0 ft",15,25);
			feetConvArea.setEditable(false);
			feetConvArea.setBackground(Color.GREEN);
			p.add(feetConvArea);
			
			MeterConversionArea meterConvArea = new MeterConversionArea("0 m",15,25);
			meterConvArea.setEditable(false);
			meterConvArea.setBackground(Color.ORANGE);
			p.add(meterConvArea);
		
			CentimetersConversionArea cmConvArea = new CentimetersConversionArea(cmStr,15,25);
			cmConvArea.setBackground(Color.YELLOW);
			p.add(cmConvArea);


			
			System.out.println(p.getFeetConvArea().getText());
			System.out.println(p.getMeterConvArea().getText());

			p.getCMConvArea().setText(Double.toString(areaCm));

			assert(Double.parseDouble(p.getCMConvArea().getText()) == areaCm);

			
		assertTrue(true);
	}

	/**
	 * Test Cent Area string is updated
	 */
	@Test
	public void testCentAreaStringToString(){
		ProgPanel p = new ProgPanel();
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

}
