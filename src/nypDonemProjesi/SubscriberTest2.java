package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscriberTest2 {

	@Test
    public void testGetBillingInformation() {
		Individual subscriber = new Individual("ikbal", "bingol");
        String expectedBillingInfo = "ikbal"; 
        assertEquals(expectedBillingInfo, subscriber.getName());
    }

}
