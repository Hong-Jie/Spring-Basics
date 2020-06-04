package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.cars.Corolla;
import app.cars.Cx5;
import app.engines.V6;
import app.engines.V8;

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
	
	@Bean("enginev6")
	public V6 v6() {
		return new V6();
	}
	
	@Bean("enginev8")
	public V8 v8() {
		return new V8();
	}
}
