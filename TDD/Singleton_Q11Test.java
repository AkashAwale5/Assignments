package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Singleton_Q11Test {

	@Test
	void test() {
		Singleton_Q11 st1=Singleton_Q11.geSingleton_Q11();
		Singleton_Q11 st2=Singleton_Q11.geSingleton_Q11();
		assertTrue(SingletonCheck.check(st1, st2));	
		}

}
