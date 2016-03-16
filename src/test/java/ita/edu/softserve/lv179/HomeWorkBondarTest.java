package ita.edu.softserve.lv179;


import ita.edu.softserve.lv179.usersclases.HomeWorkBondar;
import org.junit.Assert;
import org.junit.Test;

public class HomeWorkBondarTest {

    @Test
    public void calculateSumDivTask87Test1(){
        Assert.assertEquals(9,HomeWorkBondar.calculateSumDivTask87(12345,2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void calculateSumDivTask87Test2(){
        HomeWorkBondar.calculateSumDivTask87(10,-5);
        HomeWorkBondar.calculateSumDivTask87(12345, 8);
    }

    @Test
    public void isRelativelyPrimeTask323Test(){
        Assert.assertEquals(false,HomeWorkBondar.isRelativelyPrimeTask323(2,7));
        Assert.assertEquals(true,HomeWorkBondar.isRelativelyPrimeTask323(2,6));
    }

    @Test
    public void isPrimeNumberTask559Test(){
        Assert.assertEquals(true,HomeWorkBondar.isPrimeNumberTask559(3));
        Assert.assertEquals(false, HomeWorkBondar.isPrimeNumberTask559(6));
    }


}
