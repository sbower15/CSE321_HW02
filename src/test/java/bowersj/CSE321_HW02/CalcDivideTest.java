package bowersj.CSE321_HW02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcDivideTest {

	@Test(expected = java.lang.ArithmeticException.class)
	public void divideByZeroTest() {
			Calc.divide(5, 0);
	}
	
	@Test
	public void divideNoRemainderTest(){
		assertEquals("divideNoRemainder", Calc.divide(25, 5), 5);
	}
	
	@Test
	public void divideWithRemainderTest(){
		assertEquals("divideWithRemainder", Calc.divide(25, 8), 3);
	}

}
