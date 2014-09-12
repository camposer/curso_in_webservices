package service;

import org.springframework.stereotype.Component;

@Component
public class HolaMundoService implements IHolaMundoService {

	@Override
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}

}
