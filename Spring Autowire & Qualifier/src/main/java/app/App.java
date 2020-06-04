package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.cars.Cx5;
import app.interfaces.Car;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("cx5", Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
