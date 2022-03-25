package gerenciarLocatarios;

import java.util.Scanner;

import app.CNPJ; //Importando a classe CNPJ de outro pacote, para poder apontar corretamente e utilizar de seu método.
import app.Endereco;
 
public class PessoaJuridica extends Locatario {
	Scanner sc = new Scanner(System.in); 
	
	int numeroFuncionarios; //O número total de funcionários que a empresa vai ter.
	String nomeSocial;
    
	public void cadastrarFuncionarios() {	
		System.out.println("----------------------------------------------------------\n");
		System.out.println(" Quantos funcionários a pessoa jurídica tem?\n");
		numeroFuncionarios = sc.nextInt();
		
		PessoaFisica[] funcionarios = new PessoaFisica[numeroFuncionarios]; //Instanciando um número x de funcionários do tipo "PessoaFisica".
		}
		// O código ainda tá inacabado, mas ilustra as relações entre PessoaFisica e PessoaJuridica.	  
	
    
	public void cadastrarCnpj() { //Instanciando "cnpjEmpresa".    	
    	CNPJ cnpjEmpresa;
    	cnpjEmpresa = new CNPJ();
    	cnpjEmpresa.getCnpj();	
    }
    
    public String getNomeSocial() {
    	
    	System.out.println("-------------------------------------------------");
    	System.out.println(" Insira o nome social da pessoa jurídica.\n");
    	
    	nomeSocial = sc.next();
    	
    	return nomeSocial;
    }
    
    public void cadastrarPessoaJuridica(){
    	Endereco enderecoPessoaJuridica;
    	enderecoPessoaJuridica = new Endereco();
	       
    	enderecoPessoaJuridica.setRua();
    	enderecoPessoaJuridica.setNumero();
    	enderecoPessoaJuridica.setComplemento();
    	enderecoPessoaJuridica.setBairro();
    	enderecoPessoaJuridica.setCidade();
    	enderecoPessoaJuridica.setEstado();
    	enderecoPessoaJuridica.setCep();   	
    }
    
}   

