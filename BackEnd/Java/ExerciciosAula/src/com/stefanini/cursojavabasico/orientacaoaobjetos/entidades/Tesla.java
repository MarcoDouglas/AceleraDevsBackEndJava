package com.stefanini.cursojavabasico.orientacaoaobjetos.entidades;

import com.stefanini.cursojavabasico.orientacaoaobjetos.Carro;

public class Tesla extends Carro {
	private boolean dirigeSozinho;

	public Tesla() {
		super();
	}
	
	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}
	
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Tesla Sobrescrita");
		return velocidadeFinal * tempoFinal;
	}
}
