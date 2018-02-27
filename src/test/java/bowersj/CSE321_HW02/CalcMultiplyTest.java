package bowersj.CSE321_HW02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcMultiplyTest {

	@Test
	public void zeroMultiplyTest() {
		assertEquals("zeroMultiplyTest", Calc.multiply(5, 0), 0);
	}
	
	@Test
	public void oneMultiplyTest() {
		assertEquals("oneMultiplyTest", Calc.multiply(5, 1), 5);
	}
	
	@Test
	public void positiveMultiplyTest() {
		assertEquals("positiveMultiplyTest", Calc.multiply(5, 2), 10);
	}
	
	@Test
	public void negativeMultiplyTest() {
		assertEquals("negativeMultiplyTest", Calc.multiply(-5, -3), 15);
	}

}

