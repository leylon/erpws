/**
 * 
 */
package com.ti.erpws.publica.model.response;

//import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Leylon Ocaña Sanchez
 *
 */

@Component("Estados")
public class EstadosResponse {

	private String status;
	private String mensaje;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
