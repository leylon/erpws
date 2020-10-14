package com.ti.erpws.logistica.controller;

import com.ti.erpws.logistica.entity.LogTipoCatalogo;
import com.ti.erpws.logistica.model.response.LogTipoCatalogoVO;
import com.ti.erpws.logistica.service.LogTipoCatalogoService;
import com.ti.erpws.publica.model.response.EstadosResponse;
import com.ti.erpws.publica.util.PublicaCrudMulti;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/webresources/logistica/LogTipoCatalogo/")
@Api(tags = "Logistica-LogTipoCatalogo")
public class LogTipoCatalogoController implements PublicaCrudMulti<LogTipoCatalogoVO, EstadosResponse> {

    @Autowired
    @Qualifier("LogTipoCatalogoService")
    private LogTipoCatalogoService service;

    @Override
    @PostMapping("/CrearLogTipoCatalogo")
    @ApiOperation(value = "Crear LogTipoCatalogo", notes = "servicio para crear uno o varios registros de la tabla LogTipoCatalogo")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse crear(@RequestBody List<LogTipoCatalogoVO> entities) {
        List<LogTipoCatalogo> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogTipoCatalogo(entity)));
        return service.crear(data);
    }

    @Override
    @PostMapping("/ActualizarLogTipoCatalogo")
    @ApiOperation(value = "Actualizar LogTipoCatalogo", notes = "servicio para Actualizar uno o varios registros de la tabla LogTipoCatalogo")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse actualizar(@RequestBody List<LogTipoCatalogoVO> entities) {
        List<LogTipoCatalogo> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogTipoCatalogo(entity)));
        return service.actualizar(data);
    }

    @Override
    @PostMapping("/EliminarLogTipoCatalogo")
    @ApiOperation(value = "Eliminar LogTipoCatalogo", notes = "servicio para Eliminar uno o varios registros de la tabla LogTipoCatalogo")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse borrar(@RequestBody List<LogTipoCatalogoVO> entities) {
        List<LogTipoCatalogo> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogTipoCatalogo(entity)));
        return service.borrar(data);
    }

    @Override
    @GetMapping("/ListarLogTipoCatalogo")
    @ApiOperation(value = "Listar LogTipoCatalogo", notes = "servicio para Listar todos los registro de la tabla LogTipoCatalogo")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public List<LogTipoCatalogoVO> listartodo() {
        List<LogTipoCatalogoVO> data = new ArrayList<>();
        service.listartodo().forEach(entity -> data.add(new LogTipoCatalogoVO(entity)));
        return data;
    }
}
