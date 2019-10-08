package unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTestCases2 {
	@Test		
    public void mySecondMethod(){					
        String str= "Pravin Singh";					
        assertEquals("Pravin Singh",str);					
    }
}
