package ita.edu.softserve.lv179;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import ita.edu.softserve.lv179.usersclases.HomeworkVarvariuk;
/**
 * Contains JUnit for tests to  developed tasks
 * @author TARAZIDZE
 * @version 1.0
 * @see HomeworkVarvariuk.java
 */
public class VarvariukHomeworkTest {

	@Test
	public void testVarvariuk86a() {
		assertEquals(3, HomeworkVarvariuk.calculateCounterTask86a(123));
	}

	@Test
	public void testVarvariuk86b() {
		assertEquals(6, HomeworkVarvariuk.calculateSumTask86b(123));
	}

	@Test
	public void testVarvariuk330() {
		List<Integer> current = new ArrayList<Integer>();
		current.add(6);
		current.add(28);
		assertEquals(current, HomeworkVarvariuk.findAllPerfectNumbersTask330(30));
	}

}
