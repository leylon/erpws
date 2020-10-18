package com.ti.erpws.logistica.controller;

import com.ti.erpws.logistica.entity.LogCatalogo;
import com.ti.erpws.logistica.model.LogCatalogoVO;
import com.ti.erpws.logistica.service.LogCatalogoService;
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
@RequestMapping("/api/webresources/logistica/LogCatalogo/")
@Api(tags="Logistica-LogCatalogo")
public class LogCatalogoController implements PublicaCrudMulti<LogCatalogoVO, EstadosResponse> {

    @Autowired
    @Qualifier("LogCatalogoService")
    private LogCatalogoService service;

    @Override
    @PostMapping("/CrearLogCatalogo")
    @ApiOperation(value = "Crear LogCatalogo", notes = "servicio para crear uno o varios registros de la tabla LogCatalogo")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse crear(@RequestBody List<LogCatalogoVO> entities) {
        List<LogCatalogo> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogCatalogo(entity)));
        return service.crear(data);
    }

    @Override
    @PostMapping("/ActualizarLogCatalogo")
    @ApiOperation(value = "Actualizar LogCatalogo", notes = "servicio para Actualizar uno o varios registros de la tabla LogCatalogo")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse actualizar(@RequestBody List<LogCatalogoVO> entities) {
        List<LogCatalogo> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogCatalogo(entity)));
        return service.actualizar(data);
    }

    @Override
    @PostMapping("/EliminarLogCatalogo")
    @ApiOperation(value = "Eliminar LogCatalogo", notes = "servicio para Eliminar uno o varios registros de la tabla LogCatalogo")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse borrar(@RequestBody List<LogCatalogoVO> entities) {
        List<LogCatalogo> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogCatalogo(entity)));
        return service.borrar(data);
    }

    @Override
    @GetMapping("/ListarLogCatalogo")
    @ApiOperation(value = "Listar LogCatalogo", notes = "servicio para Listar todos los registro de la tabla LogCatalogo")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public List<LogCatalogoVO> listartodo() {
        List<LogCatalogoVO> data = new ArrayList<>();
        service.listartodo().forEach(entity -> data.add(new LogCatalogoVO(entity)));
        return data;
    }
}
