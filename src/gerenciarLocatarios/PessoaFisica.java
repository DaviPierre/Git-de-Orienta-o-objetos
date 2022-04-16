package gerenciarLocatarios;

import java.util.Scanner;

public class PessoaFisica extends Locatario {
	Scanner sc = new Scanner(System.in);
	
	String nomeCompleto, estadoCivil;
	int  cpf;
	
	public String getNomeCompleto() {
		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o nome completo da pessoa física.\n");
		nomeCompleto = sc.next();
		
		return nomeCompleto;
	}
	
	public int setCpf() {
		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o CPF da pessoa física.\n");
		cpf = sc.nextInt();
		
		return cpf;
	}
	
	public String setEstadoCivil() {
		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o estado civil da pessoa física.\n");
		estadoCivil = sc.next();
		
		return estadoCivil;
	}
	
	public void cadastrarPessoaFisica(){
		

	}
}
