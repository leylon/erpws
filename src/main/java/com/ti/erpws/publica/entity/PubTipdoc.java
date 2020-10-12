/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ti.erpws.publica.entity;



import com.ti.erpws.publica.model.response.PubTipdocVO;

import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Leylon Ocaña Sanchez
 */
@Entity
@Table(name = "pub_tipdoc")
@NamedQueries({
    @NamedQuery(name = "PubTipdoc.findAll", query = "SELECT p FROM PubTipdoc p")
    , @NamedQuery(name = "PubTipdoc.findByIdPubTipdoc", query = "SELECT p FROM PubTipdoc p WHERE p.idPubTipdoc = :idPubTipdoc")
    , @NamedQuery(name = "PubTipdoc.findByTipdoc", query = "SELECT p FROM PubTipdoc p WHERE p.tipdoc = :tipdoc")
    , @NamedQuery(name = "PubTipdoc.findByNombre", query = "SELECT p FROM PubTipdoc p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PubTipdoc.findByCodsunat", query = "SELECT p FROM PubTipdoc p WHERE p.codsunat = :codsunat")
    , @NamedQuery(name = "PubTipdoc.findByComprobantedepago", query = "SELECT p FROM PubTipdoc p WHERE p.comprobantedepago = :comprobantedepago")
    , @NamedQuery(name = "PubTipdoc.findByEstado", query = "SELECT p FROM PubTipdoc p WHERE p.estado = :estado")
    , @NamedQuery(name = "PubTipdoc.findBySaldo", query = "SELECT p FROM PubTipdoc p WHERE p.saldo = :saldo")
    , @NamedQuery(name = "PubTipdoc.findByAplicadoc", query = "SELECT p FROM PubTipdoc p WHERE p.aplicadoc = :aplicadoc")
    , @NamedQuery(name = "PubTipdoc.findByTipoasiento", query = "SELECT p FROM PubTipdoc p WHERE p.tipoasiento = :tipoasiento")
    , @NamedQuery(name = "PubTipdoc.findByTipper", query = "SELECT p FROM PubTipdoc p WHERE p.tipper = :tipper")
    , @NamedQuery(name = "PubTipdoc.findBySyscaj", query = "SELECT p FROM PubTipdoc p WHERE p.syscaj = :syscaj")
    , @NamedQuery(name = "PubTipdoc.findBySyspro", query = "SELECT p FROM PubTipdoc p WHERE p.syspro = :syspro")
    , @NamedQuery(name = "PubTipdoc.findBySysproTipreg", query = "SELECT p FROM PubTipdoc p WHERE p.sysproTipreg = :sysproTipreg")
    , @NamedQuery(name = "PubTipdoc.findBySysproApldoc", query = "SELECT p FROM PubTipdoc p WHERE p.sysproApldoc = :sysproApldoc")
    , @NamedQuery(name = "PubTipdoc.findBySysproTipimp", query = "SELECT p FROM PubTipdoc p WHERE p.sysproTipimp = :sysproTipimp")
    , @NamedQuery(name = "PubTipdoc.findByEtiqueta", query = "SELECT p FROM PubTipdoc p WHERE p.etiqueta = :etiqueta")
    , @NamedQuery(name = "PubTipdoc.findByFAlmacen", query = "SELECT p FROM PubTipdoc p WHERE p.fAlmacen = :fAlmacen")
    , @NamedQuery(name = "PubTipdoc.findBySysvtas", query = "SELECT p FROM PubTipdoc p WHERE p.sysvtas = :sysvtas")
    , @NamedQuery(name = "PubTipdoc.findByPdbSerdocMaxlong", query = "SELECT p FROM PubTipdoc p WHERE p.pdbSerdocMaxlong = :pdbSerdocMaxlong")
    , @NamedQuery(name = "PubTipdoc.findByPdbNumdocMaxlong", query = "SELECT p FROM PubTipdoc p WHERE p.pdbNumdocMaxlong = :pdbNumdocMaxlong")
    , @NamedQuery(name = "PubTipdoc.findByPdbFlagFormulario", query = "SELECT p FROM PubTipdoc p WHERE p.pdbFlagFormulario = :pdbFlagFormulario")
    , @NamedQuery(name = "PubTipdoc.findByExpReguNumdoc", query = "SELECT p FROM PubTipdoc p WHERE p.expReguNumdoc = :expReguNumdoc")
    , @NamedQuery(name = "PubTipdoc.findByExpReguSerdoc", query = "SELECT p FROM PubTipdoc p WHERE p.expReguSerdoc = :expReguSerdoc")
    , @NamedQuery(name = "PubTipdoc.findByPleSignoSerdoc", query = "SELECT p FROM PubTipdoc p WHERE p.pleSignoSerdoc = :pleSignoSerdoc")
    , @NamedQuery(name = "PubTipdoc.findByPleSerdocLong", query = "SELECT p FROM PubTipdoc p WHERE p.pleSerdocLong = :pleSerdocLong")
    , @NamedQuery(name = "PubTipdoc.findByPleSignoNumdoc", query = "SELECT p FROM PubTipdoc p WHERE p.pleSignoNumdoc = :pleSignoNumdoc")
    , @NamedQuery(name = "PubTipdoc.findByPleNumdocLong", query = "SELECT p FROM PubTipdoc p WHERE p.pleNumdocLong = :pleNumdocLong")
    , @NamedQuery(name = "PubTipdoc.findByPleVenNulo", query = "SELECT p FROM PubTipdoc p WHERE p.pleVenNulo = :pleVenNulo")
    , @NamedQuery(name = "PubTipdoc.findByPleComNulo", query = "SELECT p FROM PubTipdoc p WHERE p.pleComNulo = :pleComNulo")
    , @NamedQuery(name = "PubTipdoc.findByPleDiaNulo", query = "SELECT p FROM PubTipdoc p WHERE p.pleDiaNulo = :pleDiaNulo")
    , @NamedQuery(name = "PubTipdoc.findByMensajeErrorNumdoc", query = "SELECT p FROM PubTipdoc p WHERE p.mensajeErrorNumdoc = :mensajeErrorNumdoc")
    , @NamedQuery(name = "PubTipdoc.findByMensajeErrorSerdoc", query = "SELECT p FROM PubTipdoc p WHERE p.mensajeErrorSerdoc = :mensajeErrorSerdoc")
    , @NamedQuery(name = "PubTipdoc.findByUtilizadoEnOc", query = "SELECT p FROM PubTipdoc p WHERE p.utilizadoEnOc = :utilizadoEnOc")
    , @NamedQuery(name = "PubTipdoc.findByReqValidacion", query = "SELECT p FROM PubTipdoc p WHERE p.reqValidacion = :reqValidacion")
    , @NamedQuery(name = "PubTipdoc.findByIndDetraccion", query = "SELECT p FROM PubTipdoc p WHERE p.indDetraccion = :indDetraccion")
    , @NamedQuery(name = "PubTipdoc.findByAbreviatura", query = "SELECT p FROM PubTipdoc p WHERE p.abreviatura = :abreviatura")
    , @NamedQuery(name = "PubTipdoc.findBySysLiqServ", query = "SELECT p FROM PubTipdoc p WHERE p.sysLiqServ = :sysLiqServ")
    , @NamedQuery(name = "PubTipdoc.findByAplicaret", query = "SELECT p FROM PubTipdoc p WHERE p.aplicaret = :aplicaret")})
public class PubTipdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pub_tipdoc")
    private Long idPubTipdoc;
    @Basic(optional = false)

    @Column(name = "tipdoc")
    private String tipdoc;
    @Basic(optional = false)

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "codsunat")
    private String codsunat;
    @Column(name = "comprobantedepago")
    private Character comprobantedepago;
    @Column(name = "estado")
    private Character estado;
    @Column(name = "saldo")
    private Short saldo;
    @Column(name = "aplicadoc")
    private Character aplicadoc;

    @Column(name = "tipoasiento")
    private String tipoasiento;

    @Column(name = "tipper")
    private String tipper;
    @Column(name = "syscaj")
    private Character syscaj;
    @Column(name = "syspro")
    private Character syspro;
    @Column(name = "syspro_tipreg")
    private Character sysproTipreg;
    @Column(name = "syspro_apldoc")
    private Character sysproApldoc;
    @Column(name = "syspro_tipimp")
    private Character sysproTipimp;

    @Column(name = "etiqueta")
    private String etiqueta;
    @Column(name = "f_almacen")
    private Integer fAlmacen;

    @Column(name = "sysvtas")
    private String sysvtas;
    @Column(name = "pdb_serdoc_maxlong")
    private Integer pdbSerdocMaxlong;
    @Column(name = "pdb_numdoc_maxlong")
    private Integer pdbNumdocMaxlong;
    @Column(name = "pdb_flag_formulario")
    private Integer pdbFlagFormulario;

    @Column(name = "exp_regu_numdoc")
    private String expReguNumdoc;

    @Column(name = "exp_regu_serdoc")
    private String expReguSerdoc;
    @Column(name = "ple_signo_serdoc")
    private Character pleSignoSerdoc;

    @Column(name = "ple_serdoc_long")
    private String pleSerdocLong;
    @Column(name = "ple_signo_numdoc")
    private Character pleSignoNumdoc;

    @Column(name = "ple_numdoc_long")
    private String pleNumdocLong;
    @Column(name = "ple_ven_nulo")
    private Character pleVenNulo;
    @Column(name = "ple_com_nulo")
    private Character pleComNulo;
    @Column(name = "ple_dia_nulo")
    private Character pleDiaNulo;

    @Column(name = "mensaje_error_numdoc")
    private String mensajeErrorNumdoc;

    @Column(name = "mensaje_error_serdoc")
    private String mensajeErrorSerdoc;

    @Column(name = "utilizado_en_oc")
    private String utilizadoEnOc;
    @Column(name = "req_validacion")
    private Character reqValidacion;
    @Column(name = "ind_detraccion")
    private Integer indDetraccion;

    @Column(name = "abreviatura")
    private String abreviatura;
    @Column(name = "sys_liq_serv")
    private Character sysLiqServ;
    @Column(name = "aplicaret")
    private Character aplicaret;


    public PubTipdoc() {
    }
    
    public PubTipdoc(PubTipdocVO data) {
    	
        this.idPubTipdoc = data.getIdPubTipdoc();
        this.tipdoc = data.getTipdoc();
        this.nombre = data.getNombre();
        this.codsunat = data.getCodsunat();
        this.comprobantedepago = data.getComprobantedepago();
        this.estado = data.getEstado();
        this.saldo = data.getSaldo();
        this.aplicadoc = data.getAplicadoc();
        this.tipoasiento = data.getTipoasiento();
        this.tipper = data.getTipper();
        this.syscaj = data.getSyscaj();
        this.syspro = data.getSyspro();
        this.sysproTipreg = data.getSysproTipreg();
        this.sysproApldoc = data.getSysproApldoc();
        this.sysproTipimp = data.getSysproTipimp();
        this.etiqueta = data.getEtiqueta();
        this.fAlmacen = data.getfAlmacen();
        this.sysvtas = data.getSysvtas();
        this.pdbSerdocMaxlong = data.getPdbSerdocMaxlong();
        this.pdbNumdocMaxlong = data.getPdbNumdocMaxlong();
        this.pdbFlagFormulario = data.getPdbFlagFormulario();
        this.expReguNumdoc = data.getExpReguNumdoc();
        this.expReguSerdoc = data.getExpReguSerdoc();
        this.pleSignoSerdoc = data.getPleSignoSerdoc();
        this.pleSerdocLong = data.getPleSerdocLong();
        this.pleSignoNumdoc = data.getPleSignoNumdoc();
        this.pleNumdocLong = data.getPleNumdocLong();
        this.pleVenNulo = data.getPleVenNulo();
        this.pleComNulo = data.getPleComNulo();
        this.pleDiaNulo = data.getPleDiaNulo();
        this.mensajeErrorNumdoc = data.getMensajeErrorNumdoc();
        this.mensajeErrorSerdoc = data.getMensajeErrorSerdoc();
        this.utilizadoEnOc = data.getUtilizadoEnOc();
        this.reqValidacion = data.getReqValidacion();
        this.indDetraccion = data.getIndDetraccion();
        this.abreviatura = data.getAbreviatura();
        this.sysLiqServ = data.getSysLiqServ();
        this.aplicaret = data.getAplicaret();
    	
    }

    public PubTipdoc(Long idPubTipdoc) {
        this.idPubTipdoc = idPubTipdoc;
    }

    public PubTipdoc(Long idPubTipdoc, String tipdoc, String nombre) {
        this.idPubTipdoc = idPubTipdoc;
        this.tipdoc = tipdoc;
        this.nombre = nombre;
    }

    public Long getIdPubTipdoc() {
        return idPubTipdoc;
    }

    public void setIdPubTipdoc(Long idPubTipdoc) {
        this.idPubTipdoc = idPubTipdoc;
    }

    public String getTipdoc() {
        return tipdoc;
    }

    public void setTipdoc(String tipdoc) {
        this.tipdoc = tipdoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodsunat() {
        return codsunat;
    }

    public void setCodsunat(String codsunat) {
        this.codsunat = codsunat;
    }

    public Character getComprobantedepago() {
        return comprobantedepago;
    }

    public void setComprobantedepago(Character comprobantedepago) {
        this.comprobantedepago = comprobantedepago;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Short getSaldo() {
        return saldo;
    }

    public void setSaldo(Short saldo) {
        this.saldo = saldo;
    }

    public Character getAplicadoc() {
        return aplicadoc;
    }

    public void setAplicadoc(Character aplicadoc) {
        this.aplicadoc = aplicadoc;
    }

    public String getTipoasiento() {
        return tipoasiento;
    }

    public void setTipoasiento(String tipoasiento) {
        this.tipoasiento = tipoasiento;
    }

    public String getTipper() {
        return tipper;
    }

    public void setTipper(String tipper) {
        this.tipper = tipper;
    }

    public Character getSyscaj() {
        return syscaj;
    }

    public void setSyscaj(Character syscaj) {
        this.syscaj = syscaj;
    }

    public Character getSyspro() {
        return syspro;
    }

    public void setSyspro(Character syspro) {
        this.syspro = syspro;
    }

    public Character getSysproTipreg() {
        return sysproTipreg;
    }

    public void setSysproTipreg(Character sysproTipreg) {
        this.sysproTipreg = sysproTipreg;
    }

    public Character getSysproApldoc() {
        return sysproApldoc;
    }

    public void setSysproApldoc(Character sysproApldoc) {
        this.sysproApldoc = sysproApldoc;
    }

    public Character getSysproTipimp() {
        return sysproTipimp;
    }

    public void setSysproTipimp(Character sysproTipimp) {
        this.sysproTipimp = sysproTipimp;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Integer getFAlmacen() {
        return fAlmacen;
    }

    public void setFAlmacen(Integer fAlmacen) {
        this.fAlmacen = fAlmacen;
    }

    public String getSysvtas() {
        return sysvtas;
    }

    public void setSysvtas(String sysvtas) {
        this.sysvtas = sysvtas;
    }

    public Integer getPdbSerdocMaxlong() {
        return pdbSerdocMaxlong;
    }

    public void setPdbSerdocMaxlong(Integer pdbSerdocMaxlong) {
        this.pdbSerdocMaxlong = pdbSerdocMaxlong;
    }

    public Integer getPdbNumdocMaxlong() {
        return pdbNumdocMaxlong;
    }

    public void setPdbNumdocMaxlong(Integer pdbNumdocMaxlong) {
        this.pdbNumdocMaxlong = pdbNumdocMaxlong;
    }

    public Integer getPdbFlagFormulario() {
        return pdbFlagFormulario;
    }

    public void setPdbFlagFormulario(Integer pdbFlagFormulario) {
        this.pdbFlagFormulario = pdbFlagFormulario;
    }

    public String getExpReguNumdoc() {
        return expReguNumdoc;
    }

    public void setExpReguNumdoc(String expReguNumdoc) {
        this.expReguNumdoc = expReguNumdoc;
    }

    public String getExpReguSerdoc() {
        return expReguSerdoc;
    }

    public void setExpReguSerdoc(String expReguSerdoc) {
        this.expReguSerdoc = expReguSerdoc;
    }

    public Character getPleSignoSerdoc() {
        return pleSignoSerdoc;
    }

    public void setPleSignoSerdoc(Character pleSignoSerdoc) {
        this.pleSignoSerdoc = pleSignoSerdoc;
    }

    public String getPleSerdocLong() {
        return pleSerdocLong;
    }

    public void setPleSerdocLong(String pleSerdocLong) {
        this.pleSerdocLong = pleSerdocLong;
    }

    public Character getPleSignoNumdoc() {
        return pleSignoNumdoc;
    }

    public void setPleSignoNumdoc(Character pleSignoNumdoc) {
        this.pleSignoNumdoc = pleSignoNumdoc;
    }

    public String getPleNumdocLong() {
        return pleNumdocLong;
    }

    public void setPleNumdocLong(String pleNumdocLong) {
        this.pleNumdocLong = pleNumdocLong;
    }

    public Character getPleVenNulo() {
        return pleVenNulo;
    }

    public void setPleVenNulo(Character pleVenNulo) {
        this.pleVenNulo = pleVenNulo;
    }

    public Character getPleComNulo() {
        return pleComNulo;
    }

    public void setPleComNulo(Character pleComNulo) {
        this.pleComNulo = pleComNulo;
    }

    public Character getPleDiaNulo() {
        return pleDiaNulo;
    }

    public void setPleDiaNulo(Character pleDiaNulo) {
        this.pleDiaNulo = pleDiaNulo;
    }

    public String getMensajeErrorNumdoc() {
        return mensajeErrorNumdoc;
    }

    public void setMensajeErrorNumdoc(String mensajeErrorNumdoc) {
        this.mensajeErrorNumdoc = mensajeErrorNumdoc;
    }

    public String getMensajeErrorSerdoc() {
        return mensajeErrorSerdoc;
    }

    public void setMensajeErrorSerdoc(String mensajeErrorSerdoc) {
        this.mensajeErrorSerdoc = mensajeErrorSerdoc;
    }

    public String getUtilizadoEnOc() {
        return utilizadoEnOc;
    }

    public void setUtilizadoEnOc(String utilizadoEnOc) {
        this.utilizadoEnOc = utilizadoEnOc;
    }

    public Character getReqValidacion() {
        return reqValidacion;
    }

    public void setReqValidacion(Character reqValidacion) {
        this.reqValidacion = reqValidacion;
    }

    public Integer getIndDetraccion() {
        return indDetraccion;
    }

    public void setIndDetraccion(Integer indDetraccion) {
        this.indDetraccion = indDetraccion;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public Character getSysLiqServ() {
        return sysLiqServ;
    }

    public void setSysLiqServ(Character sysLiqServ) {
        this.sysLiqServ = sysLiqServ;
    }

    public Character getAplicaret() {
        return aplicaret;
    }

    public void setAplicaret(Character aplicaret) {
        this.aplicaret = aplicaret;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPubTipdoc != null ? idPubTipdoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PubTipdoc)) {
            return false;
        }
        PubTipdoc other = (PubTipdoc) object;
        if ((this.idPubTipdoc == null && other.idPubTipdoc != null) || (this.idPubTipdoc != null && !this.idPubTipdoc.equals(other.idPubTipdoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.osf.siga.admin.entity.mapeo.PubTipdoc[ idPubTipdoc=" + idPubTipdoc + " ]";
    }
    
}
