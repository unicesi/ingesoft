/*
 * Copyright © 2015 Universidad Icesi
 * 
 * This file is part of Calculadora.
 * 
 * Calculadora is free software: you can redistribute it 
 * and/or modify it under the terms of the GNU General 
 * Public License as published by the Free Software 
 * Foundation, either version 3 of the License, or (at your 
 * option) any later version.
 * 
 * Calculadora is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied 
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 
 * PURPOSE. See the GNU General Public License for more 
 * details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with The SLR Support Tools. If not, see 
 * <http://www.gnu.org/licenses/>.
 */
package co.edu.icesi.ingesoft.calculadora;

/**
 * @author Andrés Paz
 * 
 * @version 1.1, Agosto 2015
 */
public enum Control {

	/**
	 * 
	 */
	PUNTO("."),
	/**
	 * 
	 */
	RESULTADO("="),
	/**
	 * 
	 */
	BORRAR("C");
	
	/**
	 * 
	 */
	private String texto;
	
	/**
	 * 
	 * @param texto
	 */
	private Control(final String texto) {
		this.texto = texto;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getTexto() {
		return this.texto;
	}
	
	/**
	 * 
	 * @param texto
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static Control obtenerPorTexto(String texto) throws IllegalArgumentException {
		for (Control control : values()) {
			if (control.getTexto().equals(texto)) {
				return control;
			}
		}
		throw new IllegalArgumentException(texto + " no es un control válido.");
	}
}
