package io.nebla.methodOverloadingOverriding;
import io.nebla.methodOverloadingOverriding.util.Multiplier;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OverloadingMultiplierTest {
	//member variable
	Multiplier multiplier;
	
	@BeforeEach
	void init() {
		multiplier = new Multiplier();
	}
	
	@AfterEach
	void cleanUp() {
		multiplier = null;
	}
	
	//tests
	
	@Test
	@DisplayName("When given two integer")
	void testMultiplyWithTwoIntegerArgsAndIntegerReturnType() {
		assertEquals(200, multiplier.multiply(10, 20),"should return correct integer");
	}
	
	@Test
	@DisplayName("When given three integer")
	void test_Multiply_With_Three_Integer_Args_and_Returns_Integer() {
		assertEquals(1000 , multiplier.multiply(10, 10, 10),"should return correct integer");
	}
	
	@Test
	@DisplayName("When give two double")
	void test_Multiply_With_Two_Double_Args_And_Returns_Double() {
		assertEquals(100.0, multiplier.multiply(10.0, 10.0),"should return correct double value");
	}
	
	@Test
	@DisplayName("when given one arg with of lower type happen typeconversion")
	void test_Multiply_with_one_int_and_other_long_args_and_returns_double() {
		assertEquals(10.0, multiplier.multiply(2, (byte)5),"should return correct double type value");
	}

}
