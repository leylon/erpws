package com.ti.erpws.logistica.entity;

import com.ti.erpws.logistica.model.LogOrdenVO;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "log_ordenes")
public class LogOrden implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_log_ordenes")
    private Long idLogOrdenes;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 2)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 30)
    @Column(name = "unid_operativa")
    private String unidOperativa;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "anio")
    private int anio;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 1)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "nro_orden")
    private long nroOrden;
    //@Size(max = 20)
    @Column(name = "area_requerimiento")
    private String areaRequerimiento;
    @Column(name = "anio_requerimiento")
    private Integer anioRequerimiento;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "nro_requerimiento")
    private long nroRequerimiento;
    @Column(name = "anio_cotizacion")
    private Integer anioCotizacion;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "id_cotizacion")
    private int idCotizacion;
    //@Size(max = 80)
    @Column(name = "ndoc_cotizacion")
    private String ndocCotizacion;
    //@Size(max = 10)
    @Column(name = "etiqueta_orden")
    private String etiquetaOrden;
    @Column(name = "fecha")
    //@Temporal(TemporalType.DATE)
    private Date fecha;
    //@Size(max = 15)
    @Column(name = "ruc_proveedor")
    private String rucProveedor;
    //@Size(max = 150)
    @Column(name = "razon_proveedor")
    private String razonProveedor;
    //@Size(max = 25)
    @Column(name = "fono_proveedor")
    private String fonoProveedor;
    //@Size(max = 2)
    @Column(name = "forma_pago")
    private String formaPago;
    //@Size(max = 40)
    @Column(name = "otra_forma_pago")
    private String otraFormaPago;
    @Column(name = "dias_credito")
    private Integer diasCredito;
    //@Size(max = 1)
    @Column(name = "moneda")
    private String moneda;
    //@Size(max = 30)
    @Column(name = "banco")
    private String banco;
    //@Size(max = 35)
    @Column(name = "cta_bancaria")
    private String ctaBancaria;
    //@Size(max = 75)
    @Column(name = "cta_interbancaria")
    private String ctaInterbancaria;
    //@Size(max = 150)
    @Column(name = "contacto")
    private String contacto;
    //@Size(max = 2)
    @Column(name = "tipo_entrega")
    private String tipoEntrega;
    @Column(name = "fecha_entrega")
    //@Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Column(name = "tiempo_garantia")
    private Integer tiempoGarantia;
    //@Size(max = 1)
    @Column(name = "um_garantia")
    private String umGarantia;
    //@Size(max = 15)
    @Column(name = "usua_reg")
    private String usuaReg;
    @Column(name = "fec_reg")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecReg;
    //@Size(max = 15)
    @Column(name = "usua_mod")
    private String usuaMod;
    @Column(name = "fec_mod")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecMod;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_valor")
    private BigDecimal totalValor;
    @Column(name = "total_igv")
    private BigDecimal totalIgv;
    @Column(name = "total_precio")
    private BigDecimal totalPrecio;
    //@Size(max = 350)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "vb_logistica")
    private Integer vbLogistica;
    @Column(name = "fecha_vb_log")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaVbLog;
    //@Size(max = 15)
    @Column(name = "usuario_vb_log")
    private String usuarioVbLog;
    //@Size(max = 100)
    @Column(name = "notas_vb_log")
    private String notasVbLog;
    @Column(name = "vb_gerencia")
    private Integer vbGerencia;
    @Column(name = "fecha_vb_gte")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaVbGte;
    //@Size(max = 15)
    @Column(name = "usuario_vb_gte")
    private String usuarioVbGte;
    //@Size(max = 100)
    @Column(name = "notas_vb_gte")
    private String notasVbGte;
    @Column(name = "orientacion")
    private Character orientacion;
    @Column(name = "con_catalogo")
    private Character conCatalogo;
    @Column(name = "con_indicaciones")
    private Character conIndicaciones;
    //@Size(max = 2)
    @Column(name = "estado")
    private String estado;
    //@Size(max = 16)
    @Column(name = "codigo_asiento_cos")
    private String codigoAsientoCos;
    @Column(name = "fecha_atendido")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaAtendido;
    @Column(name = "flag_provisionado")
    private Integer flagProvisionado;
    //@Size(max = 30)
    @Column(name = "id_cencos")
    private String idCencos;
    @Column(name = "anio_slp")
    private Integer anioSlp;
    //@Size(max = 2)
    @Column(name = "codlocal_slp")
    private String codlocalSlp;
    @Column(name = "nro_slp")
    private Integer nroSlp;
    //@Size(max = 1)
    @Column(name = "tipo_slp")
    private String tipoSlp;
    //@Size(max = 16)
    @Column(name = "codigo_pro_doc")
    private String codigoProDoc;
    //@Size(max = 20)
    @Column(name = "nro_lote")
    private String nroLote;
    @Column(name = "fecha_facturado")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaFacturado;
    @Column(name = "nro_etapa_slp")
    private Character nroEtapaSlp;
    //@Size(max = 40)
    @Column(name = "ruta_firma_vb_log")
    private String rutaFirmaVbLog;
    //@Size(max = 40)
    @Column(name = "ruta_firma_vb_gte")
    private String rutaFirmaVbGte;
    //@Size(max = 2)
    @Column(name = "tipo_doc")
    private String tipoDoc;
    //@Size(max = 10)
    @Column(name = "serie_doc")
    private String serieDoc;
    //@Size(max = 20)
    @Column(name = "numero_doc")
    private String numeroDoc;
    @Column(name = "tipo_clasificacion")
    private Integer tipoClasificacion;
    //@Size(max = 15)
    @Column(name = "cta_compra")
    private String ctaCompra;
    @Column(name = "tipo_registro")
    private Integer tipoRegistro;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "idLogOrdenes")
    private List<LogOrdenesDet> logOrdenesDetList;
    @JoinColumn(name = "id_pub_empresas", referencedColumnName = "id_pub_empresas")
    @ManyToOne(optional = false)
    private PubEmpresas idPubEmpresas;
    @JoinColumn(name = "id_pub_personas", referencedColumnName = "id_pub_personas")
    @ManyToOne(optional = false)
    private PubPersonas idPubPersonas;*/

    public LogOrden() {
    }

    public LogOrden(LogOrdenVO data) {

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
        //this.idPubEmpresas = new PubEmpresas(data.getIdPubEmpresas());
        //this.idPubPersonas = new PubPersonas(data.getIdPubPersonas());
    }

    public LogOrden(Long idLogOrdenes) {
        this.idLogOrdenes = idLogOrdenes;
    }

    public LogOrden(Long idLogOrdenes, String empresa, String unidOperativa, int anio, String tipo, long nroOrden, long nroRequerimiento, int idCotizacion) {
        this.idLogOrdenes = idLogOrdenes;
        this.empresa = empresa;
        this.unidOperativa = unidOperativa;
        this.anio = anio;
        this.tipo = tipo;
        this.nroOrden = nroOrden;
        this.nroRequerimiento = nroRequerimiento;
        this.idCotizacion = idCotizacion;
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
}
