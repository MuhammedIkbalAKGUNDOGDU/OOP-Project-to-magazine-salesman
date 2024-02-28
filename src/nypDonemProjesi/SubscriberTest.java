package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscriberTest {

	@Test
    public void testSubscriberConstructor() {
        Subscriber subscriber = new Individual("ikbal", "bingol");
        assertEquals("ikbal", subscriber.getName());
        assertEquals("bingol", subscriber.getAddress());
    }

}
