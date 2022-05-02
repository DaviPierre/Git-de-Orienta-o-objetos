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
		System.out.println(" Digite o CNPJ da empresa.\n");
		valorCnpj = sc.next();
		
		return valorCnpj;
	}
	
	
}
