package ita.edu.softserve.lv179;

import ita.edu.softserve.lv179.usersclases.HomeWorkPetryk;
import org.junit.Assert;
import org.junit.Test;


public class PetrykHomeworkTest {

	HomeWorkPetryk hwp;
	
//	@BeforeClass
//	public void testCreateMenu() {
//		Menu m = new Menu();
//	}

	@SuppressWarnings("static-access")
	@Test
	public void testSumA(){
		Assert.assertEquals(8, hwp.sumA(10));
		Assert.assertEquals(0, hwp.sumA(0));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testGCD(){
		Assert.assertEquals(1, hwp.gcd(1, 0));
		Assert.assertEquals(1, hwp.gcd(1, 1));
		Assert.assertEquals(1, hwp.gcd(235, 756));
		Assert.assertEquals(56, hwp.gcd(280, 224));
	}
	
	
	
}
