package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IndividualTest2 {

	@Test
    public void testGetBillingInformation() {
        Individual individual = new Individual("ikbal", "bingol");
        individual.setCreditCardNr("9876-5432-1098-7654");
        individual.setExpireMonth(6);
        individual.setExpireYear(2023);
        individual.setCCV(456);

        String expectedBillingInfo = "9876-5432-1098-765462023456";
        assertEquals(expectedBillingInfo, individual.getBillingInformation());
    }

}
