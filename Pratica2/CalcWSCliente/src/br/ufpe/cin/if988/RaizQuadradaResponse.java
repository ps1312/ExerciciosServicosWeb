
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
 *         &lt;element name="raizQuadradaReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "raizQuadradaReturn"
})
@XmlRootElement(name = "raizQuadradaResponse")
public class RaizQuadradaResponse {

    protected double raizQuadradaReturn;

    /**
     * Obtém o valor da propriedade raizQuadradaReturn.
     * 
     */
    public double getRaizQuadradaReturn() {
        return raizQuadradaReturn;
    }

    /**
     * Define o valor da propriedade raizQuadradaReturn.
     * 
     */
    public void setRaizQuadradaReturn(double value) {
        this.raizQuadradaReturn = value;
    }

}
