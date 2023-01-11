
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _Getcompte_QNAME = new QName("http://service/", "getcompte");
    private final static QName _ConversionEuroEnDh_QNAME = new QName("http://service/", "conversionEuroEnDh");
    private final static QName _Cp_QNAME = new QName("http://service/", "cp");
    private final static QName _GetComptesResponse_QNAME = new QName("http://service/", "getComptesResponse");
    private final static QName _ConversionEuroEnDhResponse_QNAME = new QName("http://service/", "conversionEuroEnDhResponse");
    private final static QName _GetComptes_QNAME = new QName("http://service/", "getComptes");
    private final static QName _GetcompteResponse_QNAME = new QName("http://service/", "getcompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEuroEnDh }
     * 
     */
    public ConversionEuroEnDh createConversionEuroEnDh() {
        return new ConversionEuroEnDh();
    }

    /**
     * Create an instance of {@link Getcompte }
     * 
     */
    public Getcompte createGetcompte() {
        return new Getcompte();
    }

    /**
     * Create an instance of {@link GetcompteResponse }
     * 
     */
    public GetcompteResponse createGetcompteResponse() {
        return new GetcompteResponse();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link ConversionEuroEnDhResponse }
     * 
     */
    public ConversionEuroEnDhResponse createConversionEuroEnDhResponse() {
        return new ConversionEuroEnDhResponse();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getcompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getcompte")
    public JAXBElement<Getcompte> createGetcompte(Getcompte value) {
        return new JAXBElement<Getcompte>(_Getcompte_QNAME, Getcompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroEnDh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "conversionEuroEnDh")
    public JAXBElement<ConversionEuroEnDh> createConversionEuroEnDh(ConversionEuroEnDh value) {
        return new JAXBElement<ConversionEuroEnDh>(_ConversionEuroEnDh_QNAME, ConversionEuroEnDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "cp")
    public JAXBElement<Compte> createCp(Compte value) {
        return new JAXBElement<Compte>(_Cp_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroEnDhResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "conversionEuroEnDhResponse")
    public JAXBElement<ConversionEuroEnDhResponse> createConversionEuroEnDhResponse(ConversionEuroEnDhResponse value) {
        return new JAXBElement<ConversionEuroEnDhResponse>(_ConversionEuroEnDhResponse_QNAME, ConversionEuroEnDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetcompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getcompteResponse")
    public JAXBElement<GetcompteResponse> createGetcompteResponse(GetcompteResponse value) {
        return new JAXBElement<GetcompteResponse>(_GetcompteResponse_QNAME, GetcompteResponse.class, null, value);
    }

}
