package sample;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;
	
	@Before
	public void setUp(){
		calc=new Calculator();
	}
	@Test
	public void testAdd(){
		Assert.assertEquals(30,calc.add(20,10));
	}
	@Test
	public void testSub(){
		Assert.assertEquals(10,calc.sub(20,10));
	}
	@Test
	public void testMul(){
		Assert.assertEquals(200,calc.mul(20,10));
	}
}
