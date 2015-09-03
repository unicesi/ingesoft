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
package co.edu.icesi.ingesoft.calculadora.operaciones;

import java.util.Stack;

/**
 * @author Andrés Paz
 * @author XXX
 *
 * @version 0.2, Agosto 2015
 */
public final class Calculadora {

	/**
	 * 
	 * @param pila
	 * @return
	 */
	public static String darResultado(Stack<String> pila) {
		String resultado = "";
		// TODO Completar...
		return resultado;
	}
	
	private double adicionar(double a, double b)
	{
		return a + b;
	}
	
	private double sustraer(double a, double b)
	{
		return a - b;
	}
	
	private double multiplicar(double a, double b)
	{
		return a * b;
	}
	
	private double dividir(double a, double b){
		if(b != 0){
			return a/b;
		}
		return 0;
	}
	
	
}
