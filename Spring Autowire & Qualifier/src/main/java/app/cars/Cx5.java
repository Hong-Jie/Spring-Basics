package app.cars;

import org.springframework.beans.factory.annotation.Autowired;
import app.interfaces.Car;
import app.interfaces.Engine;

public class Cx5 implements Car {

	@Autowired
	Engine engine;
	
	public String specs() {
		return "Cx5 "+engine.type();
	}

}
