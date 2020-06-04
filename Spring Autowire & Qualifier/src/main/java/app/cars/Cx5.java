package app.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import app.interfaces.Car;
import app.interfaces.Engine;

public class Cx5 implements Car {

	@Autowired
	@Qualifier("enginev6")
	Engine engine;
	
	public String specs() {
		return "Cx5 "+engine.type();
	}

}
