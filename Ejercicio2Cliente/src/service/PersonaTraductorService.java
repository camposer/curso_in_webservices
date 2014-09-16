package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import model.Ordenador;
import model.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import webservice.IPersonaSoap;
import webservice.OrdenadorTo;
import webservice.PersonaTo;

@Component
public class PersonaTraductorService implements IPersonaService {
	@Autowired
	private IPersonaSoap personaSoap;

	private PersonaTo obtenerPersonaTo(Persona p) {
		PersonaTo pTo = new PersonaTo();
		pTo.setId(p.getId());
		pTo.setNombre(p.getNombre());
		pTo.setApellido(p.getApellido());
		pTo.setAltura(p.getAltura());
		
		pTo.setFechanacimiento(obtenerGregorianCalendar(p.getFechanacimiento()));
		
		List<Ordenador> ordenadores = p.getOrdenadores();
		if (ordenadores != null) for (Ordenador o : ordenadores) {
			OrdenadorTo oTo = new OrdenadorTo();
			oTo.setId(o.getId());
			oTo.setNombre(o.getNombre());
			oTo.setSerial(o.getSerial());
			
			pTo.getOrdenadores().add(oTo);
		}
		
		return pTo;
	}

	private XMLGregorianCalendar obtenerGregorianCalendar(Date fechanacimiento) {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(fechanacimiento);
		XMLGregorianCalendar date2 = null;
		
		try {
			date2 = DatatypeFactory
					.newInstance()
					.newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) { }

		return date2;
	}

	private Persona obtenerPersona(PersonaTo pTo) {
		Persona p = new Persona();
		p.setId(pTo.getId());
		p.setNombre(pTo.getNombre());
		p.setApellido(pTo.getApellido());
		p.setAltura(pTo.getAltura());
		p.setFechanacimiento(obtenerDate(pTo.getFechanacimiento()));
		
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

	private Date obtenerDate(XMLGregorianCalendar fechanacimiento) {
		return fechanacimiento.toGregorianCalendar().getTime();
	}

	@Override
	public List<Persona> obtenerPersonas() {
		List<Persona> personas = new ArrayList<Persona>();
		List<PersonaTo> personasTo = personaSoap.obtenerPersonas();
		
		if (personasTo != null) for (PersonaTo pTo : personasTo) 
			personas.add(obtenerPersona(pTo));
		
		return personas;
	}

	@Override
	public void agregarPersona(Persona p) {
		personaSoap.agregarPersona(obtenerPersonaTo(p));
	}

	@Override
	public Persona obtenerPersona(Integer id) {
		Persona p = null;
		PersonaTo pTo = personaSoap.obtenerPersona(id);
		
		if (pTo != null)  
			p = obtenerPersona(pTo);
		
		return p;
	}

	@Override
	public void modificarPersona(Persona p) {
		personaSoap.modificarPersona(obtenerPersonaTo(p));
	}

	@Override
	public void eliminarPersona(Integer id) {
		personaSoap.eliminarPersona(id);
	}
	
}
