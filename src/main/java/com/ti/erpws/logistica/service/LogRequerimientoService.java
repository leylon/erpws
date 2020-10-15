package com.ti.erpws.logistica.service;

import com.ti.erpws.logistica.entity.LogRequerimiento;
import com.ti.erpws.logistica.repository.LogCatalogoRepository;
import com.ti.erpws.logistica.repository.LogRequerimientoRepository;
import com.ti.erpws.publica.model.response.EstadosResponse;
import com.ti.erpws.publica.util.PublicaCrudMulti;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("LogRequerimientoService")
@Transactional(readOnly = true)
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
}
