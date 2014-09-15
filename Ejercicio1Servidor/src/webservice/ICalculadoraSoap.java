package webservice;

import javax.jws.WebService;

@WebService
public interface ICalculadoraSoap {
    public float restar(float a, float b);
    public float dividir(float a, float b);
    public float sumar(float a, float b);
    public float multiplicar(float a, float b);
}
