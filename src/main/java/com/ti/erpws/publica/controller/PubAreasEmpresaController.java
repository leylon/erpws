package com.ti.erpws.publica.controller;

import com.ti.erpws.publica.entity.PubAreasEmpresa;
import com.ti.erpws.publica.entity.PubEmpresas;
import com.ti.erpws.publica.model.response.EstadosResponse;
import com.ti.erpws.publica.model.response.PubAreasEmpresaVO;
import com.ti.erpws.publica.model.response.PubEmpresasVO;
import com.ti.erpws.publica.service.PubAreasEmpresaService;
import com.ti.erpws.publica.service.PubEmpresasService;
import com.ti.erpws.publica.util.PublicaCrudMulti;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/webresources/publica/PubAreasEmpresa/")
@Api(tags="publica-PubAreasEmpresa")
public class PubAreasEmpresaController implements PublicaCrudMulti<PubAreasEmpresaVO, EstadosResponse> {

    private static final Log logger = LogFactory.getLog(PubAreasEmpresaController.class);

    @Autowired
    @Qualifier("PubAreasEmpresaService")
    private PubAreasEmpresaService service;

    @Override
    @PostMapping("/CrearPubAreasEmpresa")
    @ApiOperation(value="Crear PubAreasEmpresa",notes="servicio para crear uno o varios registros de la tabla PubAreasEmpresa")
    @ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
    public EstadosResponse crear(List<PubAreasEmpresaVO> entities) {
        List<PubAreasEmpresa> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new PubAreasEmpresa(entity)));
        return service.crear(data);
    }

    @Override
    @PostMapping("/ActualizarPubAreasEmpresa")
    @ApiOperation(value="Actualizar PubAreasEmpresa",notes="servicio para crear uno o varios registros de la tabla PubAreasEmpresa")
    @ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
    public EstadosResponse actualizar(List<PubAreasEmpresaVO> entities) {
        List<PubAreasEmpresa> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new PubAreasEmpresa(entity)));
        return service.actualizar(data);
    }

    @Override
    @PostMapping("/EliminarPubAreasEmpresa")
    @ApiOperation(value="Eliminar PubAreasEmpresa",notes="servicio para eliminar uno o varios registros de la tabla PubAreasEmpresa")
    @ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
    public EstadosResponse borrar(List<PubAreasEmpresaVO> entities) {
        List<PubAreasEmpresa> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new PubAreasEmpresa(entity)));
        return service.borrar(data);
    }

    @Override
    @GetMapping("/ListarPubAreasEmpresa")
    @ApiOperation(value="Listar PubAreasEmpresa",notes="servicio para Listar todos los registros de la tabla PubAreasEmpresa")
    @ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
    public List<PubAreasEmpresaVO> listartodo() {
        List<PubAreasEmpresaVO> data = new ArrayList<>();
        service.listartodo().forEach(entity -> data.add(new PubAreasEmpresaVO(entity)));
        return data;
    }
}
