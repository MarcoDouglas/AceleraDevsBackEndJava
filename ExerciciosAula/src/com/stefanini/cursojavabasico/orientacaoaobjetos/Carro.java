package com.stefanini.cursojavabasico.orientacaoaobjetos;

public class Carro {
	String marca;
	String modelo;
	int velocidadeMaxima;
	int taxaAceleracao;
	double quilometrosPorLitro;
	
	
	void acelerar(){
		System.out.println("Acelerando ...");
	}	
	void frear() {
		System.out.println("freando...");
	}
	double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial) {
		return(velocidadeFinal - velocidadeInicial)/(tempoFinal - tempoInicial);
	}
	
}
