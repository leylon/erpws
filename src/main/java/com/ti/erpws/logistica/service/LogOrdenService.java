package com.ti.erpws.logistica.service;

import com.ti.erpws.logistica.entity.LogCatalogo;
import com.ti.erpws.logistica.entity.LogOrden;
import com.ti.erpws.logistica.model.request.OrdenAprobRequest;
import com.ti.erpws.logistica.model.request.ReqAprobRequest;
import com.ti.erpws.logistica.model.response.OrdenAprobResponse;
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
}
