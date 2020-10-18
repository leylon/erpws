package com.ti.erpws.logistica.model.response;

public class ReqPendResponse {
    private String out_empresa;
    private String out_unidad;
    private String out_area;
    private Integer out_anio;
    private Integer out_numero;
    /*OUT_ORIGEN := reg.DES_AREA_ORIGEN;
    OUT_DESTINO := reg.AREA_DESTINO;
    OUT_FECHA := reg.FECHA_REG;
    OUT_FECHA_REQUERIDA := reg.FECHA_REQ;
    OUT_USUARIO := reg.NOM_USUARIO;
    OUT_DESCRIPCION := reg.DESCRIPCION;
    OUT_USO := reg.USO;
    OUT_URGENTE := reg.TIPO;
    OUT_TIPO := reg.TIPO1;
    OUT_VB_JEFE := reg.VB_APROBACION;
    OUT_JEFE := reg.VB_USUARIO;
    OUT_VB_GTE := reg.VB_GERENTE;*/

    public ReqPendResponse() {
    }

    public ReqPendResponse(String out_empresa, String out_unidad, String out_area, Integer out_anio, Integer out_numero) {
        this.out_empresa = out_empresa;
        this.out_unidad = out_unidad;
        this.out_area = out_area;
        this.out_anio = out_anio;
        this.out_numero = out_numero;
    }

    public String getOut_empresa() {
        return out_empresa;
    }

    public void setOut_empresa(String out_empresa) {
        this.out_empresa = out_empresa;
    }

    public String getOut_unidad() {
        return out_unidad;
    }

    public void setOut_unidad(String out_unidad) {
        this.out_unidad = out_unidad;
    }

    public String getOut_area() {
        return out_area;
    }

    public void setOut_area(String out_area) {
        this.out_area = out_area;
    }

    public Integer getOut_anio() {
        return out_anio;
    }

    public void setOut_anio(Integer out_anio) {
        this.out_anio = out_anio;
    }

    public Integer getOut_numero() {
        return out_numero;
    }

    public void setOut_numero(Integer out_numero) {
        this.out_numero = out_numero;
    }
}
