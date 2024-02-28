package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class DistributorTest {

	 private Distributor distributor;

	    @Test
	    public void testSearchJournal() {
	    	distributor = new Distributor();
	        assertEquals(null, distributor.searchJournal("1234")); // The journal should not be found
	    }

}
