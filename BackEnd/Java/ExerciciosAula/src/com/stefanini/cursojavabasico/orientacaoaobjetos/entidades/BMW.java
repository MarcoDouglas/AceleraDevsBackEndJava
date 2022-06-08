package com.stefanini.cursojavabasico.orientacaoaobjetos.entidades;

import com.stefanini.cursojavabasico.orientacaoaobjetos.Carro;
import com.stefanini.cursojavabasico.orientacaoaobjetos.Conversivel;
import com.stefanini.cursojavabasico.orientacaoaobjetos.Esportivo;
import com.stefanini.cursojavabasico.orientacaoaobjetos.Utilitario;

public class BMW extends Carro implements Conversivel, Utilitario {


	public BMW(){
		super();
	}
	
	  @Override
	  public double calcularTaxaAceleracao(double velocidadeFinal, double
	  tempoFinal) { System.out.println("BMW Sobrescrita"); return velocidadeFinal /
	  tempoFinal; }

	@Override
	public void piscarAlerta() {
		System.out.println("BMW piscando alerta...");
		
	}

	@Override
	public void acionarTubo() {
		// TODO Auto-generated method stub
	}

	@Override
	public void passear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abrirCapo() {
		// TODO Auto-generated method stub
		
	}
	
	 
}
