package com.ti.erpws.logistica.model.response;

public class OrdenAprobResponse {

    private Integer contador;
    private String mensaje;

    public OrdenAprobResponse() {
    }

    public OrdenAprobResponse(Integer contador, String mensaje) {
        this.contador = contador;
        this.mensaje = mensaje;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
