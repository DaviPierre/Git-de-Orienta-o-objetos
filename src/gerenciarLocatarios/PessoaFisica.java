package gerenciarLocatarios;

import java.util.Scanner;

public class PessoaFisica extends Locatario {
	Scanner sc = new Scanner(System.in);
	
	String nomeCompleto, estadoCivil;
	int  cpf;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nomeCompleto, String email, int cpf, int telefone) {
		setNomeCompleto(nomeCompleto);
		setEmail(email);
	}
	
	public String getNomeCompleto() {
		System.out.println(nomeCompleto);
		return nomeCompleto;
	}
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
	
	
	public void cadastrarPessoaFisica(){
		

	}
}
