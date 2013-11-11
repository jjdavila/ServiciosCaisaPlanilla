/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caisa.planilla.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NCN00973
 */
@Entity
@Table(name = "formulas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formulas.findAll", query = "SELECT f FROM Formulas f"),
    @NamedQuery(name = "Formulas.findByIdFormula", query = "SELECT f FROM Formulas f WHERE f.idFormula = :idFormula"),
    @NamedQuery(name = "Formulas.findByNombreFormula", query = "SELECT f FROM Formulas f WHERE f.nombreFormula = :nombreFormula"),
    @NamedQuery(name = "Formulas.findByDescripcion", query = "SELECT f FROM Formulas f WHERE f.descripcion = :descripcion"),
    @NamedQuery(name = "Formulas.findByDescripcionformula", query = "SELECT f FROM Formulas f WHERE f.descripcionformula = :descripcionformula")})
public class Formulas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_formula")
    private Integer idFormula;
    @Size(max = 200)
    @Column(name = "nombre_formula")
    private String nombreFormula;
    @Size(max = 400)
    @Column(name = "Descripcion")
    private String descripcion;
    @Size(max = 200)
    @Column(name = "Descripcion_formula")
    private String descripcionformula;

    public Formulas() {
    }

    public Formulas(Integer idFormula) {
        this.idFormula = idFormula;
    }

    public Integer getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(Integer idFormula) {
        this.idFormula = idFormula;
    }

    public String getNombreFormula() {
        return nombreFormula;
    }

    public void setNombreFormula(String nombreFormula) {
        this.nombreFormula = nombreFormula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcionformula() {
        return descripcionformula;
    }

    public void setDescripcionformula(String descripcionformula) {
        this.descripcionformula = descripcionformula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormula != null ? idFormula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formulas)) {
            return false;
        }
        Formulas other = (Formulas) object;
        if ((this.idFormula == null && other.idFormula != null) || (this.idFormula != null && !this.idFormula.equals(other.idFormula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caisa.planilla.entity.Formulas[ idFormula=" + idFormula + " ]";
    }
    
}
