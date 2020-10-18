package com.ti.erpws.logistica.model;

import com.ti.erpws.logistica.entity.LogOrden;
import org.apache.tomcat.jni.Local;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public class LogOrdenVO {
    private Long idLogOrdenes;
    private String empresa;
    private String unidOperativa;
    private int anio;
    private String tipo;
    private long nroOrden;
    private String areaRequerimiento;
    private Integer anioRequerimiento;
    private long nroRequerimiento;
    private Integer anioCotizacion;
    private int idCotizacion;
    private String ndocCotizacion;
    private String etiquetaOrden;
    private Date fecha;
    private String rucProveedor;
    private String razonProveedor;
    private String fonoProveedor;
    private String formaPago;
    private String otraFormaPago;
    private Integer diasCredito;
    private String moneda;
    private String banco;
    private String ctaBancaria;
    private String ctaInterbancaria;
    private String contacto;
    private String tipoEntrega;
    private Date fechaEntrega;
    private Integer tiempoGarantia;
    private String umGarantia;
    private String usuaReg;
    private LocalDateTime fecReg;
    private String usuaMod;
    private LocalDateTime fecMod;
    private BigDecimal totalValor;
    private BigDecimal totalIgv;
    private BigDecimal totalPrecio;
    private String descripcion;
    private Integer vbLogistica;
    private LocalDateTime fechaVbLog;
    private String usuarioVbLog;
    private String notasVbLog;
    private Integer vbGerencia;
    private LocalDateTime fechaVbGte;
    private String usuarioVbGte;
    private String notasVbGte;
    private Character orientacion;
    private Character conCatalogo;
    private Character conIndicaciones;
    private String estado;
    private String codigoAsientoCos;
    private LocalDateTime fechaAtendido;
    private Integer flagProvisionado;
    private String idCencos;
    private Integer anioSlp;
    private String codlocalSlp;
    private Integer nroSlp;
    private String tipoSlp;
    private String codigoProDoc;
    private String nroLote;
    private LocalDateTime fechaFacturado;
    private Character nroEtapaSlp;
    private String rutaFirmaVbLog;
    private String rutaFirmaVbGte;
    private String tipoDoc;
    private String serieDoc;
    private String numeroDoc;
    private Integer tipoClasificacion;
    private String ctaCompra;
    private Integer tipoRegistro;
    private Long idPubEmpresas;
    private Long idPubPersonas;

    public LogOrdenVO() {
    }

    public LogOrdenVO(LogOrden data) {

        this.idLogOrdenes = data.getIdLogOrdenes();
        this.empresa = data.getEmpresa();
        this.unidOperativa = data.getUnidOperativa();
        this.anio = data.getAnio();
        this.tipo = data.getTipo();
        this.nroOrden = data.getNroOrden();
        this.areaRequerimiento = data.getAreaRequerimiento();
        this.anioRequerimiento = data.getAnioRequerimiento();
        this.nroRequerimiento = data.getNroRequerimiento();
        this.anioCotizacion = data.getAnioCotizacion();
        this.idCotizacion = data.getIdCotizacion();
        this.ndocCotizacion = data.getNdocCotizacion();
        this.etiquetaOrden = data.getEtiquetaOrden();
        this.fecha = data.getFecha();
        this.rucProveedor = data.getRucProveedor();
        this.razonProveedor = data.getRazonProveedor();
        this.fonoProveedor = data.getFonoProveedor();
        this.formaPago = data.getFormaPago();
        this.otraFormaPago = data.getOtraFormaPago();
        this.diasCredito = data.getDiasCredito();
        this.moneda = data.getMoneda();
        this.banco = data.getBanco();
        this.ctaBancaria = data.getCtaBancaria();
        this.ctaInterbancaria = data.getCtaInterbancaria();
        this.contacto = data.getContacto();
        this.tipoEntrega = data.getTipoEntrega();
        this.fechaEntrega = data.getFechaEntrega();
        this.tiempoGarantia = data.getTiempoGarantia();
        this.umGarantia = data.getUmGarantia();
        this.usuaReg = data.getUsuaReg();
        this.fecReg = data.getFecReg();
        this.usuaMod = data.getUsuaMod();
        this.fecMod = data.getFecMod();
        this.totalValor = data.getTotalValor();
        this.totalIgv = data.getTotalIgv();
        this.totalPrecio = data.getTotalPrecio();
        this.descripcion = data.getDescripcion();
        this.vbLogistica = data.getVbLogistica();
        this.fechaVbLog = data.getFechaVbLog();
        this.usuarioVbLog = data.getUsuarioVbLog();
        this.notasVbLog = data.getNotasVbLog();
        this.vbGerencia = data.getVbGerencia();
        this.fechaVbGte = data.getFechaVbGte();
        this.usuarioVbGte = data.getUsuarioVbGte();
        this.notasVbGte = data.getNotasVbGte();
        this.orientacion = data.getOrientacion();
        this.conCatalogo = data.getConCatalogo();
        this.conIndicaciones = data.getConIndicaciones();
        this.estado = data.getEstado();
        this.codigoAsientoCos = data.getCodigoAsientoCos();
        this.fechaAtendido = data.getFechaAtendido();
        this.flagProvisionado = data.getFlagProvisionado();
        this.idCencos = data.getIdCencos();
        this.anioSlp = data.getAnioSlp();
        this.codlocalSlp = data.getCodlocalSlp();
        this.nroSlp = data.getNroSlp();
        this.tipoSlp = data.getTipoSlp();
        this.codigoProDoc = data.getCodigoProDoc();
        this.nroLote = data.getNroLote();
        this.fechaFacturado = data.getFechaFacturado();
        this.nroEtapaSlp = data.getNroEtapaSlp();
        this.rutaFirmaVbLog = data.getRutaFirmaVbLog();
        this.rutaFirmaVbGte = data.getRutaFirmaVbGte();
        this.tipoDoc = data.getTipoDoc();
        this.serieDoc = data.getSerieDoc();
        this.numeroDoc = data.getNumeroDoc();
        this.tipoClasificacion = data.getTipoClasificacion();
        this.ctaCompra = data.getCtaCompra();
        this.tipoRegistro = data.getTipoRegistro();
        //this.idPubEmpresas = data.getIdPubEmpresas().getIdPubEmpresas();
        //this.idPubPersonas = data.getIdPubPersonas().getIdPubPersonas();
    }

    public Long getIdLogOrdenes() {
        return idLogOrdenes;
    }

    public void setIdLogOrdenes(Long idLogOrdenes) {
        this.idLogOrdenes = idLogOrdenes;
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

    public String getAreaRequerimiento() {
        return areaRequerimiento;
    }

    public void setAreaRequerimiento(String areaRequerimiento) {
        this.areaRequerimiento = areaRequerimiento;
    }

    public Integer getAnioRequerimiento() {
        return anioRequerimiento;
    }

    public void setAnioRequerimiento(Integer anioRequerimiento) {
        this.anioRequerimiento = anioRequerimiento;
    }

    public long getNroRequerimiento() {
        return nroRequerimiento;
    }

    public void setNroRequerimiento(long nroRequerimiento) {
        this.nroRequerimiento = nroRequerimiento;
    }

    public Integer getAnioCotizacion() {
        return anioCotizacion;
    }

    public void setAnioCotizacion(Integer anioCotizacion) {
        this.anioCotizacion = anioCotizacion;
    }

    public int getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public String getNdocCotizacion() {
        return ndocCotizacion;
    }

    public void setNdocCotizacion(String ndocCotizacion) {
        this.ndocCotizacion = ndocCotizacion;
    }

    public String getEtiquetaOrden() {
        return etiquetaOrden;
    }

    public void setEtiquetaOrden(String etiquetaOrden) {
        this.etiquetaOrden = etiquetaOrden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRucProveedor() {
        return rucProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public String getRazonProveedor() {
        return razonProveedor;
    }

    public void setRazonProveedor(String razonProveedor) {
        this.razonProveedor = razonProveedor;
    }

    public String getFonoProveedor() {
        return fonoProveedor;
    }

    public void setFonoProveedor(String fonoProveedor) {
        this.fonoProveedor = fonoProveedor;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getOtraFormaPago() {
        return otraFormaPago;
    }

    public void setOtraFormaPago(String otraFormaPago) {
        this.otraFormaPago = otraFormaPago;
    }

    public Integer getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(Integer diasCredito) {
        this.diasCredito = diasCredito;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCtaBancaria() {
        return ctaBancaria;
    }

    public void setCtaBancaria(String ctaBancaria) {
        this.ctaBancaria = ctaBancaria;
    }

    public String getCtaInterbancaria() {
        return ctaInterbancaria;
    }

    public void setCtaInterbancaria(String ctaInterbancaria) {
        this.ctaInterbancaria = ctaInterbancaria;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(Integer tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }

    public String getUmGarantia() {
        return umGarantia;
    }

    public void setUmGarantia(String umGarantia) {
        this.umGarantia = umGarantia;
    }

    public String getUsuaReg() {
        return usuaReg;
    }

    public void setUsuaReg(String usuaReg) {
        this.usuaReg = usuaReg;
    }

    public LocalDateTime getFecReg() {
        return fecReg;
    }

    public void setFecReg(LocalDateTime fecReg) {
        this.fecReg = fecReg;
    }

    public String getUsuaMod() {
        return usuaMod;
    }

    public void setUsuaMod(String usuaMod) {
        this.usuaMod = usuaMod;
    }

    public LocalDateTime getFecMod() {
        return fecMod;
    }

    public void setFecMod(LocalDateTime fecMod) {
        this.fecMod = fecMod;
    }

    public BigDecimal getTotalValor() {
        return totalValor;
    }

    public void setTotalValor(BigDecimal totalValor) {
        this.totalValor = totalValor;
    }

    public BigDecimal getTotalIgv() {
        return totalIgv;
    }

    public void setTotalIgv(BigDecimal totalIgv) {
        this.totalIgv = totalIgv;
    }

    public BigDecimal getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(BigDecimal totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getVbLogistica() {
        return vbLogistica;
    }

    public void setVbLogistica(Integer vbLogistica) {
        this.vbLogistica = vbLogistica;
    }

    public LocalDateTime getFechaVbLog() {
        return fechaVbLog;
    }

    public void setFechaVbLog(LocalDateTime fechaVbLog) {
        this.fechaVbLog = fechaVbLog;
    }

    public String getUsuarioVbLog() {
        return usuarioVbLog;
    }

    public void setUsuarioVbLog(String usuarioVbLog) {
        this.usuarioVbLog = usuarioVbLog;
    }

    public String getNotasVbLog() {
        return notasVbLog;
    }

    public void setNotasVbLog(String notasVbLog) {
        this.notasVbLog = notasVbLog;
    }

    public Integer getVbGerencia() {
        return vbGerencia;
    }

    public void setVbGerencia(Integer vbGerencia) {
        this.vbGerencia = vbGerencia;
    }

    public LocalDateTime getFechaVbGte() {
        return fechaVbGte;
    }

    public void setFechaVbGte(LocalDateTime fechaVbGte) {
        this.fechaVbGte = fechaVbGte;
    }

    public String getUsuarioVbGte() {
        return usuarioVbGte;
    }

    public void setUsuarioVbGte(String usuarioVbGte) {
        this.usuarioVbGte = usuarioVbGte;
    }

    public String getNotasVbGte() {
        return notasVbGte;
    }

    public void setNotasVbGte(String notasVbGte) {
        this.notasVbGte = notasVbGte;
    }

    public Character getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Character orientacion) {
        this.orientacion = orientacion;
    }

    public Character getConCatalogo() {
        return conCatalogo;
    }

    public void setConCatalogo(Character conCatalogo) {
        this.conCatalogo = conCatalogo;
    }

    public Character getConIndicaciones() {
        return conIndicaciones;
    }

    public void setConIndicaciones(Character conIndicaciones) {
        this.conIndicaciones = conIndicaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoAsientoCos() {
        return codigoAsientoCos;
    }

    public void setCodigoAsientoCos(String codigoAsientoCos) {
        this.codigoAsientoCos = codigoAsientoCos;
    }

    public LocalDateTime getFechaAtendido() {
        return fechaAtendido;
    }

    public void setFechaAtendido(LocalDateTime fechaAtendido) {
        this.fechaAtendido = fechaAtendido;
    }

    public Integer getFlagProvisionado() {
        return flagProvisionado;
    }

    public void setFlagProvisionado(Integer flagProvisionado) {
        this.flagProvisionado = flagProvisionado;
    }

    public String getIdCencos() {
        return idCencos;
    }

    public void setIdCencos(String idCencos) {
        this.idCencos = idCencos;
    }

    public Integer getAnioSlp() {
        return anioSlp;
    }

    public void setAnioSlp(Integer anioSlp) {
        this.anioSlp = anioSlp;
    }

    public String getCodlocalSlp() {
        return codlocalSlp;
    }

    public void setCodlocalSlp(String codlocalSlp) {
        this.codlocalSlp = codlocalSlp;
    }

    public Integer getNroSlp() {
        return nroSlp;
    }

    public void setNroSlp(Integer nroSlp) {
        this.nroSlp = nroSlp;
    }

    public String getTipoSlp() {
        return tipoSlp;
    }

    public void setTipoSlp(String tipoSlp) {
        this.tipoSlp = tipoSlp;
    }

    public String getCodigoProDoc() {
        return codigoProDoc;
    }

    public void setCodigoProDoc(String codigoProDoc) {
        this.codigoProDoc = codigoProDoc;
    }

    public String getNroLote() {
        return nroLote;
    }

    public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
    }

    public LocalDateTime getFechaFacturado() {
        return fechaFacturado;
    }

    public void setFechaFacturado(LocalDateTime fechaFacturado) {
        this.fechaFacturado = fechaFacturado;
    }

    public Character getNroEtapaSlp() {
        return nroEtapaSlp;
    }

    public void setNroEtapaSlp(Character nroEtapaSlp) {
        this.nroEtapaSlp = nroEtapaSlp;
    }

    public String getRutaFirmaVbLog() {
        return rutaFirmaVbLog;
    }

    public void setRutaFirmaVbLog(String rutaFirmaVbLog) {
        this.rutaFirmaVbLog = rutaFirmaVbLog;
    }

    public String getRutaFirmaVbGte() {
        return rutaFirmaVbGte;
    }

    public void setRutaFirmaVbGte(String rutaFirmaVbGte) {
        this.rutaFirmaVbGte = rutaFirmaVbGte;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getSerieDoc() {
        return serieDoc;
    }

    public void setSerieDoc(String serieDoc) {
        this.serieDoc = serieDoc;
    }

    public String getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public Integer getTipoClasificacion() {
        return tipoClasificacion;
    }

    public void setTipoClasificacion(Integer tipoClasificacion) {
        this.tipoClasificacion = tipoClasificacion;
    }

    public String getCtaCompra() {
        return ctaCompra;
    }

    public void setCtaCompra(String ctaCompra) {
        this.ctaCompra = ctaCompra;
    }

    public Integer getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(Integer tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public Long getIdPubEmpresas() {
        return idPubEmpresas;
    }

    public void setIdPubEmpresas(Long idPubEmpresas) {
        this.idPubEmpresas = idPubEmpresas;
    }

    public Long getIdPubPersonas() {
        return idPubPersonas;
    }

    public void setIdPubPersonas(Long idPubPersonas) {
        this.idPubPersonas = idPubPersonas;
    }
}
