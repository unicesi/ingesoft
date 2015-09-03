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

import java.awt.EventQueue;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * 
 * 
 * @author Andrés Paz
 * 
 * @version 1.1, Agosto 2015
 */
public final class CalculadoraGUI {

	/**
	 * 
	 */
	private JFrame ventana;
	/**
	 * 
	 */
	private JTextField textFieldPantalla;
	/**
	 * 
	 */
	private Stack<String> pila;
	/**
	 * 
	 */
	private ManejadorEventosNumeros manejadorEventosNumeros;
	/**
	 * 
	 */
	private ManejadorEventosOperaciones manejadorEventosOperaciones;
	/**
	 * 
	 */
	private ManejadorEventosControles manejadorEventosControles;

	/**
	 * Inicia la aplicación.
	 * 
	 * @param args Parámetros de ejecución.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGUI calculadoraGUI = new CalculadoraGUI();
					calculadoraGUI.ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Crea la aplicación.
	 */
	protected CalculadoraGUI() {
		this.pila = new Stack<String>();
		this.manejadorEventosNumeros = new ManejadorEventosNumeros(this);
		this.manejadorEventosOperaciones = new ManejadorEventosOperaciones(this);
		this.manejadorEventosControles = new ManejadorEventosControles(this);
		initialize();
	}

	/**
	 * Inicializa el contenido de la ventana.
	 */
	private void initialize() {
		ventana = new JFrame();
		ventana.setBounds(100, 100, 207, 212);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);

		JPanel panelPantalla = new JPanel();
		panelPantalla.setBounds(0, 0, 207, 49);
		ventana.getContentPane().add(panelPantalla);
		panelPantalla.setLayout(null);
		
		textFieldPantalla = new JTextField();
		textFieldPantalla.setEditable(false);
		textFieldPantalla.setBounds(6, 6, 154, 37);
		panelPantalla.add(textFieldPantalla);
		textFieldPantalla.setColumns(10);
		
		JButton buttonBorrar = new JButton(Control.BORRAR.getTexto());
		buttonBorrar.addActionListener(this.manejadorEventosControles);
		buttonBorrar.setBounds(159, 11, 48, 29);
		panelPantalla.add(buttonBorrar);
		
		JPanel panelControles = new JPanel();
		panelControles.setBounds(0, 49, 207, 140);
		ventana.getContentPane().add(panelControles);
		panelControles.setLayout(null);

		JButton buttonCero = new JButton(Numero.CERO.getTexto());
		buttonCero.setActionCommand(Numero.CERO.getTexto());
		buttonCero.addActionListener(this.manejadorEventosNumeros);
		buttonCero.setBounds(6, 103, 48, 29);
		panelControles.add(buttonCero);

		JButton buttonUno = new JButton(Numero.UNO.getTexto());
		buttonUno.setActionCommand(Numero.UNO.getTexto());
		buttonUno.addActionListener(this.manejadorEventosNumeros);
		buttonUno.setBounds(6, 70, 48, 29);
		panelControles.add(buttonUno);
		
		JButton buttonDos = new JButton(Numero.DOS.getTexto());
		buttonDos.setActionCommand(Numero.DOS.getTexto());
		buttonDos.addActionListener(this.manejadorEventosNumeros);
		buttonDos.setBounds(54, 70, 48, 29);
		panelControles.add(buttonDos);
		
		JButton buttonTres = new JButton(Numero.TRES.getTexto());
		buttonTres.setActionCommand(Numero.TRES.getTexto());
		buttonTres.addActionListener(this.manejadorEventosNumeros);
		buttonTres.setBounds(102, 70, 48, 29);
		panelControles.add(buttonTres);
		
		JButton buttonCuatro = new JButton(Numero.CUATRO.getTexto());
		buttonCuatro.setActionCommand(Numero.CUATRO.getTexto());
		buttonCuatro.addActionListener(this.manejadorEventosNumeros);
		buttonCuatro.setBounds(6, 38, 48, 29);
		panelControles.add(buttonCuatro);
		
		JButton buttonCinco = new JButton(Numero.CINCO.getTexto());
		buttonCinco.setActionCommand(Numero.CINCO.getTexto());
		buttonCinco.addActionListener(this.manejadorEventosNumeros);
		buttonCinco.setBounds(54, 38, 48, 29);
		panelControles.add(buttonCinco);
		
		JButton buttonSeis = new JButton(Numero.SEIS.getTexto());
		buttonSeis.setActionCommand(Numero.SEIS.getTexto());
		buttonSeis.addActionListener(this.manejadorEventosNumeros);
		buttonSeis.setBounds(102, 38, 48, 29);
		panelControles.add(buttonSeis);

		JButton buttonSiete = new JButton(Numero.SIETE.getTexto());
		buttonSiete.setActionCommand(Numero.SIETE.getTexto());
		buttonSiete.addActionListener(this.manejadorEventosNumeros);
		buttonSiete.setBounds(6, 6, 48, 29);
		panelControles.add(buttonSiete);
		
		JButton buttonOcho = new JButton(Numero.OCHO.getTexto());
		buttonOcho.setActionCommand(Numero.OCHO.getTexto());
		buttonOcho.addActionListener(this.manejadorEventosNumeros);
		buttonOcho.setBounds(54, 6, 48, 29);
		panelControles.add(buttonOcho);
		
		JButton buttonNueve = new JButton(Numero.NUEVE.getTexto());
		buttonNueve.setActionCommand(Numero.NUEVE.getTexto());
		buttonNueve.addActionListener(this.manejadorEventosNumeros);
		buttonNueve.setBounds(102, 6, 48, 29);
		panelControles.add(buttonNueve);
		
		JButton buttonPunto = new JButton(Control.PUNTO.getTexto());
		buttonPunto.setActionCommand(Control.PUNTO.getTexto());
		buttonPunto.addActionListener(this.manejadorEventosControles);
		buttonPunto.setBounds(54, 103, 48, 29);
		panelControles.add(buttonPunto);
		
		JButton buttonSuma = new JButton(Operacion.SUMA.getTexto());
		buttonSuma.addActionListener(this.manejadorEventosOperaciones);
		buttonSuma.setBounds(150, 103, 48, 29);
		panelControles.add(buttonSuma);
		
		JButton buttonResta = new JButton(Operacion.RESTA.getTexto());
		buttonResta.addActionListener(this.manejadorEventosOperaciones);
		buttonResta.setBounds(150, 70, 48, 29);
		panelControles.add(buttonResta);
		
		JButton buttonMultiplicacion = new JButton(Operacion.MULTIPLICACION.getTexto());
		buttonMultiplicacion.addActionListener(this.manejadorEventosOperaciones);
		buttonMultiplicacion.setBounds(150, 38, 48, 29);
		panelControles.add(buttonMultiplicacion);

		JButton buttonDivision = new JButton(Operacion.DIVISION.getTexto());
		buttonDivision.addActionListener(this.manejadorEventosOperaciones);
		buttonDivision.setBounds(150, 6, 48, 29);
		panelControles.add(buttonDivision);

		JButton buttonResultado = new JButton(Control.RESULTADO.getTexto());
		buttonResultado.addActionListener(this.manejadorEventosControles);
		buttonResultado.setBounds(102, 103, 48, 29);
		panelControles.add(buttonResultado);
	}
	
	/**
	 * 
	 * @return
	 */
	protected String obtenerTextoDePantalla() {
		return this.textFieldPantalla.getText();
	}

	/**
	 * 
	 * @return
	 */
	protected Stack<String> obtenerPila() {
		return this.pila;
	}
	
	/**
	 * 
	 * @param texto
	 */
	protected void cambiarTextoDePantalla(String texto) {
		this.textFieldPantalla.setText(texto);
	}
	
	/**
	 * 
	 */
	protected void limpiarTextoDePantalla() {
		this.textFieldPantalla.setText("");
	}
	
}
