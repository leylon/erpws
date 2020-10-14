package com.ti.erpws.publica.entity;

import com.ti.erpws.publica.model.response.PubAreasEmpresaVO;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "pub_areas_empresa")
@NamedQueries({
        @NamedQuery(name = "PubAreasEmpresa.findAll", query = "SELECT p FROM PubAreasEmpresa p")
        , @NamedQuery(name = "PubAreasEmpresa.findByIdPubAreasEmpresa", query = "SELECT p FROM PubAreasEmpresa p WHERE p.idPubAreasEmpresa = :idPubAreasEmpresa")
        , @NamedQuery(name = "PubAreasEmpresa.findByCodgruEmp", query = "SELECT p FROM PubAreasEmpresa p WHERE p.codgruEmp = :codgruEmp")
        , @NamedQuery(name = "PubAreasEmpresa.findByAnio", query = "SELECT p FROM PubAreasEmpresa p WHERE p.anio = :anio")
        , @NamedQuery(name = "PubAreasEmpresa.findByIdArea", query = "SELECT p FROM PubAreasEmpresa p WHERE p.idArea = :idArea")
        , @NamedQuery(name = "PubAreasEmpresa.findByNivel", query = "SELECT p FROM PubAreasEmpresa p WHERE p.nivel = :nivel")
        , @NamedQuery(name = "PubAreasEmpresa.findByNomArea", query = "SELECT p FROM PubAreasEmpresa p WHERE p.nomArea = :nomArea")
        , @NamedQuery(name = "PubAreasEmpresa.findByImp", query = "SELECT p FROM PubAreasEmpresa p WHERE p.imp = :imp")
        , @NamedQuery(name = "PubAreasEmpresa.findByServicio", query = "SELECT p FROM PubAreasEmpresa p WHERE p.servicio = :servicio")
        , @NamedQuery(name = "PubAreasEmpresa.findByNombreLargo", query = "SELECT p FROM PubAreasEmpresa p WHERE p.nombreLargo = :nombreLargo")
        , @NamedQuery(name = "PubAreasEmpresa.findByBloqueo", query = "SELECT p FROM PubAreasEmpresa p WHERE p.bloqueo = :bloqueo")
        , @NamedQuery(name = "PubAreasEmpresa.findByEstado", query = "SELECT p FROM PubAreasEmpresa p WHERE p.estado = :estado")
        , @NamedQuery(name = "PubAreasEmpresa.findByUsuario", query = "SELECT p FROM PubAreasEmpresa p WHERE p.usuario = :usuario")
        , @NamedQuery(name = "PubAreasEmpresa.findByNombrepc", query = "SELECT p FROM PubAreasEmpresa p WHERE p.nombrepc = :nombrepc")
        , @NamedQuery(name = "PubAreasEmpresa.findByFecmod", query = "SELECT p FROM PubAreasEmpresa p WHERE p.fecmod = :fecmod")
        , @NamedQuery(name = "PubAreasEmpresa.findByJefeNivel1", query = "SELECT p FROM PubAreasEmpresa p WHERE p.jefeNivel1 = :jefeNivel1")
        , @NamedQuery(name = "PubAreasEmpresa.findByJefeNivel1Nombre", query = "SELECT p FROM PubAreasEmpresa p WHERE p.jefeNivel1Nombre = :jefeNivel1Nombre")
        , @NamedQuery(name = "PubAreasEmpresa.findByJefeNivel2", query = "SELECT p FROM PubAreasEmpresa p WHERE p.jefeNivel2 = :jefeNivel2")
        , @NamedQuery(name = "PubAreasEmpresa.findByJefeNivel2Nombre", query = "SELECT p FROM PubAreasEmpresa p WHERE p.jefeNivel2Nombre = :jefeNivel2Nombre")
        , @NamedQuery(name = "PubAreasEmpresa.findByJefeNivel3", query = "SELECT p FROM PubAreasEmpresa p WHERE p.jefeNivel3 = :jefeNivel3")
        , @NamedQuery(name = "PubAreasEmpresa.findByJefeNivel3Nombre", query = "SELECT p FROM PubAreasEmpresa p WHERE p.jefeNivel3Nombre = :jefeNivel3Nombre")
        , @NamedQuery(name = "PubAreasEmpresa.findByFlagCc", query = "SELECT p FROM PubAreasEmpresa p WHERE p.flagCc = :flagCc")
        , @NamedQuery(name = "PubAreasEmpresa.findByDireccionLogistica", query = "SELECT p FROM PubAreasEmpresa p WHERE p.direccionLogistica = :direccionLogistica")
        , @NamedQuery(name = "PubAreasEmpresa.findByJefeNivel4", query = "SELECT p FROM PubAreasEmpresa p WHERE p.jefeNivel4 = :jefeNivel4")
        , @NamedQuery(name = "PubAreasEmpresa.findByLocalProvision", query = "SELECT p FROM PubAreasEmpresa p WHERE p.localProvision = :localProvision")
        , @NamedQuery(name = "PubAreasEmpresa.findByIdCencos", query = "SELECT p FROM PubAreasEmpresa p WHERE p.idCencos = :idCencos")})
public class PubAreasEmpresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pub_areas_empresa")
    private Long idPubAreasEmpresa;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 2)
    @Column(name = "codgru_emp")
    private String codgruEmp;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "anio")
    private short anio;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 30)
    @Column(name = "id_area")
    private String idArea;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "nivel")
    private int nivel;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 80)
    @Column(name = "nom_area")
    private String nomArea;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "imp")
    private Character imp;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "servicio")
    private Character servicio;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 200)
    @Column(name = "nombre_largo")
    private String nombreLargo;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "bloqueo")
    private Character bloqueo;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "estado")
    private Character estado;
    //@Size(max = 20)
    @Column(name = "usuario")
    private String usuario;
    //@Size(max = 20)
    @Column(name = "nombrepc")
    private String nombrepc;
    @Column(name = "fecmod")
    private LocalDateTime fecmod;
    //@Size(max = 20)
    @Column(name = "jefe_nivel1")
    private String jefeNivel1;
    //@Size(max = 80)
    @Column(name = "jefe_nivel1_nombre")
    private String jefeNivel1Nombre;
    //@Size(max = 20)
    @Column(name = "jefe_nivel2")
    private String jefeNivel2;
    //@Size(max = 80)
    @Column(name = "jefe_nivel2_nombre")
    private String jefeNivel2Nombre;
    //@Size(max = 20)
    @Column(name = "jefe_nivel3")
    private String jefeNivel3;
    //@Size(max = 80)
    @Column(name = "jefe_nivel3_nombre")
    private String jefeNivel3Nombre;
    @Column(name = "flag_cc")
    private Short flagCc;
    //@Size(max = 250)
    @Column(name = "direccion_logistica")
    private String direccionLogistica;
    //@Size(max = 50)
    @Column(name = "jefe_nivel4")
    private String jefeNivel4;
    //@Size(max = 2)
    @Column(name = "local_provision")
    private String localProvision;
    //@Size(max = 30)
    @Column(name = "id_cencos")
    private String idCencos;
    /*@JoinColumn(name = "id_pub_cencos", referencedColumnName = "id_pub_cencos")
    @ManyToOne
    private PubCencos idPubCencos;
    @JoinColumn(name = "id_pub_empresas", referencedColumnName = "id_pub_empresas")
    @ManyToOne(optional = false)
    private PubEmpresas idPubEmpresas;
    @JoinColumn(name = "id_pub_localidad", referencedColumnName = "id_pub_localidad")
    @ManyToOne
    private PubLocalidad idPubLocalidad;*/

    public PubAreasEmpresa() {
    }

    public PubAreasEmpresa(PubAreasEmpresaVO obj) {
        this.idPubAreasEmpresa = obj.getIdPubAreasEmpresa();
        this.codgruEmp = obj.getCodgruEmp();
        this.anio = obj.getAnio();
        this.idArea = obj.getIdArea();
        this.nivel = obj.getNivel();
        this.nomArea = obj.getNomArea();
        this.imp = obj.getImp();
        this.servicio = obj.getServicio();
        this.nombreLargo = obj.getNombreLargo();
        this.bloqueo = obj.getBloqueo();
        this.estado = obj.getEstado();
        this.usuario = obj.getUsuario();
        this.nombrepc = obj.getNombrepc();
        this.fecmod = obj.getFecmod();
        this.jefeNivel1 = obj.getJefeNivel1();
        this.jefeNivel1Nombre = obj.getJefeNivel1Nombre();
        this.jefeNivel2 = obj.getJefeNivel2();
        this.jefeNivel2Nombre = obj.getJefeNivel2Nombre();
        this.jefeNivel3 = obj.getJefeNivel3();
        this.jefeNivel3Nombre = obj.getJefeNivel3Nombre();
        this.flagCc = obj.getFlagCc();
        this.direccionLogistica = obj.getDireccionLogistica();
        this.jefeNivel4 = obj.getJefeNivel4();
        this.localProvision = obj.getLocalProvision();
        this.idCencos = obj.getIdCencos();
        /*PubCencos pubcencos = new PubCencos(obj.getIdPubCencos());
        this.idPubCencos = pubcencos;
        PubEmpresas empresas = new PubEmpresas(obj.getIdPubEmpresas());
        this.idPubEmpresas = empresas;
        PubLocalidad localidad = new PubLocalidad(obj.getIdPubLocalidad());
        this.idPubLocalidad = localidad;*/
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdPubAreasEmpresa() {
        return idPubAreasEmpresa;
    }

    public void setIdPubAreasEmpresa(Long idPubAreasEmpresa) {
        this.idPubAreasEmpresa = idPubAreasEmpresa;
    }

    public String getCodgruEmp() {
        return codgruEmp;
    }

    public void setCodgruEmp(String codgruEmp) {
        this.codgruEmp = codgruEmp;
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNomArea() {
        return nomArea;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }

    public Character getImp() {
        return imp;
    }

    public void setImp(Character imp) {
        this.imp = imp;
    }

    public Character getServicio() {
        return servicio;
    }

    public void setServicio(Character servicio) {
        this.servicio = servicio;
    }

    public String getNombreLargo() {
        return nombreLargo;
    }

    public void setNombreLargo(String nombreLargo) {
        this.nombreLargo = nombreLargo;
    }

    public Character getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(Character bloqueo) {
        this.bloqueo = bloqueo;
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

    public LocalDateTime getFecmod() {
        return fecmod;
    }

    public void setFecmod(LocalDateTime fecmod) {
        this.fecmod = fecmod;
    }

    public String getJefeNivel1() {
        return jefeNivel1;
    }

    public void setJefeNivel1(String jefeNivel1) {
        this.jefeNivel1 = jefeNivel1;
    }

    public String getJefeNivel1Nombre() {
        return jefeNivel1Nombre;
    }

    public void setJefeNivel1Nombre(String jefeNivel1Nombre) {
        this.jefeNivel1Nombre = jefeNivel1Nombre;
    }

    public String getJefeNivel2() {
        return jefeNivel2;
    }

    public void setJefeNivel2(String jefeNivel2) {
        this.jefeNivel2 = jefeNivel2;
    }

    public String getJefeNivel2Nombre() {
        return jefeNivel2Nombre;
    }

    public void setJefeNivel2Nombre(String jefeNivel2Nombre) {
        this.jefeNivel2Nombre = jefeNivel2Nombre;
    }

    public String getJefeNivel3() {
        return jefeNivel3;
    }

    public void setJefeNivel3(String jefeNivel3) {
        this.jefeNivel3 = jefeNivel3;
    }

    public String getJefeNivel3Nombre() {
        return jefeNivel3Nombre;
    }

    public void setJefeNivel3Nombre(String jefeNivel3Nombre) {
        this.jefeNivel3Nombre = jefeNivel3Nombre;
    }

    public Short getFlagCc() {
        return flagCc;
    }

    public void setFlagCc(Short flagCc) {
        this.flagCc = flagCc;
    }

    public String getDireccionLogistica() {
        return direccionLogistica;
    }

    public void setDireccionLogistica(String direccionLogistica) {
        this.direccionLogistica = direccionLogistica;
    }

    public String getJefeNivel4() {
        return jefeNivel4;
    }

    public void setJefeNivel4(String jefeNivel4) {
        this.jefeNivel4 = jefeNivel4;
    }

    public String getLocalProvision() {
        return localProvision;
    }

    public void setLocalProvision(String localProvision) {
        this.localProvision = localProvision;
    }

    public String getIdCencos() {
        return idCencos;
    }

    public void setIdCencos(String idCencos) {
        this.idCencos = idCencos;
    }
}
