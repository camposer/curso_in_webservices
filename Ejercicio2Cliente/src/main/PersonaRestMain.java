package main;

import gui.PersonaRestGui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonaRestMain {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml")
			.getBean("personaRestGui", PersonaRestGui.class).iniciar();
	}
}
