
package br.ufpe.cin.if988;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="v1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="v2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "v1",
    "v2"
})
@XmlRootElement(name = "potencia")
public class Potencia {

    protected int v1;
    protected int v2;

    /**
     * Obtém o valor da propriedade v1.
     * 
     */
    public int getV1() {
        return v1;
    }

    /**
     * Define o valor da propriedade v1.
     * 
     */
    public void setV1(int value) {
        this.v1 = value;
    }

    /**
     * Obtém o valor da propriedade v2.
     * 
     */
    public int getV2() {
        return v2;
    }

    /**
     * Define o valor da propriedade v2.
     * 
     */
    public void setV2(int value) {
        this.v2 = value;
    }

}
