package ita.edu.softserve.lv179;

import static org.junit.Assert.*;
import org.junit.Test;

import ita.edu.softserve.lv179.usersclases.HomeworkVarvariuk;


public class VarvariukHomeworkTest {

	HomeworkVarvariuk homeworkVarvariuk;

	@Test
	public void testVarvariuk86a() {
		assertEquals(3, homeworkVarvariuk.calculateCounterTask86a(123));
	}

	@Test
	public void testVarvariuk86b() {
		assertEquals(6, homeworkVarvariuk.calculateSumTask86b(123));
	}

	@Test
	public void testVarvariuk330() {
		assertEquals("6, 28, ", homeworkVarvariuk.findAllPerfectNumbersTask330(30));
	}

}
