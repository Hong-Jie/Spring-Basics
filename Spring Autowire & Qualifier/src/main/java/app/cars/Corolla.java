package app.cars;

import org.springframework.stereotype.Component;

import app.interfaces.Car;

@Component
public class Corolla implements Car {

	public String specs() {
		return "Corolla";
	}
	
}
