package ita.edu.softserve.lv179;

import static org.junit.Assert.*;

import org.junit.Test;

import ita.edu.softserve.lv179.usersclases.HomeworkKrokhmalyuk;
import junit.framework.Assert;

public class KrokhmalyukHomeworkTest {
	HomeworkKrokhmalyuk homeworkKrokhmalyuk = HomeworkKrokhmalyuk.getInstance();

	@Test
	public void testFactorial(){
		Assert.assertEquals(homeworkKrokhmalyuk.factorial(0), 1);
	}
	
	@Test
	public void testFunction178D(){
		Assert.assertEquals(homeworkKrokhmalyuk.function178D(8), "034567");
		Assert.assertEquals(homeworkKrokhmalyuk.function178D(1), "0");
		Assert.assertEquals(homeworkKrokhmalyuk.function178D(4), "03");	
	}
	
	@Test
	public void testFunction178G(){
		Assert.assertEquals(homeworkKrokhmalyuk.function178G(4), "3");
		Assert.assertEquals(homeworkKrokhmalyuk.function178G(2), "");
	}	
}
