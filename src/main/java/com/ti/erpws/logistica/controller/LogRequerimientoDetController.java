package com.ti.erpws.logistica.controller;

import com.ti.erpws.logistica.entity.LogCatalogo;
import com.ti.erpws.logistica.entity.LogRequerimientoDet;
import com.ti.erpws.logistica.model.response.LogCatalogoVO;
import com.ti.erpws.logistica.model.response.LogRequerimientoDetVO;
import com.ti.erpws.logistica.service.LogCatalogoService;
import com.ti.erpws.logistica.service.LogRequerimientoDetService;
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
@RequestMapping("/api/webresources/logistica/LogRequerimientoDet/")
@Api(tags = "Logistica-LogRequerimientoDet")
public class LogRequerimientoDetController implements PublicaCrudMulti<LogRequerimientoDetVO, EstadosResponse> {

    @Autowired
    @Qualifier("LogRequerimientoDetService")
    private LogRequerimientoDetService service;

    @Override
    @PostMapping("/CrearLogRequerimientoDet")
    @ApiOperation(value = "Crear LogRequerimientoDet", notes = "servicio para crear uno o varios registros de la tabla LogRequerimientoDet")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse crear(@RequestBody List<LogRequerimientoDetVO> entities) {
        List<LogRequerimientoDet> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogRequerimientoDet(entity)));
        return service.crear(data);
    }

    @Override
    @PostMapping("/ActualizarLogRequerimientoDet")
    @ApiOperation(value = "Actualizar LogRequerimientoDet", notes = "servicio para Actualizar uno o varios registros de la tabla LogRequerimientoDet")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse actualizar(@RequestBody List<LogRequerimientoDetVO> entities) {
        List<LogRequerimientoDet> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogRequerimientoDet(entity)));
        return service.actualizar(data);
    }

    @Override
    @PostMapping("/EliminarLogRequerimientoDet")
    @ApiOperation(value = "Eliminar LogRequerimientoDet", notes = "servicio para Eliminar uno o varios registros de la tabla LogRequerimientoDet")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse borrar(@RequestBody List<LogRequerimientoDetVO> entities) {
        List<LogRequerimientoDet> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogRequerimientoDet(entity)));
        return service.borrar(data);
    }

    @Override
    @GetMapping("/ListarLogRequerimientoDet")
    @ApiOperation(value = "Listar LogRequerimientoDet", notes = "servicio para Listar todos los registro de la tabla LogRequerimientoDet")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public List<LogRequerimientoDetVO> listartodo() {
        List<LogRequerimientoDetVO> data = new ArrayList<>();
        service.listartodo().forEach(entity -> data.add(new LogRequerimientoDetVO(entity)));
        return data;
    }
}
