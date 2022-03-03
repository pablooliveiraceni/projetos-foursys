package br.com.imc.bo;

import br.com.imc.beans.Pessoa;

public class PessoaBO {
	
	private Pessoa pessoa;
	
	
	public Pessoa cadastrarPessoa(String nome, double altura,  int idade, double peso) {
		
		pessoa = new Pessoa();
		
		pessoa.setNome(nome);
		pessoa.setAltura(altura);
		pessoa.setIdade(idade);
		pessoa.setPeso(peso);
		
		return pessoa;
		
	}
	
	public void calcularIMC(){
		
		  pessoa.setImc(pessoa.getPeso()/Math.pow(pessoa.getAltura(), 2));
	
		 
	}

}
