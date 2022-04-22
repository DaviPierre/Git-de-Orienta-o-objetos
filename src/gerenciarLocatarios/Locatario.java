package gerenciarLocatarios;

import java.util.Scanner;

// Esse "Import" é necessário pois estamos referenciando uma classe diferente de OUTRO pacote.

public class Locatario {
 static Scanner sc = new Scanner(System.in);
	
   int telefone;
   String  nomeCompleto, nomeSocial, email, cpf, cnpj, estadoCivil; 
   
 
  //----------------------------------------------------------------------------------
 //Aqui começam os métodos próprios de "Locatario".
   
   public Locatario() {
	   
   }
   
   public Locatario(String nomeCompleto, String nomeSocial, String email, String cpf, String cnpj, int telefone, String estadoCivil) {
	  
	//   Locatario lessoaFisica = new Locatario();
	//   PessoaFisica bessoaFisica = (PessoaFisica) lessoaFisica;
	  
	   setNomeCompleto(nomeCompleto);
	   setEstadoCivil(estadoCivil);
	   setCpf(cpf);
	   
	   setNomeSocial(nomeSocial);
	   setCnpj(cnpj);	
	   
	   setTelefone(telefone);	   
	   setEmail(email);
   }
   
   // MÉTODOS DE PESSOA FÍSICA - APAGAR DEPOIS (VER DUPLO CASTING)----------------------------------------
   public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}    
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//----------------------------------------------------------------------------------------------------
	
	// MÉTODOS DE PESSOA JURÌDICA - APAGAR DEPOIS (VER DUPLO CASTING)-------------------------------------

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}  	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	//----------------------------------------------------------------------------------------------------
	
 	public void setTelefone(int telefone) {
 		this.telefone = telefone;
 	}
 	public void setEmail(String email) {
 		this.email = email;
 	}

 	
 	public String getNomeCompleto() {
 		System.out.println(nomeCompleto);
 		return nomeCompleto;
 	}
 	public String getNomeSocial() {
 		System.out.println(nomeSocial);
 		return nomeSocial;
 	}
 	public String getEmail() {
 		System.out.println(email);
 		return email;
 	}
 	public int getTelefone() {
  	   System.out.println(telefone);
  	   return telefone;
  	}
 	public String getCpf(){
 		System.out.println(cpf);
 		return cpf;
 	}
 	public String getCnpj(){
 		System.out.println(cnpj);
 		return cnpj;
 	}
 	
	
 	
 	   }

