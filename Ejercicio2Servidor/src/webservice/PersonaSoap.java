package webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import model.Ordenador;
import model.Persona;

import org.springframework.beans.factory.annotation.Autowired;

import service.IPersonaService;
import to.OrdenadorTo;
import to.PersonaTo;

@WebService(endpointInterface="webservice.IPersonaSoap")
public class PersonaSoap implements IPersonaSoap {
	@Autowired
	private IPersonaService personaService;

	@Override
	public List<PersonaTo> obtenerPersonas() {
		List<Persona> personas = personaService.obtenerPersonas();
		List<PersonaTo> personasTo = new ArrayList<PersonaTo>();
		
		for (Persona p : personas) 
			personasTo.add(obtenerPersonaTo(p));
		
		return personasTo;
	}

	private PersonaTo obtenerPersonaTo(Persona p) {
		PersonaTo pTo = new PersonaTo();
		pTo.setId(p.getId());
		pTo.setNombre(p.getNombre());
		pTo.setApellido(p.getApellido());
		pTo.setAltura(p.getAltura());
		pTo.setFechanacimiento(p.getFechanacimiento());
		
		List<Ordenador> ordenadores = p.getOrdenadores();
		List<OrdenadorTo> ordenadoresTo = new ArrayList<OrdenadorTo>();
		for (Ordenador o : ordenadores) {
			OrdenadorTo oTo = new OrdenadorTo();
			oTo.setId(o.getId());
			oTo.setNombre(o.getNombre());
			oTo.setSerial(o.getSerial());
			
			ordenadoresTo.add(oTo);
		}
		
		pTo.setOrdenadores(ordenadoresTo);
		
		return pTo;
	}

	private Persona obtenerPersona(PersonaTo pTo) {
		Persona p = new Persona();
		p.setId(pTo.getId());
		p.setNombre(pTo.getNombre());
		p.setApellido(pTo.getApellido());
		p.setAltura(pTo.getAltura());
		p.setFechanacimiento(pTo.getFechanacimiento());
		
		List<Ordenador> ordenadores = new ArrayList<Ordenador>();
		List<OrdenadorTo> ordenadoresTo = pTo.getOrdenadores();
		if (ordenadoresTo != null) for (OrdenadorTo oTo : ordenadoresTo) {
			Ordenador o = new Ordenador();
			o.setId(oTo.getId());
			o.setNombre(oTo.getNombre());
			o.setSerial(oTo.getSerial());
			
			ordenadores.add(o);
		}
		
		p.setOrdenadores(ordenadores);
		
		return p;
	}

	@Override
	public void agregarPersona(PersonaTo pTo) {
		personaService.agregarPersona(obtenerPersona(pTo));
	}

	@Override
	public PersonaTo obtenerPersona(Integer id) {
		Persona persona = personaService.obtenerPersona(id);
		
		return obtenerPersonaTo(persona);
	}

	@Override
	public void modificarPersona(PersonaTo pTo) {
		personaService.modificarPersona(obtenerPersona(pTo));
	}

	@Override
	public void eliminarPersona(Integer id) {
		personaService.eliminarPersona(id);
	}

}
