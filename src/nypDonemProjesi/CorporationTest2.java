package nypDonemProjesi;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CorporationTest2 {

	  @Test
	    public void testToString() {
	        Corporation corporation = new Corporation("ABC Corp", "123 Main St", "XYZ Bank", 1234, 567890, 1, 2, 2023);
	        String expectedBillingInfo = "1234XYZ Bank567890122023";
	        assertEquals(expectedBillingInfo, corporation.getBillingInformation());
	    }

}
