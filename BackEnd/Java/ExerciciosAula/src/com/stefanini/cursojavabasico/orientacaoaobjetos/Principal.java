package com.stefanini.cursojavabasico.orientacaoaobjetos;

import com.stefanini.cursojavabasico.orientacaoaobjetos.entidades.BMW;
import com.stefanini.cursojavabasico.orientacaoaobjetos.entidades.Tesla;

public class Principal {
	public static void main(String[] args) {
		Carro bmw = new Carro();
		bmw.setMarca ("BMW");
		bmw.setModelo  ("M3");
		bmw.setQuilometrosPorLitro (7.5);
		bmw.setTaxaAceleracao  (50);
	//	bmw.setVelocidadeMaxima(280);
		
		Carro mercedes =new Carro ("Mercedes","c180");
		
		BMW bmwDois = new BMW();
		Tesla tesla=new Tesla();
		tesla.isDirigeSozinho();
		
		try {
			bmwDois.setVelocidadeMaxima(-10);
		}catch (NegocioException e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {//finally executa independente de sucesso ou não.
			System.out.println("Passou aqui");
		}
		
		
		Carro teslaDois=new Tesla();
		//tesla Dois não tem acesso a atributos e metodos da classe Tesla.
		//usando casting para ter acesso a classe Tesla.
		((Tesla)teslaDois).setDirigeSozinho(true);
		System.out.println(((Tesla) teslaDois).isDirigeSozinho());
		
		Carro[] carros = new Carro[] {bmw, bmwDois, tesla, teslaDois};
		
		for (Carro carro: carros) {
			if (carro instanceof Tesla) {
				//Checando se é uma instancia de Tesla.
				System.out.println(((Tesla)carro).isDirigeSozinho());
			}
		}
 		
		bmwDois.calcularTaxaAceleracao(100.50, 10);
		tesla.calcularTaxaAceleracao(100.50, 10);
		/*
		 * System.out.println(bmwDois.calcularTaxaAceleracao(100.5, 10.5));
		 * 
		 * System.out.println(mercedes.getMarca());
		 * System.out.println(mercedes.getModelo());
		 * 
		 * 
		 * System.out.println(bmw.getMarca()); System.out.println(bmw.getModelo());
		 * System.out.println(bmw.getQuilometrosPorLitro());
		 * System.out.println(bmw.getTaxaAceleracao());
		 * System.out.println(bmw.getVelocidadeMaxima());
		 * System.out.println(bmw.calcularTaxaAceleracao(100, 5)); bmw.acelerar();
		 * bmw.frear();
		 * 
		 * System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0 ,
		 * 10,0));
		 * System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 5));
		 */
	}
	
}
