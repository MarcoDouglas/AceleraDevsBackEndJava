package br.com.stefanini.orientacaoaoobjetos;

public class Mercedes extends Carro {
	
	public Mercedes() {
		this.setMarca("Mercedes");
	}
	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "A Mercedes tem uma aceleração diferente para cada modelo";
	}
}