/**
 * 
 */
package app;

import java.util.Scanner;

public class CNPJ {
	Scanner sc = new Scanner(System.in);
	    
	    String valorCnpj;
	
	public String getCnpj() {
		
		System.out.println("-------------------------------------");
		System.out.println(" Por favor, digite o CNPJ desejado.\n");
		valorCnpj = sc.next();
		
		return valorCnpj;
	}
	
	
}
