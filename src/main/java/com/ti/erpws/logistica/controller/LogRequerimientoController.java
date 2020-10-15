package com.ti.erpws.logistica.controller;

import com.ti.erpws.logistica.entity.LogCatalogo;
import com.ti.erpws.logistica.entity.LogRequerimiento;
import com.ti.erpws.logistica.model.response.LogCatalogoVO;
import com.ti.erpws.logistica.model.response.LogRequerimientoVO;
import com.ti.erpws.logistica.service.LogCatalogoService;
import com.ti.erpws.logistica.service.LogRequerimientoService;
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
@RequestMapping("/api/webresources/logistica/LogRequerimiento/")
@Api(tags="Logistica-LogRequerimiento")
public class LogRequerimientoController implements PublicaCrudMulti<LogRequerimientoVO, EstadosResponse> {

    @Autowired
    @Qualifier("LogRequerimientoService")
    private LogRequerimientoService service;

    @Override
    @PostMapping("/CrearLogRequerimiento")
    @ApiOperation(value = "Crear LogRequerimiento", notes = "servicio para crear uno o varios registros de la tabla LogRequerimiento")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse crear(@RequestBody List<LogRequerimientoVO> entities) {
        List<LogRequerimiento> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogRequerimiento(entity)));
        return service.crear(data);
    }

    @Override
    @PostMapping("/ActualizarLogRequerimiento")
    @ApiOperation(value = "Actualizar LogRequerimiento", notes = "servicio para Actualizar uno o varios registros de la tabla LogRequerimiento")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse actualizar(@RequestBody List<LogRequerimientoVO> entities) {
        List<LogRequerimiento> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogRequerimiento(entity)));
        return service.actualizar(data);
    }

    @Override
    @PostMapping("/EliminarLogRequerimiento")
    @ApiOperation(value = "Eliminar LogRequerimiento", notes = "servicio para Eliminar uno o varios registros de la tabla LogRequerimiento")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public EstadosResponse borrar(@RequestBody List<LogRequerimientoVO> entities) {
        List<LogRequerimiento> data = new ArrayList<>();
        entities.forEach(entity -> data.add(new LogRequerimiento(entity)));
        return service.borrar(data);
    }

    @Override
    @GetMapping("/ListarLogRequerimiento")
    @ApiOperation(value = "Listar LogRequerimiento", notes = "servicio para Listar todos los registro de la tabla LogRequerimiento")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "El servicio respondio correctamente"), @ApiResponse(code = 400, message = "Solicitud Invalida")})
    public List<LogRequerimientoVO> listartodo() {
        List<LogRequerimientoVO> data = new ArrayList<>();
        service.listartodo().forEach(entity -> data.add(new LogRequerimientoVO(entity)));
        return data;
    }
}
