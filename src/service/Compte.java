
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour compte complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="compte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condeCompte" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "condeCompte",
    "solde"
})
public class Compte {

    protected Long condeCompte;
    protected double solde;

    /**
     * Obtient la valeur de la propriété condeCompte.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCondeCompte() {
        return condeCompte;
    }

    /**
     * Définit la valeur de la propriété condeCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCondeCompte(Long value) {
        this.condeCompte = value;
    }

    /**
     * Obtient la valeur de la propriété solde.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Définit la valeur de la propriété solde.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

}
