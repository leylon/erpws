package com.ti.erpws.logistica.entity;

import com.ti.erpws.logistica.model.LogCatalogoVO;
import com.ti.erpws.publica.entity.PubEmpresas;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "log_catalogo")
@NamedQueries({
        @NamedQuery(name = "LogCatalogo.findAll", query = "SELECT l FROM LogCatalogo l")
})
public class LogCatalogo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_log_catalogo")
    private Long idLogCatalogo;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 2)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 3)
    @Column(name = "tipo_catalogo")
    private String tipoCatalogo;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 15)
    @Column(name = "cod_articulo")
    private String codArticulo;
    //@Size(max = 150)
    @Column(name = "descripcion")
    private String descripcion;
    //@Size(max = 10)
    @Column(name = "unimed")
    private String unimed;
    //@Size(max = 120)
    @Column(name = "uso")
    private String uso;
    //@Size(max = 70)
    @Column(name = "marca")
    private String marca;
    //@Size(max = 20)
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "fecha_reg")
    private LocalDateTime fechaReg;
    @Column(name = "fecha_mod")
    private LocalDateTime fechaMod;
    //@Size(max = 15)
    @Column(name = "usua_reg")
    private String usuaReg;
    //@Size(max = 15)
    @Column(name = "usua_mod")
    private String usuaMod;
    @Column(name = "estado")
    private Integer estado;
    //@Size(max = 15)
    @Column(name = "proveedor_favor")
    private String proveedorFavor;
    //@Size(max = 3)
    @Column(name = "cod_concepto")
    private String codConcepto;
    //@Size(max = 2)
    @Column(name = "cod_familia")
    private String codFamilia;
    @Column(name = "tipo_articulo")
    private Integer tipoArticulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLogCatalogo")
    private List<LogRequerimientoDet> logRequerimientoDetList;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "idLogCatalogo")
    //private List<LogOrdenesDet> logOrdenesDetList;
    //@JoinColumn(name = "id_cos_familia_det_conceptos", referencedColumnName = "id_cos_familia_det_conceptos")
    //@ManyToOne
    //private CosFamiliaDetConceptos idCosFamiliaDetConceptos;
    @JoinColumn(name = "id_log_tipo_catalogo", referencedColumnName = "id_log_tipo_catalogo")
    @ManyToOne(optional = false)
    private LogTipoCatalogo idLogTipoCatalogo;
    @JoinColumn(name = "id_pub_empresas", referencedColumnName = "id_pub_empresas")
    @ManyToOne(optional = false)
    private PubEmpresas idPubEmpresas;

    public LogCatalogo(LogCatalogoVO data) {

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
        /*this.idCosFamiliaDetConceptos = new CosFamiliaDetConceptos(data.getIdCosFamiliaDetConceptos());*/
        this.idLogTipoCatalogo = new LogTipoCatalogo(data.getIdLogTipoCatalogo());
        this.idPubEmpresas = new PubEmpresas(data.getIdPubEmpresas());

    }

    public LogCatalogo(Long idLogCatalogo) {
        this.idLogCatalogo = idLogCatalogo;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public List<LogRequerimientoDet> getLogRequerimientoDetList() {
        return logRequerimientoDetList;
    }

    public void setLogRequerimientoDetList(List<LogRequerimientoDet> logRequerimientoDetList) {
        this.logRequerimientoDetList = logRequerimientoDetList;
    }

    public LogTipoCatalogo getIdLogTipoCatalogo() {
        return idLogTipoCatalogo;
    }

    public void setIdLogTipoCatalogo(LogTipoCatalogo idLogTipoCatalogo) {
        this.idLogTipoCatalogo = idLogTipoCatalogo;
    }

    public PubEmpresas getIdPubEmpresas() {
        return idPubEmpresas;
    }

    public void setIdPubEmpresas(PubEmpresas idPubEmpresas) {
        this.idPubEmpresas = idPubEmpresas;
    }
}
