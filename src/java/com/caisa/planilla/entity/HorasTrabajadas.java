/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caisa.planilla.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NCN00973
 */
@Entity
@Table(name = "horas_trabajadas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HorasTrabajadas.findAll", query = "SELECT h FROM HorasTrabajadas h"),
    @NamedQuery(name = "HorasTrabajadas.findByIdJornadas", query = "SELECT h FROM HorasTrabajadas h WHERE h.idJornadas = :idJornadas"),
    @NamedQuery(name = "HorasTrabajadas.findByIdEmpleadoNumero", query = "SELECT h FROM HorasTrabajadas h WHERE h.idEmpleadoNumero = :idEmpleadoNumero"),
    @NamedQuery(name = "HorasTrabajadas.findByIdHorario", query = "SELECT h FROM HorasTrabajadas h WHERE h.idHorario = :idHorario"),
    @NamedQuery(name = "HorasTrabajadas.findByHorasTrabajadas", query = "SELECT h FROM HorasTrabajadas h WHERE h.horasTrabajadas = :horasTrabajadas"),
    @NamedQuery(name = "HorasTrabajadas.findByHorasXtrasTrabajadas", query = "SELECT h FROM HorasTrabajadas h WHERE h.horasXtrasTrabajadas = :horasXtrasTrabajadas"),
    @NamedQuery(name = "HorasTrabajadas.findByIncapacidades", query = "SELECT h FROM HorasTrabajadas h WHERE h.incapacidades = :incapacidades"),
    @NamedQuery(name = "HorasTrabajadas.findByHorasAusentes", query = "SELECT h FROM HorasTrabajadas h WHERE h.horasAusentes = :horasAusentes"),
    @NamedQuery(name = "HorasTrabajadas.findByHorasAjustadas", query = "SELECT h FROM HorasTrabajadas h WHERE h.horasAjustadas = :horasAjustadas"),
    @NamedQuery(name = "HorasTrabajadas.findByFechaInicio", query = "SELECT h FROM HorasTrabajadas h WHERE h.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "HorasTrabajadas.findByFechaFin", query = "SELECT h FROM HorasTrabajadas h WHERE h.fechaFin = :fechaFin"),
    @NamedQuery(name = "HorasTrabajadas.findByIdRenta", query = "SELECT h FROM HorasTrabajadas h WHERE h.idRenta = :idRenta")})
public class HorasTrabajadas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_jornadas")
    private Integer idJornadas;
    @Column(name = "id_empleado_numero")
    private Integer idEmpleadoNumero;
    @Column(name = "id_horario")
    private Integer idHorario;
    @Column(name = "horas_trabajadas")
    private Integer horasTrabajadas;
    @Column(name = "horas_xtras_trabajadas")
    private Integer horasXtrasTrabajadas;
    @Column(name = "incapacidades")
    private Integer incapacidades;
    @Column(name = "horas_ausentes")
    private Integer horasAusentes;
    @Column(name = "horas_ajustadas")
    private Integer horasAjustadas;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "id_renta")
    private Integer idRenta;

    public HorasTrabajadas() {
    }

    public HorasTrabajadas(Integer idJornadas) {
        this.idJornadas = idJornadas;
    }

    public Integer getIdJornadas() {
        return idJornadas;
    }

    public void setIdJornadas(Integer idJornadas) {
        this.idJornadas = idJornadas;
    }

    public Integer getIdEmpleadoNumero() {
        return idEmpleadoNumero;
    }

    public void setIdEmpleadoNumero(Integer idEmpleadoNumero) {
        this.idEmpleadoNumero = idEmpleadoNumero;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Integer getHorasXtrasTrabajadas() {
        return horasXtrasTrabajadas;
    }

    public void setHorasXtrasTrabajadas(Integer horasXtrasTrabajadas) {
        this.horasXtrasTrabajadas = horasXtrasTrabajadas;
    }

    public Integer getIncapacidades() {
        return incapacidades;
    }

    public void setIncapacidades(Integer incapacidades) {
        this.incapacidades = incapacidades;
    }

    public Integer getHorasAusentes() {
        return horasAusentes;
    }

    public void setHorasAusentes(Integer horasAusentes) {
        this.horasAusentes = horasAusentes;
    }

    public Integer getHorasAjustadas() {
        return horasAjustadas;
    }

    public void setHorasAjustadas(Integer horasAjustadas) {
        this.horasAjustadas = horasAjustadas;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getIdRenta() {
        return idRenta;
    }

    public void setIdRenta(Integer idRenta) {
        this.idRenta = idRenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJornadas != null ? idJornadas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HorasTrabajadas)) {
            return false;
        }
        HorasTrabajadas other = (HorasTrabajadas) object;
        if ((this.idJornadas == null && other.idJornadas != null) || (this.idJornadas != null && !this.idJornadas.equals(other.idJornadas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caisa.planilla.entity.HorasTrabajadas[ idJornadas=" + idJornadas + " ]";
    }
    
}
