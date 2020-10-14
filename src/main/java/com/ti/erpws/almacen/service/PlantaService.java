package com.ti.erpws.almacen.service;

import com.ti.erpws.almacen.entity.Planta;
import com.ti.erpws.almacen.repository.AlmacenesRepository;
import com.ti.erpws.publica.model.response.EstadosResponse;
import com.ti.erpws.publica.util.PublicaCrudMulti;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("PlantaService")
@Transactional(readOnly = true)
public class PlantaService implements PublicaCrudMulti<Planta, EstadosResponse> {
    private static final Log logger = LogFactory.getLog(PlantaService.class);

    @Autowired
    @Qualifier("AlmacenesRepository")
    private AlmacenesRepository repository;

    @Autowired
    @Qualifier("Estados")
    private EstadosResponse estado;

    @Override
    public EstadosResponse crear(List<Planta> entities) {
        // TODO Auto-generated method stub
        estado = new EstadosResponse();
        try {

            repository.saveAll(entities);
            estado.setStatus("Success");
            estado.setMensaje("Se Guardó Correctamente..!");
        } catch (Exception e) {
            // TODO: handle exception
            estado.setStatus("Error");
            logger.error(e.getMessage());
            estado.setMensaje(e.getMessage().toString());
        }
        return estado;
    }

    @Override
    public EstadosResponse actualizar(List<Planta> entities) {
        // TODO Auto-generated method stub
        estado = new EstadosResponse();
        try {

            repository.saveAll(entities);
            estado.setStatus("Success");
            estado.setMensaje("Se Actualizó Correctamente..!");
        } catch (Exception e) {
            // TODO: handle exception
            estado.setStatus("Error");
            logger.error(e.getMessage());
            estado.setMensaje(e.getMessage().toString());
        }
        return estado;
    }

    @Override
    public EstadosResponse borrar(List<Planta> entities) {
        // TODO Auto-generated method stub
        estado = new EstadosResponse();
        try {

            repository.deleteAll(entities);
            estado.setStatus("Success");
            estado.setMensaje("Se Eliminó Correctamente..!");
        } catch (Exception e) {
            // TODO: handle exception
            estado.setStatus("Error");
            logger.error(e.getMessage());
            estado.setMensaje(e.getMessage().toString());
        }
        return estado;
    }

    @Override
    public List<Planta> listartodo() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }
}
