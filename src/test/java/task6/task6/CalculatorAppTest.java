package task6.task6;

import org.testng.annotations.*;

import junit.framework.Assert;

public class CalculatorAppTest {
	@Test
	public void testAdd() {
		CalculatorApp app = new CalculatorApp();
		int a = 5;
		int b = 6;
		int actual=app.addMethod(a, b);
		int expected=a+b;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testSub() {
		CalculatorApp app = new CalculatorApp();
		int a = 6;
		int b = 5;
		int actual=app.subMethod(a,b);
		int expected=a-b;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testMul() {
		CalculatorApp app = new CalculatorApp();
		int a = 5;
		int b = 6;
		int actual=app.mulMethod(a, b);
		int expected=a*b;
		Assert.assertEquals(actual, expected);
	}
}
