package com.ti.erpws.logistica.model.response;

import com.ti.erpws.logistica.entity.LogCatalogo;

import java.time.LocalDateTime;

public class LogCatalogoVO {
    private Long idLogCatalogo;
    private String empresa;
    private String tipoCatalogo;
    private String codArticulo;
    private String descripcion;
    private String unimed;
    private String uso;
    private String marca;
    private String modelo;
    private LocalDateTime fechaReg;
    private LocalDateTime fechaMod;
    private String usuaReg;
    private String usuaMod;
    private Integer estado;
    private String proveedorFavor;
    private String codConcepto;
    private String codFamilia;
    private Integer tipoArticulo;
    private Long idCosFamiliaDetConceptos;
    private Long idLogTipoCatalogo;
    private Long idPubEmpresas;

    public LogCatalogoVO() {
    }

    public LogCatalogoVO(LogCatalogo data) {

        this.idLogCatalogo = data.getIdLogCatalogo();
        this.empresa = data.getEmpresa();
        this.tipoCatalogo = data.getTipoCatalogo();
        this.codArticulo = data.getCodArticulo();
        this.descripcion = data.getDescripcion();
        this.unimed = data.getUnimed();
        this.uso = data.getUso();
        this.marca = data.getMarca();
        this.modelo = data.getModelo();
        this.fechaReg = data.getFechaReg();
        this.fechaMod = data.getFechaMod();
        this.usuaReg = data.getUsuaReg();
        this.usuaMod = data.getUsuaMod();
        this.estado = data.getEstado();
        this.proveedorFavor = data.getProveedorFavor();
        this.codConcepto = data.getCodConcepto();
        this.codFamilia = data.getCodFamilia();
        this.tipoArticulo = data.getTipoArticulo();
        /*this.idCosFamiliaDetConceptos = data.getIdCosFamiliaDetConceptos().getIdCosFamiliaDetConceptos();
        this.idLogTipoCatalogo = data.getIdLogTipoCatalogo().getIdLogTipoCatalogo();
        this.idPubEmpresas = data.getIdPubEmpresas().getIdPubEmpresas();*/
    }

    public Long getIdLogCatalogo() {
        return idLogCatalogo;
    }

    public void setIdLogCatalogo(Long idLogCatalogo) {
        this.idLogCatalogo = idLogCatalogo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipoCatalogo() {
        return tipoCatalogo;
    }

    public void setTipoCatalogo(String tipoCatalogo) {
        this.tipoCatalogo = tipoCatalogo;
    }

    public String getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnimed() {
        return unimed;
    }

    public void setUnimed(String unimed) {
        this.unimed = unimed;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public String getUsuaReg() {
        return usuaReg;
    }

    public void setUsuaReg(String usuaReg) {
        this.usuaReg = usuaReg;
    }

    public String getUsuaMod() {
        return usuaMod;
    }

    public void setUsuaMod(String usuaMod) {
        this.usuaMod = usuaMod;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getProveedorFavor() {
        return proveedorFavor;
    }

    public void setProveedorFavor(String proveedorFavor) {
        this.proveedorFavor = proveedorFavor;
    }

    public String getCodConcepto() {
        return codConcepto;
    }

    public void setCodConcepto(String codConcepto) {
        this.codConcepto = codConcepto;
    }

    public String getCodFamilia() {
        return codFamilia;
    }

    public void setCodFamilia(String codFamilia) {
        this.codFamilia = codFamilia;
    }

    public Integer getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(Integer tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public Long getIdCosFamiliaDetConceptos() {
        return idCosFamiliaDetConceptos;
    }

    public void setIdCosFamiliaDetConceptos(Long idCosFamiliaDetConceptos) {
        this.idCosFamiliaDetConceptos = idCosFamiliaDetConceptos;
    }

    public Long getIdLogTipoCatalogo() {
        return idLogTipoCatalogo;
    }

    public void setIdLogTipoCatalogo(Long idLogTipoCatalogo) {
        this.idLogTipoCatalogo = idLogTipoCatalogo;
    }

    public Long getIdPubEmpresas() {
        return idPubEmpresas;
    }

    public void setIdPubEmpresas(Long idPubEmpresas) {
        this.idPubEmpresas = idPubEmpresas;
    }
}
