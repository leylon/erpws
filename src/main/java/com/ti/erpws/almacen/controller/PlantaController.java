package com.ti.erpws.almacen.controller;

import com.ti.erpws.almacen.entity.Planta;
import com.ti.erpws.almacen.model.PlantaVO;
import com.ti.erpws.almacen.service.PlantaService;
import com.ti.erpws.publica.model.response.EstadosResponse;
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

@RestController("PlantaController")
@RequestMapping("/api/webresources/almacen/planta/")
@Api(tags="almacen-Planta")
public class PlantaController implements PublicaCrudMulti<PlantaVO, EstadosResponse> {
    private static final Log logger = LogFactory.getLog(PlantaController.class);

    @Autowired
    @Qualifier("PlantaService")
    private PlantaService service;

    @Override
    @PostMapping("/CrearPlanta")
    @ApiOperation(value="Crear Planta",notes="servicio para crear uno o varios registros de la tabla Locales")
    @ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
    public EstadosResponse crear(List<PlantaVO> entities) {
        // TODO Auto-generated method stub
        List<Planta> data=new ArrayList<>();
        entities.forEach(entity -> data.add(new Planta(entity)) );
        return service.crear(data);
    }

    @Override
    @PostMapping("/ActualizarPLanta")
    @ApiOperation(value="Actualizar Planta",notes="servicio para Actualizar uno o varios registros de la tabla Locales")
    @ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
    public EstadosResponse actualizar(List<PlantaVO> entities) {
        // TODO Auto-generated method stub
        List<Planta> data=new ArrayList<>();
        entities.forEach(entity -> data.add(new Planta(entity)) );
        return service.actualizar(data);
    }

    @Override
    @PostMapping("/EliminarPlanta")
    @ApiOperation(value="Eliminar PubTipdoc",notes="servicio para Eliminar uno o varios registros de la tabla Locales")
    @ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
    public EstadosResponse borrar(List<PlantaVO> entities) {
        // TODO Auto-generated method stub
        List<Planta> data=new ArrayList<>();
        entities.forEach(entity -> data.add(new Planta(entity)) );
        return service.borrar(data);
    }

    @Override
    @GetMapping("/ListarPlanta")
    @ApiOperation(value="Listar Planta",notes="servicio para Listar todos los registro de la tabla Locales")
    @ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
    public List<PlantaVO> listartodo() {
        // TODO Auto-generated method stub
        List<PlantaVO> data=new ArrayList<>();
        service.listartodo().forEach(entity -> data.add(new PlantaVO(entity)) );

        return data;
    }
}
