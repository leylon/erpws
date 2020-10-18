package com.ti.erpws.logistica.model;

import com.ti.erpws.logistica.entity.LogOrdenDet;

import java.math.BigDecimal;
import java.util.Date;

public class LogOrdenDetVO {
    private Long idLogOrdenesDet;
    private String empresa;
    private String unidOperativa;
    private int anio;
    private String tipo;
    private long nroOrden;
    private int item;
    private long nroRequerimiento;
    private int idCotizacion;
    private String tipoCatalogo;
    private String codProdServ;
    private String desProdServ;
    private BigDecimal cantidad;
    private String unimed;
    private String moneda;
    private BigDecimal valorVenta;
    private BigDecimal totalValor;
    private String observaciones;
    private Integer itemReqdet;
    private Integer idProgramacion;
    private Date fechaEntrega;
    private BigDecimal cantidadFacturada;
    private BigDecimal saldoPendiente;
    private BigDecimal cantidadXRecibir;
    private BigDecimal cantidadRecibida;
    private Integer codPlanta;
    private Integer tipoCosto;
    private String codArticulo;
    private String codAlmacen;
    private Long idLogCatalogo;
    private Long idLogOrdenes;

    public LogOrdenDetVO() {
    }

    public LogOrdenDetVO(LogOrdenDet data) {

        this.idLogOrdenesDet = data.getIdLogOrdenesDet();
        this.empresa = data.getEmpresa();
        this.unidOperativa = data.getUnidOperativa();
        this.anio = data.getAnio();
        this.tipo = data.getTipo();
        this.nroOrden = data.getNroOrden();
        this.item = data.getItem();
        this.nroRequerimiento = data.getNroRequerimiento();
        this.idCotizacion = data.getIdCotizacion();
        this.tipoCatalogo = data.getTipoCatalogo();
        this.codProdServ = data.getCodProdServ();
        this.desProdServ = data.getDesProdServ();
        this.cantidad = data.getCantidad();
        this.unimed = data.getUnimed();
        this.moneda = data.getMoneda();
        this.valorVenta = data.getValorVenta();
        this.totalValor = data.getTotalValor();
        this.observaciones = data.getObservaciones();
        this.itemReqdet = data.getItemReqdet();
        this.idProgramacion = data.getIdProgramacion();
        this.fechaEntrega = data.getFechaEntrega();
        this.cantidadFacturada = data.getCantidadFacturada();
        this.saldoPendiente = data.getSaldoPendiente();
        this.cantidadXRecibir = data.getCantidadXRecibir();
        this.cantidadRecibida = data.getCantidadRecibida();
        this.codPlanta = data.getCodPlanta();
        this.tipoCosto = data.getTipoCosto();
        this.codArticulo = data.getCodArticulo();
        this.codAlmacen = data.getCodAlmacen();
        this.idLogCatalogo = data.getIdLogCatalogo().getIdLogCatalogo();
        this.idLogOrdenes = data.getIdLogOrdenes().getIdLogOrdenes();

    }

    public Long getIdLogOrdenesDet() {
        return idLogOrdenesDet;
    }

    public void setIdLogOrdenesDet(Long idLogOrdenesDet) {
        this.idLogOrdenesDet = idLogOrdenesDet;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUnidOperativa() {
        return unidOperativa;
    }

    public void setUnidOperativa(String unidOperativa) {
        this.unidOperativa = unidOperativa;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(long nroOrden) {
        this.nroOrden = nroOrden;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public long getNroRequerimiento() {
        return nroRequerimiento;
    }

    public void setNroRequerimiento(long nroRequerimiento) {
        this.nroRequerimiento = nroRequerimiento;
    }

    public int getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
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

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(BigDecimal valorVenta) {
        this.valorVenta = valorVenta;
    }

    public BigDecimal getTotalValor() {
        return totalValor;
    }

    public void setTotalValor(BigDecimal totalValor) {
        this.totalValor = totalValor;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getItemReqdet() {
        return itemReqdet;
    }

    public void setItemReqdet(Integer itemReqdet) {
        this.itemReqdet = itemReqdet;
    }

    public Integer getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(Integer idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public BigDecimal getCantidadFacturada() {
        return cantidadFacturada;
    }

    public void setCantidadFacturada(BigDecimal cantidadFacturada) {
        this.cantidadFacturada = cantidadFacturada;
    }

    public BigDecimal getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(BigDecimal saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public BigDecimal getCantidadXRecibir() {
        return cantidadXRecibir;
    }

    public void setCantidadXRecibir(BigDecimal cantidadXRecibir) {
        this.cantidadXRecibir = cantidadXRecibir;
    }

    public BigDecimal getCantidadRecibida() {
        return cantidadRecibida;
    }

    public void setCantidadRecibida(BigDecimal cantidadRecibida) {
        this.cantidadRecibida = cantidadRecibida;
    }

    public Integer getCodPlanta() {
        return codPlanta;
    }

    public void setCodPlanta(Integer codPlanta) {
        this.codPlanta = codPlanta;
    }

    public Integer getTipoCosto() {
        return tipoCosto;
    }

    public void setTipoCosto(Integer tipoCosto) {
        this.tipoCosto = tipoCosto;
    }

    public String getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getCodAlmacen() {
        return codAlmacen;
    }

    public void setCodAlmacen(String codAlmacen) {
        this.codAlmacen = codAlmacen;
    }

    public Long getIdLogCatalogo() {
        return idLogCatalogo;
    }

    public void setIdLogCatalogo(Long idLogCatalogo) {
        this.idLogCatalogo = idLogCatalogo;
    }

    public Long getIdLogOrdenes() {
        return idLogOrdenes;
    }

    public void setIdLogOrdenes(Long idLogOrdenes) {
        this.idLogOrdenes = idLogOrdenes;
    }
}
