package ita.edu.softserve.lv179;

import org.junit.Assert;
import org.junit.Test;
import ita.edu.softserve.lv179.usersclases.HomeworkKobevka;



/**
 * Created by ka on 16.03.2016.
 */
public class HomeworkKobevkaTest {

    @Test
    public void testFunction107() throws Exception {
        int value = HomeworkKobevka.solveExercise107(5);
        if (value != 1) Assert.fail();

    }

    @Test
    public void testFunction243a() throws Exception {
        boolean isTrue = HomeworkKobevka.solveExercise243a(13);
        if (isTrue != true) Assert.fail();

    }

    @Test
    public void testFunction243b() throws Exception {
        boolean isTrue = HomeworkKobevka.solveExercise243b(13);
        if ((isTrue != true)||(HomeworkKobevka.answerValues.get(3)!=2))Assert.fail();

    }
}