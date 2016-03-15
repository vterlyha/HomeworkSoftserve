package ita.edu.softserve.lv179;

import static org.junit.Assert.*;

import org.junit.Test;

import ita.edu.softserve.lv179.usersclases.HomeworkKrokhmalyuk;
import junit.framework.Assert;

public class KrokhmalyukHomeworkTest {
	HomeworkKrokhmalyuk homeworkKrokhmalyuk = new HomeworkKrokhmalyuk();

	@Test
	public void testFactorial(){
		assertEquals(homeworkKrokhmalyuk.factorial(0), 1);
	}
	
	@Test
	public void testFunction178D(){
		assertEquals(homeworkKrokhmalyuk.function178D(8), "034567");
		assertEquals(homeworkKrokhmalyuk.function178D(1), "0");
		assertEquals(homeworkKrokhmalyuk.function178D(4), "03");	
	}
	
	@Test
	public void testFunction178G(){
		assertEquals(homeworkKrokhmalyuk.function178G(4), "3");
		assertEquals(homeworkKrokhmalyuk.function178G(2), "");
	}	
}
