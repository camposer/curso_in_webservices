package webservice;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import service.IHolaMundoService;

@WebService(endpointInterface="webservice.IHolaMundoSoap")
public class HolaMundoSoap implements IHolaMundoSoap {
	@Autowired
	IHolaMundoService holaMundoService;
	
	@Override
	public String saludar(String nombre) {
		return holaMundoService.saludar(nombre);
	} 

}
