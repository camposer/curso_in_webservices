package webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import to.CalculadoraResultadoTo;

@Produces(value={ "application/json" }) // OUTPUT (RESPONSE)
//@Consumes("application/json") // INPUT (REQUEST)
public interface ICalculadoraRest {
	/**
	 * GET http://localhost:8080/Ejercicio1Servidor/ws/calculadora/restar/2/3
	 * Header: Accept: application/json
	 * 
	 * { result: -1 }
	 */
	@GET
	@Path("/restar/{a}/{b}")
    public CalculadoraResultadoTo restar(@PathParam("a") float a, @PathParam("b") float b);

	/**
	 * GET http://localhost:8080/Ejercicio1Servidor/ws/calculadora/dividir/25/5
	 * Header: Accept: application/json
	 *
	 * { result: 5 }
	 */
	@GET
	@Path("/dividir/{a}/{b}")
	public CalculadoraResultadoTo dividir(@PathParam("a") float a, @PathParam("b") float b);

	/**
	 * GET http://localhost:8080/Ejercicio1Servidor/ws/calculadora/sumar/2/2
	 * Header: Accept: application/json
	 *
	 * { result: 4 }
	 */
	@GET
	@Path("/sumar/{a}/{b}")
	public CalculadoraResultadoTo sumar(@PathParam("a") float a, @PathParam("b") float b);

	/**
	 * GET http://localhost:8080/Ejercicio1Servidor/ws/calculadora/multiplicar/2/3
	 * Header: Accept: application/json
	 *
	 * { result: 6 }
	 */
	@GET
	@Path("/multiplicar/{a}/{b}")
    public CalculadoraResultadoTo multiplicar(@PathParam("a") float a, @PathParam("b") float b);
}
