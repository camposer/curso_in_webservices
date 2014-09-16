package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Float altura;
	private String apellido;
	private Date fechanacimiento;
	private String nombre;
	private List<Ordenador> ordenadores;
	public int cantidadOrdenadores;

	public Persona() {
	}

	public Persona(String nombre, String apellido, 
			Float altura, Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.altura = altura;
		this.fechanacimiento = fechaNacimiento;
	}
		
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getAltura() {
		return this.altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ordenador> getOrdenadores() {
		return this.ordenadores;
	}

	public void setOrdenadores(List<Ordenador> ordenadores) {
		this.ordenadores = ordenadores;
	}

	public Ordenador addOrdenador(Ordenador ordenador) {
		getOrdenadores().add(ordenador);
		ordenador.setPersona(this);

		return ordenador;
	}

	public Ordenador removeOrdenador(Ordenador ordenador) {
		getOrdenadores().remove(ordenador);
		ordenador.setPersona(null);

		return ordenador;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", altura=" + altura + ", apellido="
				+ apellido + ", fechanacimiento=" + fechanacimiento
				+ ", nombre=" + nombre + "]";
	}
}