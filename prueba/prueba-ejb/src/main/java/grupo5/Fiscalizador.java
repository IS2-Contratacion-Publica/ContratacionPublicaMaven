/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo5;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "FISCALIZADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fiscalizador.findAll", query = "SELECT f FROM Fiscalizador f"),
    @NamedQuery(name = "Fiscalizador.findByConcedula2", query = "SELECT f FROM Fiscalizador f WHERE f.concedula2 = :concedula2"),
    @NamedQuery(name = "Fiscalizador.findByFiscodigo", query = "SELECT f FROM Fiscalizador f WHERE f.fiscodigo = :fiscodigo"),
    @NamedQuery(name = "Fiscalizador.findByFisnombre", query = "SELECT f FROM Fiscalizador f WHERE f.fisnombre = :fisnombre"),
    @NamedQuery(name = "Fiscalizador.findByFisfechanacimiento", query = "SELECT f FROM Fiscalizador f WHERE f.fisfechanacimiento = :fisfechanacimiento"),
    @NamedQuery(name = "Fiscalizador.findByFisgenero", query = "SELECT f FROM Fiscalizador f WHERE f.fisgenero = :fisgenero"),
    @NamedQuery(name = "Fiscalizador.findByFistelefono", query = "SELECT f FROM Fiscalizador f WHERE f.fistelefono = :fistelefono"),
    @NamedQuery(name = "Fiscalizador.findByFiscelular", query = "SELECT f FROM Fiscalizador f WHERE f.fiscelular = :fiscelular"),
    @NamedQuery(name = "Fiscalizador.findByFiscorreo", query = "SELECT f FROM Fiscalizador f WHERE f.fiscorreo = :fiscorreo")})
public class Fiscalizador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CONCEDULA2")
    private String concedula2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "FISCODIGO")
    private String fiscodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "FISNOMBRE")
    private String fisnombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FISFECHANACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fisfechanacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FISGENERO")
    private Character fisgenero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FISTELEFONO")
    private String fistelefono;
    @Size(max = 10)
    @Column(name = "FISCELULAR")
    private String fiscelular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FISCORREO")
    private String fiscorreo;

    public Fiscalizador() {
    }

    public Fiscalizador(String concedula2) {
        this.concedula2 = concedula2;
    }

    public Fiscalizador(String concedula2, String fiscodigo, String fisnombre, Date fisfechanacimiento, Character fisgenero, String fistelefono, String fiscorreo) {
        this.concedula2 = concedula2;
        this.fiscodigo = fiscodigo;
        this.fisnombre = fisnombre;
        this.fisfechanacimiento = fisfechanacimiento;
        this.fisgenero = fisgenero;
        this.fistelefono = fistelefono;
        this.fiscorreo = fiscorreo;
    }

    public String getConcedula2() {
        return concedula2;
    }

    public void setConcedula2(String concedula2) {
        this.concedula2 = concedula2;
    }

    public String getFiscodigo() {
        return fiscodigo;
    }

    public void setFiscodigo(String fiscodigo) {
        this.fiscodigo = fiscodigo;
    }

    public String getFisnombre() {
        return fisnombre;
    }

    public void setFisnombre(String fisnombre) {
        this.fisnombre = fisnombre;
    }

    public Date getFisfechanacimiento() {
        return fisfechanacimiento;
    }

    public void setFisfechanacimiento(Date fisfechanacimiento) {
        this.fisfechanacimiento = fisfechanacimiento;
    }

    public Character getFisgenero() {
        return fisgenero;
    }

    public void setFisgenero(Character fisgenero) {
        this.fisgenero = fisgenero;
    }

    public String getFistelefono() {
        return fistelefono;
    }

    public void setFistelefono(String fistelefono) {
        this.fistelefono = fistelefono;
    }

    public String getFiscelular() {
        return fiscelular;
    }

    public void setFiscelular(String fiscelular) {
        this.fiscelular = fiscelular;
    }

    public String getFiscorreo() {
        return fiscorreo;
    }

    public void setFiscorreo(String fiscorreo) {
        this.fiscorreo = fiscorreo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (concedula2 != null ? concedula2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fiscalizador)) {
            return false;
        }
        Fiscalizador other = (Fiscalizador) object;
        if ((this.concedula2 == null && other.concedula2 != null) || (this.concedula2 != null && !this.concedula2.equals(other.concedula2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "grupo5.Fiscalizador[ concedula2=" + concedula2 + " ]";
    }
    
}
