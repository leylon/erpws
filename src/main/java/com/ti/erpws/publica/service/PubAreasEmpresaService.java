package com.ti.erpws.publica.service;

import com.ti.erpws.publica.entity.PubAreasEmpresa;
import com.ti.erpws.publica.entity.PubEmpresas;
import com.ti.erpws.publica.model.response.EstadosResponse;
import com.ti.erpws.publica.repository.PubAreasEmpresaRepository;
import com.ti.erpws.publica.repository.PubEmpresasRepository;
import com.ti.erpws.publica.util.PublicaCrudMulti;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("PubAreasEmpresaService")
@Transactional(readOnly = true)
public class PubAreasEmpresaService implements PublicaCrudMulti<PubAreasEmpresa, EstadosResponse> {

    private static final Log logger = LogFactory.getLog(PubAreasEmpresaService.class);

    @Autowired
    @Qualifier("PubAreasEmpresaRepository")
    private PubAreasEmpresaRepository repository;

    @Autowired
    @Qualifier("Estados")
    private EstadosResponse estado;

    @Override
    public EstadosResponse crear(List<PubAreasEmpresa> entities) {
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
    public EstadosResponse actualizar(List<PubAreasEmpresa> entities) {
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
    public EstadosResponse borrar(List<PubAreasEmpresa> entities) {
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
    public List<PubAreasEmpresa> listartodo() {
        return repository.findAll();
    }
}
