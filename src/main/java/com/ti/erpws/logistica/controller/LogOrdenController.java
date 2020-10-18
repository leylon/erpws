package com.ti.erpws.logistica.controller;

import com.ti.erpws.logistica.entity.LogCatalogo;
import com.ti.erpws.logistica.entity.LogOrden;
import com.ti.erpws.logistica.model.LogCatalogoVO;
import com.ti.erpws.logistica.model.LogOrdenVO;
import com.ti.erpws.logistica.service.LogCatalogoService;
import com.ti.erpws.logistica.service.LogOrdenService;
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
@RequestMapping("/api/webresources/logistica/LogOrden/")
@Api(tags = "Logistica-LogOrden")
public class LogOrdenController implements PublicaCrudMulti<LogOrdenVO, EstadosResponse> {

    @Autowired
    @Qualifier("LogOrdenService")
    private LogOrdenService service;

    @Override
    @PostMapping("/CrearLogOrden")
    @ApiOperation(value = "Crear LogOrden", notes = "servicio para crear uno o varios registros de la tabla LogOrden")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse crear(@RequestBody List<LogOrdenVO> entities) {
        List<LogOrden> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogOrden(entity)));
        return service.crear(data);
    }

    @Override
    @PostMapping("/ActualizarLogOrden")
    @ApiOperation(value = "Actualizar LogOrden", notes = "servicio para Actualizar uno o varios registros de la tabla LogOrden")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse actualizar(@RequestBody List<LogOrdenVO> entities) {
        List<LogOrden> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogOrden(entity)));
        return service.actualizar(data);
    }

    @Override
    @PostMapping("/EliminarLogOrden")
    @ApiOperation(value = "Eliminar LogOrden", notes = "servicio para Eliminar uno o varios registros de la tabla LogOrden")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse borrar(@RequestBody List<LogOrdenVO> entities) {
        List<LogOrden> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogOrden(entity)));
        return service.borrar(data);
    }

    @Override
    @GetMapping("/ListarLogOrden")
    @ApiOperation(value = "Listar LogOrden", notes = "servicio para Listar todos los registro de la tabla LogOrden")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public List<LogOrdenVO> listartodo() {
        List<LogOrdenVO> data = new ArrayList<>();
        service.listartodo().forEach(entity -> data.add(new LogOrdenVO(entity)));
        return data;
    }
}
