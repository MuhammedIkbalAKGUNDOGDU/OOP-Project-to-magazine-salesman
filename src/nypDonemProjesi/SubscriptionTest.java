package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscriptionTest {

	

	  @Test
	    public void testGetCopies() {
	        Subscriber subscriber = new Individual("ikbal", "bingol");
	        Journal journal = new Journal();
	        DateInfo dates = new DateInfo(1, 12, 2022);

	        Subscription subscription = new Subscription(5, dates, subscriber, journal);

	        int expectedCopies = 5;
	        assertEquals(expectedCopies, subscription.getCopies());
	    }


}
