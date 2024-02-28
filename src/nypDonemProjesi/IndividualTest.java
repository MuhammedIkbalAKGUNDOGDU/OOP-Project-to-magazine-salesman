package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IndividualTest {

	@Test
    public void testToString() {
        Individual individual = new Individual("ikbal", "bingol");
        individual.setCreditCardNr("1234-5678-9012-3456");
        individual.setExpireMonth(12);
        individual.setExpireYear(2024);
        individual.setCCV(123);

        String expectedToString = "Individual [creditCardNr=1234-5678-9012-3456, expireMonth=12, expireYear=2024, CCV=123]";
        assertEquals(expectedToString, individual.toString());
    }

}
