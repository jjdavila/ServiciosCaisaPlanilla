/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caisa.planilla.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NCN00973
 */
@Entity
@Table(name = "sexos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sexos.findAll", query = "SELECT s FROM Sexos s"),
    @NamedQuery(name = "Sexos.findByIdSexo", query = "SELECT s FROM Sexos s WHERE s.idSexo = :idSexo"),
    @NamedQuery(name = "Sexos.findByDescripcion", query = "SELECT s FROM Sexos s WHERE s.descripcion = :descripcion")})
public class Sexos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_sexo")
    private Integer idSexo;
    @Size(max = 20)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idSexo")
    private Collection<Empleados> empleadosCollection;

    public Sexos() {
    }

    public Sexos(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Empleados> getEmpleadosCollection() {
        return empleadosCollection;
    }

    public void setEmpleadosCollection(Collection<Empleados> empleadosCollection) {
        this.empleadosCollection = empleadosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSexo != null ? idSexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sexos)) {
            return false;
        }
        Sexos other = (Sexos) object;
        if ((this.idSexo == null && other.idSexo != null) || (this.idSexo != null && !this.idSexo.equals(other.idSexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caisa.planilla.entity.Sexos[ idSexo=" + idSexo + " ]";
    }
    
}
