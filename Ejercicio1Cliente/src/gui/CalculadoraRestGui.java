package gui;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import webservice.ICalculadoraRest;


public class CalculadoraRestGui {
	private Scanner scanner;
	private ICalculadoraRest calculadoraRest;
	
	@SuppressWarnings("resource")
	public CalculadoraRestGui() {
		this.scanner = new Scanner(System.in);
		this.calculadoraRest = 
				new ClassPathXmlApplicationContext("applicationContext.xml")
					.getBean("calculadoraRest", ICalculadoraRest.class);
	}
	
	public void iniciar() {
		
		while (true) {
			System.out.println();
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Modulo");
			System.out.println("6. Salir");
			System.out.println("? ");
			String opcion = scanner.nextLine();

			if (opcion.equals("6")) // Saliendo 
				break;
			
			System.out.print("a? ");
			String sa = scanner.nextLine();
			float a = Float.parseFloat(sa);

			System.out.print("b? ");
			String sb = scanner.nextLine();
			float b = Float.parseFloat(sb);
			
			if (opcion.equals("1"))
				System.out.println(a + " + " + b + " = " + calculadoraRest.sumar(a, b).getResultado());
			else if (opcion.equals("2"))
				System.out.println(a + " - " + b + " = " + calculadoraRest.restar(a, b).getResultado());
			else if (opcion.equals("3"))
				System.out.println(a + " * " + b + " = " + calculadoraRest.multiplicar(a, b).getResultado());
			else if (opcion.equals("4"))
				System.out.println(a + " / " + b + " = " + calculadoraRest.dividir(a, b).getResultado());
			else if (opcion.equals("5"))
				System.out.println(a + " % " + b + " = " + calculadoraRest.modulo(a, b).getResultado());
			
		}
	}
	
	public static void main(String[] args) {
		new CalculadoraRestGui().iniciar();
	}
}
