/**
 * Codigo Autogenerado
 * @author Leylon Ocaña Sanchez /
 */
package com.ti.erpws.publica.service;

import com.ti.erpws.publica.entity.PubTipdoc;
import com.ti.erpws.publica.model.response.EstadosResponse;
import com.ti.erpws.publica.repository.PubTipdocRepository;
import com.ti.erpws.publica.util.PublicaCrudMulti;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * @author Leylon Ocaña Sanchez
 *
 */
@Service("PubTipdocService")
@Transactional(readOnly = true)
public class PubTipdocService implements PublicaCrudMulti<PubTipdoc, EstadosResponse> {
	private static final Log logger = LogFactory.getLog(PubTipdocService.class);

	@Autowired
	@Qualifier("PubTipdocRepository")
	private PubTipdocRepository repository;

	@Autowired
	@Qualifier("Estados")
	private EstadosResponse estado;

	@Override
	@Transactional
	public EstadosResponse crear(List<PubTipdoc> entities) {
		// TODO Auto-generated method stub
		estado = new EstadosResponse();
		try {

			//repository.save(entities);
			estado.setStatus("Success");
			estado.setMensaje("Se Guardó Correctamente..!");
		} catch (Exception e) {
			// TODO: handle exception
			estado.setStatus("Error");
			logger.error(e.getMessage());
			estado.setMensaje(e.getMessage().toString());
		}
		return estado;
	}

	@Override
	@Transactional
	public EstadosResponse actualizar(List<PubTipdoc> entities) {
		// TODO Auto-generated method stub
		estado = new EstadosResponse();
		try {

			//repository.save(entities);
			estado.setStatus("Success");
			estado.setMensaje("Se Actualizó Correctamente..!");
		} catch (Exception e) {
			// TODO: handle exception
			estado.setStatus("Error");
			logger.error(e.getMessage());
			estado.setMensaje(e.getMessage().toString());
		}
		return estado;
	}

	@Override
	@Transactional
	public EstadosResponse borrar(List<PubTipdoc> entities) {
		// TODO Auto-generated method stub
		estado = new EstadosResponse();
		try {

			//repository.delete(entities);
			estado.setStatus("Success");
			estado.setMensaje("Se Eliminó Correctamente..!");
		} catch (Exception e) {
			// TODO: handle exception
			estado.setStatus("Error");
			logger.error(e.getMessage());
			estado.setMensaje(e.getMessage().toString());
		}
		return estado;
	}

	@Override
	public List<PubTipdoc> listartodo() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}