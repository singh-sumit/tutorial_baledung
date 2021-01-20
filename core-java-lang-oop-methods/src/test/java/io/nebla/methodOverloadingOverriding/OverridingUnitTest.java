package io.nebla.methodOverloadingOverriding;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.nebla.methodOverloadingOverriding.model.Vehicle;
import io.nebla.methodOverloadingOverriding.model.Car;

class OverridingUnitTest {
	//member variables
	private Vehicle vehicle;
	private Car car;

	@BeforeEach
	public void setUpVehicleInstance() {
		vehicle = new Vehicle();
	}
	
	@BeforeEach
	public void setUpCarInstance() {
		car = new Car();
	}
	
	@AfterEach
	public void clearVehicleInstance() {
		vehicle = null;
	}
	
	@AfterEach
	public void clearCarInstance() {
		car = null;
	}
	
	@Test
	void test_NotSame_acclerate_Result_for_both_Instance() {
		assertFalse( vehicle.accelerate(100).equals(car.accelerate(100)),"should not be same");
//		assertEquals(vehicle.accelerate(100), car.accelerate(100),"should not be same");
	}
	
	@Test
	void test_Same_run_Result_for_both_Instance() {
		assertTrue(vehicle.run().equals(car.run()),"should be same");
	}
	
	@Test
	void test_Same_stop_Result_for_both_Instance() {
		assertTrue(vehicle.stop().equals(car.stop()),"should be same");
	}

}
