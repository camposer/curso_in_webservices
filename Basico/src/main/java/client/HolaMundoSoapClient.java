package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import webservice.IHolaMundoSoap;

public class HolaMundoSoapClient {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		IHolaMundoSoap holaMundoSoap = 
				ctx.getBean("holaMundoSoapClient", IHolaMundoSoap.class);
		
		System.out.println(holaMundoSoap.saludar("Juan"));
	}
}
