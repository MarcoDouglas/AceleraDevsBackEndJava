package br.com.stefanini.orientacaoaoobjetos;

public class BMW extends Carro {
	public BMW() {
		this.setMarca("BMW");		
	}
	
	@Override
	public String acelerar() {
		return "A BMW pode faze de 0  a" + this.getVelocidade() + " em 5s"	;
	}
}
