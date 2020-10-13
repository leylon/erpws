package com.ti.erpws.publica.controller;

import com.ti.erpws.publica.entity.PubEmpresas;
import com.ti.erpws.publica.entity.PubTipdoc;
import com.ti.erpws.publica.model.response.EstadosResponse;
import com.ti.erpws.publica.model.response.PubEmpresasVO;
import com.ti.erpws.publica.model.response.PubTipdocVO;


import com.ti.erpws.publica.service.PubEmpresasService;
import com.ti.erpws.publica.util.PublicaCrudMulti;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/webresources/publica/PubEmpresas/")
public class PubEmpresasController implements PublicaCrudMulti<PubEmpresasVO, EstadosResponse> {

    private static final Log logger = LogFactory.getLog(PubEmpresasController.class);

    @Autowired
    @Qualifier("PubEmpresasService")
    private PubEmpresasService service;

    @Override
    @PostMapping("/CrearPubEmpresas")
    public EstadosResponse crear(List<PubEmpresasVO> entities) {
        List<PubEmpresas> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new PubEmpresas(entity)));
        return service.crear(data);
    }

    @Override
    @PostMapping("/ActualizarPubEmpresas")
    public EstadosResponse actualizar(List<PubEmpresasVO> entities) {
        List<PubEmpresas> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new PubEmpresas(entity)));
        return service.actualizar(data);
    }

    @Override
    @PostMapping("/EliminarPubEmpresas")
    public EstadosResponse borrar(List<PubEmpresasVO> entities) {
        List<PubEmpresas> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new PubEmpresas(entity)));
        return service.borrar(data);
    }

    @Override
    @GetMapping("/ListarPubEmpresas")
    public List<PubEmpresasVO> listartodo() {
        List<PubEmpresasVO> data = new ArrayList<>();
        service.listartodo().forEach(entity -> data.add(new PubEmpresasVO(entity)));
        return data;
    }
}
