package com.ti.erpws.logistica.entity;

import com.ti.erpws.logistica.model.response.LogRequerimientoDetVO;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "log_requerimiento_det")
@NamedQueries({
        @NamedQuery(name = "LogRequerimientoDet.findAll", query = "SELECT l FROM LogRequerimientoDet l")
        , @NamedQuery(name = "LogRequerimientoDet.findByIdLogRequerimientoDet", query = "SELECT l FROM LogRequerimientoDet l WHERE l.idLogRequerimientoDet = :idLogRequerimientoDet")
        , @NamedQuery(name = "LogRequerimientoDet.findByEmpresa", query = "SELECT l FROM LogRequerimientoDet l WHERE l.empresa = :empresa")
        , @NamedQuery(name = "LogRequerimientoDet.findByUnidadNegocio", query = "SELECT l FROM LogRequerimientoDet l WHERE l.unidadNegocio = :unidadNegocio")
        , @NamedQuery(name = "LogRequerimientoDet.findByAreaOrigen", query = "SELECT l FROM LogRequerimientoDet l WHERE l.areaOrigen = :areaOrigen")
        , @NamedQuery(name = "LogRequerimientoDet.findByAnio", query = "SELECT l FROM LogRequerimientoDet l WHERE l.anio = :anio")
        , @NamedQuery(name = "LogRequerimientoDet.findByNroRequerimiento", query = "SELECT l FROM LogRequerimientoDet l WHERE l.nroRequerimiento = :nroRequerimiento")
        , @NamedQuery(name = "LogRequerimientoDet.findByItem", query = "SELECT l FROM LogRequerimientoDet l WHERE l.item = :item")
        , @NamedQuery(name = "LogRequerimientoDet.findByTipoCatalogo", query = "SELECT l FROM LogRequerimientoDet l WHERE l.tipoCatalogo = :tipoCatalogo")
        , @NamedQuery(name = "LogRequerimientoDet.findByCodProdServ", query = "SELECT l FROM LogRequerimientoDet l WHERE l.codProdServ = :codProdServ")
        , @NamedQuery(name = "LogRequerimientoDet.findByDesProdServ", query = "SELECT l FROM LogRequerimientoDet l WHERE l.desProdServ = :desProdServ")
        , @NamedQuery(name = "LogRequerimientoDet.findByTipo", query = "SELECT l FROM LogRequerimientoDet l WHERE l.tipo = :tipo")
        , @NamedQuery(name = "LogRequerimientoDet.findByMarca", query = "SELECT l FROM LogRequerimientoDet l WHERE l.marca = :marca")
        , @NamedQuery(name = "LogRequerimientoDet.findByCantidad", query = "SELECT l FROM LogRequerimientoDet l WHERE l.cantidad = :cantidad")
        , @NamedQuery(name = "LogRequerimientoDet.findByUnimed", query = "SELECT l FROM LogRequerimientoDet l WHERE l.unimed = :unimed")
        , @NamedQuery(name = "LogRequerimientoDet.findByFecreg", query = "SELECT l FROM LogRequerimientoDet l WHERE l.fecreg = :fecreg")
        , @NamedQuery(name = "LogRequerimientoDet.findByUsureg", query = "SELECT l FROM LogRequerimientoDet l WHERE l.usureg = :usureg")
        , @NamedQuery(name = "LogRequerimientoDet.findByFecmod", query = "SELECT l FROM LogRequerimientoDet l WHERE l.fecmod = :fecmod")
        , @NamedQuery(name = "LogRequerimientoDet.findByUsumod", query = "SELECT l FROM LogRequerimientoDet l WHERE l.usumod = :usumod")
        , @NamedQuery(name = "LogRequerimientoDet.findByDetalleProdser", query = "SELECT l FROM LogRequerimientoDet l WHERE l.detalleProdser = :detalleProdser")
        , @NamedQuery(name = "LogRequerimientoDet.findByDesTipoCatalogo", query = "SELECT l FROM LogRequerimientoDet l WHERE l.desTipoCatalogo = :desTipoCatalogo")
        , @NamedQuery(name = "LogRequerimientoDet.findByAreaDestino", query = "SELECT l FROM LogRequerimientoDet l WHERE l.areaDestino = :areaDestino")
        , @NamedQuery(name = "LogRequerimientoDet.findByDesAreaDestino", query = "SELECT l FROM LogRequerimientoDet l WHERE l.desAreaDestino = :desAreaDestino")
        , @NamedQuery(name = "LogRequerimientoDet.findByUniNegocioDest", query = "SELECT l FROM LogRequerimientoDet l WHERE l.uniNegocioDest = :uniNegocioDest")
        , @NamedQuery(name = "LogRequerimientoDet.findByDesUniNegocioDest", query = "SELECT l FROM LogRequerimientoDet l WHERE l.desUniNegocioDest = :desUniNegocioDest")
        , @NamedQuery(name = "LogRequerimientoDet.findByAprobado", query = "SELECT l FROM LogRequerimientoDet l WHERE l.aprobado = :aprobado")
        , @NamedQuery(name = "LogRequerimientoDet.findByCompradoXCch", query = "SELECT l FROM LogRequerimientoDet l WHERE l.compradoXCch = :compradoXCch")
        , @NamedQuery(name = "LogRequerimientoDet.findByAtendido", query = "SELECT l FROM LogRequerimientoDet l WHERE l.atendido = :atendido")
        , @NamedQuery(name = "LogRequerimientoDet.findByProveedor", query = "SELECT l FROM LogRequerimientoDet l WHERE l.proveedor = :proveedor")
        , @NamedQuery(name = "LogRequerimientoDet.findByPrecio", query = "SELECT l FROM LogRequerimientoDet l WHERE l.precio = :precio")
        , @NamedQuery(name = "LogRequerimientoDet.findByMoneda", query = "SELECT l FROM LogRequerimientoDet l WHERE l.moneda = :moneda")
        , @NamedQuery(name = "LogRequerimientoDet.findByIdCencos", query = "SELECT l FROM LogRequerimientoDet l WHERE l.idCencos = :idCencos")})
public class LogRequerimientoDet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_log_requerimiento_det")
    private Long idLogRequerimientoDet;
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
    private long nroRequerimiento;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "item")
    private int item;
    //@Size(max = 3)
    @Column(name = "tipo_catalogo")
    private String tipoCatalogo;
    //@Size(max = 15)
    @Column(name = "cod_prod_serv")
    private String codProdServ;
    //@Size(max = 180)
    @Column(name = "des_prod_serv")
    private String desProdServ;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 1)
    @Column(name = "tipo")
    private String tipo;
    //@Size(max = 30)
    @Column(name = "marca")
    private String marca;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    //@NotNull
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    //@Size(max = 10)
    @Column(name = "unimed")
    private String unimed;
    @Column(name = "fecreg")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecreg;
    //@Size(max = 15)
    @Column(name = "usureg")
    private String usureg;
    @Column(name = "fecmod")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecmod;
    //@Size(max = 15)
    @Column(name = "usumod")
    private String usumod;
    //@Size(max = 300)
    @Column(name = "detalle_prodser")
    private String detalleProdser;
    //@Size(max = 80)
    @Column(name = "des_tipo_catalogo")
    private String desTipoCatalogo;
    //@Size(max = 20)
    @Column(name = "area_destino")
    private String areaDestino;
    //@Size(max = 120)
    @Column(name = "des_area_destino")
    private String desAreaDestino;
    //@Size(max = 20)
    @Column(name = "uni_negocio_dest")
    private String uniNegocioDest;
    //@Size(max = 120)
    @Column(name = "des_uni_negocio_dest")
    private String desUniNegocioDest;
    @Column(name = "aprobado")
    private Integer aprobado;
    @Column(name = "comprado_x_cch")
    private Integer compradoXCch;
    @Column(name = "atendido")
    private Integer atendido;
    //@Size(max = 15)
    @Column(name = "proveedor")
    private String proveedor;
    @Column(name = "precio")
    private BigDecimal precio;
    @Column(name = "moneda")
    private Character moneda;
    //@Size(max = 30)
    @Column(name = "id_cencos")
    private String idCencos;
    @JoinColumn(name = "id_log_catalogo", referencedColumnName = "id_log_catalogo")
    @ManyToOne(optional = false)
    private LogCatalogo idLogCatalogo;
    @JoinColumn(name = "id_log_requerimiento", referencedColumnName = "id_log_requerimiento")
    @ManyToOne(optional = false)
    private LogRequerimiento idLogRequerimiento;

    public LogRequerimientoDet() {
    }

    public LogRequerimientoDet(LogRequerimientoDetVO data) {

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
        this.idLogCatalogo = new LogCatalogo(data.getIdLogCatalogo());
        this.idLogRequerimiento = new LogRequerimiento(data.getIdLogRequerimiento());
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

    public LogCatalogo getIdLogCatalogo() {
        return idLogCatalogo;
    }

    public void setIdLogCatalogo(LogCatalogo idLogCatalogo) {
        this.idLogCatalogo = idLogCatalogo;
    }

    public LogRequerimiento getIdLogRequerimiento() {
        return idLogRequerimiento;
    }

    public void setIdLogRequerimiento(LogRequerimiento idLogRequerimiento) {
        this.idLogRequerimiento = idLogRequerimiento;
    }
}
