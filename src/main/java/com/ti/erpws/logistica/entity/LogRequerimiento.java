package com.ti.erpws.logistica.entity;

import com.ti.erpws.logistica.model.LogRequerimientoVO;
import com.ti.erpws.publica.entity.PubEmpresas;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "log_requerimiento")
@NamedQueries({
        @NamedQuery(name = "LogRequerimiento.findAll", query = "SELECT l FROM LogRequerimiento l")
})
public class LogRequerimiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_log_requerimiento")
    private Long idLogRequerimiento;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 2)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 20)
    @Column(name = "unidad_negocio")
    private String unidadNegocio;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 20)
    @Column(name = "area_origen")
    private String areaOrigen;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "anio")
    private int anio;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "nro_requerimiento")
    private int nroRequerimiento;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "fecha_req")

    private LocalDateTime fechaReq;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "mes")
    private int mes;
    //@Size(max = 250)
    @Column(name = "descripcion")
    private String descripcion;
    //@Size(max = 120)
    @Column(name = "des_area_origen")
    private String desAreaOrigen;
    //@Size(max = 120)
    @Column(name = "des_unidad_negocio")
    private String desUnidadNegocio;
    //@Size(max = 15)
    @Column(name = "usuario")
    private String usuario;
    //@Size(max = 100)
    @Column(name = "nom_usuario")
    private String nomUsuario;
    //@Size(max = 2)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 1)
    @Column(name = "tipo1")
    private String tipo1;
    //@Size(max = 250)
    @Column(name = "uso")
    private String uso;
    //@Size(max = 20)
    @Column(name = "area_destino")
    private String areaDestino;
    //@Size(max = 120)
    @Column(name = "des_area_destino")
    private String desAreaDestino;
    //@Size(max = 20)
    @Column(name = "uni_negocio_destino")
    private String uniNegocioDestino;
    //@Size(max = 120)
    @Column(name = "des_uni_negocio_destino")
    private String desUniNegocioDestino;
    @Column(name = "fecha_reg")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaReg;
    @Column(name = "fecha_mod")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaMod;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "vb_aprobacion")
    private short vbAprobacion;
    @Column(name = "vb_fecha")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime vbFecha;
    //@Size(max = 25)
    @Column(name = "vb_usuario")
    private String vbUsuario;
    //@Size(max = 150)
    @Column(name = "vb_nom_usuario")
    private String vbNomUsuario;
    //@Size(max = 100)
    @Column(name = "vb_notas")
    private String vbNotas;
    //@Size(max = 2)
    @Column(name = "estado")
    private String estado;
    //@Size(max = 10)
    @Column(name = "vb_cod_trab")
    private String vbCodTrab;
    @Column(name = "multidestinos")
    private Short multidestinos;
    @Column(name = "vb_gerente")
    private Integer vbGerente;
    @Column(name = "vb_gte_fecha")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime vbGteFecha;
    //@Size(max = 20)
    @Column(name = "vb_gte_usuario")
    private String vbGteUsuario;
    @Column(name = "id_correo")
    private Long idCorreo;
    //@Size(max = 30)
    @Column(name = "id_cencos")
    private String idCencos;
    @Column(name = "flag_atendido")
    private Integer flagAtendido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLogRequerimiento")
    private List<LogRequerimientoDet> logRequerimientoDetList;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "idLogRequerimiento")
    //private List<LogRequerimientoDetProg> logRequerimientoDetProgList;
    @JoinColumn(name = "id_pub_empresas", referencedColumnName = "id_pub_empresas")
    @ManyToOne(optional = false)
    private PubEmpresas idPubEmpresas;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "idLogRequerimiento")
    //private List<LogRequerimientoAdj> logRequerimientoAdjList;*/

    public LogRequerimiento() {
    }

    public LogRequerimiento(Long idLogRequerimiento) {
        this.idLogRequerimiento = idLogRequerimiento;
    }

    public LogRequerimiento(LogRequerimientoVO data) {

        this.idLogRequerimiento = data.getIdLogRequerimiento();
        this.empresa = data.getEmpresa();
        this.unidadNegocio = data.getUnidadNegocio();
        this.areaOrigen = data.getAreaOrigen();
        this.anio = data.getAnio();
        this.nroRequerimiento = data.getNroRequerimiento();
        this.fechaReq = data.getFechaReq();
        this.mes = data.getMes();
        this.descripcion = data.getDescripcion();
        this.desAreaOrigen = data.getDesAreaOrigen();
        this.desUnidadNegocio = data.getDesUnidadNegocio();
        this.usuario = data.getUsuario();
        this.nomUsuario = data.getNomUsuario();
        this.tipo = data.getTipo();
        this.tipo1 = data.getTipo1();
        this.uso = data.getUso();
        this.areaDestino = data.getAreaDestino();
        this.desAreaDestino = data.getDesAreaDestino();
        this.uniNegocioDestino = data.getUniNegocioDestino();
        this.desUniNegocioDestino = data.getDesUniNegocioDestino();
        this.fechaReg = data.getFechaReg();
        this.fechaMod = data.getFechaMod();
        this.vbAprobacion = data.getVbAprobacion();
        this.vbFecha = data.getVbFecha();
        this.vbUsuario = data.getVbUsuario();
        this.vbNomUsuario = data.getVbNomUsuario();
        this.vbNotas = data.getVbNotas();
        this.estado = data.getEstado();
        this.vbCodTrab = data.getVbCodTrab();
        this.multidestinos = data.getMultidestinos();
        this.vbGerente = data.getVbGerente();
        this.vbGteFecha = data.getVbGteFecha();
        this.vbGteUsuario = data.getVbGteUsuario();
        this.idCorreo = data.getIdCorreo();
        this.idCencos = data.getIdCencos();
        this.flagAtendido = data.getFlagAtendido();
        this.idPubEmpresas = new PubEmpresas(data.getIdPubEmpresas());
    }

    public Long getIdLogRequerimiento() {
        return idLogRequerimiento;
    }

    public void setIdLogRequerimiento(Long idLogRequerimiento) {
        this.idLogRequerimiento = idLogRequerimiento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUnidadNegocio() {
        return unidadNegocio;
    }

    public void setUnidadNegocio(String unidadNegocio) {
        this.unidadNegocio = unidadNegocio;
    }

    public String getAreaOrigen() {
        return areaOrigen;
    }

    public void setAreaOrigen(String areaOrigen) {
        this.areaOrigen = areaOrigen;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNroRequerimiento() {
        return nroRequerimiento;
    }

    public void setNroRequerimiento(int nroRequerimiento) {
        this.nroRequerimiento = nroRequerimiento;
    }

    public LocalDateTime getFechaReq() {
        return fechaReq;
    }

    public void setFechaReq(LocalDateTime fechaReq) {
        this.fechaReq = fechaReq;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDesAreaOrigen() {
        return desAreaOrigen;
    }

    public void setDesAreaOrigen(String desAreaOrigen) {
        this.desAreaOrigen = desAreaOrigen;
    }

    public String getDesUnidadNegocio() {
        return desUnidadNegocio;
    }

    public void setDesUnidadNegocio(String desUnidadNegocio) {
        this.desUnidadNegocio = desUnidadNegocio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getAreaDestino() {
        return areaDestino;
    }

    public void setAreaDestino(String areaDestino) {
        this.areaDestino = areaDestino;
    }

    public String getDesAreaDestino() {
        return desAreaDestino;
    }

    public void setDesAreaDestino(String desAreaDestino) {
        this.desAreaDestino = desAreaDestino;
    }

    public String getUniNegocioDestino() {
        return uniNegocioDestino;
    }

    public void setUniNegocioDestino(String uniNegocioDestino) {
        this.uniNegocioDestino = uniNegocioDestino;
    }

    public String getDesUniNegocioDestino() {
        return desUniNegocioDestino;
    }

    public void setDesUniNegocioDestino(String desUniNegocioDestino) {
        this.desUniNegocioDestino = desUniNegocioDestino;
    }

    public LocalDateTime getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(LocalDateTime fechaReg) {
        this.fechaReg = fechaReg;
    }

    public LocalDateTime getFechaMod() {
        return fechaMod;
    }

    public void setFechaMod(LocalDateTime fechaMod) {
        this.fechaMod = fechaMod;
    }

    public short getVbAprobacion() {
        return vbAprobacion;
    }

    public void setVbAprobacion(short vbAprobacion) {
        this.vbAprobacion = vbAprobacion;
    }

    public LocalDateTime getVbFecha() {
        return vbFecha;
    }

    public void setVbFecha(LocalDateTime vbFecha) {
        this.vbFecha = vbFecha;
    }

    public String getVbUsuario() {
        return vbUsuario;
    }

    public void setVbUsuario(String vbUsuario) {
        this.vbUsuario = vbUsuario;
    }

    public String getVbNomUsuario() {
        return vbNomUsuario;
    }

    public void setVbNomUsuario(String vbNomUsuario) {
        this.vbNomUsuario = vbNomUsuario;
    }

    public String getVbNotas() {
        return vbNotas;
    }

    public void setVbNotas(String vbNotas) {
        this.vbNotas = vbNotas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getVbCodTrab() {
        return vbCodTrab;
    }

    public void setVbCodTrab(String vbCodTrab) {
        this.vbCodTrab = vbCodTrab;
    }

    public Short getMultidestinos() {
        return multidestinos;
    }

    public void setMultidestinos(Short multidestinos) {
        this.multidestinos = multidestinos;
    }

    public Integer getVbGerente() {
        return vbGerente;
    }

    public void setVbGerente(Integer vbGerente) {
        this.vbGerente = vbGerente;
    }

    public LocalDateTime getVbGteFecha() {
        return vbGteFecha;
    }

    public void setVbGteFecha(LocalDateTime vbGteFecha) {
        this.vbGteFecha = vbGteFecha;
    }

    public String getVbGteUsuario() {
        return vbGteUsuario;
    }

    public void setVbGteUsuario(String vbGteUsuario) {
        this.vbGteUsuario = vbGteUsuario;
    }

    public Long getIdCorreo() {
        return idCorreo;
    }

    public void setIdCorreo(Long idCorreo) {
        this.idCorreo = idCorreo;
    }

    public String getIdCencos() {
        return idCencos;
    }

    public void setIdCencos(String idCencos) {
        this.idCencos = idCencos;
    }

    public Integer getFlagAtendido() {
        return flagAtendido;
    }

    public void setFlagAtendido(Integer flagAtendido) {
        this.flagAtendido = flagAtendido;
    }

    public List<LogRequerimientoDet> getLogRequerimientoDetList() {
        return logRequerimientoDetList;
    }

    public void setLogRequerimientoDetList(List<LogRequerimientoDet> logRequerimientoDetList) {
        this.logRequerimientoDetList = logRequerimientoDetList;
    }

    public PubEmpresas getIdPubEmpresas() {
        return idPubEmpresas;
    }

    public void setIdPubEmpresas(PubEmpresas idPubEmpresas) {
        this.idPubEmpresas = idPubEmpresas;
    }
}
