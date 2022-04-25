package gerenciarLocatarios;

import java.util.Scanner;

// Esse "Import" é necessário pois estamos referenciando uma classe diferente de OUTRO pacote.

public class Locatario {
 static Scanner sc = new Scanner(System.in);
	
   int telefone;
   String email; 
   
 
  //----------------------------------------------------------------------------------
 //Aqui começam os métodos próprios de "Locatario".
   
   public Locatario() {
	   
   }
   
   public Locatario( String email, int telefone) {
	  
   }
   
	
 	public void setTelefone(int telefone) {
 		this.telefone = telefone;
 	}
	 public int getTelefone() {
			//  System.out.println(telefone);
			 return telefone;
		}

 	public void setEmail(String email) {
 		this.email = email;
 	}
 	public String getEmail() {
 		// System.out.println(email);
 		return email;
 	}
	
}

