/**
 * 
 */
package com.ti.erpws.publica.util;

import java.util.List;


/**
 * @author Leylon Ocaña Sanchez
 *<T> es una entidad o clase 
 *<S> es la clase de EStadosResponse
 */
public interface PublicaCrud<T,S> {
	
	S crear(T obj);
	
	S actualizar(T obj);
	
	S borrar(T obj);
	
	List<T> listartodo();
	
}
