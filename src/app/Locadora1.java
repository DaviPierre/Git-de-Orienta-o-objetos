package app;

import java.util.Scanner;

import gerenciarLocatarios.Locatario;
import gerenciarLocatarios.PessoaFisica;

import java.util.ArrayList; // Esse import vai servir para registrar diversos usu�rios, ve�culos e reservas


public class Locadora1 {
	
	
// O menu principal contido na fun��o main - aqui que vai acontecer tudo	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Aqui v�o estar os atributos e as refer�ncias pertinentes a essa classe.
		//-------------------------------------------------------------------------------
		int sel1, sel2; // Ints de sele��o pra funcionar com os do...while
				
		
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
	//A partir daqui, est�o as fun��es de printar a op��o correta nos menus.
	
	public static void printarMenuPrincipal() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Principal\n");
        
        System.out.println(" 1) Gerenciar Locat�rios");
        System.out.println(" 2) Gerenciar Frota");
        System.out.println(" 3) Gerenciar Reservas");
        System.out.println(" 4) Gerenciar Locadora");
        System.out.println(" 5) Sair do Programa");
	}	
	
	public static void printarGerenciarLocatarios() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Locat�rios\n");
        
        System.out.println(" 1) Cadastrar Locat�rios");
        System.out.println(" 2) Buscar locat�rio");
        System.out.println(" 3) Pesquisar Locat�rio");
        System.out.println(" 4) Excluir locat�rio");
	}	
	
	public static void printarGerenciarFrotas() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Frotas\n");
        
        System.out.println(" 1) Cadastrar ve�culo");
        System.out.println(" 2) Buscar ve�culo");
        System.out.println(" 3) Atualizar dados de um ve�culo");
        System.out.println(" 4) Remover ve�culo da frota");
	}	
	
	public static void printarGerenciarReservas() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Reservas\n");
        
        System.out.println(" 1) Realizar reserva");
        System.out.println(" 2) Emitir relat�rio(s) de reserva(s)");
        System.out.println(" 3) Emitir relat�rio consolidado de reserva(s)");
	}	
	
	public static void printarGerenciarLocadora() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Locadora\n");
        
        System.out.println(" 1) Cadastrar Locadora");
        System.out.println(" 2) Ver dados da locadora");
	}

	public static void printarCadastrarVeiculos() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Cadastro de Ve�culos\n");
        
        System.out.println(" 1) Cadastrar ve�culo de passeio");
        System.out.println(" 2) Cadastrar ve�culo utilit�rio");
        System.out.println(" 3) Cadastrar motocicleta");
	}
	
	public static void printarPesquisarVeiculos() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Pesquisa de Ve�culos\n");
        
        System.out.println(" 1) Pesquisar ve�culo pelo RENAVAM");
        System.out.println(" 2) Pesquisar ve�culo por marca ou modelo");
	}
	
	public static void printarCasoDefault() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Por favor, insira uma op��o v�lida.");   
	}
	
	public static void printarSaindoDoPrograma() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Saindo do programa...");   
	}
	
	public static void cadastrarLocatario() {
				
		Scanner sc = new Scanner(System.in);
		ArrayList<PessoaFisica> pessoaFisica = new ArrayList<PessoaFisica>();
		
		String nomeCompleto, email;
		int cpf, telefone;
		
		int FouJ;
		do {
			System.out.println("                      CADASTRO DE LOCAT�RIOS");
			System.out.println("-----------------------------------------------------------------------"); 
			System.out.println(" Por favor, insira se o locat�rio � uma pessoa f�sica pu jur�dica.\n");
			System.out.println(" 1 - F�sica");
			System.out.println(" 2 - Jur�dica");
		
			FouJ = sc.nextInt();
		}while(FouJ < 1 || FouJ > 2);
		
		
		if(FouJ == 1){
			int pao=0; //remover
			while(pao<3) { //remover
				
			
			System.out.println("---------------------------------------\n");
			System.out.println(" Insira o Nome Completo da pessoa fisica.\n");
			nomeCompleto = sc.next();
			
			System.out.println("---------------------------------------\n");
			System.out.println(" Insira o email da pessoa fisica.\n");
			email = sc.next();
			
			System.out.println("---------------------------------------\n");
			System.out.println(" Insira o cpf da pessoa fisica.\n");
			cpf = sc.nextInt();

			System.out.println("---------------------------------------\n");
			System.out.println(" Insira o telefone da pessoa fisica.\n");
			telefone = sc.nextInt();
			
			PessoaFisica newPessoaFisica = new PessoaFisica(nomeCompleto, email, cpf, telefone);
			pessoaFisica.add(newPessoaFisica);
			for(PessoaFisica listaPessoa:pessoaFisica) {
				listaPessoa.getNomeCompleto();
				listaPessoa.getEmail();
			}
			
			pao+=1;
			} // remover
			
		}
		else{


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