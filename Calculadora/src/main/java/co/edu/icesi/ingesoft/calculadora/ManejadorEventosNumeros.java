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

/**
 * 
 * 
 * @author Andrés Paz
 * 
 * @version 1.1, Agosto 2015
 */
public final class ManejadorEventosNumeros extends ManejadorEventos {

	/**
	 * 
	 * @param calculadoraGUI
	 */
	public ManejadorEventosNumeros(final CalculadoraGUI calculadoraGUI) {
		super(calculadoraGUI);
	}
	
	/**
	 * 
	 */
	@Override public void actionPerformed(ActionEvent event) {
		String numeroActual = this.obtenerCalculadoraGUI().obtenerTextoDePantalla();
		String nuevoDigito = event.getActionCommand();
		String nuevoNumero = numeroActual + nuevoDigito;
		this.obtenerCalculadoraGUI().cambiarTextoDePantalla(nuevoNumero);
	}

}
