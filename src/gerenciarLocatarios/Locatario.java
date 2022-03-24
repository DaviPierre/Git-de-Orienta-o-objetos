package gerenciarLocatarios;

import java.util.Scanner;

// Esse "Import" é necessário pois estamos referenciando uma classe diferente de OUTRO pacote.
import app.Endereco;

public class Locatario {
 static Scanner sc = new Scanner(System.in);
	
   int telefone;
   String email; 
 
   // Referência de Endereco(classe) e puxando os métodos de lá.
 public void cadastrarEndereco(){
       Endereco enderecoLocatario;
       enderecoLocatario = new Endereco();
       
       enderecoLocatario.setRua();
       enderecoLocatario.setNumero();
       enderecoLocatario.setComplemento();
       enderecoLocatario.setBairro();
       enderecoLocatario.setCidade();
       enderecoLocatario.setEstado();
       enderecoLocatario.setCep();
          
   }
 
  //----------------------------------------------------------------------------------
 //Aqui começam os métodos próprios de "Locatario".
 	public String getEmail() {
 		System.out.println("---------------------------------------");
		System.out.println(" Por favor, insira o e-mail do locatário.");
		
		email = sc.next();
 			
		return email;
 	}
 
 	public int getTelefone() {
 		System.out.println("---------------------------------------");
		System.out.println(" Por favor, insira o telefone do locatário.");
		
		telefone = sc.nextInt();
 			
		return telefone;
 	}
 
}
