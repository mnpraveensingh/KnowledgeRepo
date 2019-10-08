package unitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class JunitTestCases {

	 @Test		
	    public void myFirstMethod(){					
	        String str= "JUnit is working fine";					
	        assertEquals("JUnit is working fine",str);					
	    }
	 @Test		
	    public void mySecondMethod(){					
	        String str= "Usha";					
	        assertEquals("Usha",str);
	        assertNotEquals("Pravin Singh", str);
	    }
	 @Test		
	    public void myThirdMethod(){					
	        String str= "Usha";					
	        assertNotEquals("Pravin Singh", str);
	    }

}
