package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JournalTest {

	 @Test
	    public void testToString() {
	        Journal journal = new Journal();
	        journal.setName("Science Journal");
	        journal.setIssn("1234-5678");
	        journal.setFrequency(12);
	        journal.setIssuePrice(19.99);

	        String expectedToString = "Journal [name=Science Journal, issn=1234-5678, frequency=12, issuePrice=19.99, subscriptions=]";
	        assertEquals(expectedToString, journal.toString());
	    }


}
