package ita.edu.softserve.lv179;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ita.edu.softserve.lv179.usersclases.HomeWorkPetryk;

public class PetrykHomeworkTest {

	HomeWorkPetryk hwp;

	@SuppressWarnings("static-access")
	@Test
	public void testSumA() {
		assertEquals(8, hwp.sumA(10));
		assertEquals(0, hwp.sumA(0));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testSolveExercise182() {
		assertEquals("Sum is 0 Total is 0", hwp.solveExercise182(0));
		assertEquals("Sum is 5 Total is 1", hwp.solveExercise182(10));
	}

	@SuppressWarnings("static-access")
	@Test
	public void testSolveExercise323() {
		List<Integer> actual = new ArrayList<>();
		actual.add(1);
		actual.add(3);
		actual.add(7);
		actual.add(9);
		List<Integer> expected = hwp.solveExercise323(10);
		assertEquals(expected, actual);

		assertEquals(4, hwp.solveExercise323(10).size());

		assertEquals(true, hwp.solveExercise323(0).isEmpty());
	}

	@SuppressWarnings("static-access")
	@Test
	public void testSolveExcercise560() {
		assertEquals(2, hwp.solveExercise560().size());
	}

}
