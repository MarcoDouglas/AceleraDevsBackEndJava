package br.com.stefanini.orientacaoaoobjetos.executor;
import br.com.stefanini.orientacaoaoobjetos.BMW;
import br.com.stefanini.orientacaoaoobjetos.Carro;

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
		
		System.out.println(soma(10, 5));
		
		System.out.println(soma(10, 15, 6));
		
		BMW bmw=new BMW();
		bmw.setVelocidade(100);
		System.out.println(bmw.acelerar());
		
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int soma(int a, int b, int c) {
		return a + b+ c;
	}
}
