package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.cars.Corolla;
import app.cars.Cx5;
import app.engines.EngineType;

@Configuration
@ComponentScan("app")
public class AppConfig {

	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("cx5")
	public Cx5 cx5() {
		return new Cx5();
	}
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("V8");
	}
	
}
