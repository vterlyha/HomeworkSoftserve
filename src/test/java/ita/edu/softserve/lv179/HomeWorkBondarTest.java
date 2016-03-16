package ita.edu.softserve.lv179;


import ita.edu.softserve.lv179.usersclases.HomeWorkBondar;
import org.junit.Assert;
import org.junit.Test;

public class HomeWorkBondarTest {

    @Test
    public void calculateSumDivTask87Test(){

        Assert.assertEquals(9,HomeWorkBondar.calculateSumDivTask87(12345,2));

    }
}
