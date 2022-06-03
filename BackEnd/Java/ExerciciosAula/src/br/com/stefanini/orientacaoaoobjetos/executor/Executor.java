package br.com.stefanini.orientacaoaoobjetos.executor;

import br.com.stefanini.orientacaodeobjetos.Carro;

public class Executor {
	public static void main(String[] args) {
		Carro carros1 = new Carro();
		carros1.marca = "BMW" ;
		carros1.modelo = "320i";
		carros1.chassi = 9999;
		carros1.placa = "AAA99999"; 
		carros1.bancos = 5; 
		carros1.roda = 20;
		System.out.println(carros1.marca);
		System.out.println(carros1.chassi);
	}
}
