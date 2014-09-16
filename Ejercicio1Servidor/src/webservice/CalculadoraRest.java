package webservice;

import org.springframework.beans.factory.annotation.Autowired;

import enumaration.Operacion;
import service.ICalculadoraService;
import to.CalculadoraResultadoTo;

public class CalculadoraRest implements ICalculadoraRest {
	@Autowired
	private ICalculadoraService calculadoraService;

	@Override
	public CalculadoraResultadoTo restar(float a, float b) {
		return new CalculadoraResultadoTo(
				a, 
				b, 
				Operacion.RESTAR, 
				calculadoraService.restar(a, b));
	}

	@Override
	public CalculadoraResultadoTo dividir(float a, float b) {
		return new CalculadoraResultadoTo(
				a, 
				b, 
				Operacion.DIVIDIR, 
				calculadoraService.dividir(a, b));
	}

	@Override
	public CalculadoraResultadoTo sumar(float a, float b) {
		return new CalculadoraResultadoTo(
				a, 
				b, 
				Operacion.SUMAR, 
				calculadoraService.sumar(a, b));
	}

	@Override
	public CalculadoraResultadoTo multiplicar(float a, float b) {
		return new CalculadoraResultadoTo(
				a, 
				b, 
				Operacion.MULTIPLICAR, 
				calculadoraService.multiplicar(a, b));
	}

	@Override
	public CalculadoraResultadoTo modulo(float a, float b) {
		return new CalculadoraResultadoTo(
				a, 
				b, 
				Operacion.MODULO, 
				calculadoraService.modulo(a, b));
	}

}
