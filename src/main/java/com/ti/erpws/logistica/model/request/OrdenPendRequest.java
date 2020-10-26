package com.ti.erpws.logistica.model.request;

public class OrdenPendRequest {

    private String empresa;
    private Integer anio;
    private String usuario;
    private String filtro;

    public OrdenPendRequest() {
    }

    public OrdenPendRequest(String empresa, Integer anio, String usuario, String filtro) {
        this.empresa = empresa;
        this.anio = anio;
        this.usuario = usuario;
        this.filtro = filtro;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }
}
