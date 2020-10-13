package com.ti.erpws.almacen.entity;

import com.ti.erpws.almacen.model.PlantaVO;

import javax.persistence.*;
import java.io.Serializable;
/*
 * Autor: Jerry Mechato Cotos
 * Fecha:12/10/2020
 * Comentario:Clase de la tabla Locales
 * */
@Entity
@Table(name = "locales")
public class Planta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_locales")
    private Long idLocales;
    @Basic(optional = false)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)

    @Column(name = "cod_local")
    private String codLocal;

    private String descripcion;

    @Column(name = "cod_ptoventa")
    private String codPtoventa;

    private String direccion;

    @Column(name = "id_cencos")
    private String idCencos;

    @Column(name = "cod_almacen")
    private String codAlmacen;

    @Column(name = "metodo_distr_costo")
    private Character metodoDistrCosto;

    @Column(name = "ind_tipo_produccion")
    private Integer indTipoProduccion;

    @Column(name = "id_pub_empresas")
    private Long idPubEmpresas;

    //creamos el constructos

    public Planta(){

    }

    public Planta(PlantaVO data){
        this.idLocales = data.getIdLocales();
        this.empresa = data.getEmpresa();
        this.codLocal = data.getCodLocal();
        this.descripcion = data.getDescripcion();
        this.codPtoventa = data.getCodPtoventa();
        this.direccion = data.getDireccion();
        this.idCencos = data.getIdCencos();
        this.codAlmacen = data.getCodAlmacen();
        this.metodoDistrCosto = data.getMetodoDistrCosto();
        this.indTipoProduccion = data.getIndTipoProduccion();
        this.idPubEmpresas = data.getIdPubEmpresas();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdLocales() {
        return idLocales;
    }

    public void setIdLocales(Long idLocales) {
        this.idLocales = idLocales;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCodLocal() {
        return codLocal;
    }

    public void setCodLocal(String codLocal) {
        this.codLocal = codLocal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodPtoventa() {
        return codPtoventa;
    }

    public void setCodPtoventa(String codPtoventa) {
        this.codPtoventa = codPtoventa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdCencos() {
        return idCencos;
    }

    public void setIdCencos(String idCencos) {
        this.idCencos = idCencos;
    }

    public String getCodAlmacen() {
        return codAlmacen;
    }

    public void setCodAlmacen(String codAlmacen) {
        this.codAlmacen = codAlmacen;
    }

    public Character getMetodoDistrCosto() {
        return metodoDistrCosto;
    }

    public void setMetodoDistrCosto(Character metodoDistrCosto) {
        this.metodoDistrCosto = metodoDistrCosto;
    }

    public Integer getIndTipoProduccion() {
        return indTipoProduccion;
    }

    public void setIndTipoProduccion(Integer indTipoProduccion) {
        this.indTipoProduccion = indTipoProduccion;
    }

    public Long getIdPubEmpresas() {
        return idPubEmpresas;
    }

    public void setIdPubEmpresas(Long idPubEmpresas) {
        this.idPubEmpresas = idPubEmpresas;
    }

}

