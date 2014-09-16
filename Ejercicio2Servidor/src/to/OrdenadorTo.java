package to;

import to.PersonaTo;

public class OrdenadorTo {
	private Integer id;
	private String nombre;
	private String serial;
	private PersonaTo persona;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public PersonaTo getPersona() {
		return persona;
	}
	public void setPersona(PersonaTo persona) {
		this.persona = persona;
	}
}
