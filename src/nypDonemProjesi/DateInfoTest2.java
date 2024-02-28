package nypDonemProjesi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateInfoTest2 {

	@Test
    public void testCopy() {
        DateInfo originalDateInfo = new DateInfo(1, 12, 2022);
        DateInfo copiedDateInfo = originalDateInfo.copy();

        // Check if the copy method creates a new instance with the same values
        assertNotSame(originalDateInfo, copiedDateInfo);
        assertEquals(originalDateInfo.toString(), copiedDateInfo.toString());
    }

}
