package model;

import java.io.Serializable;

public class Ordenador implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nombre;
	private String serial;
	private Persona persona;

	public Ordenador() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Ordenador [id=" + id + ", nombre=" + nombre + ", serial="
				+ serial + ", persona=" + persona + "]";
	}
}