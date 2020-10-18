package com.ti.erpws.logistica.model.request;

public class ReqAprobRequest {
    private String empresa;
    private String und_negocio;
    private String area_origen;
    private Integer anio;
    private Integer nro_requerimiento;
    private String usuario;
    private String notas;
    private String tipo_ope;

    public ReqAprobRequest() {
    }

    public ReqAprobRequest(String empresa, String und_negocio, String area_origen, Integer anio, Integer nro_requerimiento, String usuario, String notas, String tipo_ope) {
        this.empresa = empresa;
        this.und_negocio = und_negocio;
        this.area_origen = area_origen;
        this.anio = anio;
        this.nro_requerimiento = nro_requerimiento;
        this.usuario = usuario;
        this.notas = notas;
        this.tipo_ope = tipo_ope;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUnd_negocio() {
        return und_negocio;
    }

    public void setUnd_negocio(String und_negocio) {
        this.und_negocio = und_negocio;
    }

    public String getArea_origen() {
        return area_origen;
    }

    public void setArea_origen(String area_origen) {
        this.area_origen = area_origen;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getNro_requerimiento() {
        return nro_requerimiento;
    }

    public void setNro_requerimiento(Integer nro_requerimiento) {
        this.nro_requerimiento = nro_requerimiento;
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

    public String getTipo_ope() {
        return tipo_ope;
    }

    public void setTipo_ope(String tipo_ope) {
        this.tipo_ope = tipo_ope;
    }
}
