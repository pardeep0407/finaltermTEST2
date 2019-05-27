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
	@Test
	public void test2() {
		TTC T = new TTC();
		//inside zone2
		String[] from1 = new String []{"Sheppard"};
		String[] To1 = new String []{"Finch Station"};
		double fare = T.calculateTotal(from1,To1);
		assertEquals(3.0,fare,0.0);
	}	
	@Test
      public void test3() {
		TTC T = new TTC();
		//trip between zones
		String[] from1 = new String []{"Don Mills"};
		String[] To1 = new String []{"Finch Station"};
		double fare = T.calculateTotal(from1,To1);
		assertEquals(3.0,fare,0.0);
	}	
	@Test
    public void test4() {
		TTC T = new TTC();
		//MORE THAN 1 TRIP
		String[] from1 = new String []{"Finch","Leslie"};
		String[] To1 = new String []{"Sheppard","Don Mills"};
		double fare = T.calculateTotal(from1,To1);
		assertEquals(5.50,fare,0.0);
	}
	@Test
    public void test5() {
		TTC T = new TTC();
		//dAILY mAXIMUM
		String[] from1 = new String []{"Finch","Leslie"};
		String[] To1 = new String []{"Sheppard","Don Mills"};
		double fare = T.calculateTotal(from1,To1);
		assertEquals(5.50,fare,0.0);
	}	


}
