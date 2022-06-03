package br.com.stefanini.orientacaoaoobjetos.executor;

import br.com.stefanini.orientacaodeobjetos.Carro;

public class Executor {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.setMarca("BMW" );
		carro1.setModelo ("320i");
		carro1.setChassi ( 9999);
		carro1.setPlaca ("AAA99999"); 
		carro1.setBancos(5); 
		carro1.setRoda(20);
		carro1.setVelocidade(280);
		System.out.println(carro1.getMarca());
		carro1.acelerar();
		System.out.println(carro1.acelerar());
		
		Carro carro2=new Carro ("Mercedes");
		System.out.println(carro2.getMarca());
		
	}
}
