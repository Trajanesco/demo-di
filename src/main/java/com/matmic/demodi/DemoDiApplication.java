package com.matmic.demodi;

import com.matmic.demodi.controllers.ConstrucorInjectedController;
import com.matmic.demodi.controllers.GetterInjectedController;
import com.matmic.demodi.controllers.MyController;
import com.matmic.demodi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoDiApplication.class, args);
		MyController ctrl = (MyController)ctx.getBean("myController");
		System.out.println(ctrl.hello());

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstrucorInjectedController.class).sayHello());
	}
}
