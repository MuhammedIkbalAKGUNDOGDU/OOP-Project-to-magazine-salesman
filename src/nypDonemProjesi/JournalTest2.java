package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class JournalTest2 {

	@Test
    public void testAddSubscription() {
        Journal journal = new Journal();
        Subscription subscription = new Subscription(0, null, null, journal);
        journal.addSubscription(subscription);

        ArrayList<Subscription> expectedSubscriptions = new ArrayList<>();
        expectedSubscriptions.add(subscription);

        assertEquals(expectedSubscriptions, journal.subscriptions);
    }

}
