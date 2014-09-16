package service;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraService implements ICalculadoraService {

	@Override
	public float sumar(float a, float b) {
		return a + b;
	}

	@Override
	public float restar(float a, float b) {
		return a - b;
	}

	@Override
	public float multiplicar(float a, float b) {
		return a * b;
	}

	@Override
	public float dividir(float a, float b) {
		return a / b;
	}

	@Override
	public int modulo(float a, float b) {
		return (int)(a % b);
	}
}
