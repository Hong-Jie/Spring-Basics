package app.engines;

import org.springframework.stereotype.Component;

import app.interfaces.Engine;

@Component("V6")
public class V6 implements Engine {

	@Override
	public String type() {
		return "V6";
	}

}
