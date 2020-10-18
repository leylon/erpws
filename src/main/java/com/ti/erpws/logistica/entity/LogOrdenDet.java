package com.ti.erpws.logistica.entity;

import com.ti.erpws.logistica.model.LogOrdenDetVO;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "log_ordenes_det")
public class LogOrdenDet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_log_ordenes_det")
    private Long idLogOrdenesDet;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 2)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 10)
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
    @Basic(optional = false)
    //@NotNull
    @Column(name = "item")
    private int item;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "nro_requerimiento")
    private long nroRequerimiento;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "id_cotizacion")
    private int idCotizacion;
    //@Size(max = 3)
    @Column(name = "tipo_catalogo")
    private String tipoCatalogo;
    //@Size(max = 15)
    @Column(name = "cod_prod_serv")
    private String codProdServ;
    //@Size(max = 350)
    @Column(name = "des_prod_serv")
    private String desProdServ;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    //@Size(max = 10)
    @Column(name = "unimed")
    private String unimed;
    //@Size(max = 1)
    @Column(name = "moneda")
    private String moneda;
    @Column(name = "valor_venta")
    private BigDecimal valorVenta;
    @Column(name = "total_valor")
    private BigDecimal totalValor;
    //@Size(max = 120)
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "item_reqdet")
    private Integer itemReqdet;
    @Column(name = "id_programacion")
    private Integer idProgramacion;
    @Column(name = "fecha_entrega")
    //@Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Column(name = "cantidad_facturada")
    private BigDecimal cantidadFacturada;
    @Column(name = "saldo_pendiente")
    private BigDecimal saldoPendiente;
    @Column(name = "cantidad_x_recibir")
    private BigDecimal cantidadXRecibir;
    @Column(name = "cantidad_recibida")
    private BigDecimal cantidadRecibida;
    @Column(name = "cod_planta")
    private Integer codPlanta;
    @Column(name = "tipo_costo")
    private Integer tipoCosto;
    //@Size(max = 9)
    @Column(name = "cod_articulo")
    private String codArticulo;
    //@Size(max = 3)
    @Column(name = "cod_almacen")
    private String codAlmacen;
    @JoinColumn(name = "id_log_catalogo", referencedColumnName = "id_log_catalogo")
    @ManyToOne(optional = false)
    private LogCatalogo idLogCatalogo;
    @JoinColumn(name = "id_log_ordenes", referencedColumnName = "id_log_ordenes")
    @ManyToOne(optional = false)
    private LogOrden idLogOrdenes;
    //@OneToMany(mappedBy = "idLogOrdenesDet")
    //private List<ProDocDet> proDocDetList;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "idLogOrdenesDet")
    //private List<ProDocDetOrden> proDocDetOrdenList;

    public LogOrdenDet() {
    }

    public LogOrdenDet(LogOrdenDetVO data) {

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
        this.idLogCatalogo = new LogCatalogo(data.getIdLogCatalogo());
        this.idLogOrdenes = new LogOrden(data.getIdLogOrdenes());

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

    public LogCatalogo getIdLogCatalogo() {
        return idLogCatalogo;
    }

    public void setIdLogCatalogo(LogCatalogo idLogCatalogo) {
        this.idLogCatalogo = idLogCatalogo;
    }

    public LogOrden getIdLogOrdenes() {
        return idLogOrdenes;
    }

    public void setIdLogOrdenes(LogOrden idLogOrdenes) {
        this.idLogOrdenes = idLogOrdenes;
    }
}
