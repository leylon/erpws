/**
 * 
 */
package com.ti.erpws.publica.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leylon Ocaña Sanchez
 *
 */
public class PublicaConverter<E,O> {
	private E obj;
	private O objectVo;
	
	
	public  List<E> convertidor(List<O> datos) {
		List<E> lista=new ArrayList<>();
		List<? extends O> intList = new ArrayList<>();
		List<? extends E>  numList = (List<? extends E>) intList;
		//datos.forEach(E -> lista.add(E));
		
		return (List<E>) numList;
	}
}
