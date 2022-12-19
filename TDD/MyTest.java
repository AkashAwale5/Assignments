package tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTest {

	@Test
	void test1()
	{
		assertEquals(4, Ass1.hcf());
	}
	
	@Test
	void test2()
	{
		assertEquals(true, Ass2.palindrome());
	}
	@Test
	void test4()
	{
		assertEquals("Armstrong No", Ass4.arm());
	}
	
	@Test
	void test5()
	{
		assertEquals(true, Ass5.pythagors());
	}
	@Test
	void test6()
	{
		assertEquals(5, Ass6.check_vowels());
	}
	@Test
	void test7()
	{
		assertEquals(true, Ass7.palin());
	}
	@Test
	void test8()
	{
		assertEquals(true, Ass8.check_even());
	}
	@Test
	void test9()
	{
		assertEquals("This red car", Ass9.remove_space());
	}
	
	@Test
	void test10()
	{
		assertEquals("APPLE-orange-banana-lemon-amba", Ass10.concat_String());
	}
	@Test
	void testAss3()
	{
		assertEquals(true, Ass3.checkUNamePwd());
	}
}
