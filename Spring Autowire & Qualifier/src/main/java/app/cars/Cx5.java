package app.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import app.interfaces.Car;
import app.interfaces.Engine;

@Component
public class Cx5 implements Car {

	@Autowired
	@Qualifier("V6")
	Engine engine;
	
	public String specs() {
		return "Cx5 "+engine.type();
	}

}
