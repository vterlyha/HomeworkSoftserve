package ita.edu.softserve.lv179;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import ita.edu.softserve.lv179.usersclases.HomeworkTerlyha;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Class for testing methods from HomeworkTerlyha.
 *
 * @version 1
 * @author  Volodymyr Terlyha
 *
 */
public class TerlyhaHomeworkTest {

    @Test
    public void testfindNumberForTask108() {
        assertEquals(4, HomeworkTerlyha.findNumberForTask108(2));
    }

    @Test
    public void testFindDividersForTask325() {
        List<Integer> actual = new ArrayList<Integer>();
        actual.add(11);
        actual.add(101);
        List<Integer> expected = HomeworkTerlyha.findDividersForTask325(1111);
        assertThat(actual, is(expected));
    }

    @Test
    public void testfindNaturalNumbersForTask561() {
        List<Integer> actual = new ArrayList<Integer>();
        actual.add(1);
        actual.add(5);
        actual.add(6);
        actual.add(25);
        actual.add(76);
        List<Integer> expected = HomeworkTerlyha.findNaturalNumbersForTask561(100);
        assertThat(actual, is(expected));
    }
}
