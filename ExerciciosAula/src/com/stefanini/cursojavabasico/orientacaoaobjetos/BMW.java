package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class BMW extends Carro{
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		return velocidadeFinal/tempoFinal;
	}

}
