package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateInfoTest {

	@Test
    public void testToString() {
        DateInfo dateInfo = new DateInfo(1, 12, 2022);
        String expectedToString = "DateInfo [starthMonth=1, endMonth=12, startYear=2022]";
        assertEquals(expectedToString, dateInfo.toString());
    }

}
