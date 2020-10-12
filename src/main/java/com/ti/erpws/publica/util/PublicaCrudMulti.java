/**
 * 
 */
package com.ti.erpws.publica.util;

import java.util.List;

/**
 * @author Leylon Ocaña Sanchez
 *@param T = este parametro hace referencia a la clase que va ingresar al metodo
 *@param S = este parametro hacer refrencia a la clase que respoder el metodo
 */
public interface PublicaCrudMulti<T,S> {

	S crear(List<T> entities);
	
	S actualizar(List<T> entities);
	
	S borrar(List<T> entities);
	
	List<T> listartodo();
	
}
