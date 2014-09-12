package webservice;

import javax.jws.WebService;

@WebService
public interface IHolaMundoSoap {
	public String saludar(String nombre);
}
