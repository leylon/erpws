package com.ti.erpws.logistica.model.response;

import com.ti.erpws.logistica.entity.LogRequerimientoDet;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class LogRequerimientoDetVO {
    private Long idLogRequerimientoDet;
    private String empresa;
    private String unidadNegocio;
    private String areaOrigen;
    private int anio;
    private long nroRequerimiento;
    private int item;
    private String tipoCatalogo;
    private String codProdServ;
    private String desProdServ;
    private String tipo;
    private String marca;
    private BigDecimal cantidad;
    private String unimed;
    private LocalDateTime fecreg;
    private String usureg;
    private LocalDateTime fecmod;
    private String usumod;
    private String detalleProdser;
    private String desTipoCatalogo;
    private String areaDestino;
    private String desAreaDestino;
    private String uniNegocioDest;
    private String desUniNegocioDest;
    private Integer aprobado;
    private Integer compradoXCch;
    private Integer atendido;
    private String proveedor;
    private BigDecimal precio;
    private Character moneda;
    private String idCencos;
    private Long idLogCatalogo;
    private Long idLogRequerimiento;

    public LogRequerimientoDetVO() {
    }

    public LogRequerimientoDetVO(LogRequerimientoDet data) {

        this.idLogRequerimientoDet = data.getIdLogRequerimientoDet();
        this.empresa = data.getEmpresa();
        this.unidadNegocio = data.getUnidadNegocio();
        this.areaOrigen = data.getAreaOrigen();
        this.anio = data.getAnio();
        this.nroRequerimiento = data.getNroRequerimiento();
        this.item = data.getItem();
        this.tipoCatalogo = data.getTipoCatalogo();
        this.codProdServ = data.getCodProdServ();
        this.desProdServ = data.getDesProdServ();
        this.tipo = data.getTipo();
        this.marca = data.getMarca();
        this.cantidad = data.getCantidad();
        this.unimed = data.getUnimed();
        this.fecreg = data.getFecreg();
        this.usureg = data.getUsureg();
        this.fecmod = data.getFecmod();
        this.usumod = data.getUsumod();
        this.detalleProdser = data.getDetalleProdser();
        this.desTipoCatalogo = data.getDesTipoCatalogo();
        this.areaDestino = data.getAreaDestino();
        this.desAreaDestino = data.getDesAreaDestino();
        this.uniNegocioDest = data.getUniNegocioDest();
        this.desUniNegocioDest = data.getDesUniNegocioDest();
        this.aprobado = data.getAprobado();
        this.compradoXCch = data.getCompradoXCch();
        this.atendido = data.getAtendido();
        this.proveedor = data.getProveedor();
        this.precio = data.getPrecio();
        this.moneda = data.getMoneda();
        this.idCencos = data.getIdCencos();
        this.idLogCatalogo = data.getIdLogCatalogo().getIdLogCatalogo();
        this.idLogRequerimiento = data.getIdLogRequerimiento().getIdLogRequerimiento();

    }

    public Long getIdLogRequerimientoDet() {
        return idLogRequerimientoDet;
    }

    public void setIdLogRequerimientoDet(Long idLogRequerimientoDet) {
        this.idLogRequerimientoDet = idLogRequerimientoDet;
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

    public long getNroRequerimiento() {
        return nroRequerimiento;
    }

    public void setNroRequerimiento(long nroRequerimiento) {
        this.nroRequerimiento = nroRequerimiento;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getTipoCatalogo() {
        return tipoCatalogo;
    }

    public void setTipoCatalogo(String tipoCatalogo) {
        this.tipoCatalogo = tipoCatalogo;
    }

    public String getCodProdServ() {
        return codProdServ;
    }

    public void setCodProdServ(String codProdServ) {
        this.codProdServ = codProdServ;
    }

    public String getDesProdServ() {
        return desProdServ;
    }

    public void setDesProdServ(String desProdServ) {
        this.desProdServ = desProdServ;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnimed() {
        return unimed;
    }

    public void setUnimed(String unimed) {
        this.unimed = unimed;
    }

    public LocalDateTime getFecreg() {
        return fecreg;
    }

    public void setFecreg(LocalDateTime fecreg) {
        this.fecreg = fecreg;
    }

    public String getUsureg() {
        return usureg;
    }

    public void setUsureg(String usureg) {
        this.usureg = usureg;
    }

    public LocalDateTime getFecmod() {
        return fecmod;
    }

    public void setFecmod(LocalDateTime fecmod) {
        this.fecmod = fecmod;
    }

    public String getUsumod() {
        return usumod;
    }

    public void setUsumod(String usumod) {
        this.usumod = usumod;
    }

    public String getDetalleProdser() {
        return detalleProdser;
    }

    public void setDetalleProdser(String detalleProdser) {
        this.detalleProdser = detalleProdser;
    }

    public String getDesTipoCatalogo() {
        return desTipoCatalogo;
    }

    public void setDesTipoCatalogo(String desTipoCatalogo) {
        this.desTipoCatalogo = desTipoCatalogo;
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

    public String getUniNegocioDest() {
        return uniNegocioDest;
    }

    public void setUniNegocioDest(String uniNegocioDest) {
        this.uniNegocioDest = uniNegocioDest;
    }

    public String getDesUniNegocioDest() {
        return desUniNegocioDest;
    }

    public void setDesUniNegocioDest(String desUniNegocioDest) {
        this.desUniNegocioDest = desUniNegocioDest;
    }

    public Integer getAprobado() {
        return aprobado;
    }

    public void setAprobado(Integer aprobado) {
        this.aprobado = aprobado;
    }

    public Integer getCompradoXCch() {
        return compradoXCch;
    }

    public void setCompradoXCch(Integer compradoXCch) {
        this.compradoXCch = compradoXCch;
    }

    public Integer getAtendido() {
        return atendido;
    }

    public void setAtendido(Integer atendido) {
        this.atendido = atendido;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Character getMoneda() {
        return moneda;
    }

    public void setMoneda(Character moneda) {
        this.moneda = moneda;
    }

    public String getIdCencos() {
        return idCencos;
    }

    public void setIdCencos(String idCencos) {
        this.idCencos = idCencos;
    }

    public Long getIdLogCatalogo() {
        return idLogCatalogo;
    }

    public void setIdLogCatalogo(Long idLogCatalogo) {
        this.idLogCatalogo = idLogCatalogo;
    }

    public Long getIdLogRequerimiento() {
        return idLogRequerimiento;
    }

    public void setIdLogRequerimiento(Long idLogRequerimiento) {
        this.idLogRequerimiento = idLogRequerimiento;
    }
}
