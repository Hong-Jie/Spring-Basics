package app.engines;

import org.springframework.stereotype.Component;

import app.interfaces.Engine;

@Component("V8")
public class V8 implements Engine {

	@Override
	public String type() {
		return "V8";
	}

}
