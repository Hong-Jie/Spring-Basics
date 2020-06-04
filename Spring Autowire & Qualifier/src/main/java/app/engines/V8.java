package app.engines;

import app.interfaces.Engine;

public class V8 implements Engine {

	@Override
	public String type() {
		return "V8";
	}

}
