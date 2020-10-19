package com.ti.erpws.logistica.model.request;

import org.springframework.data.repository.query.Param;

public class OrdenAprobRequest {

    private String empresa;
    private String area;
    private Integer anio;
    private String tipo;
    private Integer nro_orden;
    private String usuario;
    private String notas;

    public OrdenAprobRequest() {
    }

    public OrdenAprobRequest(String empresa, String area, Integer anio, String tipo, Integer nro_orden, String usuario, String notas) {
        this.empresa = empresa;
        this.area = area;
        this.anio = anio;
        this.tipo = tipo;
        this.nro_orden = nro_orden;
        this.usuario = usuario;
        this.notas = notas;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNro_orden() {
        return nro_orden;
    }

    public void setNro_orden(Integer nro_orden) {
        this.nro_orden = nro_orden;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
