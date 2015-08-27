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
import java.awt.event.ActionListener;

/**
 * @author Andrés Paz
 *
 * @version 1.0, Agosto 2015
 */
public abstract class ManejadorEventos implements ActionListener {

	/**
	 * 
	 */
	private CalculadoraGUI calculadoraGUI;
	
	public ManejadorEventos(final CalculadoraGUI calculadoraGUI) {
		this.calculadoraGUI = calculadoraGUI;
	}
	
	/**
	 * 
	 * @return
	 */
	protected CalculadoraGUI obtenerCalculadoraGUI() {
		return this.calculadoraGUI;
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override public abstract void actionPerformed(ActionEvent event);

}
