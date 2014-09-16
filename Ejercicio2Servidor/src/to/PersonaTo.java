package to;

import java.util.Date;
import java.util.List;

import to.OrdenadorTo;

public class PersonaTo {
	private Integer id;
	private Float altura;
	private String apellido;
	private Date fechanacimiento;
	private String nombre;
	private List<OrdenadorTo> ordenadores;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<OrdenadorTo> getOrdenadores() {
		return ordenadores;
	}
	public void setOrdenadores(List<OrdenadorTo> ordenadores) {
		this.ordenadores = ordenadores;
	}
}
