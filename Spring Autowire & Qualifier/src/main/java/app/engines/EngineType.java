package app.engines;

import app.interfaces.Engine;

public class EngineType implements Engine {

	private String type;
	
	public EngineType() {
		type = "Unknown";
	}
	
	public EngineType(String type) {
		this.type = type;
	}
	
	@Override
	public String type() {
		return type;
	}

}
