package gerenciarLocatarios;

import java.util.Scanner;

public class PessoaFisica extends Locatario {
	Scanner sc = new Scanner(System.in);
	
	String nomeCompleto, estadoCivil;
	int  cpf;
	
	public PessoaFisica() {
		
	}
	
	// Aqui entram os dados registrados na main "Locadora1", quando "newPessoaFisica" é instanciada.
	public PessoaFisica(String nomeCompleto, String email, int cpf, int telefone) { 
		setNomeCompleto(nomeCompleto); 
		setEmail(email);
	}
	
	// Função que retorna "nomeCompleto" após o registro devido nesta classe (PessoaFisica) por meio do "setNomeCompleto".
	public String getNomeCompleto() {
		System.out.println(nomeCompleto);
		return nomeCompleto;
	}
	
	
	//Esse "this" é necessário, pois "nomeCompleto" é uma String diferente em "Locadora1" (estamos em "PessoaFisica").
    //Essencialmente, a linha 26 pode ser traduzida como: registrando nomeCompleto de "newPessoaFisica" (da classe Locadora1)
    //propriamente (na classe PessoaFisica).
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}    
	
	
	public int getCpf() {
		System.out.println(cpf);
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getEstadoCivil() {
		System.out.println(estadoCivil);
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}

