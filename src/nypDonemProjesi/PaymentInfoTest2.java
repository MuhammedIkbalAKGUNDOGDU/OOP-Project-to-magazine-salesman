package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaymentInfoTest2 {

	@Test
    public void testToString() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.increasePaymnent(100.0);

        String expectedToString = "PaymentInfo [discountRate=0.0, receviedPaymnent=100.0]";
        assertEquals(expectedToString, paymentInfo.toString());
    }

}
