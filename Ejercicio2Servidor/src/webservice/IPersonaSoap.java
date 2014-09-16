package webservice;

import java.util.List;

import javax.jws.WebService;

import to.PersonaTo;

@WebService
public interface IPersonaSoap {
	public List<PersonaTo> obtenerPersonas();
	public void agregarPersona(PersonaTo p);
	public PersonaTo obtenerPersona(Integer id);
	public void modificarPersona(PersonaTo p);
	public void eliminarPersona(Integer id);
}
