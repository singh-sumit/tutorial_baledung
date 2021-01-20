package io.nebla.covariance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CovariantProducersUnitTest {

	@Test
	void whenInputIsArbitrary_thenProducerProduceString() {
		String arbitraryInput = "some random text";
		Producer producer = new Producer();
		
		Object objectOutput = producer.produce(arbitraryInput);
		
		assertEquals(arbitraryInput,objectOutput);
		assertEquals(String.class, objectOutput.getClass());
	}
	
	@Test
	void whenInputIsInteger_thenProducerCreatesInteger() {
		String integerAsString = "32";
		Producer producer = new IntegerProducer();
		
		Object result =producer.produce(integerAsString);
		
		assertEquals(Integer.class, result.getClass());
		assertEquals(Integer.parseInt(integerAsString),result);
	}
	
	@Test
	void whenInputIsInteger_thenIntegerProducerCreatesIntegerWithoutCasting() {
		String integerAsString = "42";
		IntegerProducer producer = new IntegerProducer();
		
		Integer result = producer.produce(integerAsString);
		
		assertEquals(Integer.parseInt(integerAsString), result );
	}

}
