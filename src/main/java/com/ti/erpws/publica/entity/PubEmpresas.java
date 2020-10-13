package com.ti.erpws.publica.entity;

import com.ti.erpws.publica.model.response.PubEmpresasVO;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "pub_empresas")
@NamedQueries({
        @NamedQuery(name = "PubEmpresas.findAll", query = "SELECT p FROM PubEmpresas p")
})
public class PubEmpresas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pub_empresas")
    private Long idPubEmpresas;
    @Basic(optional = false)
    //@NotNull
    ////@Size(min = 1, max = 2)
    @Column(name = "codemp")
    private String codemp;
    ////@Size(max = 2)
    @Column(name = "codgru")
    private String codgru;
    @Basic(optional = false)
    //@NotNull
    ////@Size(min = 1, max = 50)
    @Column(name = "nomemp")
    private String nomemp;
    ////@Size(max = 100)
    @Column(name = "dirfis")
    private String dirfis;
    ////@Size(max = 100)
    @Column(name = "dirleg")
    private String dirleg;
    ////@Size(max = 11)
    @Column(name = "ubigeo")
    private String ubigeo;
    ////@Size(max = 11)
    @Column(name = "ruc")
    private String ruc;
    ////@Size(max = 90)
    @Column(name = "representante")
    private String representante;
    ////@Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    ////@Size(max = 20)
    @Column(name = "fax")
    private String fax;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    ////@Size(max = 30)
    @Column(name = "email")
    private String email;
    ////@Size(max = 50)
    @Column(name = "pagweb")
    private String pagweb;
    ////@Size(max = 15)
    @Column(name = "reg_patronal")
    private String regPatronal;
    ////@Size(max = 20)
    @Column(name = "giro_negocio")
    private String giroNegocio;
    ////@Size(max = 20)
    @Column(name = "tipo_negocio")
    private String tipoNegocio;
    ////@Size(max = 30)
    @Column(name = "nom_representante")
    private String nomRepresentante;
    ////@Size(max = 11)
    @Column(name = "dni_representante")
    private String dniRepresentante;
    @Column(name = "estado")
    private Character estado;
    ////@Size(max = 20)
    @Column(name = "usuario")
    private String usuario;
    ////@Size(max = 20)
    @Column(name = "nombrepc")
    private String nombrepc;
    @Column(name = "fechamodificacion")
    private LocalDateTime fechamodificacion;
    ////@Size(max = 15)
    @Column(name = "ctaperdc")
    private String ctaperdc;
    ////@Size(max = 15)
    @Column(name = "ctagandc")
    private String ctagandc;
    ////@Size(max = 15)
    @Column(name = "cenctodc")
    private String cenctodc;
    ////@Size(max = 5)
    @Column(name = "codopeperdc")
    private String codopeperdc;
    ////@Size(max = 5)
    @Column(name = "codopegandc")
    private String codopegandc;
    ////@Size(max = 5)
    @Column(name = "codopea_ing")
    private String codopeaIng;
    ////@Size(max = 5)
    @Column(name = "codopea_egr")
    private String codopeaEgr;
    ////@Size(max = 15)
    @Column(name = "codctaa_ing")
    private String codctaaIng;
    ////@Size(max = 15)
    @Column(name = "codctaa_ingd")
    private String codctaaIngd;
    ////@Size(max = 15)
    @Column(name = "codctaa_egr")
    private String codctaaEgr;
    ////@Size(max = 15)
    @Column(name = "codctaa_egrd")
    private String codctaaEgrd;
    ////@Size(max = 15)
    @Column(name = "codopev_ing")
    private String codopevIng;
    ////@Size(max = 15)
    @Column(name = "codopev_egr")
    private String codopevEgr;
    ////@Size(max = 15)
    @Column(name = "codctav_ing")
    private String codctavIng;
    //@Size(max = 15)
    @Column(name = "codctav_ingd")
    private String codctavIngd;
    //@Size(max = 15)
    @Column(name = "codctav_egr")
    private String codctavEgr;
    //@Size(max = 15)
    @Column(name = "codctav_egrd")
    private String codctavEgrd;
    //@Size(max = 15)
    @Column(name = "iniciales")
    private String iniciales;
    //@Size(max = 40)
    @Column(name = "ciudad_legal")
    private String ciudadLegal;
    //@Size(max = 15)
    @Column(name = "codcta_garcar")
    private String codctaGarcar;
    //@Size(max = 15)
    @Column(name = "codcta_garabo")
    private String codctaGarabo;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "agente_retencion")
    private int agenteRetencion;
    @Column(name = "sec_lote_detraccion")
    private Integer secLoteDetraccion;
    //@Size(max = 2)
    @Column(name = "tipo_plan_ctas")
    private String tipoPlanCtas;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "agente_percepcion")
    private int agentePercepcion;
    //@Size(max = 200)
    @Column(name = "aduana_datos")
    private String aduanaDatos;
    //@Size(max = 1)
    @Column(name = "ind_operaciones")
    private String indOperaciones;
    @Column(name = "flag_rc_igvdif")
    private Character flagRcIgvdif;
    @Column(name = "flag_endeudamiento")
    private Integer flagEndeudamiento;
    @Column(name = "tipo_vista_eeff")
    private Character tipoVistaEeff;
    @Column(name = "flag_valida_cencos")
    private Character flagValidaCencos;
    @Column(name = "aprob_conta_ccosto")
    private Character aprobContaCcosto;
    @Column(name = "flag_exportador")
    private Integer flagExportador;
    //@Size(max = 150)
    @Column(name = "correo_sigga")
    private String correoSigga;
    //@Size(max = 200)
    @Column(name = "header")
    private String header;
    //@Size(max = 200)
    @Column(name = "footer")
    private String footer;
    //@Size(max = 30)
    @Column(name = "cta_detraccion")
    private String ctaDetraccion;

    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPubEmpresas")
    private List<LogCatalogo> logCatalogoList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPubEmpresas")
    private List<LogTipoCatalogo> logTipoCatalogoList;*/

    public PubEmpresas() {
    }

    public PubEmpresas(PubEmpresasVO pubEmpresasVO) {
        this.idPubEmpresas = pubEmpresasVO.getIdPubEmpresas();
        this.codemp = pubEmpresasVO.getCodemp();
        this.codgru = pubEmpresasVO.getCodgru();
        this.nomemp = pubEmpresasVO.getNomemp();
        this.dirfis = pubEmpresasVO.getDirfis();
        this.dirleg = pubEmpresasVO.getDirleg();
        this.ubigeo = pubEmpresasVO.getUbigeo();
        this.ruc = pubEmpresasVO.getRuc();
        this.representante = pubEmpresasVO.getRepresentante();
        this.telefono = pubEmpresasVO.getTelefono();
        this.fax = pubEmpresasVO.getFax();
        this.email = pubEmpresasVO.getEmail();
        this.pagweb = pubEmpresasVO.getPagweb();
        this.regPatronal = pubEmpresasVO.getRegPatronal();
        this.giroNegocio = pubEmpresasVO.getGiroNegocio();
        this.tipoNegocio = pubEmpresasVO.getTipoNegocio();
        this.nomRepresentante = pubEmpresasVO.getNomRepresentante();
        this.dniRepresentante = pubEmpresasVO.getDniRepresentante();
        this.estado = pubEmpresasVO.getEstado();
        this.usuario = pubEmpresasVO.getUsuario();
        this.nombrepc = pubEmpresasVO.getNombrepc();
        this.fechamodificacion = pubEmpresasVO.getFechamodificacion();
        this.ctaperdc = pubEmpresasVO.getCtaperdc();
        this.ctagandc = pubEmpresasVO.getCtagandc();
        this.cenctodc = pubEmpresasVO.getCenctodc();
        this.codopeperdc = pubEmpresasVO.getCodopeperdc();
        this.codopegandc = pubEmpresasVO.getCodopegandc();
        this.codopeaIng = pubEmpresasVO.getCodopeaIng();
        this.codopeaEgr = pubEmpresasVO.getCodopeaEgr();
        this.codctaaIng = pubEmpresasVO.getCodctaaIng();
        this.codctaaIngd = pubEmpresasVO.getCodctaaIngd();
        this.codctaaEgr = pubEmpresasVO.getCodctaaEgr();
        this.codctaaEgrd = pubEmpresasVO.getCodctaaEgrd();
        this.codopevIng = pubEmpresasVO.getCodopevIng();
        this.codopevEgr = pubEmpresasVO.getCodopevEgr();
        this.codctavIng = pubEmpresasVO.getCodctavIng();
        this.codctavIngd = pubEmpresasVO.getCodctavIngd();
        this.codctavEgr = pubEmpresasVO.getCodctavEgr();
        this.codctavEgrd = pubEmpresasVO.getCodctavEgrd();
        this.iniciales = pubEmpresasVO.getIniciales();
        this.ciudadLegal = pubEmpresasVO.getCiudadLegal();
        this.codctaGarcar = pubEmpresasVO.getCodctaGarcar();
        this.codctaGarabo = pubEmpresasVO.getCodctaGarabo();
        this.agenteRetencion = pubEmpresasVO.getAgenteRetencion();
        this.secLoteDetraccion = pubEmpresasVO.getSecLoteDetraccion();
        this.tipoPlanCtas = pubEmpresasVO.getTipoPlanCtas();
        this.agentePercepcion = pubEmpresasVO.getAgentePercepcion();
        this.aduanaDatos = pubEmpresasVO.getAduanaDatos();
        this.indOperaciones = pubEmpresasVO.getIndOperaciones();
        this.flagRcIgvdif = pubEmpresasVO.getFlagRcIgvdif();
        this.flagEndeudamiento = pubEmpresasVO.getFlagEndeudamiento();
        this.tipoVistaEeff = pubEmpresasVO.getTipoVistaEeff();
        this.flagValidaCencos = pubEmpresasVO.getFlagValidaCencos();
        this.aprobContaCcosto = pubEmpresasVO.getAprobContaCcosto();
        this.flagExportador = pubEmpresasVO.getFlagExportador();
        this.correoSigga = pubEmpresasVO.getCorreoSigga();
        this.header = pubEmpresasVO.getHeader();
        this.footer = pubEmpresasVO.getFooter();
        this.ctaDetraccion = pubEmpresasVO.getCtaDetraccion();
    }

    public Long getIdPubEmpresas() {
        return idPubEmpresas;
    }

    public void setIdPubEmpresas(Long idPubEmpresas) {
        this.idPubEmpresas = idPubEmpresas;
    }

    public String getCodemp() {
        return codemp;
    }

    public void setCodemp(String codemp) {
        this.codemp = codemp;
    }

    public String getCodgru() {
        return codgru;
    }

    public void setCodgru(String codgru) {
        this.codgru = codgru;
    }

    public String getNomemp() {
        return nomemp;
    }

    public void setNomemp(String nomemp) {
        this.nomemp = nomemp;
    }

    public String getDirfis() {
        return dirfis;
    }

    public void setDirfis(String dirfis) {
        this.dirfis = dirfis;
    }

    public String getDirleg() {
        return dirleg;
    }

    public void setDirleg(String dirleg) {
        this.dirleg = dirleg;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPagweb() {
        return pagweb;
    }

    public void setPagweb(String pagweb) {
        this.pagweb = pagweb;
    }

    public String getRegPatronal() {
        return regPatronal;
    }

    public void setRegPatronal(String regPatronal) {
        this.regPatronal = regPatronal;
    }

    public String getGiroNegocio() {
        return giroNegocio;
    }

    public void setGiroNegocio(String giroNegocio) {
        this.giroNegocio = giroNegocio;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    public String getNomRepresentante() {
        return nomRepresentante;
    }

    public void setNomRepresentante(String nomRepresentante) {
        this.nomRepresentante = nomRepresentante;
    }

    public String getDniRepresentante() {
        return dniRepresentante;
    }

    public void setDniRepresentante(String dniRepresentante) {
        this.dniRepresentante = dniRepresentante;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombrepc() {
        return nombrepc;
    }

    public void setNombrepc(String nombrepc) {
        this.nombrepc = nombrepc;
    }

    public LocalDateTime getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(LocalDateTime fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    public String getCtaperdc() {
        return ctaperdc;
    }

    public void setCtaperdc(String ctaperdc) {
        this.ctaperdc = ctaperdc;
    }

    public String getCtagandc() {
        return ctagandc;
    }

    public void setCtagandc(String ctagandc) {
        this.ctagandc = ctagandc;
    }

    public String getCenctodc() {
        return cenctodc;
    }

    public void setCenctodc(String cenctodc) {
        this.cenctodc = cenctodc;
    }

    public String getCodopeperdc() {
        return codopeperdc;
    }

    public void setCodopeperdc(String codopeperdc) {
        this.codopeperdc = codopeperdc;
    }

    public String getCodopegandc() {
        return codopegandc;
    }

    public void setCodopegandc(String codopegandc) {
        this.codopegandc = codopegandc;
    }

    public String getCodopeaIng() {
        return codopeaIng;
    }

    public void setCodopeaIng(String codopeaIng) {
        this.codopeaIng = codopeaIng;
    }

    public String getCodopeaEgr() {
        return codopeaEgr;
    }

    public void setCodopeaEgr(String codopeaEgr) {
        this.codopeaEgr = codopeaEgr;
    }

    public String getCodctaaIng() {
        return codctaaIng;
    }

    public void setCodctaaIng(String codctaaIng) {
        this.codctaaIng = codctaaIng;
    }

    public String getCodctaaIngd() {
        return codctaaIngd;
    }

    public void setCodctaaIngd(String codctaaIngd) {
        this.codctaaIngd = codctaaIngd;
    }

    public String getCodctaaEgr() {
        return codctaaEgr;
    }

    public void setCodctaaEgr(String codctaaEgr) {
        this.codctaaEgr = codctaaEgr;
    }

    public String getCodctaaEgrd() {
        return codctaaEgrd;
    }

    public void setCodctaaEgrd(String codctaaEgrd) {
        this.codctaaEgrd = codctaaEgrd;
    }

    public String getCodopevIng() {
        return codopevIng;
    }

    public void setCodopevIng(String codopevIng) {
        this.codopevIng = codopevIng;
    }

    public String getCodopevEgr() {
        return codopevEgr;
    }

    public void setCodopevEgr(String codopevEgr) {
        this.codopevEgr = codopevEgr;
    }

    public String getCodctavIng() {
        return codctavIng;
    }

    public void setCodctavIng(String codctavIng) {
        this.codctavIng = codctavIng;
    }

    public String getCodctavIngd() {
        return codctavIngd;
    }

    public void setCodctavIngd(String codctavIngd) {
        this.codctavIngd = codctavIngd;
    }

    public String getCodctavEgr() {
        return codctavEgr;
    }

    public void setCodctavEgr(String codctavEgr) {
        this.codctavEgr = codctavEgr;
    }

    public String getCodctavEgrd() {
        return codctavEgrd;
    }

    public void setCodctavEgrd(String codctavEgrd) {
        this.codctavEgrd = codctavEgrd;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public String getCiudadLegal() {
        return ciudadLegal;
    }

    public void setCiudadLegal(String ciudadLegal) {
        this.ciudadLegal = ciudadLegal;
    }

    public String getCodctaGarcar() {
        return codctaGarcar;
    }

    public void setCodctaGarcar(String codctaGarcar) {
        this.codctaGarcar = codctaGarcar;
    }

    public String getCodctaGarabo() {
        return codctaGarabo;
    }

    public void setCodctaGarabo(String codctaGarabo) {
        this.codctaGarabo = codctaGarabo;
    }

    public int getAgenteRetencion() {
        return agenteRetencion;
    }

    public void setAgenteRetencion(int agenteRetencion) {
        this.agenteRetencion = agenteRetencion;
    }

    public Integer getSecLoteDetraccion() {
        return secLoteDetraccion;
    }

    public void setSecLoteDetraccion(Integer secLoteDetraccion) {
        this.secLoteDetraccion = secLoteDetraccion;
    }

    public String getTipoPlanCtas() {
        return tipoPlanCtas;
    }

    public void setTipoPlanCtas(String tipoPlanCtas) {
        this.tipoPlanCtas = tipoPlanCtas;
    }

    public int getAgentePercepcion() {
        return agentePercepcion;
    }

    public void setAgentePercepcion(int agentePercepcion) {
        this.agentePercepcion = agentePercepcion;
    }

    public String getAduanaDatos() {
        return aduanaDatos;
    }

    public void setAduanaDatos(String aduanaDatos) {
        this.aduanaDatos = aduanaDatos;
    }

    public String getIndOperaciones() {
        return indOperaciones;
    }

    public void setIndOperaciones(String indOperaciones) {
        this.indOperaciones = indOperaciones;
    }

    public Character getFlagRcIgvdif() {
        return flagRcIgvdif;
    }

    public void setFlagRcIgvdif(Character flagRcIgvdif) {
        this.flagRcIgvdif = flagRcIgvdif;
    }

    public Integer getFlagEndeudamiento() {
        return flagEndeudamiento;
    }

    public void setFlagEndeudamiento(Integer flagEndeudamiento) {
        this.flagEndeudamiento = flagEndeudamiento;
    }

    public Character getTipoVistaEeff() {
        return tipoVistaEeff;
    }

    public void setTipoVistaEeff(Character tipoVistaEeff) {
        this.tipoVistaEeff = tipoVistaEeff;
    }

    public Character getFlagValidaCencos() {
        return flagValidaCencos;
    }

    public void setFlagValidaCencos(Character flagValidaCencos) {
        this.flagValidaCencos = flagValidaCencos;
    }

    public Character getAprobContaCcosto() {
        return aprobContaCcosto;
    }

    public void setAprobContaCcosto(Character aprobContaCcosto) {
        this.aprobContaCcosto = aprobContaCcosto;
    }

    public Integer getFlagExportador() {
        return flagExportador;
    }

    public void setFlagExportador(Integer flagExportador) {
        this.flagExportador = flagExportador;
    }

    public String getCorreoSigga() {
        return correoSigga;
    }

    public void setCorreoSigga(String correoSigga) {
        this.correoSigga = correoSigga;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getCtaDetraccion() {
        return ctaDetraccion;
    }

    public void setCtaDetraccion(String ctaDetraccion) {
        this.ctaDetraccion = ctaDetraccion;
    }

    /*public List<LogCatalogo> getLogCatalogoList() {
        return logCatalogoList;
    }

    public void setLogCatalogoList(List<LogCatalogo> logCatalogoList) {
        this.logCatalogoList = logCatalogoList;
    }

    public List<LogTipoCatalogo> getLogTipoCatalogoList() {
        return logTipoCatalogoList;
    }

    public void setLogTipoCatalogoList(List<LogTipoCatalogo> logTipoCatalogoList) {
        this.logTipoCatalogoList = logTipoCatalogoList;
    }*/
}
