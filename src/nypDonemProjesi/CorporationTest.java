package nypDonemProjesi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CorporationTest {

    @Test
    public void testGetBillingInformation() {
        Corporation corporation = new Corporation("ABC Corp", "123 Main St", "XYZ Bank", 1234, 567890, 1, 2, 2023);
        String expectedToString = "Corporation [bankCode=1234, accountNumber=567890, issueDay=1, issueMonth=2, issueYear=2023, bankName=XYZ Bank]";
	
        assertEquals(expectedToString, corporation.toString());
    }
}
