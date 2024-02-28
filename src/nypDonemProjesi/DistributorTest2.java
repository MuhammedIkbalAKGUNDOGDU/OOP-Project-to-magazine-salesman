package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DistributorTest2 {

	 private Distributor distributor;

	    @Test
	    public void testSearchJournal() {
	    	distributor = new Distributor();
	        assertEquals(null, distributor.searchSubscriber("1234")); // The journal should not be found
	    }


}
