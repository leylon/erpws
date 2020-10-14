package com.ti.erpws.almacen.model;

import com.ti.erpws.almacen.entity.Planta;

public class PlantaVO {

    private Long idLocales;
    private String empresa;
    private String codLocal;
    private String descripcion;
    private String codPtoventa;
    private String direccion;
    private String idCencos;
    private String codAlmacen;
    private Character metodoDistrCosto;
    private Integer indTipoProduccion;
    private Long idPubEmpresas;

    public PlantaVO(){

    }

    public PlantaVO(Planta data){
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
