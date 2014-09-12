package webservice;

import javax.jws.WebService;

@WebService(endpointInterface="webservice.IHolaMundoSoap")
public class HolaMundoSoap implements IHolaMundoSoap {

	@Override
	public String saludar(String nombre) {
		return "Hola " + nombre;
	} 

}
