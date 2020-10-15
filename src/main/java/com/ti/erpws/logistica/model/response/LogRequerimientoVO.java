package com.ti.erpws.logistica.model.response;

import com.ti.erpws.logistica.entity.LogRequerimiento;
import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;

public class LogRequerimientoVO {
    private Long idLogRequerimiento;
    private String empresa;
    private String unidadNegocio;
    private String areaOrigen;
    private int anio;
    private int nroRequerimiento;
    private LocalDateTime fechaReq;
    private int mes;
    private String descripcion;
    private String desAreaOrigen;
    private String desUnidadNegocio;
    private String usuario;
    private String nomUsuario;
    private String tipo;
    private String tipo1;
    private String uso;
    private String areaDestino;
    private String desAreaDestino;
    private String uniNegocioDestino;
    private String desUniNegocioDestino;
    private LocalDateTime fechaReg;
    private LocalDateTime fechaMod;
    private short vbAprobacion;
    private LocalDateTime vbFecha;
    private String vbUsuario;
    private String vbNomUsuario;
    private String vbNotas;
    private String estado;
    private String vbCodTrab;
    private Short multidestinos;
    private Integer vbGerente;
    private LocalDateTime vbGteFecha;
    private String vbGteUsuario;
    private Long idCorreo;
    private String idCencos;
    private Integer flagAtendido;
    private Long idPubEmpresas;

    public LogRequerimientoVO(LogRequerimiento data) {

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
        //this.idPubEmpresas = data.getIdPubEmpresas().getIdPubEmpresas();

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

    public Long getIdPubEmpresas() {
        return idPubEmpresas;
    }

    public void setIdPubEmpresas(Long idPubEmpresas) {
        this.idPubEmpresas = idPubEmpresas;
    }
}
