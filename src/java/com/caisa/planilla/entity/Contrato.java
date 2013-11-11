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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NCN00973
 */
@Entity
@Table(name = "contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c"),
    @NamedQuery(name = "Contrato.findByIdContrato", query = "SELECT c FROM Contrato c WHERE c.idContrato = :idContrato"),
    @NamedQuery(name = "Contrato.findByNumeroEmpleado", query = "SELECT c FROM Contrato c WHERE c.numeroEmpleado = :numeroEmpleado"),
    @NamedQuery(name = "Contrato.findByFechainicio", query = "SELECT c FROM Contrato c WHERE c.fechainicio = :fechainicio"),
    @NamedQuery(name = "Contrato.findByFechafinal", query = "SELECT c FROM Contrato c WHERE c.fechafinal = :fechafinal"),
    @NamedQuery(name = "Contrato.findByIdEstado", query = "SELECT c FROM Contrato c WHERE c.idEstado = :idEstado"),
    @NamedQuery(name = "Contrato.findByIdTurno", query = "SELECT c FROM Contrato c WHERE c.idTurno = :idTurno"),
    @NamedQuery(name = "Contrato.findByIdFrmPago", query = "SELECT c FROM Contrato c WHERE c.idFrmPago = :idFrmPago"),
    @NamedQuery(name = "Contrato.findBySalarioPorHora", query = "SELECT c FROM Contrato c WHERE c.salarioPorHora = :salarioPorHora"),
    @NamedQuery(name = "Contrato.findBySalarioBruto", query = "SELECT c FROM Contrato c WHERE c.salarioBruto = :salarioBruto"),
    @NamedQuery(name = "Contrato.findByCodFre", query = "SELECT c FROM Contrato c WHERE c.codFre = :codFre"),
    @NamedQuery(name = "Contrato.findByCodPer", query = "SELECT c FROM Contrato c WHERE c.codPer = :codPer"),
    @NamedQuery(name = "Contrato.findByCRenta", query = "SELECT c FROM Contrato c WHERE c.cRenta = :cRenta"),
    @NamedQuery(name = "Contrato.findByFRenta", query = "SELECT c FROM Contrato c WHERE c.fRenta = :fRenta"),
    @NamedQuery(name = "Contrato.findByNRenta", query = "SELECT c FROM Contrato c WHERE c.nRenta = :nRenta"),
    @NamedQuery(name = "Contrato.findByGrep", query = "SELECT c FROM Contrato c WHERE c.grep = :grep"),
    @NamedQuery(name = "Contrato.findByDgi", query = "SELECT c FROM Contrato c WHERE c.dgi = :dgi"),
    @NamedQuery(name = "Contrato.findByHorasBase", query = "SELECT c FROM Contrato c WHERE c.horasBase = :horasBase"),
    @NamedQuery(name = "Contrato.findByIdCargo", query = "SELECT c FROM Contrato c WHERE c.idCargo = :idCargo"),
    @NamedQuery(name = "Contrato.findByIdEmpresa", query = "SELECT c FROM Contrato c WHERE c.idEmpresa = :idEmpresa"),
    @NamedQuery(name = "Contrato.findByIdFinca", query = "SELECT c FROM Contrato c WHERE c.idFinca = :idFinca")})
public class Contrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_contrato")
    private Integer idContrato;
    @Size(max = 8)
    @Column(name = "numero_empleado")
    private String numeroEmpleado;
    @Column(name = "Fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "Fecha_final")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinal;
    @Column(name = "id_estado")
    private Integer idEstado;
    @Column(name = "id_turno")
    private Integer idTurno;
    @Column(name = "id_frm_pago")
    private Integer idFrmPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "salario_por_hora")
    private Double salarioPorHora;
    @Column(name = "salario_bruto")
    private Double salarioBruto;
    @Size(max = 20)
    @Column(name = "cod_fre")
    private String codFre;
    @Size(max = 20)
    @Column(name = "cod_per")
    private String codPer;
    @Size(max = 20)
    @Column(name = "c_renta")
    private String cRenta;
    @Column(name = "f_renta")
    private Integer fRenta;
    @Column(name = "n_renta")
    private Integer nRenta;
    @Size(max = 20)
    @Column(name = "grep")
    private String grep;
    @Size(max = 20)
    @Column(name = "dgi")
    private String dgi;
    @Column(name = "horas_base")
    private Integer horasBase;
    @Column(name = "id_cargo")
    private Integer idCargo;
    @Column(name = "id_empresa")
    private Integer idEmpresa;
    @Column(name = "id_finca")
    private Integer idFinca;

    public Contrato() {
    }

    public Contrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    public Integer getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Integer getIdFrmPago() {
        return idFrmPago;
    }

    public void setIdFrmPago(Integer idFrmPago) {
        this.idFrmPago = idFrmPago;
    }

    public Double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(Double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public String getCodFre() {
        return codFre;
    }

    public void setCodFre(String codFre) {
        this.codFre = codFre;
    }

    public String getCodPer() {
        return codPer;
    }

    public void setCodPer(String codPer) {
        this.codPer = codPer;
    }

    public String getCRenta() {
        return cRenta;
    }

    public void setCRenta(String cRenta) {
        this.cRenta = cRenta;
    }

    public Integer getFRenta() {
        return fRenta;
    }

    public void setFRenta(Integer fRenta) {
        this.fRenta = fRenta;
    }

    public Integer getNRenta() {
        return nRenta;
    }

    public void setNRenta(Integer nRenta) {
        this.nRenta = nRenta;
    }

    public String getGrep() {
        return grep;
    }

    public void setGrep(String grep) {
        this.grep = grep;
    }

    public String getDgi() {
        return dgi;
    }

    public void setDgi(String dgi) {
        this.dgi = dgi;
    }

    public Integer getHorasBase() {
        return horasBase;
    }

    public void setHorasBase(Integer horasBase) {
        this.horasBase = horasBase;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Integer idFinca) {
        this.idFinca = idFinca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContrato != null ? idContrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.idContrato == null && other.idContrato != null) || (this.idContrato != null && !this.idContrato.equals(other.idContrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caisa.planilla.entity.Contrato[ idContrato=" + idContrato + " ]";
    }
    
}
