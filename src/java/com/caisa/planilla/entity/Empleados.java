/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caisa.planilla.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author NCN00973
 */
@Entity
@Table(name = "empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findById", query = "SELECT e FROM Empleados e WHERE e.empleadosPK.id = :id"),
    @NamedQuery(name = "Empleados.findByIdEmpleado", query = "SELECT e FROM Empleados e WHERE e.empleadosPK.idEmpleado = :idEmpleado"),
    @NamedQuery(name = "Empleados.findByNombre", query = "SELECT e FROM Empleados e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleados.findByApellido", query = "SELECT e FROM Empleados e WHERE e.apellido = :apellido"),
    @NamedQuery(name = "Empleados.findByCedula", query = "SELECT e FROM Empleados e WHERE e.cedula = :cedula"),
    @NamedQuery(name = "Empleados.findByFechanacimiento", query = "SELECT e FROM Empleados e WHERE e.fechanacimiento = :fechanacimiento"),
    @NamedQuery(name = "Empleados.findBySegurosocial", query = "SELECT e FROM Empleados e WHERE e.segurosocial = :segurosocial"),
    @NamedQuery(name = "Empleados.findByTipodesangre", query = "SELECT e FROM Empleados e WHERE e.tipodesangre = :tipodesangre"),
    @NamedQuery(name = "Empleados.findByIdEstadoCivil", query = "SELECT e FROM Empleados e WHERE e.idEstadoCivil = :idEstadoCivil"),
    @NamedQuery(name = "Empleados.findByIdNacionalidad", query = "SELECT e FROM Empleados e WHERE e.idNacionalidad = :idNacionalidad"),
    @NamedQuery(name = "Empleados.findBySindicato", query = "SELECT e FROM Empleados e WHERE e.sindicato = :sindicato"),
    @NamedQuery(name = "Empleados.findByCarnetsalud", query = "SELECT e FROM Empleados e WHERE e.carnetsalud = :carnetsalud"),
    @NamedQuery(name = "Empleados.findByFechavencimientocarnet", query = "SELECT e FROM Empleados e WHERE e.fechavencimientocarnet = :fechavencimientocarnet"),
    @NamedQuery(name = "Empleados.findByNroCuenta", query = "SELECT e FROM Empleados e WHERE e.nroCuenta = :nroCuenta"),
    @NamedQuery(name = "Empleados.findByTipoCuenta", query = "SELECT e FROM Empleados e WHERE e.tipoCuenta = :tipoCuenta"),
    @NamedQuery(name = "Empleados.findByBanco", query = "SELECT e FROM Empleados e WHERE e.banco = :banco")})
public class Empleados implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmpleadosPK empleadosPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Cedula")
    private String cedula;
    @Column(name = "Fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Column(name = "Seguro_social")
    private Integer segurosocial;
    @Column(name = "Tipo_de_sangre")
    private Integer tipodesangre;
    @Column(name = "id_estado_civil")
    private Integer idEstadoCivil;
    @Column(name = "id_nacionalidad")
    private Integer idNacionalidad;
    @Column(name = "Sindicato")
    private Integer sindicato;
    @Column(name = "Carnet_salud")
    private Integer carnetsalud;
    @Column(name = "Fecha_vencimiento_carnet")
    @Temporal(TemporalType.DATE)
    private Date fechavencimientocarnet;
    @Size(max = 40)
    @Column(name = "nro_cuenta")
    private String nroCuenta;
    @Column(name = "tipo_cuenta")
    private Integer tipoCuenta;
    @Size(max = 80)
    @Column(name = "banco")
    private String banco;
    @JoinColumn(name = "id_sexo", referencedColumnName = "id_sexo")
    @ManyToOne
    private Sexos idSexo;
    @JoinColumn(name = "id_Estado", referencedColumnName = "id")
    @ManyToOne
    private Estados idEstado;

    public Empleados() {
    }

    public Empleados(EmpleadosPK empleadosPK) {
        this.empleadosPK = empleadosPK;
    }

    public Empleados(EmpleadosPK empleadosPK, String nombre, String apellido, String cedula) {
        this.empleadosPK = empleadosPK;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public Empleados(int id, String idEmpleado) {
        this.empleadosPK = new EmpleadosPK(id, idEmpleado);
    }

    public EmpleadosPK getEmpleadosPK() {
        return empleadosPK;
    }

    public void setEmpleadosPK(EmpleadosPK empleadosPK) {
        this.empleadosPK = empleadosPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Integer getSegurosocial() {
        return segurosocial;
    }

    public void setSegurosocial(Integer segurosocial) {
        this.segurosocial = segurosocial;
    }

    public Integer getTipodesangre() {
        return tipodesangre;
    }

    public void setTipodesangre(Integer tipodesangre) {
        this.tipodesangre = tipodesangre;
    }

    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public Integer getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public Integer getSindicato() {
        return sindicato;
    }

    public void setSindicato(Integer sindicato) {
        this.sindicato = sindicato;
    }

    public Integer getCarnetsalud() {
        return carnetsalud;
    }

    public void setCarnetsalud(Integer carnetsalud) {
        this.carnetsalud = carnetsalud;
    }

    public Date getFechavencimientocarnet() {
        return fechavencimientocarnet;
    }

    public void setFechavencimientocarnet(Date fechavencimientocarnet) {
        this.fechavencimientocarnet = fechavencimientocarnet;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Integer getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(Integer tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Sexos getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Sexos idSexo) {
        this.idSexo = idSexo;
    }

    public Estados getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estados idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empleadosPK != null ? empleadosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.empleadosPK == null && other.empleadosPK != null) || (this.empleadosPK != null && !this.empleadosPK.equals(other.empleadosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caisa.planilla.entity.Empleados[ empleadosPK=" + empleadosPK + " ]";
    }
    
}
