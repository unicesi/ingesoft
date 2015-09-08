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

import co.edu.icesi.ingesoft.calculadora.Operacion;

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
		double calculo = 0;
	if(pila.size() == 1){
		resultado = pila.pop();
	}
	else{
		double numero1 = Double.parseDouble(pila.pop());
		String operacion = pila.pop();
		double numero2 = Double.parseDouble(pila.pop());
		
		switch(Operacion.obtenerPorTexto(operacion)){
		case SUMA: calculo += adicionar(numero2, numero1); 
		break;
		case RESTA: calculo += sustraer(numero2, numero1);
		break;
		case MULTIPLICACION: calculo += multiplicar(numero2, numero1);
		break;
        case DIVISION: calculo += dividir(numero2, numero1);
        break;
		}
		
		while(pila.size() != 0){
		
		String operador = pila.pop();
		double numerotemp = Double.parseDouble(pila.pop());
		
		
		switch(Operacion.obtenerPorTexto(operador)){
		case SUMA: calculo = adicionar(numerotemp, calculo); 
		break;
		case RESTA: calculo = sustraer(numerotemp, calculo);
		break;
		case MULTIPLICACION: calculo = multiplicar(numerotemp, calculo);
		break;
        case DIVISION: calculo = dividir(numerotemp, calculo);
        break;
		}
		
		
	 }
	
		resultado = calculo + "";
	}
	   
		// TODO Completar...
		return resultado;
	}
	
	private static double adicionar(double a, double b)
	{
		return a + b;
	}
	
	private static double sustraer(double a, double b)
	{
		return a - b;
	}
	
	private static double multiplicar(double a, double b)
	{
		return a * b;
	}
	
	private static double dividir(double a, double b){
		if(b != 0){
			return a/b;
		}
		return 0;
	}
	
	
}
