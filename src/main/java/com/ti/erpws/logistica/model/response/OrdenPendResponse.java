package com.ti.erpws.logistica.model.response;

import java.time.LocalDateTime;
import java.util.Date;

public class OrdenPendResponse {

    private String out_empresa;
    private String out_unid_operativa;
    private Integer out_anio;
    private Integer out_nro_orden;
    private String out_area_requerimiento;
    private Integer out_anio_requerimiento;
    private Integer out_nro_requerimiento;
    private Integer out_anio_cotizacion;
    private String out_ndoc_cotizacion;
    private String out_tipo;
    private Date out_fecha;
    private String out_razon_proveedor;
    private String out_forma_pago;
    private String out_entrega;
    private String out_garantia;
    private String out_total;
    private String out_descripcion;
    private String out_nom_usuario;
    private LocalDateTime out_fecha_reg;
    private String out_vb_nom_usuario;
    private LocalDateTime out_vb_fecha;
    private String out_nom_area;
    private Integer out_vb_logistica;
    private LocalDateTime out_fecha_vb_log;
    private String out_usuario_vb_log;
    private Integer out_vb_gerencia;
    private LocalDateTime out_fecha_vb_gte;
    private String out_usuario_vb_gte;
    private String out_orientacion;
    private String out_moneda;
    private Double out_total_precio;
    private String out_estado;
    private String out_notas_vb_log;
    private String out_notas_vb_gte;
    private String out_num_orden;
    private String out_contrato;
    private String out_valor_costo;

    public OrdenPendResponse() {
    }

    public OrdenPendResponse(String out_empresa, String out_unid_operativa, Integer out_anio, Integer out_nro_orden, String out_area_requerimiento, Integer out_anio_requerimiento, Integer out_nro_requerimiento, Integer out_anio_cotizacion, String out_ndoc_cotizacion, String out_tipo, Date out_fecha, String out_razon_proveedor, String out_forma_pago, String out_entrega, String out_garantia, String out_total, String out_descripcion, String out_nom_usuario, LocalDateTime out_fecha_reg, String out_vb_nom_usuario, LocalDateTime out_vb_fecha, String out_nom_area, Integer out_vb_logistica, LocalDateTime out_fecha_vb_log, String out_usuario_vb_log, Integer out_vb_gerencia, LocalDateTime out_fecha_vb_gte, String out_usuario_vb_gte, String out_orientacion, String out_moneda, Double out_total_precio, String out_estado, String out_notas_vb_log, String out_notas_vb_gte, String out_num_orden, String out_contrato, String out_valor_costo) {
        this.out_empresa = out_empresa;
        this.out_unid_operativa = out_unid_operativa;
        this.out_anio = out_anio;
        this.out_nro_orden = out_nro_orden;
        this.out_area_requerimiento = out_area_requerimiento;
        this.out_anio_requerimiento = out_anio_requerimiento;
        this.out_nro_requerimiento = out_nro_requerimiento;
        this.out_anio_cotizacion = out_anio_cotizacion;
        this.out_ndoc_cotizacion = out_ndoc_cotizacion;
        this.out_tipo = out_tipo;
        this.out_fecha = out_fecha;
        this.out_razon_proveedor = out_razon_proveedor;
        this.out_forma_pago = out_forma_pago;
        this.out_entrega = out_entrega;
        this.out_garantia = out_garantia;
        this.out_total = out_total;
        this.out_descripcion = out_descripcion;
        this.out_nom_usuario = out_nom_usuario;
        this.out_fecha_reg = out_fecha_reg;
        this.out_vb_nom_usuario = out_vb_nom_usuario;
        this.out_vb_fecha = out_vb_fecha;
        this.out_nom_area = out_nom_area;
        this.out_vb_logistica = out_vb_logistica;
        this.out_fecha_vb_log = out_fecha_vb_log;
        this.out_usuario_vb_log = out_usuario_vb_log;
        this.out_vb_gerencia = out_vb_gerencia;
        this.out_fecha_vb_gte = out_fecha_vb_gte;
        this.out_usuario_vb_gte = out_usuario_vb_gte;
        this.out_orientacion = out_orientacion;
        this.out_moneda = out_moneda;
        this.out_total_precio = out_total_precio;
        this.out_estado = out_estado;
        this.out_notas_vb_log = out_notas_vb_log;
        this.out_notas_vb_gte = out_notas_vb_gte;
        this.out_num_orden = out_num_orden;
        this.out_contrato = out_contrato;
        this.out_valor_costo = out_valor_costo;
    }

    public String getOut_empresa() {
        return out_empresa;
    }

    public void setOut_empresa(String out_empresa) {
        this.out_empresa = out_empresa;
    }

    public String getOut_unid_operativa() {
        return out_unid_operativa;
    }

    public void setOut_unid_operativa(String out_unid_operativa) {
        this.out_unid_operativa = out_unid_operativa;
    }

    public Integer getOut_anio() {
        return out_anio;
    }

    public void setOut_anio(Integer out_anio) {
        this.out_anio = out_anio;
    }

    public Integer getOut_nro_orden() {
        return out_nro_orden;
    }

    public void setOut_nro_orden(Integer out_nro_orden) {
        this.out_nro_orden = out_nro_orden;
    }

    public String getOut_area_requerimiento() {
        return out_area_requerimiento;
    }

    public void setOut_area_requerimiento(String out_area_requerimiento) {
        this.out_area_requerimiento = out_area_requerimiento;
    }

    public Integer getOut_anio_requerimiento() {
        return out_anio_requerimiento;
    }

    public void setOut_anio_requerimiento(Integer out_anio_requerimiento) {
        this.out_anio_requerimiento = out_anio_requerimiento;
    }

    public Integer getOut_nro_requerimiento() {
        return out_nro_requerimiento;
    }

    public void setOut_nro_requerimiento(Integer out_nro_requerimiento) {
        this.out_nro_requerimiento = out_nro_requerimiento;
    }

    public Integer getOut_anio_cotizacion() {
        return out_anio_cotizacion;
    }

    public void setOut_anio_cotizacion(Integer out_anio_cotizacion) {
        this.out_anio_cotizacion = out_anio_cotizacion;
    }

    public String getOut_ndoc_cotizacion() {
        return out_ndoc_cotizacion;
    }

    public void setOut_ndoc_cotizacion(String out_ndoc_cotizacion) {
        this.out_ndoc_cotizacion = out_ndoc_cotizacion;
    }

    public String getOut_tipo() {
        return out_tipo;
    }

    public void setOut_tipo(String out_tipo) {
        this.out_tipo = out_tipo;
    }

    public Date getOut_fecha() {
        return out_fecha;
    }

    public void setOut_fecha(Date out_fecha) {
        this.out_fecha = out_fecha;
    }

    public String getOut_razon_proveedor() {
        return out_razon_proveedor;
    }

    public void setOut_razon_proveedor(String out_razon_proveedor) {
        this.out_razon_proveedor = out_razon_proveedor;
    }

    public String getOut_forma_pago() {
        return out_forma_pago;
    }

    public void setOut_forma_pago(String out_forma_pago) {
        this.out_forma_pago = out_forma_pago;
    }

    public String getOut_entrega() {
        return out_entrega;
    }

    public void setOut_entrega(String out_entrega) {
        this.out_entrega = out_entrega;
    }

    public String getOut_garantia() {
        return out_garantia;
    }

    public void setOut_garantia(String out_garantia) {
        this.out_garantia = out_garantia;
    }

    public String getOut_total() {
        return out_total;
    }

    public void setOut_total(String out_total) {
        this.out_total = out_total;
    }

    public String getOut_descripcion() {
        return out_descripcion;
    }

    public void setOut_descripcion(String out_descripcion) {
        this.out_descripcion = out_descripcion;
    }

    public String getOut_nom_usuario() {
        return out_nom_usuario;
    }

    public void setOut_nom_usuario(String out_nom_usuario) {
        this.out_nom_usuario = out_nom_usuario;
    }

    public LocalDateTime getOut_fecha_reg() {
        return out_fecha_reg;
    }

    public void setOut_fecha_reg(LocalDateTime out_fecha_reg) {
        this.out_fecha_reg = out_fecha_reg;
    }

    public String getOut_vb_nom_usuario() {
        return out_vb_nom_usuario;
    }

    public void setOut_vb_nom_usuario(String out_vb_nom_usuario) {
        this.out_vb_nom_usuario = out_vb_nom_usuario;
    }

    public LocalDateTime getOut_vb_fecha() {
        return out_vb_fecha;
    }

    public void setOut_vb_fecha(LocalDateTime out_vb_fecha) {
        this.out_vb_fecha = out_vb_fecha;
    }

    public String getOut_nom_area() {
        return out_nom_area;
    }

    public void setOut_nom_area(String out_nom_area) {
        this.out_nom_area = out_nom_area;
    }

    public Integer getOut_vb_logistica() {
        return out_vb_logistica;
    }

    public void setOut_vb_logistica(Integer out_vb_logistica) {
        this.out_vb_logistica = out_vb_logistica;
    }

    public LocalDateTime getOut_fecha_vb_log() {
        return out_fecha_vb_log;
    }

    public void setOut_fecha_vb_log(LocalDateTime out_fecha_vb_log) {
        this.out_fecha_vb_log = out_fecha_vb_log;
    }

    public String getOut_usuario_vb_log() {
        return out_usuario_vb_log;
    }

    public void setOut_usuario_vb_log(String out_usuario_vb_log) {
        this.out_usuario_vb_log = out_usuario_vb_log;
    }

    public Integer getOut_vb_gerencia() {
        return out_vb_gerencia;
    }

    public void setOut_vb_gerencia(Integer out_vb_gerencia) {
        this.out_vb_gerencia = out_vb_gerencia;
    }

    public LocalDateTime getOut_fecha_vb_gte() {
        return out_fecha_vb_gte;
    }

    public void setOut_fecha_vb_gte(LocalDateTime out_fecha_vb_gte) {
        this.out_fecha_vb_gte = out_fecha_vb_gte;
    }

    public String getOut_usuario_vb_gte() {
        return out_usuario_vb_gte;
    }

    public void setOut_usuario_vb_gte(String out_usuario_vb_gte) {
        this.out_usuario_vb_gte = out_usuario_vb_gte;
    }

    public String getOut_orientacion() {
        return out_orientacion;
    }

    public void setOut_orientacion(String out_orientacion) {
        this.out_orientacion = out_orientacion;
    }

    public String getOut_moneda() {
        return out_moneda;
    }

    public void setOut_moneda(String out_moneda) {
        this.out_moneda = out_moneda;
    }

    public Double getOut_total_precio() {
        return out_total_precio;
    }

    public void setOut_total_precio(Double out_total_precio) {
        this.out_total_precio = out_total_precio;
    }

    public String getOut_estado() {
        return out_estado;
    }

    public void setOut_estado(String out_estado) {
        this.out_estado = out_estado;
    }

    public String getOut_notas_vb_log() {
        return out_notas_vb_log;
    }

    public void setOut_notas_vb_log(String out_notas_vb_log) {
        this.out_notas_vb_log = out_notas_vb_log;
    }

    public String getOut_notas_vb_gte() {
        return out_notas_vb_gte;
    }

    public void setOut_notas_vb_gte(String out_notas_vb_gte) {
        this.out_notas_vb_gte = out_notas_vb_gte;
    }

    public String getOut_num_orden() {
        return out_num_orden;
    }

    public void setOut_num_orden(String out_num_orden) {
        this.out_num_orden = out_num_orden;
    }

    public String getOut_contrato() {
        return out_contrato;
    }

    public void setOut_contrato(String out_contrato) {
        this.out_contrato = out_contrato;
    }

    public String getOut_valor_costo() {
        return out_valor_costo;
    }

    public void setOut_valor_costo(String out_valor_costo) {
        this.out_valor_costo = out_valor_costo;
    }
}
