package com.ti.erpws.logistica.model;
// Generated 17/04/2019 11:20:35 AM by Hibernate Tools 4.3.1

//import lombok.Data;


import com.ti.erpws.logistica.entity.LogTipoCatalogo;

/**
 * LogTipoCatalogoRepository generated by hbm2java
 */
//@Data
public class LogTipoCatalogoVO {

    private Long idLogTipoCatalogo;
    private String empresa;
    private String tipoCatalogo;
    private String descripcion;
    private String catalogoPadre;
    private Integer nivel;
    private Integer flagAlmacen;
    private Integer flagProvisiona;
    private String codCta;
    private String codFamilia;
    private Long idPubEmpresas;

     public LogTipoCatalogoVO() {
     }
     
     public LogTipoCatalogoVO(LogTipoCatalogo data) {
    	 
    	    this.idLogTipoCatalogo = data.getIdLogTipoCatalogo();
    	    this.empresa = data.getEmpresa();
    	    this.tipoCatalogo = data.getTipoCatalogo();
    	    this.descripcion = data.getDescripcion();
    	    this.catalogoPadre = data.getCatalogoPadre();
    	    this.nivel = data.getNivel();
    	    this.flagAlmacen = data.getFlagAlmacen();
    	    this.flagProvisiona = data.getFlagProvisiona();
    	    this.codCta = data.getCodCta();
    	    this.codFamilia = data.getCodFamilia();
    	  //  this.idPubEmpresas = data.getIdPubEmpresas().getIdPubEmpresas();
    	 
     }

    public Long getIdLogTipoCatalogo() {
        return idLogTipoCatalogo;
    }

    public void setIdLogTipoCatalogo(Long idLogTipoCatalogo) {
        this.idLogTipoCatalogo = idLogTipoCatalogo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCatalogoPadre() {
        return catalogoPadre;
    }

    public void setCatalogoPadre(String catalogoPadre) {
        this.catalogoPadre = catalogoPadre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getFlagAlmacen() {
        return flagAlmacen;
    }

    public void setFlagAlmacen(Integer flagAlmacen) {
        this.flagAlmacen = flagAlmacen;
    }

    public Integer getFlagProvisiona() {
        return flagProvisiona;
    }

    public void setFlagProvisiona(Integer flagProvisiona) {
        this.flagProvisiona = flagProvisiona;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getCodFamilia() {
        return codFamilia;
    }

    public void setCodFamilia(String codFamilia) {
        this.codFamilia = codFamilia;
    }

    /*public Long getIdPubEmpresas() {
        return idPubEmpresas;
    }

    public void setIdPubEmpresas(Long idPubEmpresas) {
        this.idPubEmpresas = idPubEmpresas;
    }*/
}

