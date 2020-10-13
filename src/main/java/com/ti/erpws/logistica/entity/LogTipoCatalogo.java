/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ti.erpws.logistica.entity;

import com.sun.istack.NotNull;
import com.ti.erpws.logistica.model.response.LogTipoCatalogoVO;


import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Leylon Ocaña Sanchez
 */
@Entity
@Table(name = "log_tipo_catalogo")
@NamedQueries({
    @NamedQuery(name = "LogTipoCatalogo.findAll", query = "SELECT l FROM LogTipoCatalogo l")
    , @NamedQuery(name = "LogTipoCatalogo.findByIdLogTipoCatalogo", query = "SELECT l FROM LogTipoCatalogo l WHERE l.idLogTipoCatalogo = :idLogTipoCatalogo")
    , @NamedQuery(name = "LogTipoCatalogo.findByEmpresa", query = "SELECT l FROM LogTipoCatalogo l WHERE l.empresa = :empresa")
    , @NamedQuery(name = "LogTipoCatalogo.findByTipoCatalogo", query = "SELECT l FROM LogTipoCatalogo l WHERE l.tipoCatalogo = :tipoCatalogo")
    , @NamedQuery(name = "LogTipoCatalogo.findByDescripcion", query = "SELECT l FROM LogTipoCatalogo l WHERE l.descripcion = :descripcion")
    , @NamedQuery(name = "LogTipoCatalogo.findByCatalogoPadre", query = "SELECT l FROM LogTipoCatalogo l WHERE l.catalogoPadre = :catalogoPadre")
    , @NamedQuery(name = "LogTipoCatalogo.findByNivel", query = "SELECT l FROM LogTipoCatalogo l WHERE l.nivel = :nivel")
    , @NamedQuery(name = "LogTipoCatalogo.findByFlagAlmacen", query = "SELECT l FROM LogTipoCatalogo l WHERE l.flagAlmacen = :flagAlmacen")
    , @NamedQuery(name = "LogTipoCatalogo.findByFlagProvisiona", query = "SELECT l FROM LogTipoCatalogo l WHERE l.flagProvisiona = :flagProvisiona")
    , @NamedQuery(name = "LogTipoCatalogo.findByCodCta", query = "SELECT l FROM LogTipoCatalogo l WHERE l.codCta = :codCta")
    , @NamedQuery(name = "LogTipoCatalogo.findByCodFamilia", query = "SELECT l FROM LogTipoCatalogo l WHERE l.codFamilia = :codFamilia")})
public class LogTipoCatalogo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_log_tipo_catalogo")
    private Long idLogTipoCatalogo;
    @Basic(optional = false)

    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_catalogo")
    private String tipoCatalogo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "catalogo_padre")
    private String catalogoPadre;
    @Column(name = "nivel")
    private Integer nivel;
    @Column(name = "flag_almacen")
    private Integer flagAlmacen;
    @Column(name = "flag_provisiona")
    private Integer flagProvisiona;
    @Column(name = "cod_cta")
    private String codCta;
    @Column(name = "cod_familia")
    private String codFamilia;


    public LogTipoCatalogo() {
    }
    
    public LogTipoCatalogo(LogTipoCatalogoVO data) {
   	 
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
	   // this.idPubEmpresas = new PubEmpresas(data.getIdPubEmpresas());
	 
    }

    public LogTipoCatalogo(Long idLogTipoCatalogo) {
        this.idLogTipoCatalogo = idLogTipoCatalogo;
    }

    public LogTipoCatalogo(Long idLogTipoCatalogo, String empresa, String tipoCatalogo) {
        this.idLogTipoCatalogo = idLogTipoCatalogo;
        this.empresa = empresa;
        this.tipoCatalogo = tipoCatalogo;
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


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLogTipoCatalogo != null ? idLogTipoCatalogo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogTipoCatalogo)) {
            return false;
        }
        LogTipoCatalogo other = (LogTipoCatalogo) object;
        if ((this.idLogTipoCatalogo == null && other.idLogTipoCatalogo != null) || (this.idLogTipoCatalogo != null && !this.idLogTipoCatalogo.equals(other.idLogTipoCatalogo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.osf.siga.admin.entity.mapeo.LogTipoCatalogo[ idLogTipoCatalogo=" + idLogTipoCatalogo + " ]";
    }
    
}
