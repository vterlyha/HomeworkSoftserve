package ita.edu.softserve.lv179;


import org.junit.Assert;
import org.junit.Test;

import ita.edu.softserve.lv179.usersclases.HomeWorkBervetskyy;

public class HometaskBervetskyyTest {
    
    @Test
    public void testSquereNumber(){
	int expected = 25;
	int real = HomeWorkBervetskyy.squereNumber(5);
	Assert.assertTrue(real == expected);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExeptionSquereNumber(){
	HomeWorkBervetskyy.squereNumber(-5);
    }
    @Test
    public void testZeroSquereNumber(){
	int expected = 0;
	int real = HomeWorkBervetskyy.squereNumber(0);
	Assert.assertTrue(real == expected);
    }
    @Test
    public void testTrueIsFoundNumber(){
	Assert.assertTrue(HomeWorkBervetskyy.isFoundNumber(13));
    }
    @Test
    public void testFalseIsFoundNumber(){
	Assert.assertFalse(HomeWorkBervetskyy.isFoundNumber(10));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionIsFoundNumber(){
	HomeWorkBervetskyy.isFoundNumber(-2);
    }
    @Test
    public void testZeroIsFoundNumber(){
	Assert.assertFalse(HomeWorkBervetskyy.isFoundNumber(0));
    }
    @Test(timeout = 100)
    public void testTimeOutIsFoundNumber(){
	HomeWorkBervetskyy.isFoundNumber(50);
    }
    
    @Test
    public void testTrueChangeOrder(){
	int expected = 321;
	int real = HomeWorkBervetskyy.changeOrder(123);
	Assert.assertTrue(real == expected);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionChangeOrder(){
	HomeWorkBervetskyy.changeOrder(-1);
    }
    
    @Test
    public void testZeroChangeOrder(){
	int expected = 0;
	int real = HomeWorkBervetskyy.changeOrder(0);
	Assert.assertTrue(real == expected);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
