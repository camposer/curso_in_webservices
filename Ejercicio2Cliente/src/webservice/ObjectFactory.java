
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EliminarPersonaResponse_QNAME = new QName("http://webservice/", "eliminarPersonaResponse");
    private final static QName _AgregarPersonaResponse_QNAME = new QName("http://webservice/", "agregarPersonaResponse");
    private final static QName _ObtenerPersona_QNAME = new QName("http://webservice/", "obtenerPersona");
    private final static QName _ObtenerPersonaResponse_QNAME = new QName("http://webservice/", "obtenerPersonaResponse");
    private final static QName _ObtenerPersonasResponse_QNAME = new QName("http://webservice/", "obtenerPersonasResponse");
    private final static QName _ObtenerPersonas_QNAME = new QName("http://webservice/", "obtenerPersonas");
    private final static QName _AgregarPersona_QNAME = new QName("http://webservice/", "agregarPersona");
    private final static QName _EliminarPersona_QNAME = new QName("http://webservice/", "eliminarPersona");
    private final static QName _ModificarPersona_QNAME = new QName("http://webservice/", "modificarPersona");
    private final static QName _ModificarPersonaResponse_QNAME = new QName("http://webservice/", "modificarPersonaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerPersonasResponse }
     * 
     */
    public ObtenerPersonasResponse createObtenerPersonasResponse() {
        return new ObtenerPersonasResponse();
    }

    /**
     * Create an instance of {@link ObtenerPersonas }
     * 
     */
    public ObtenerPersonas createObtenerPersonas() {
        return new ObtenerPersonas();
    }

    /**
     * Create an instance of {@link EliminarPersonaResponse }
     * 
     */
    public EliminarPersonaResponse createEliminarPersonaResponse() {
        return new EliminarPersonaResponse();
    }

    /**
     * Create an instance of {@link ObtenerPersonaResponse }
     * 
     */
    public ObtenerPersonaResponse createObtenerPersonaResponse() {
        return new ObtenerPersonaResponse();
    }

    /**
     * Create an instance of {@link ObtenerPersona }
     * 
     */
    public ObtenerPersona createObtenerPersona() {
        return new ObtenerPersona();
    }

    /**
     * Create an instance of {@link AgregarPersonaResponse }
     * 
     */
    public AgregarPersonaResponse createAgregarPersonaResponse() {
        return new AgregarPersonaResponse();
    }

    /**
     * Create an instance of {@link ModificarPersona }
     * 
     */
    public ModificarPersona createModificarPersona() {
        return new ModificarPersona();
    }

    /**
     * Create an instance of {@link ModificarPersonaResponse }
     * 
     */
    public ModificarPersonaResponse createModificarPersonaResponse() {
        return new ModificarPersonaResponse();
    }

    /**
     * Create an instance of {@link EliminarPersona }
     * 
     */
    public EliminarPersona createEliminarPersona() {
        return new EliminarPersona();
    }

    /**
     * Create an instance of {@link AgregarPersona }
     * 
     */
    public AgregarPersona createAgregarPersona() {
        return new AgregarPersona();
    }

    /**
     * Create an instance of {@link OrdenadorTo }
     * 
     */
    public OrdenadorTo createOrdenadorTo() {
        return new OrdenadorTo();
    }

    /**
     * Create an instance of {@link PersonaTo }
     * 
     */
    public PersonaTo createPersonaTo() {
        return new PersonaTo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "eliminarPersonaResponse")
    public JAXBElement<EliminarPersonaResponse> createEliminarPersonaResponse(EliminarPersonaResponse value) {
        return new JAXBElement<EliminarPersonaResponse>(_EliminarPersonaResponse_QNAME, EliminarPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "agregarPersonaResponse")
    public JAXBElement<AgregarPersonaResponse> createAgregarPersonaResponse(AgregarPersonaResponse value) {
        return new JAXBElement<AgregarPersonaResponse>(_AgregarPersonaResponse_QNAME, AgregarPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "obtenerPersona")
    public JAXBElement<ObtenerPersona> createObtenerPersona(ObtenerPersona value) {
        return new JAXBElement<ObtenerPersona>(_ObtenerPersona_QNAME, ObtenerPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "obtenerPersonaResponse")
    public JAXBElement<ObtenerPersonaResponse> createObtenerPersonaResponse(ObtenerPersonaResponse value) {
        return new JAXBElement<ObtenerPersonaResponse>(_ObtenerPersonaResponse_QNAME, ObtenerPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPersonasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "obtenerPersonasResponse")
    public JAXBElement<ObtenerPersonasResponse> createObtenerPersonasResponse(ObtenerPersonasResponse value) {
        return new JAXBElement<ObtenerPersonasResponse>(_ObtenerPersonasResponse_QNAME, ObtenerPersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPersonas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "obtenerPersonas")
    public JAXBElement<ObtenerPersonas> createObtenerPersonas(ObtenerPersonas value) {
        return new JAXBElement<ObtenerPersonas>(_ObtenerPersonas_QNAME, ObtenerPersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "agregarPersona")
    public JAXBElement<AgregarPersona> createAgregarPersona(AgregarPersona value) {
        return new JAXBElement<AgregarPersona>(_AgregarPersona_QNAME, AgregarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "eliminarPersona")
    public JAXBElement<EliminarPersona> createEliminarPersona(EliminarPersona value) {
        return new JAXBElement<EliminarPersona>(_EliminarPersona_QNAME, EliminarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "modificarPersona")
    public JAXBElement<ModificarPersona> createModificarPersona(ModificarPersona value) {
        return new JAXBElement<ModificarPersona>(_ModificarPersona_QNAME, ModificarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "modificarPersonaResponse")
    public JAXBElement<ModificarPersonaResponse> createModificarPersonaResponse(ModificarPersonaResponse value) {
        return new JAXBElement<ModificarPersonaResponse>(_ModificarPersonaResponse_QNAME, ModificarPersonaResponse.class, null, value);
    }

}
