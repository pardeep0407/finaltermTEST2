import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TTCTEST {
  
	@Before
	public void setUp() throws Exception {
		
	
	}

	@Test
	public void test1() {
		TTC T = new TTC();
		//inside zone1
		String[] from = new String []{"Leslie"};
		String[] To = new String []{"Don Mills"};
		double fare = T.calculateTotal(from,To);
		assertEquals(2.50,fare,0.0);
		
	
	}
	public void test2() {
		TTC T = new TTC();
		//inside zone2
		String[] from = new String []{"Leslie"};
		String[] To = new String []{"Don Mills"};
		double fare = T.calculateTotal(from,To);
		assertEquals(2.50,fare,0.0);
	}	

}
