package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaymentInfoTest {

	@Test
    public void testIncreasePayment() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.increasePaymnent(50.0);

        double expectedReceivedPayment = 50.0;
        assertEquals(expectedReceivedPayment, paymentInfo.getReceviedPaymnent(), 0.001);
    }

}
