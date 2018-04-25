
package br.cin.ufpe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.cin.ufpe package. 
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

    private final static QName _Multiplicar_QNAME = new QName("http://ufpe.cin.br/", "multiplicar");
    private final static QName _Dividir_QNAME = new QName("http://ufpe.cin.br/", "dividir");
    private final static QName _DividirResponse_QNAME = new QName("http://ufpe.cin.br/", "dividirResponse");
    private final static QName _AdicionarResponse_QNAME = new QName("http://ufpe.cin.br/", "adicionarResponse");
    private final static QName _Subtrair_QNAME = new QName("http://ufpe.cin.br/", "subtrair");
    private final static QName _SubtrairResponse_QNAME = new QName("http://ufpe.cin.br/", "subtrairResponse");
    private final static QName _Adicionar_QNAME = new QName("http://ufpe.cin.br/", "adicionar");
    private final static QName _MultiplicarResponse_QNAME = new QName("http://ufpe.cin.br/", "multiplicarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.cin.ufpe
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Adicionar }
     * 
     */
    public Adicionar createAdicionar() {
        return new Adicionar();
    }

    /**
     * Create an instance of {@link MultiplicarResponse }
     * 
     */
    public MultiplicarResponse createMultiplicarResponse() {
        return new MultiplicarResponse();
    }

    /**
     * Create an instance of {@link Multiplicar }
     * 
     */
    public Multiplicar createMultiplicar() {
        return new Multiplicar();
    }

    /**
     * Create an instance of {@link Dividir }
     * 
     */
    public Dividir createDividir() {
        return new Dividir();
    }

    /**
     * Create an instance of {@link DividirResponse }
     * 
     */
    public DividirResponse createDividirResponse() {
        return new DividirResponse();
    }

    /**
     * Create an instance of {@link AdicionarResponse }
     * 
     */
    public AdicionarResponse createAdicionarResponse() {
        return new AdicionarResponse();
    }

    /**
     * Create an instance of {@link Subtrair }
     * 
     */
    public Subtrair createSubtrair() {
        return new Subtrair();
    }

    /**
     * Create an instance of {@link SubtrairResponse }
     * 
     */
    public SubtrairResponse createSubtrairResponse() {
        return new SubtrairResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ufpe.cin.br/", name = "multiplicar")
    public JAXBElement<Multiplicar> createMultiplicar(Multiplicar value) {
        return new JAXBElement<Multiplicar>(_Multiplicar_QNAME, Multiplicar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dividir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ufpe.cin.br/", name = "dividir")
    public JAXBElement<Dividir> createDividir(Dividir value) {
        return new JAXBElement<Dividir>(_Dividir_QNAME, Dividir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ufpe.cin.br/", name = "dividirResponse")
    public JAXBElement<DividirResponse> createDividirResponse(DividirResponse value) {
        return new JAXBElement<DividirResponse>(_DividirResponse_QNAME, DividirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ufpe.cin.br/", name = "adicionarResponse")
    public JAXBElement<AdicionarResponse> createAdicionarResponse(AdicionarResponse value) {
        return new JAXBElement<AdicionarResponse>(_AdicionarResponse_QNAME, AdicionarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtrair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ufpe.cin.br/", name = "subtrair")
    public JAXBElement<Subtrair> createSubtrair(Subtrair value) {
        return new JAXBElement<Subtrair>(_Subtrair_QNAME, Subtrair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtrairResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ufpe.cin.br/", name = "subtrairResponse")
    public JAXBElement<SubtrairResponse> createSubtrairResponse(SubtrairResponse value) {
        return new JAXBElement<SubtrairResponse>(_SubtrairResponse_QNAME, SubtrairResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adicionar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ufpe.cin.br/", name = "adicionar")
    public JAXBElement<Adicionar> createAdicionar(Adicionar value) {
        return new JAXBElement<Adicionar>(_Adicionar_QNAME, Adicionar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ufpe.cin.br/", name = "multiplicarResponse")
    public JAXBElement<MultiplicarResponse> createMultiplicarResponse(MultiplicarResponse value) {
        return new JAXBElement<MultiplicarResponse>(_MultiplicarResponse_QNAME, MultiplicarResponse.class, null, value);
    }

}
