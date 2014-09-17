package webservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import model.Persona;

// Mapping /personas
@Consumes("application/json")
@Produces("application/json")
public interface IPersonaRest {
	/**
	 * GET http://localhost:8080/Ejercicio2Servidor/ws/personas
	 * Accept: application/json
	 * 
	 * [ {...}, {...}]
	 */
	@GET
	@Path("")
	public List<Persona> obtenerPersonas();

	/**
	 * GET http://localhost:8080/Ejercicio2Servidor/ws/personas/1
	 * Accept: application/json
	 * 
	 * {...}
	 */
	@GET
	@Path("/{id}")
	public Persona obtenerPersona(@PathParam("id") Integer id);
	
	/**
	 * GET http://localhost:8080/Ejercicio2Servidor/ws/personas/1
	 * Accept: application/json
	 * 
	 * null
	 */
	@GET
	@Path("/order/nombre")
	public List<Persona> obtenerPersonasOrdenadasPorNombre();

	/**
	 * POST http://localhost:8080/Ejercicio2Servidor/ws/personas
	 * Content-type: application/json
	 * {
     *  "nombre": "9",
     *  "apellido": "9",
     *  "altura": 9,
     *  "fechanacimiento": "2009-09-09"
	 * }
	 *
	 * void (No content)
	 */	
	@POST
	@Path("")
	public void agregarPersona(Persona pTo);
	

	/**
	 * PUT http://localhost:8080/Ejercicio2Servidor/ws/personas/1
	 * Content-type: application/json
	 * {
     *  "nombre": "9",
     *  "apellido": "9",
     *  "altura": 9,
     *  "fechanacimiento": "2009-09-09"
	 * }
	 *
	 * void (No content)
	 */	
	@PUT
	@Path("/{id}")
	public void modificarPersona(@PathParam("id") Integer id, Persona pTo);
	
	
	/**
	 * DELETE http://localhost:8080/Ejercicio2Servidor/ws/personas/1
	 * 
	 * void (No content)
	 */
	@DELETE
	@Path("/{id}")
	public void eliminarPersona(@PathParam("id") Integer id);
}
