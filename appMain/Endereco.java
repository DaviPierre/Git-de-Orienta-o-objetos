/**
 * 
 */
package app;

import java.util.Scanner;

public class Endereco {
		String rua, complemento, bairro, cidade, estado;
		int numero, cep;
		
		public String setRua() {
			Scanner sc = new Scanner(System.in);
			System.out.println("---------------------------------------");
			System.out.println(" Por favor, insira a rua.");
			
			rua = sc.next();
			return rua;
		}
		
		public int setNumero() {
			Scanner sc = new Scanner(System.in);
			System.out.println("---------------------------------------");
			System.out.println(" Por favor, insira o número.");
			
			numero = sc.nextInt();
			return numero;
		}
		
		public String setComplemento() {
			Scanner sc = new Scanner(System.in);
			System.out.println("---------------------------------------");
			System.out.println(" Por favor, insira o complemento.");
			
			complemento = sc.next();
			return complemento;
		}
		
		public String setBairro() {
			Scanner sc = new Scanner(System.in);
			System.out.println("---------------------------------------");
			System.out.println(" Por favor, insira o bairro.");
			
			bairro = sc.next();
			return bairro;
		}
		
		public String setCidade() {
			Scanner sc = new Scanner(System.in);
			System.out.println("---------------------------------------");
			System.out.println(" Por favor, insira a cidade.");
			
			cidade = sc.next();
			return cidade;
		}
		
		public String setEstado() {
			Scanner sc = new Scanner(System.in);
			System.out.println("---------------------------------------");
			System.out.println(" Por favor, insira o estado.");
			
			estado = sc.next();
			return estado;
		}
		
		public int setCep() {
			Scanner sc = new Scanner(System.in);
			System.out.println("---------------------------------------");
			System.out.println(" Por favor, insira o CEP.");
			
			cep = sc.nextInt();
			return cep;
		}
	}
		
	


