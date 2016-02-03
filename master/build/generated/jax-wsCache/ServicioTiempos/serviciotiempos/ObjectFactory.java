
package serviciotiempos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviciotiempos package. 
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

    private final static QName _LapsoAlInicioEnMillisResponse_QNAME = new QName("http://serviciotiempos/", "lapsoAlInicioEnMillisResponse");
    private final static QName _Hello_QNAME = new QName("http://serviciotiempos/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://serviciotiempos/", "helloResponse");
    private final static QName _BlnReset_QNAME = new QName("http://serviciotiempos/", "blnReset");
    private final static QName _LapsoAlInicioEnMillis_QNAME = new QName("http://serviciotiempos/", "lapsoAlInicioEnMillis");
    private final static QName _BlnResetResponse_QNAME = new QName("http://serviciotiempos/", "blnResetResponse");
    private final static QName _QuienSoyResponse_QNAME = new QName("http://serviciotiempos/", "quienSoyResponse");
    private final static QName _QuienSoy_QNAME = new QName("http://serviciotiempos/", "quienSoy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviciotiempos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BlnResetResponse }
     * 
     */
    public BlnResetResponse createBlnResetResponse() {
        return new BlnResetResponse();
    }

    /**
     * Create an instance of {@link QuienSoyResponse }
     * 
     */
    public QuienSoyResponse createQuienSoyResponse() {
        return new QuienSoyResponse();
    }

    /**
     * Create an instance of {@link QuienSoy }
     * 
     */
    public QuienSoy createQuienSoy() {
        return new QuienSoy();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link BlnReset }
     * 
     */
    public BlnReset createBlnReset() {
        return new BlnReset();
    }

    /**
     * Create an instance of {@link LapsoAlInicioEnMillis }
     * 
     */
    public LapsoAlInicioEnMillis createLapsoAlInicioEnMillis() {
        return new LapsoAlInicioEnMillis();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link LapsoAlInicioEnMillisResponse }
     * 
     */
    public LapsoAlInicioEnMillisResponse createLapsoAlInicioEnMillisResponse() {
        return new LapsoAlInicioEnMillisResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LapsoAlInicioEnMillisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciotiempos/", name = "lapsoAlInicioEnMillisResponse")
    public JAXBElement<LapsoAlInicioEnMillisResponse> createLapsoAlInicioEnMillisResponse(LapsoAlInicioEnMillisResponse value) {
        return new JAXBElement<LapsoAlInicioEnMillisResponse>(_LapsoAlInicioEnMillisResponse_QNAME, LapsoAlInicioEnMillisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciotiempos/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciotiempos/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlnReset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciotiempos/", name = "blnReset")
    public JAXBElement<BlnReset> createBlnReset(BlnReset value) {
        return new JAXBElement<BlnReset>(_BlnReset_QNAME, BlnReset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LapsoAlInicioEnMillis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciotiempos/", name = "lapsoAlInicioEnMillis")
    public JAXBElement<LapsoAlInicioEnMillis> createLapsoAlInicioEnMillis(LapsoAlInicioEnMillis value) {
        return new JAXBElement<LapsoAlInicioEnMillis>(_LapsoAlInicioEnMillis_QNAME, LapsoAlInicioEnMillis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlnResetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciotiempos/", name = "blnResetResponse")
    public JAXBElement<BlnResetResponse> createBlnResetResponse(BlnResetResponse value) {
        return new JAXBElement<BlnResetResponse>(_BlnResetResponse_QNAME, BlnResetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuienSoyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciotiempos/", name = "quienSoyResponse")
    public JAXBElement<QuienSoyResponse> createQuienSoyResponse(QuienSoyResponse value) {
        return new JAXBElement<QuienSoyResponse>(_QuienSoyResponse_QNAME, QuienSoyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuienSoy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviciotiempos/", name = "quienSoy")
    public JAXBElement<QuienSoy> createQuienSoy(QuienSoy value) {
        return new JAXBElement<QuienSoy>(_QuienSoy_QNAME, QuienSoy.class, null, value);
    }

}
