/**
 * Codigo Autogenerado
 * @author Leylon Ocaña Sanchez
 */
package com.ti.erpws.publica.controller;


import com.ti.erpws.publica.entity.PubTipdoc;
import com.ti.erpws.publica.model.response.EstadosResponse;
import com.ti.erpws.publica.model.response.PubTipdocVO;
import com.ti.erpws.publica.service.PubTipdocService;
import com.ti.erpws.publica.util.PublicaCrudMulti;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Leylon Ocaña Sanchez
 *
 */
@RestController
@RequestMapping("/api/webresources/publica/PubTipdoc/")
//@Api(tags="publica-PubTipdoc")
public class PubTipdocController implements PublicaCrudMulti<PubTipdocVO, EstadosResponse> {
	
	private static final Log logger = LogFactory.getLog(PubTipdocController.class);
	
	@Autowired
	@Qualifier("PubTipdocService")
	private PubTipdocService service;

	
	@Override
	@PostMapping("/CrearPubTipdoc")
	//@ApiOperation(value="Crear PubTipdoc",notes="servicio para crear uno o varios registros de la tabla PubTipdoc")
	//@ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
	public EstadosResponse crear(@RequestBody List<PubTipdocVO> entities) {
		// TODO Auto-generated method stub
		List<PubTipdoc> data=new ArrayList<>();
		entities.forEach(entity -> data.add(new PubTipdoc(entity)) );
 		return service.crear(data);
	}

	@Override
	@PostMapping("/ActualizarPubTipdoc")
	//@ApiOperation(value="Actualizar PubTipdoc",notes="servicio para Actualizar uno o varios registros de la tabla PubTipdoc")
	//@ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
	public EstadosResponse actualizar(@RequestBody List<PubTipdocVO> entities) {
		// TODO Auto-generated method stub
		List<PubTipdoc> data=new ArrayList<>();
		entities.forEach(entity -> data.add(new PubTipdoc(entity)) );
 		return service.actualizar(data);
	}

	@Override
	@PostMapping("/EliminarPubTipdoc")
	//@ApiOperation(value="Eliminar PubTipdoc",notes="servicio para Eliminar uno o varios registros de la tabla PubTipdoc")
	//@ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
	public EstadosResponse borrar(@RequestBody List<PubTipdocVO> entities) {
		// TODO Auto-generated method stub
		List<PubTipdoc> data=new ArrayList<>();
		entities.forEach(entity -> data.add(new PubTipdoc(entity)) );
 		return service.borrar(data);
	}

	@Override
	@GetMapping("/ListarPubTipdoc")
	//@ApiOperation(value="Listar PubTipdoc",notes="servicio para Listar todos los registro de la tablaPubTipdoc")
	//@ApiResponses(value= {@ApiResponse(code=200, message="El servicio respondio correctamente"),@ApiResponse(code=400, message="Solicitud Invalida")})
	public List<PubTipdocVO> listartodo() {
		// TODO Auto-generated method stub
		List<PubTipdocVO> data=new ArrayList<>();
		service.listartodo().forEach(entity -> data.add(new PubTipdocVO(entity)) );
 		
		return data;
	}
	
	
	
}