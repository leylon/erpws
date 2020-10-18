package com.ti.erpws.logistica.controller;

import com.ti.erpws.logistica.entity.LogOrden;
import com.ti.erpws.logistica.entity.LogOrdenDet;
import com.ti.erpws.logistica.model.LogOrdenDetVO;
import com.ti.erpws.logistica.model.LogOrdenVO;
import com.ti.erpws.logistica.service.LogOrdenDetService;
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
@RequestMapping("/api/webresources/logistica/LogOrdenDet/")
@Api(tags = "Logistica-LogOrden")
public class LogOrdenDetController implements PublicaCrudMulti<LogOrdenDetVO, EstadosResponse> {

    @Autowired
    @Qualifier("LogOrdenDetService")
    private LogOrdenDetService service;

    @Override
    @PostMapping("/CrearLogOrdenDet")
    @ApiOperation(value = "Crear LogOrdenDet", notes = "servicio para crear uno o varios registros de la tabla LogOrdenDet")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse crear(@RequestBody List<LogOrdenDetVO> entities) {
        List<LogOrdenDet> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogOrdenDet(entity)));
        return service.crear(data);
    }

    @Override
    @PostMapping("/ActualizarLogOrdenDet")
    @ApiOperation(value = "Actualizar LogOrdenDet", notes = "servicio para Actualizar uno o varios registros de la tabla LogOrdenDet")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse actualizar(@RequestBody List<LogOrdenDetVO> entities) {
        List<LogOrdenDet> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogOrdenDet(entity)));
        return service.actualizar(data);
    }

    @Override
    @PostMapping("/EliminarLogOrdenDet")
    @ApiOperation(value = "Eliminar LogOrdenDet", notes = "servicio para Eliminar uno o varios registros de la tabla LogOrdenDet")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse borrar(@RequestBody List<LogOrdenDetVO> entities) {
        List<LogOrdenDet> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogOrdenDet(entity)));
        return service.borrar(data);
    }

    @Override
    @GetMapping("/ListarLogOrdenDet")
    @ApiOperation(value = "Listar LogOrdenDet", notes = "servicio para Listar todos los registro de la tabla LogOrdenDet")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public List<LogOrdenDetVO> listartodo() {
        List<LogOrdenDetVO> data = new ArrayList<>();
        service.listartodo().forEach(entity -> data.add(new LogOrdenDetVO(entity)));
        return data;
    }
}
