package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ass12Test {

	@Test
	void test() throws CloneNotSupportedException	
	{
		Ass12 a1=new Ass12(101,"ajay");
		Ass12 a2=(Ass12)a1.clone();
		assertEquals(true, Ass12.checkClone(a1, a2));
	}

}
