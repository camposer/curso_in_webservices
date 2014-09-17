package main;

import gui.PersonaSoapGui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonaSoapMain {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml")
			.getBean("personaSoapGui", PersonaSoapGui.class).iniciar();
	}
}
