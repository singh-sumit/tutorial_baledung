package io.nebla.covariance;

public class Producer {
	public Object produce(String input) {
		Object result = input.toLowerCase();
		return result;
	}
}
