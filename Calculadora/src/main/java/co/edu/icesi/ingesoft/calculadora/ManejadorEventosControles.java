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

import java.awt.event.ActionEvent;
import java.util.Stack;

import co.edu.icesi.ingesoft.calculadora.operaciones.Calculadora;

/**
 * 
 * 
 * @author Andrés Paz
 * 
 * @version 1.1, Agosto 2015
 */
public final class ManejadorEventosControles extends ManejadorEventos {

	/**
	 * 
	 */
	private Stack<String> pila;
	
	/**
	 * 
	 * @param calculadoraGUI
	 */
	public ManejadorEventosControles(final CalculadoraGUI calculadoraGUI) {
		super(calculadoraGUI);
		this.pila = calculadoraGUI.obtenerPila();
	}
	
	/**
	 * 
	 */
	@Override public void actionPerformed(ActionEvent event) {
		String control = event.getActionCommand();
		switch (Control.obtenerPorTexto(control)) {
			case PUNTO:
				String numeroActual = this.obtenerCalculadoraGUI().obtenerTextoDePantalla();
				String numero = "";
				if (!numeroActual.contains(Control.PUNTO.getTexto())) {
					numero = numeroActual + control;
				} else {
					numero = numeroActual;
				}
				this.obtenerCalculadoraGUI().cambiarTextoDePantalla(numero);
				break;
	
			case BORRAR:
				this.obtenerCalculadoraGUI().limpiarTextoDePantalla();
				break;
			
			case RESULTADO:
				String resultado = Calculadora.darResultado(this.pila);
				this.obtenerCalculadoraGUI().cambiarTextoDePantalla(resultado);
				break;
			
		}
		
	}

}
