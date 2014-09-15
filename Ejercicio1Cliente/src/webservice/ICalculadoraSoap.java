package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-09-15T10:41:57.433+02:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://webservice/", name = "ICalculadoraSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ICalculadoraSoap {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "restar", targetNamespace = "http://webservice/", className = "webservice.Restar")
    @WebMethod
    @ResponseWrapper(localName = "restarResponse", targetNamespace = "http://webservice/", className = "webservice.RestarResponse")
    public float restar(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "dividir", targetNamespace = "http://webservice/", className = "webservice.Dividir")
    @WebMethod
    @ResponseWrapper(localName = "dividirResponse", targetNamespace = "http://webservice/", className = "webservice.DividirResponse")
    public float dividir(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "multiplicar", targetNamespace = "http://webservice/", className = "webservice.Multiplicar")
    @WebMethod
    @ResponseWrapper(localName = "multiplicarResponse", targetNamespace = "http://webservice/", className = "webservice.MultiplicarResponse")
    public float multiplicar(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sumar", targetNamespace = "http://webservice/", className = "webservice.Sumar")
    @WebMethod
    @ResponseWrapper(localName = "sumarResponse", targetNamespace = "http://webservice/", className = "webservice.SumarResponse")
    public float sumar(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1
    );
}
