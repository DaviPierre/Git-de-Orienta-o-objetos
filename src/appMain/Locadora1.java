package app;

import java.util.Scanner;

import gerenciarLocatarios.Locatario;


import java.util.ArrayList; // Esse import vai servir para registrar diversos usuários, veículos e reservas


public class Locadora1 {
	
	
// O menu principal contido na função main - aqui que vai acontecer tudo	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Aqui vão estar os atributos e as referências pertinentes a essa classe.
		//-------------------------------------------------------------------------------
		int sel1, sel2; // Ints de seleção pra funcionar com os do...while
				
		
		// A partir daqui é o código do menu.
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
        				cadastrarLocatario();
        			}
        			
        			printarSaindoDoPrograma();
        		           			
        			break;
        	
        		case 2:
        			
        			do{
        				printarGerenciarFrotas();
        				sel2 = sc.nextInt();
        		
        				switch(sel2) {
        					case 1:
        						printarCadastrarVeiculos();
        						printarSaindoDoPrograma();
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
		}while(sel1 > 5 || sel1 < 1);
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------------
	//A partir daqui, estão as funções de printar a opção correta nos menus.
	
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
        System.out.println(" 2) Emitir relatório(s) de reserva(s)");
        System.out.println(" 3) Emitir relatório consolidado de reserva(s)");
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
	
	public static void cadastrarLocatario() {
				
		Scanner sc = new Scanner(System.in);
		CNPJ cnpj;
		
		int FouJ;
		
		do {
			System.out.println("                      CADASTRO DE LOCATÁRIOS");
			System.out.println("-----------------------------------------------------------------------"); 
			ArrayList<Locatario> locatario = new ArrayList<Locatario>();
		    
			
			
			
			
			
			System.out.println(" Por favor, insira se o locatário é uma pessoa física pu jurídica.\n");
			System.out.println(" 1 - Física");
			System.out.println(" 2 - Jurídica");
		
			FouJ = sc.nextInt();
		}while(FouJ < 1 || FouJ > 2);
		
		if(FouJ == 1){
			
			
			
		}else{
			cnpj = new CNPJ(); // Aqui o cnpj é instanciado e chamado, ou seja, a função getCnpj ocorre.
			System.out.println(cnpj.getCnpj());

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
