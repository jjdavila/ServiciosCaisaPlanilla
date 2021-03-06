/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caisa.planilla.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author NCN00973
 */
@Entity
@Table(name = "cargos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cargos.findAll", query = "SELECT c FROM Cargos c"),
    @NamedQuery(name = "Cargos.findById", query = "SELECT c FROM Cargos c WHERE c.id = :id"),
    @NamedQuery(name = "Cargos.findByNombre", query = "SELECT c FROM Cargos c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Cargos.findByDescripcion", query = "SELECT c FROM Cargos c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Cargos.findByUsuarioidcreo", query = "SELECT c FROM Cargos c WHERE c.usuarioidcreo = :usuarioidcreo"),
    @NamedQuery(name = "Cargos.findByFechaCreacion", query = "SELECT c FROM Cargos c WHERE c.fechaCreacion = :fechaCreacion")})
public class Cargos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
      @JsonIgnore
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 500)
      @JsonIgnore
    @Column(name = "Descripcion")
    private String descripcion;
      @JsonIgnore
    @Column(name = "Usuario_id_creo")
    private Integer usuarioidcreo;
        @JsonIgnore
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
          @JsonIgnore
    @OneToMany(mappedBy = "idCargo")
    private Collection<Usuarios> usuariosCollection;

    public Cargos() {
    }

    public Cargos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getUsuarioidcreo() {
        return usuarioidcreo;
    }

    public void setUsuarioidcreo(Integer usuarioidcreo) {
        this.usuarioidcreo = usuarioidcreo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @XmlTransient
    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargos)) {
            return false;
        }
        Cargos other = (Cargos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caisa.planilla.entity.Cargos[ id=" + id + " ]";
    }
    
}
