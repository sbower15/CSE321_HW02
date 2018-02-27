package bowersj.CSE321_HW02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void positiveSubtractTest() {
		assertEquals("positiveSubtractTest", Calc.subtract(4, 3), 1);
	}
	
	@Test
	public void negativeSubtractTest() {
		assertEquals("negativeSubtractTest", Calc.subtract(3, -4), 7);
	}
	
	@Test
	public void zeroSubtractTest() {
		assertEquals("zeroSubtractTest", Calc.subtract(3, 0), 3);
	}

}

