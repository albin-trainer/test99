package com.lnt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		assertEquals(50, new Calculator().add(25, 25));
	}

}
