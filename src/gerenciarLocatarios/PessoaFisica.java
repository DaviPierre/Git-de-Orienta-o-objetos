package gerenciarLocatarios;

import java.util.Scanner;

public class PessoaFisica extends Locatario {
	Scanner sc = new Scanner(System.in);
	
	String nomeCompleto, email, estadoCivil, cpf;
	int telefone;
	
	public PessoaFisica() {
		
	}
	
	// Aqui entram os dados registrados na main "Locadora1", quando "newPessoaFisica" é instanciada.
	public PessoaFisica(String nomeCompleto, String email, String cpf, int telefone) { 
		setNomeCompleto(nomeCompleto); 
		setEmail(email);
		setCpf(cpf);
		setTelefone(telefone);
	}
	
	// Função que retorna "nomeCompleto" após o registro devido nesta classe (PessoaFisica) por meio do "setNomeCompleto".
	public String getNomeCompleto() {
		// System.out.println(nomeCompleto);
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}    
	
	public String getEstadoCivil() {
		// System.out.println(estadoCivil);
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public String getCpf() {
		// System.out.println(cpf);
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void listarPessoaFisica() {
		System.out.println("Nome Completo: " + getNomeCompleto());
		System.out.println("Email: " + getEmail());
		System.out.println("CPF: " + getCpf());
		System.out.println("Telefone: " + getTelefone());
		// System.out.println("Estado Civil: " + getEstadoCivil());
	}
	
	
}

