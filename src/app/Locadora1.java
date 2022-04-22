package app;

import java.util.Scanner;

import gerenciarLocatarios.Locatario;
import gerenciarLocatarios.PessoaFisica;

import gerenciarFrotas.Veiculo;

import java.util.ArrayList; // Esse import vai servir para registrar diversos usuários, veículos e reservas

public class Locadora1 {
	
	// Esses ArrayLists são as listas de array que vão guardar os dados e número de objetos cadastrados, usados depois para listar os elementos.
	
	
	
// O menu principal contido na função main - aqui que vai acontecer tudo	
	public static void main(String[] args) {
		
	    ArrayList<Locatario> locatario = new ArrayList<Locatario>(); 
	    
	    ArrayList<Veiculo> veiculo = new ArrayList<Veiculo>();
	    
		Scanner sc = new Scanner(System.in);
		
	   
		
		// Aqui vão estar os atributos e as referências pertinentes a essa classe.
		//-------------------------------------------------------------------------------
		int sel1, sel2; // Ints de seleção pra funcionar com os do...while
				
		
		// A partir daqui � o c�digo do menu.
		//-------------------------------------------------------------------------------
		do {
			printarMenuPrincipal();
					    
		   			
			sel1 = sc.nextInt();
			switch(sel1){
		
        		case 1:
        			int selecao;			
        			
        			printarGerenciarLocatarios();
        			do{
        				selecao = sc.nextInt();
        				
        			}while(selecao < 1 || selecao > 4);
        			
        			if(selecao == 1) {
        				cadastrarLocatario(locatario);
        			}
        			
        		           			
        			break;
        	
        		case 2:
        			
        			do{
        				printarGerenciarFrotas();
        				sel2 = sc.nextInt();
        		
        				switch(sel2) {
        					case 1:
        						printarCadastrarVeiculos();
        						cadastrarVeiculo(veiculo);
        						break;
        		
        					 case 2:
        					 	printarPesquisarVeiculos();
        					 	printarSaindoDoPrograma();
        					 	break;
       					
        					 case 3:                          	
        						printarSaindoDoPrograma();    	
        					 	break;                      
        				                               	
        					 case 4:                        
        					 	printarSaindoDoPrograma();    
        					 	break;                        
                    
        					 default:
        					 	printarCasoDefault();
        					 	break;
        					}
        				}while(sel2 > 4 || sel2 < 1);	
        			break;
        	
        		case 3:
        			printarGerenciarReservas();
        			printarSaindoDoPrograma();
        			break;
        	
        		case 4:
        			printarGerenciarLocadora();
        			printarSaindoDoPrograma();
        		
        			break;
        			
        		case 5:
        			printarSaindoDoPrograma();
        			
        			break;
        	
        		default:
        			printarCasoDefault();
        		break;
			 }   
		}while(sel1 != 5);
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------------
	//Funções de printar.
	
	public static void printarMenuPrincipal() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Principal\n");
        
        System.out.println(" 1) Gerenciar Locatários");
        System.out.println(" 2) Gerenciar Frota");
        System.out.println(" 3) Gerenciar Reservas");
        System.out.println(" 4) Gerenciar Locadora");
        System.out.println(" 5) Sair do Programa");
	}	
	
	public static void printarGerenciarLocatarios() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Locatários\n");
        
        System.out.println(" 1) Cadastrar Locatários");
        System.out.println(" 2) Buscar locatário");
        System.out.println(" 3) Pesquisar Locatário");
        System.out.println(" 4) Excluir locatário");
	}	
	
	public static void printarGerenciarFrotas() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Frotas\n");
        
        System.out.println(" 1) Cadastrar veículo");
        System.out.println(" 2) Buscar veículo");
        System.out.println(" 3) Atualizar dados de um veículo");
        System.out.println(" 4) Remover veículo da frota");
	}	
	
	public static void printarGerenciarReservas() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Reservas\n");
        
        System.out.println(" 1) Realizar reserva");
        System.out.println(" 2) Emitir relatário(s) de reserva(s)");
        System.out.println(" 3) Emitir relatário consolidado de reserva(s)");
	}	
	
	public static void printarGerenciarLocadora() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Locadora\n");
        
        System.out.println(" 1) Cadastrar Locadora");
        System.out.println(" 2) Ver dados da locadora");
	}

	public static void printarCadastrarVeiculos() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Cadastro de Veículos\n");
        
        System.out.println(" 1) Cadastrar veículo de passeio");
        System.out.println(" 2) Cadastrar veículo utilitário");
        System.out.println(" 3) Cadastrar motocicleta");
	}
	
	public static void printarPesquisarVeiculos() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Pesquisa de Veículos\n");
        
        System.out.println(" 1) Pesquisar veículo pelo RENAVAM");
        System.out.println(" 2) Pesquisar veículo por marca ou modelo");
	}
	
	public static void printarCasoDefault() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Por favor, insira uma opção válida.");   
	}
	
	public static void printarSaindoDoPrograma() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Saindo do programa...");   
	}
	
	
	public static void cadastrarLocatario(ArrayList<Locatario> locatario) {
				
		Scanner sc = new Scanner(System.in);
		
		String nomeCompleto, email, nomeSocial, cpf, estadoCivil, cnpj;
		int telefone;
		
		int FouJ;
		do {
			System.out.println("                      CADASTRO DE LOCATÁRIOS");
			System.out.println("-----------------------------------------------------------------------"); 
			System.out.println(" Por favor, insira se o locatário é uma pessoa física pu jurídica.\n");
			System.out.println(" 1 - Física");
			System.out.println(" 2 - Jurídica");
		
			FouJ = sc.nextInt();
		}while(FouJ < 1 || FouJ > 2);
		
		
		if(FouJ == 1){ // Pessoa Física
				
			// Antes de atribuir as informações, vamos primeiro pegar todos os dados necessários para a classe.
			System.out.println("---------------------------------------\n");
			System.out.println(" Insira o nome completo da pessoa fisica.\n");
			nomeCompleto = sc.next();
			
			System.out.println("---------------------------------------\n");
			System.out.println(" Insira o estado civil da pessoa fisica.\n");
			estadoCivil = sc.next();
			
			System.out.println("---------------------------------------\n");
			System.out.println(" Insira o email da pessoa fisica.\n");
			email = sc.next();
			
			System.out.println("---------------------------------------\n");
			System.out.println(" Insira o cpf da pessoa fisica.\n");
			cpf = sc.next();

			System.out.println("---------------------------------------\n");
			System.out.println(" Insira o telefone da pessoa fisica.\n");
			telefone = sc.nextInt();
			
		    nomeSocial = null; //Nulls necessários pois locatários podem ser ambas pessoas físicas e jurídicas, todas as infos precisam ser passadas.
		    cnpj = null;
		    
			// Agora, vamos instanciar uma referência "newPessoaFisica" que contenha todos os dados informados.
			// Logo depois, adicionamos "newPessoaFisica" na Lista de Array chamada "pessoaFisica".
			Locatario newLocatario = new Locatario(nomeCompleto, nomeSocial, email, cpf, cnpj, telefone, estadoCivil);
			locatario.add(newLocatario);
			
			// Por fim, criamos uma classe "listaPessoa" que imprima os atributos por meio dos métodos/funções "get".
			for(Locatario listaLocatario: locatario) {
				System.out.println("---------------------------------------\n");

				System.out.print("NOME COMPLETO:\n");
				listaLocatario.getNomeCompleto();
				System.out.print("NOME SOCIAL:\n");
				listaLocatario.getNomeSocial();
				System.out.print("EMAIL:\n");
				listaLocatario.getEmail();
				System.out.print("CPF:\n");
				listaLocatario.getCpf();
				System.out.print("CNPJ:\n");
				listaLocatario.getCnpj();
				System.out.println("---------------------------------------\n");
				
			}

			}else{  // Pessoa Jurídica
				
				System.out.println("---------------------------------------\n");
				System.out.println(" Insira o nome social da pessoa jurídica.\n");
				nomeSocial = sc.next();
				
				
				System.out.println("---------------------------------------\n");
				System.out.println(" Insira o email da pessoa jurídica.\n");
				email = sc.next();
				
				CNPJ newCnpj = new CNPJ();
				cnpj = newCnpj.getCnpj();

				System.out.println("---------------------------------------\n");
				System.out.println(" Insira o telefone da pessoa jurídica.\n");
				telefone = sc.nextInt();
				
			    nomeCompleto = null;
				estadoCivil = null;
				cpf = null;
				
				Locatario newPessoaFisica = new Locatario(nomeCompleto, nomeSocial, email, cpf, cnpj, telefone, estadoCivil);
				locatario.add(newPessoaFisica);
				
				for(Locatario listaLocatario: locatario) {
					System.out.println("---------------------------------------\n");

					System.out.print("NOME COMPLETO:\n");
					listaLocatario.getNomeCompleto();
					System.out.print("NOME SOCIAL:\n");
					listaLocatario.getNomeSocial();
					System.out.print("EMAIL:\n");
					listaLocatario.getEmail();
					System.out.print("CPF:\n");
					listaLocatario.getCpf();
					System.out.print("CNPJ:\n");
					listaLocatario.getCnpj();

					
				}
				
			}
			
		} 
	


	
	public static void cadastrarVeiculo(ArrayList<Veiculo> veiculo) {

		Scanner sc = new Scanner(System.in);
		

		String marca, modelo, renavam;

		int tipoDeCarro;

		do {
			System.out.println("                      CADASTRO DE VEÍCULOS");
			System.out.println("-----------------------------------------------------------------------"); 
			System.out.println(" Que tipo de veículo deseja registrar?\n");
			System.out.println(" 1 - Veículo de Passeio");
			System.out.println(" 2 - Veículo Utilitário");
			System.out.println(" 3 - Motocicleta");
		
			 tipoDeCarro = sc.nextInt();
					
			
		}while(tipoDeCarro < 1 ||  tipoDeCarro > 3);

		if(tipoDeCarro == 1){

			System.out.println("---------------------------------------\n");
			System.out.println(" Insira a marca.\n");
			marca = sc.next();
			
			System.out.println("---------------------------------------\n");
			System.out.println(" Insira o modelo.\n");
			modelo = sc.next();
			
			System.out.println("---------------------------------------\n");
			System.out.println(" Insira o RENAVAM.\n");
			renavam = sc.next();

			Veiculo newVeiculo = new Veiculo(marca, modelo, renavam);
			veiculo.add(newVeiculo);
			
			// Por fim, criamos uma classe "listaPessoa" que imprima os atributos por meio dos métodos/funções "get".
			for(Veiculo listaVeiculo:veiculo) {
				System.out.println("---------------------------------------\n");
			
				System.out.print("MARCA:\n");
				listaVeiculo.getMarca();
				System.out.print("MODELO:\n");
				listaVeiculo.getModelo();
				System.out.print("RENAVAM:\n");
				listaVeiculo.getRenavam();
				
			}
			
			}
		}


				
	
	public void editarLocatarios() {
		
	}
	
	public void pesquisarVeiculos() {
		
	}

	public void editarVeiculos() {
	
	}
		
	public void emitirRelatorio() {
		
	}
	
	public void emitirRelatorioConsolidado() {
		
	}
  }
