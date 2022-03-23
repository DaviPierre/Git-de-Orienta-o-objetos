/**
 * 
 */
package app;

import java.util.Scanner;

public class CNPJ {
	    
	    String valorCnpj;
	
	public String setCnpj() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("-------------------------------------");
		System.out.println(" Por favor, digite o CNPJ desejado.\n");
		valorCnpj = sc.next();
		
		return valorCnpj;
	}
	
	
}
