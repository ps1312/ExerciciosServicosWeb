
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
 *         &lt;element name="potenciaReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "potenciaReturn"
})
@XmlRootElement(name = "potenciaResponse")
public class PotenciaResponse {

    protected int potenciaReturn;

    /**
     * Obtém o valor da propriedade potenciaReturn.
     * 
     */
    public int getPotenciaReturn() {
        return potenciaReturn;
    }

    /**
     * Define o valor da propriedade potenciaReturn.
     * 
     */
    public void setPotenciaReturn(int value) {
        this.potenciaReturn = value;
    }

}
