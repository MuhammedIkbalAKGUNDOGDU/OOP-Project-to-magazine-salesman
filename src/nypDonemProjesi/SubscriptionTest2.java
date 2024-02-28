package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscriptionTest2 {

	@Test
    public void testCanSendWithExactPayment() {
        Subscriber subscriber = new Individual("ikbal", "bingol");
        Journal journal = new Journal();
        journal.setFrequency(1);
        journal.setIssuePrice(10);
        DateInfo dates = new DateInfo(1, 12, 2022);

        Subscription subscription = new Subscription(2, dates, subscriber, journal);
        subscription.acceptPayment(30.0); 

        assertTrue(subscription.canSend(3)); 
    }

}
