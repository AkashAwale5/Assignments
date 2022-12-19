package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class Ass13Test {

	@Test
	void testAdd() 
	{
		assertEquals(20, Ass13.addition());
	}
	@Test
	void testSubstraction()
	{
		assertEquals(20, Ass13.substraction());
	}
	@Test
	void testMultiplication()
	{
		assertEquals(25, Ass13.multiplication());
	}
	

	
	@Test
	void testSquareRoot()
	{
		assertEquals(4, Ass13.squareroot());
	}
	
	@Test
	void testCubeRoot()
	{
		assertEquals(4, Ass13.cuberoot());
	}
	
	@Test
	void testModeulus()
	{
		assertEquals(4, Ass13.modulus());
	}
	
	@Test
	public void testPower()
	{
		System.out.println("power operation:");
		assertEquals(4, Ass13.power());
	}
	
	@Test
	void testDivision()
	{
		System.out.println("Divison operation--");
		assertEquals(25, Ass13.divison());	   
	}
	
	

//	@Rule
//	public ExpectedException objexp= ExpectedException.none();
//	@Test(expected=ArithmeticException.class)
//	@Test
//	void testDivision()
//	{
//		System.out.println("Divison operation--");
//		assertEquals(25, Ass13.divison());
//	}
	
	
}
