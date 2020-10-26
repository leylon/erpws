package com.ti.erpws.logistica.service;

import com.ti.erpws.logistica.entity.LogCatalogo;
import com.ti.erpws.logistica.entity.LogOrden;
import com.ti.erpws.logistica.model.request.OrdenAprobRequest;
import com.ti.erpws.logistica.model.request.OrdenPendRequest;
import com.ti.erpws.logistica.model.request.ReqAprobRequest;
import com.ti.erpws.logistica.model.response.OrdenAprobResponse;
import com.ti.erpws.logistica.model.response.OrdenPendResponse;
import com.ti.erpws.logistica.model.response.ReqAprobResponse;
import com.ti.erpws.logistica.repository.LogCatalogoRepository;
import com.ti.erpws.logistica.repository.LogOrdenRepository;
import com.ti.erpws.publica.model.response.EstadosResponse;
import com.ti.erpws.publica.util.PublicaCrudMulti;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("LogOrdenService")
public class LogOrdenService implements PublicaCrudMulti<LogOrden, EstadosResponse> {

    private static final Log logger = LogFactory.getLog(LogOrdenService.class);

    @Autowired
    @Qualifier("LogOrdenRepository")
    private LogOrdenRepository repository;

    @Autowired
    @Qualifier("Estados")
    private EstadosResponse estado;

    @Override
    public EstadosResponse crear(List<LogOrden> entities) {
        estado = new EstadosResponse();
        try {
            repository.saveAll(entities);
            estado.setStatus("Success");
            estado.setMensaje("Se Guardó Correctamente..!");
        } catch (Exception e) {
            estado.setStatus("Error");
            logger.error(e.getMessage());
            estado.setMensaje(e.getMessage().toString());
        }
        return estado;
    }

    @Override
    public EstadosResponse actualizar(List<LogOrden> entities) {
        estado = new EstadosResponse();
        try {
            repository.saveAll(entities);
            estado.setStatus("Success");
            estado.setMensaje("Se Actualizó Correctamente..!");
        } catch (Exception e) {
            estado.setStatus("Error");
            logger.error(e.getMessage());
            estado.setMensaje(e.getMessage().toString());
        }
        return estado;
    }

    @Override
    public EstadosResponse borrar(List<LogOrden> entities) {
        estado = new EstadosResponse();
        try {
            repository.deleteAll(entities);
            estado.setStatus("Success");
            estado.setMensaje("Se Eliminó Correctamente..!");
        } catch (Exception e) {
            estado.setStatus("Error");
            logger.error(e.getMessage());
            estado.setMensaje(e.getMessage().toString());
        }
        return estado;
    }

    @Override
    public List<LogOrden> listartodo() {
        return repository.findAll();
    }

    public List<OrdenAprobResponse> aprobarOrden(OrdenAprobRequest orden) {
        List<OrdenAprobResponse> data = new ArrayList<>();
        OrdenAprobResponse response;
        List<Object[]> lstOrdenAprob = repository.aprobarOrden(orden.getEmpresa(), orden.getArea(), orden.getAnio(), orden.getTipo(), orden.getNro_orden(), orden.getUsuario(), orden.getNotas());
        for (Object[] object : lstOrdenAprob) {
            response = new OrdenAprobResponse();
            response.setContador((object[0] == null) ? 0 : Integer.parseInt(object[0].toString()));
            response.setMensaje((object[1] == null) ? "" : object[1].toString());
            data.add(response);
        }
        return data;
    }

    public List<OrdenPendResponse> listarOrdenes(OrdenPendRequest orden){
        List<OrdenPendResponse> data = new ArrayList<>();
        OrdenPendResponse response;
        List<Object[]> lstOrdenPend = repository.listarOrdenesPendientes(orden.getEmpresa(), orden.getAnio(), orden.getUsuario(), orden.getFiltro());
        for (Object[] object: lstOrdenPend) {
            response = new OrdenPendResponse();
            response.setOut_empresa((object[0] == null) ? "" : object[0].toString());
            response.setOut_unid_operativa((object[1] == null) ? "" : object[1].toString());
            response.setOut_anio((object[2] == null) ? 0 : Integer.parseInt(object[2].toString()));
            response.setOut_nro_orden((object[3] == null) ? 0 : Integer.parseInt(object[3].toString()));
            response.setOut_area_requerimiento((object[4] == null) ? "" : object[4].toString());
            response.setOut_anio_requerimiento((object[5] == null) ? 0 : Integer.parseInt(object[5].toString()));
            response.setOut_nro_requerimiento((object[6] == null) ? 0 : Integer.parseInt(object[6].toString()));
            response.setOut_anio_cotizacion((object[7] == null) ? 0 : Integer.parseInt(object[7].toString()));
            response.setOut_ndoc_cotizacion((object[8] == null) ? "" : object[8].toString());
            response.setOut_tipo((object[9] == null) ? "" : object[9].toString());
            //response.setOut_fecha((object[10] == null) ? "" : object[10].toString());
            response.setOut_razon_proveedor((object[11] == null) ? "" : object[11].toString());
            response.setOut_forma_pago((object[12] == null) ? "" : object[12].toString());
            response.setOut_entrega((object[13] == null) ? "" : object[13].toString());
            response.setOut_garantia((object[14] == null) ? "" : object[14].toString());
            response.setOut_total((object[15] == null) ? "" : object[15].toString());
            response.setOut_descripcion((object[16] == null) ? "" : object[16].toString());
            response.setOut_nom_usuario((object[17] == null) ? "" : object[17].toString());
            //response.setOut_fecha_reg((object[18] == null) ? "" : object[18].toString());
            response.setOut_vb_nom_usuario((object[19] == null) ? "" : object[19].toString());
            //response.setOut_vb_fecha((object[20] == null) ? "" : object[20].toString());
            response.setOut_nom_area((object[21] == null) ? "" : object[21].toString());
            response.setOut_vb_logistica((object[22] == null) ? 0 : Integer.parseInt(object[22].toString()));
            //response.setOut_fecha_vb_log((object[23] == null) ? "" : object[23].toString());
            response.setOut_usuario_vb_log((object[24] == null) ? "" : object[24].toString());
            response.setOut_vb_gerencia((object[25] == null) ? 0 : Integer.parseInt(object[25].toString()));
            //response.setOut_fecha_vb_gte((object[26] == null) ? "" : object[26].toString());
            response.setOut_usuario_vb_gte((object[27] == null) ? "" : object[27].toString());
            response.setOut_orientacion((object[28] == null) ? "" : object[28].toString());
            response.setOut_moneda((object[29] == null) ? "" : object[29].toString());
            response.setOut_total_precio((object[30] == null) ? 0 : Double.parseDouble(object[30].toString()));
            response.setOut_estado((object[31] == null) ? "" : object[31].toString());
            response.setOut_notas_vb_log((object[32] == null) ? "" : object[32].toString());
            response.setOut_notas_vb_gte((object[33] == null) ? "" : object[33].toString());
            response.setOut_num_orden((object[34] == null) ? "" : object[34].toString());
            response.setOut_contrato((object[35] == null) ? "" : object[35].toString());
            response.setOut_valor_costo((object[36] == null) ? "" : object[36].toString());
            data.add(response);
        }
        return data;
    }

}
