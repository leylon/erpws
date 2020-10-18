package com.ti.erpws.logistica.service;

import com.ti.erpws.logistica.entity.LogRequerimiento;
import com.ti.erpws.logistica.model.request.ReqAprobRequest;
import com.ti.erpws.logistica.model.request.ReqPendRequest;
import com.ti.erpws.logistica.model.LogRequerimientoVO;
import com.ti.erpws.logistica.model.response.ReqAprobResponse;
import com.ti.erpws.logistica.model.response.ReqPendResponse;
import com.ti.erpws.logistica.repository.LogRequerimientoRepository;
import com.ti.erpws.publica.model.response.EstadosResponse;
import com.ti.erpws.publica.util.PublicaCrudMulti;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("LogRequerimientoService")
public class LogRequerimientoService implements PublicaCrudMulti<LogRequerimiento, EstadosResponse> {

    private static final Log logger = LogFactory.getLog(LogRequerimientoService.class);

    @Autowired
    @Qualifier("LogRequerimientoRepository")
    private LogRequerimientoRepository repository;

    @Autowired
    @Qualifier("Estados")
    private EstadosResponse estado;

    @Override
    public EstadosResponse crear(List<LogRequerimiento> entities) {
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
    public EstadosResponse actualizar(List<LogRequerimiento> entities) {
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
    public EstadosResponse borrar(List<LogRequerimiento> entities) {
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
    public List<LogRequerimiento> listartodo() {
        return repository.findAll();
    }

    public List<ReqPendResponse> listarReqPendientes(ReqPendRequest req) {
        List<ReqPendResponse> data = new ArrayList<>();
        ReqPendResponse response;
        List<Object[]> lstReqPend = repository.listaRequerimientosPendientes(req.getEmpresa(), req.getAnio(), req.getUsuario(), req.getFiltro());
        //lstReqPend.forEach(entity -> { data.add(new ReqPendResponse(entity)) });
        for (Object[] object : lstReqPend) {
            response = new ReqPendResponse();
            response.setOut_empresa((object[0] == null) ? "" : object[0].toString());
            response.setOut_unidad((object[1] == null) ? "" : object[1].toString());
            response.setOut_area((object[2] == null) ? "" : object[2].toString());
            response.setOut_anio((object[3] == null) ? 0 : Integer.parseInt(object[3].toString()));
            response.setOut_numero((object[4] == null) ? 0 : Integer.parseInt(object[4].toString()));
            data.add(response);
        }
        return data;
    }

    public List<ReqAprobResponse> aprobarRequerimiento(ReqAprobRequest req) {
        List<ReqAprobResponse> data = new ArrayList<>();
        ReqAprobResponse response;
        List<Object[]> lstReqAprob = repository.aprobarRequerimiento(req.getEmpresa(), req.getUnd_negocio(), req.getArea_origen(), req.getAnio(), req.getNro_requerimiento(), req.getUsuario(), req.getNotas(), req.getTipo_ope());
        for (Object[] object : lstReqAprob) {
            response = new ReqAprobResponse();
            response.setContador((object[0] == null) ? 0 : Integer.parseInt(object[0].toString()));
            response.setMensaje((object[1] == null) ? "" : object[1].toString());
            data.add(response);
        }
        return data;
    }
}
