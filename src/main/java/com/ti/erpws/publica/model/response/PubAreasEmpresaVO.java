package com.ti.erpws.publica.model.response;


import com.ti.erpws.publica.entity.PubAreasEmpresa;

import java.time.LocalDateTime;

public class PubAreasEmpresaVO {
    private long idPubAreasEmpresa;
    private String codgruEmp;
    private short anio;
    private String idArea;
    private int nivel;
    private String nomArea;
    private Character imp;
    private Character servicio;
    private String nombreLargo;
    private Character bloqueo;
    private Character estado;
    private String usuario;
    private String nombrepc;
    private LocalDateTime fecmod;
    private String jefeNivel1;
    private String jefeNivel1Nombre;
    private String jefeNivel2;
    private String jefeNivel2Nombre;
    private String jefeNivel3;
    private String jefeNivel3Nombre;
    private Short flagCc;
    private String direccionLogistica;
    private String jefeNivel4;
    private String localProvision;
    private String idCencos;
    private long idPubCencos;
    private long idPubEmpresas;
    private long idPubLocalidad;

    public PubAreasEmpresaVO() {
    }

    public PubAreasEmpresaVO(PubAreasEmpresa obj) {
        this.idPubAreasEmpresa=obj.getIdPubAreasEmpresa();
        this.codgruEmp=obj.getCodgruEmp();
        this.anio=obj.getAnio();
        this.idArea=obj.getIdArea();
        this.nivel=obj.getNivel();
        this.nomArea=obj.getNomArea();
        this.imp=obj.getImp();
        this.servicio=obj.getServicio();
        this.nombreLargo=obj.getNombreLargo();
        this.bloqueo=obj.getBloqueo();
        this.estado=obj.getEstado();
        this.usuario=obj.getUsuario();
        this.nombrepc=obj.getNombrepc();
        this.fecmod=obj.getFecmod();
        this.jefeNivel1=obj.getJefeNivel1();
        this.jefeNivel1Nombre=obj.getJefeNivel1Nombre();
        this.jefeNivel2=obj.getJefeNivel2();
        this.jefeNivel2Nombre=obj.getJefeNivel2Nombre();
        this.jefeNivel3=obj.getJefeNivel3();
        this.jefeNivel3Nombre=obj.getJefeNivel3Nombre();
        this.flagCc=obj.getFlagCc();
        this.direccionLogistica=obj.getDireccionLogistica();
        this.jefeNivel4=obj.getJefeNivel4();
        this.localProvision=obj.getLocalProvision();
        this.idCencos=obj.getIdCencos();
        //this.idPubCencos=obj.getIdPubCencos().getIdPubCencos();
        //this.idPubEmpresas=obj.getIdPubEmpresas().getIdPubEmpresas();
        //this.idPubLocalidad=obj.getIdPubLocalidad().getIdPubLocalidad();
        //PubCencos pubcencos = new PubCencos();
    }

    public long getIdPubAreasEmpresa() {
        return idPubAreasEmpresa;
    }

    public void setIdPubAreasEmpresa(long idPubAreasEmpresa) {
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

    public long getIdPubCencos() {
        return idPubCencos;
    }

    public void setIdPubCencos(long idPubCencos) {
        this.idPubCencos = idPubCencos;
    }

    public long getIdPubEmpresas() {
        return idPubEmpresas;
    }

    public void setIdPubEmpresas(long idPubEmpresas) {
        this.idPubEmpresas = idPubEmpresas;
    }

    public long getIdPubLocalidad() {
        return idPubLocalidad;
    }

    public void setIdPubLocalidad(long idPubLocalidad) {
        this.idPubLocalidad = idPubLocalidad;
    }
}
