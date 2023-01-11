package metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;
@XmlRootElement (name = "cp")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte implements Serializable {
       
	    protected Long condeCompte;
       @XmlTransient
	    protected Date dateCreation;
       @XmlElement
	    protected double solde;
	    
		public Compte() {
			
		}
		public Compte(Long condeCompte, Date dateCreation, double solde) {
			super();
			this.condeCompte = condeCompte;
			this.dateCreation = dateCreation;
			this.solde = solde;
		}
		public Long getCondeCompte() {
			return condeCompte;
		}
		public void setCondeCompte(Long condeCompte) {
			this.condeCompte = condeCompte;
		}
		  @XmlTransient
		public Date getDateCreation() {
			return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}
		public double getSolde() {
			return solde;
		}
		public void setSolde(double solde) {
			this.solde = solde;
		}

}
