package app;

import java.util.Scanner;


import gerenciarLocatarios.Locatario;
import gerenciarLocatarios.PessoaFisica;
import gerenciarLocatarios.PessoaJuridica;
import gerenciarReservas.Reserva;
import gerenciarFrotas.Motocicleta;
import gerenciarFrotas.V_carga;
import gerenciarFrotas.V_passageiro;
import gerenciarFrotas.V_passeio;
import gerenciarFrotas.Veiculo;

import java.util.ArrayList; // Esse import vai servir para registrar diversos usuários, veículos e reservas

public class Locadora1 {
	
	// Esses ArrayLists são as listas de array que vão guardar os dados e número de objetos cadastrados, usados depois para listar os elementos.
	
	
// O menu principal contido na função main - aqui que vai acontecer tudo	
	public static void main(String[] args) {
		
	  ArrayList<PessoaFisica> pessoaFisica = new ArrayList<PessoaFisica>(); 
		ArrayList<PessoaJuridica> pessoaJuridica = new ArrayList<PessoaJuridica>(); 
	    
	  ArrayList<Veiculo> veiculo = new ArrayList<Veiculo>();
		ArrayList<Reserva> reserva = new ArrayList<Reserva>();
	    
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
								int FouJ;
								do {
									System.out.println("                      CADASTRO DE LOCATÁRIOS");
									System.out.println("-----------------------------------------------------------------------"); 
									System.out.println(" Por favor, insira se o locatário é uma pessoa física ou jurídica.\n");
									System.out.println(" 1 - Física");
									System.out.println(" 2 - Jurídica");
									FouJ = sc.nextInt();
								}while(FouJ < 1 || FouJ > 2);

								if(FouJ == 1){ // Pessoa Física
									cadastroPessoaFisica(pessoaFisica);
								}
								else{
									cadastroPessoaJuridica(pessoaJuridica, pessoaFisica);
								}
        			}  			

							if(selecao == 2) {
								int selec;
								do {
									System.out.println("                      BUSCA DE LOCATÁRIOS");
									System.out.println("-----------------------------------------------------------------------"); 
									System.out.println(" 1 - Busca por Nome.\n");
									System.out.println(" 2 - Busca por Numero do documento(cpf/cnpj).\n");
									System.out.println(" 3 - Busca por email.\n");
									selec = sc.nextInt();
								}while(selec < 1 || selec > 3);
								if(selec==1){
									buscaLocatarioNome(pessoaJuridica, pessoaFisica, sc);
								}
								if(selec==2){
									buscaLocatarioCPF_CNPJ(pessoaJuridica, pessoaFisica, sc);
								}
								if(selec==3){
									buscaLocatarioEmail(pessoaJuridica, pessoaFisica, sc);
								}
							}

							if(selecao == 3) {
								// System.out.println("numero 3");
								alterarDadosLocatario(pessoaJuridica, pessoaFisica, sc);
							}

							if(selecao == 4) {
								// System.out.println("numero 4");
								deletarLocatarioNome(pessoaJuridica, pessoaFisica, sc);


							}
        			break;
        	
        		case 2:
        			
        			do{
        				printarGerenciarFrotas();
        				sel2 = sc.nextInt();
        		
        				switch(sel2) {
        					case 1:
        						// printarCadastrarVeiculos();
        						cadastrarVeiculo(veiculo);
        						break;
        		
        					 case 2:
        						 buscaVeiculo(veiculo, sc);
        					 	break;
       					
        					 case 3:                          	
        						 alterarDadosVeiculo(veiculo, sc);    	
        					 	break;                      
        				                               	
        					 case 4:                        
        						 deletarVeiculo(veiculo, sc);    
        					 	break;                        
                    
        					 default:
        					 	printarCasoDefault();
        					 	break;
        					}
        				}while(sel2 > 4 || sel2 < 1);	
        			break;
        	
        		case 3:
        			printarGerenciarReservas();
							Veiculo veiculoReserva = new Veiculo();
							Locatario locatarioReserva = new Locatario();
							int excecao_achar = 1;
							boolean findVeiculo = false;
							boolean findLocatario = false;
							do{
								sel2 = sc.nextInt();

								switch(sel2){
									case 1:

									System.out.println("LISTA DE VEICULOS CADASTRADOS");
										for (int i = 0; i < veiculo.size(); i++) { // Busca veiculo 
											System.out.println(i+1 + ") Veiculo ---------------------");
											System.out.println("Marca: " + veiculo.get(i).getMarca());
											System.out.println("Modelo: " + veiculo.get(i).getModelo());
											System.out.println("Ano fabricação: " + veiculo.get(i).getAnoFabricacao());
											System.out.println("----------------------------------------\n");
										}
										System.out.println("Selecione o numero do veiculo desejado: \n");
										int selecVeiculo = sc.nextInt();
										
										veiculoReserva = veiculo.get(selecVeiculo-1);
										findVeiculo = true;

									System.out.println("Escreva o nome do locatario cadastrado no sistema para reserva: \n");
									String nomeLocatario = sc.next();

									for (int i = 0; i < pessoaFisica.size(); i++) { // Busca nome pessoa fisica
										if(pessoaFisica.get(i).getNomeCompleto().contains(nomeLocatario)){
											locatarioReserva = pessoaFisica.get(i);
											findLocatario=true;
										}
									}
									for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome pessoa juridica
										if(pessoaJuridica.get(i).getNomeSocial().contains(nomeLocatario)){
											locatarioReserva = pessoaJuridica.get(i);
											findLocatario=true;
										}
									}
									for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome de funcionarios
										for (int j = 0; j < pessoaJuridica.get(i).listaFuncionarios.size(); j++) {
											if(pessoaJuridica.get(i).getListaFuncionarios(j).contains(nomeLocatario)){
												locatarioReserva = pessoaJuridica.get(i).listaFuncionarios.get(j);
												findLocatario=true;
											}
										}
									}
									
									ObjetoNaoEncontradoException verificandoBusca = new ObjetoNaoEncontradoException(findLocatario);
									
									try{				
										excecao_achar = verificandoBusca.verificandoObjetoNaoEncontrado(findLocatario);
									}catch(ObjetoNaoEncontradoException t){
										if(findLocatario == false){
											findLocatario = true;
										}
										System.out.println("Exceção detectada: Nenhum item com essa descrição foi encontrado.\n");		
									}finally{
										 
									}	

									if(excecao_achar == 0) {
										System.out.println("Qunatos dias deseja locar o veiculo? \n");
										int qntDiasLocacao = sc.nextInt();

										// System.out.println(locatarioReserva.getClass().getSimpleName()+" EMAILLLLLLLLLLLLLLL\n");
										System.out.println("Digite a data de inicio da reserva: \n");
										String horarioInicioReserva = getData(sc);
										System.out.println("Digite a data de fim da reserva: \n");
										String horarioFimReserva = getData(sc);

										if(findVeiculo == true && findLocatario == true){
											Reserva newReserva = new Reserva(veiculoReserva, locatarioReserva, qntDiasLocacao, horarioInicioReserva, horarioFimReserva, reserva.size()+1);
											reserva.add(newReserva);
										}

										// for (int i = 0; i < reserva.size(); i++) {
										// 	System.out.println(reserva.get(i).getNumeroDiarias());
										// 	reserva.get(i).emitirRelatorioConsolidado();
										// }
										// Reserva newReserva = new Reserva(, , 123, 234, 345);
									}
									break;

									case 2:
									System.out.println("RELATORIO INDIVIDUAL");
									for (int i = 0; i < reserva.size(); i++) {
										System.out.println(reserva.get(i).getNumeroDiarias());
										reserva.get(i).emitirRelatorioSeparado();
									}
									break;
									
									case 3:
									System.out.println("RELATORIO CONSOLIDADO");
										for (int i = 0; i < reserva.size(); i++) {
											System.out.println(reserva.get(i).getNumeroDiarias());
											reserva.get(i).emitirRelatorioConsolidado();
										}
									break;

									default:
									printarCasoDefault();
									break;
								}

							}while(sel2 < 1 || sel2 > 3);
        			break;
        	
        		case 4:
							printarSaindoDoPrograma();
        		
        			break;
        	
        		default:
        			printarCasoDefault();
        		break;
			 }   
		}while(sel1 != 4);
	}
	

	public static String getData(Scanner sc) {
		System.out.println("Digite a data que deseja: ");
		System.out.print("Dia: ");
		int dia = sc.nextInt();
		System.out.print("Mes: ");
		int mes = sc.nextInt();
		System.out.print("Ano: ");
		int ano = sc.nextInt();
		String data = dia + "/" + mes + "/" + ano;

		return data;
	}

	//----------------------------------------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------------------------------------
	//Funções de printar.

	public static void printarMenuPrincipal() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println("      MENU PRINCIPAL\n");
        
        System.out.println(" 1) Gerenciar Locatários");
        System.out.println(" 2) Gerenciar Frota");
        System.out.println(" 3) Gerenciar Reservas");
        System.out.println(" 4) Sair do Programa");
	}	
	
	public static void printarGerenciarLocatarios() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println("      MENU LOCATÁRIOS\n");
        
        System.out.println(" 1) Cadastrar Locatários");
        System.out.println(" 2) Buscar locatário");
        System.out.println(" 3) Editar Locatário");
        System.out.println(" 4) Excluir locatário");
	}	
	
	public static void printarGerenciarFrotas() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println("      MENU FROTAS");
        
        System.out.println(" 1) Cadastrar veículo");
        System.out.println(" 2) Buscar veículo");
        System.out.println(" 3) Atualizar dados de um veículo");
        System.out.println(" 4) Remover veículo da frota");
	}	
	
	public static void printarGerenciarReservas() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println("      MENU RESERVAS\n");
        
        System.out.println(" 1) Realizar reserva\n");
        System.out.println(" 2) Emitir relatário(s) de reserva(s)\n");
	}	
	
	public static void printarGerenciarLocadora() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println("      MENU LOCADORA\n");
        
        System.out.println(" 1) Cadastrar Locadora\n");
        System.out.println(" 2) Ver dados da locadora\n");
	}

	public static void printarCadastrarVeiculos() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println("      MENU CADASTRO DE VEÍCULOS\n");
        
        System.out.println(" 1) Cadastrar veículo de passeio\n");
        System.out.println(" 2) Cadastrar veículo utilitário\n");
        System.out.println(" 3) Cadastrar motocicleta\n");
	}
	
	
	public static void printarCasoDefault() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Por favor, insira uma opção válida.");   
	}
	
	public static void printarSaindoDoPrograma() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(" Saindo do programa...");   
	}

	//----------------------------------------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------------------------------------
	// Funções de Cadastro
	public static void cadastroPessoaFisica(ArrayList<PessoaFisica> pessoaFisica) {
		int excecao_nome = 1, excecao_email = 1, excecao_cpf = 1, excecao_telefone = 1;
		
		Scanner sc = new Scanner(System.in);

		
		PessoaFisica newPessoaFisica = new PessoaFisica(lerNome(sc), lerEmail(sc), lerCpf(sc), lerTelefone(sc));
		
		CampoEmBrancoException verificarException = new CampoEmBrancoException(newPessoaFisica.getNomeCompleto());
		
		try {
			excecao_nome = verificarException.verificandoCampoEmBranco(newPessoaFisica.getNomeCompleto());
			excecao_email = verificarException.verificandoCampoEmBranco(newPessoaFisica.getEmail());
			excecao_cpf = verificarException.verificandoCampoEmBranco(newPessoaFisica.getCpf());
			excecao_telefone = verificarException.verificandoCampoEmBranco(newPessoaFisica.getTelefone());
		}catch (CampoEmBrancoException c) {
			System.out.println(" Exceção detectada: Os dados inseridos têm de ser maiores do que um carácter.\n");		
			System.out.println(" O cadastro não será considerado.\n");	
		}
		
		if(excecao_nome == 0 && excecao_cpf == 0 && excecao_email == 0 && excecao_telefone == 0){
			pessoaFisica.add(newPessoaFisica);
		}

		// System.out.println(" Lista de pessoas físicas registradas: \n");
		// for(PessoaFisica listaPessoaFisica: pessoaFisica) {
		// 	listaPessoaFisica.listarPessoaFisica();
		// }
	}
	
	public static void cadastroPessoaJuridica(ArrayList<PessoaJuridica> pessoaJuridica, ArrayList<PessoaFisica> pessoaFisica) {
		int excecao_nome = 1, excecao_email = 1, excecao_cnpj = 1, excecao_cpf = 1, excecao_nome_c = 1, excecao_email_f = 1, excecao_telefone = 1, excecao_telefone_f = 1;
		
		Scanner sc = new Scanner(System.in);

		String email, nomeSocial, cnpj;
		String telefone;
		int numeroFuncionarios;

		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o nome social da empresa.\n");
		nomeSocial = sc.next();
		
		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o email da empresa.\n");
		email = sc.next();
		
		CNPJ newCnpj = new CNPJ();
		cnpj = newCnpj.getCnpj();

		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o telefone da empresa.\n");
		telefone = sc.next();

		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o número de funcionários da empresa.\n");
		numeroFuncionarios = sc.nextInt();
		
		PessoaJuridica newPessoaJuridica = new PessoaJuridica(nomeSocial, email, cnpj, telefone, numeroFuncionarios);
		
		CampoEmBrancoException verificarException = new CampoEmBrancoException(newPessoaJuridica.getNomeSocial());
		
		try {
			excecao_nome = verificarException.verificandoCampoEmBranco(newPessoaJuridica.getNomeSocial());
			excecao_email = verificarException.verificandoCampoEmBranco(newPessoaJuridica.getEmail());
			excecao_cnpj = verificarException.verificandoCampoEmBranco(newPessoaJuridica.getCnpj());
			excecao_telefone = verificarException.verificandoCampoEmBranco(newPessoaJuridica.getTelefone());
		}catch (CampoEmBrancoException c) {
			System.out.println(" Exceção detectada: Os dados inseridos têm de ser maiores do que um carácter.\n");		
			System.out.println(" O cadastro não será considerado.\n");	
		}
		
		if(excecao_nome == 0 && excecao_cnpj == 0 && excecao_email == 0 && excecao_telefone == 0){
			pessoaJuridica.add(newPessoaJuridica);
		}
				
		// System.out.println(" Lista de pessoas jurídicas registradas: \n");
		// for(PessoaJuridica listaPessoaJuridica: pessoaJuridica) {
		// 	listaPessoaJuridica.listarPessoaJuridica();
		// }

		boolean novoCadastro = true;
		
		if(excecao_nome == 0 && excecao_cnpj == 0 && excecao_email == 0 && excecao_telefone == 0){
		do{
			System.out.println("---------------------------------------\n");
			System.out.println(" Deseja adicionar um novo cadastro de funcionario?\n");
			System.out.println(" 1 - Sim  | 2 - Nao \n");
			int opcao = sc.nextInt();

			if(opcao == 1) {
				PessoaFisica novoFuncionario = new PessoaFisica(lerNome(sc), lerEmail(sc), lerCpf(sc), lerTelefone(sc));
				
				
				try {
					excecao_nome_c = verificarException.verificandoCampoEmBranco(novoFuncionario.getNomeCompleto());
					excecao_email_f = verificarException.verificandoCampoEmBranco(novoFuncionario.getEmail());
					excecao_cpf = verificarException.verificandoCampoEmBranco(novoFuncionario.getCpf());
					excecao_telefone_f = verificarException.verificandoCampoEmBranco(novoFuncionario.getTelefone());
				}catch (CampoEmBrancoException c) {
					System.out.println(" Exceção detectada: Os dados inseridos têm de ser maiores do que um carácter.\n");		
					System.out.println(" O cadastro não será considerado.\n");	
				}
				
				if(excecao_nome_c == 0 && excecao_cpf == 0 && excecao_email_f == 0){
					newPessoaJuridica.insereFuncionario(novoFuncionario);
					novoCadastro = true;
				}
				
				
			}else{
				novoCadastro = false;
			}
		}while(novoCadastro == true);

		
		
		// newPessoaJuridica.listaFuncionarios();
		}
	}
	
	public static void cadastrarVeiculo(ArrayList<Veiculo> veiculo) {

		Scanner sc = new Scanner(System.in);
		

		String marca, modelo, renavam;
		int tipoDeCarro, anoFabricacao, anoModelo, capacidadeTanque;
		int excecao_marca = 1, excecao_modelo = 1, excecao_renavam = 1;

		do {
			System.out.println("                      CADASTRO DE VEÍCULOS");
			System.out.println("-----------------------------------------------------------------------"); 
			System.out.println(" Que tipo de veículo deseja registrar?\n");
			System.out.println(" 1 - Veículo de Passeio");
			System.out.println(" 2 - Veículo Utilitário");
			System.out.println(" 3 - Motocicleta");
		
			 tipoDeCarro = sc.nextInt();
					
			
		}while(tipoDeCarro < 1 ||  tipoDeCarro > 3);

		System.out.println("---------------------------------------\n");
		System.out.println(" Insira a marca.\n");
		marca = sc.next();
		
		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o modelo.\n");
		modelo = sc.next();

		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o ano de fabricação.\n");
		anoFabricacao = sc.nextInt();

		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o ano do modelo.\n");
		anoModelo = sc.nextInt();

		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o RENAVAM.\n");
		renavam = sc.next();
		
		System.out.println("---------------------------------------\n");
		System.out.println(" Insira a capacidade do tanque(L).\n");
		capacidadeTanque = sc.nextInt();

		if(tipoDeCarro == 1){ // Veiculo Passeio

		boolean arCondicionado, direcaoHidraulica, cambioAutomatico;

		System.out.println("---------------------------------------\n");
		System.out.println("Possui ar condicionado? (S/N)\n");
		char lerString = sc.next().charAt(0);
		if(lerString == 'S' || lerString == 's'){
			arCondicionado = true;
		} else {
			arCondicionado = false;
		}

		System.out.println("---------------------------------------\n");
		System.out.println("Possui direção hidráulica? (S/N)\n");
		lerString = sc.next().charAt(0);
		if(lerString == 'S' || lerString == 's'){
			direcaoHidraulica = true;
		} else {
			direcaoHidraulica = false;
		}

		System.out.println("---------------------------------------\n");
		System.out.println("Possui câmbio automático? (S/N)\n");
		lerString = sc.next().charAt(0);
		if(lerString == 'S' || lerString == 's'){
			cambioAutomatico = true;
		} else {
			cambioAutomatico = false;
		}

			float[] valoresDiarias = setValoresDiarias(sc);
			Veiculo newV_passeio = new V_passeio(marca, modelo, renavam, anoFabricacao, anoModelo, capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico, valoresDiarias);
			
			CampoEmBrancoException verificarException = new CampoEmBrancoException(newV_passeio.getMarca());
			
			try {
				excecao_marca = verificarException.verificandoCampoEmBranco(newV_passeio.getMarca());
				excecao_modelo = verificarException.verificandoCampoEmBranco(newV_passeio.getModelo());
				excecao_renavam = verificarException.verificandoCampoEmBranco(newV_passeio.getRenavam());
			}catch (CampoEmBrancoException c) {
				System.out.println(" Exceção detectada: Os dados inseridos têm de ser maiores do que um carácter.\n");		
				System.out.println(" O cadastro não será considerado.\n");	
			}
			
			if(excecao_marca == 0 && excecao_renavam == 0 && excecao_modelo == 0){
				veiculo.add(newV_passeio);
			}
			
							
		}

		if(tipoDeCarro == 2){ // Veiculo Utilitario
			int tipoDeUtilitario;
			int maxPeso, taraVeiculo, tamCargaLitros;
			int maxOcupantes;
			boolean arCondicionado, direcaoHidraulica, tv;

			enum categoriaCarga {
				Bau,
				Graneleiro,
				Basculante
			}

			do {
				System.out.println("                      CADASTRO DE VEÍCULOS");
				System.out.println("-----------------------------------------------------------------------"); 
				System.out.println(" Que tipo de veículo deseja registrar?\n");
				System.out.println(" 1 - Veículo de carga");
				System.out.println(" 2 - Veículo de passageiro");
			
				tipoDeUtilitario = sc.nextInt();
				
			}while(tipoDeUtilitario < 1 ||  tipoDeUtilitario > 2);

			if(tipoDeUtilitario == 1){ //Veiculo de carga
				System.out.println("Cadastrando veículo de carga...");
				float[] valoresDiarias = setValoresDiarias(sc);
				Veiculo newV_carga = new V_carga(marca, modelo, renavam, anoFabricacao, anoModelo, capacidadeTanque, valoresDiarias);
				
				CampoEmBrancoException verificarException = new CampoEmBrancoException(newV_carga.getMarca());
				
				try {
					excecao_marca = verificarException.verificandoCampoEmBranco(newV_carga.getMarca());
					excecao_modelo = verificarException.verificandoCampoEmBranco(newV_carga.getModelo());
					excecao_renavam = verificarException.verificandoCampoEmBranco(newV_carga.getRenavam());
				}catch (CampoEmBrancoException c) {
					System.out.println(" Exceção detectada: Os dados inseridos têm de ser maiores do que um carácter.\n");		
					System.out.println(" O cadastro não será considerado.\n");	
				}
				
				if(excecao_marca == 0 && excecao_renavam == 0 && excecao_modelo == 0){
					veiculo.add(newV_carga);
					System.out.println("Veículo registrado!\n");
				}
				

			}

			if(tipoDeUtilitario == 2){ //Veiculo de passageiro
				System.out.println("Cadastrando veículo de passageiro...\n");
				float[] valoresDiarias = setValoresDiarias(sc);
				Veiculo newV_passageiro = new V_passageiro(marca, modelo, renavam, anoFabricacao, anoModelo, capacidadeTanque,valoresDiarias);
				
				CampoEmBrancoException verificarException = new CampoEmBrancoException(newV_passageiro.getMarca());
				
				try {
					excecao_marca = verificarException.verificandoCampoEmBranco(newV_passageiro.getMarca());
					excecao_modelo = verificarException.verificandoCampoEmBranco(newV_passageiro.getModelo());
					excecao_renavam = verificarException.verificandoCampoEmBranco(newV_passageiro.getRenavam());
				}catch (CampoEmBrancoException c) {
					System.out.println(" Exceção detectada: Os dados inseridos têm de ser maiores do que um carácter.\n");		
					System.out.println(" O cadastro não será considerado.\n");	
				}
				
				if(excecao_marca == 0 && excecao_renavam == 0 && excecao_modelo == 0){
					veiculo.add(newV_passageiro);
					System.out.println("Veículo registrado!\n");
				}
		
			}

		}

		if(tipoDeCarro == 3){
			System.out.println("Cadastrando moto...\n");
			float[] valoresDiarias = setValoresDiarias(sc);
			Veiculo newV_moto = new Motocicleta(marca, modelo, renavam, anoFabricacao, anoModelo, capacidadeTanque,valoresDiarias);
			
			CampoEmBrancoException verificarException = new CampoEmBrancoException(newV_moto.getMarca());
			
			try {
				excecao_marca = verificarException.verificandoCampoEmBranco(newV_moto.getMarca());
				excecao_modelo = verificarException.verificandoCampoEmBranco(newV_moto.getModelo());
				excecao_renavam = verificarException.verificandoCampoEmBranco(newV_moto.getRenavam());
			}catch (CampoEmBrancoException c) {
				System.out.println(" Exceção detectada: Os dados inseridos têm de ser maiores do que um carácter.\n");		
				System.out.println(" O cadastro não será considerado.\n");	
			}
			
			if(excecao_marca == 0 && excecao_renavam == 0 && excecao_modelo == 0){
				veiculo.add(newV_moto);
				System.out.println("Veículo registrado!\n");
			}
			
		}

		// for(Veiculo listaPasseio:veiculo) { // listagem veiculos
		// 	if(listaPasseio.getClass().getSimpleName().contains("V_passeio")){
		// 		System.out.print("MARCA:\n");
		// 		System.out.println(((V_passeio) listaPasseio).getMarca());
		// 		System.out.print("MODELO:\n");
		// 		System.out.println(((V_passeio) listaPasseio).getModelo());
		// 		System.out.print("RENAVAM:\n");
		// 		System.out.println(((V_passeio) listaPasseio).getRenavam());
		// 		System.out.print("\n");
				
		// 	 if(listaPasseio.getClass().getSimpleName().contains("V_carga")){
		// 			System.out.print("Veículos de Carga:\n");
		// 			System.out.print("MARCA:\n");
		// 			System.out.println(((V_carga) listaPasseio).getMarca());
		// 			System.out.print("MODELO:\n");
		// 			System.out.println(((V_carga) listaPasseio).getModelo());
		// 			System.out.print("RENAVAM:\n");
		// 			System.out.println(((V_carga) listaPasseio).getRenavam());
		// 			System.out.print("\n");						
		// 			}
		// 	 if(listaPasseio.getClass().getSimpleName().contains("V_passageiro")){
		// 			System.out.print("Veículos de Passageiro:\n");
		// 			System.out.print("MARCA:\n");
		// 			System.out.println(((V_passageiro) listaPasseio).getMarca());
		// 			System.out.print("MODELO:\n");
		// 			System.out.println(((V_passageiro) listaPasseio).getModelo());
		// 			System.out.print("RENAVAM:\n");
		// 			System.out.println(((V_passageiro) listaPasseio).getRenavam());
		// 			System.out.print("\n");	
		// 	}
		// 	 if(listaPasseio.getClass().getSimpleName().contains("Motocicleta")){
		// 			System.out.print("Motocicletas:\n");
		// 			System.out.print("MARCA:\n");
		// 			System.out.println(((Motocicleta) listaPasseio).getMarca());
		// 			System.out.print("MODELO:\n");
		// 			System.out.println(((Motocicleta) listaPasseio).getModelo());
		// 			System.out.print("RENAVAM:\n");
		// 			System.out.println(((Motocicleta) listaPasseio).getRenavam());
		// 			System.out.print("\n");
		// 	 }
			 
		// 	}
		// 	}
	}
	
	//----------------------------------------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------------------------------------
	// Funções de Busca

	public static float[] setValoresDiarias(Scanner sc) {
		float[] valoresDiarias = new float[4];
		System.out.println("Digite o valor da diária normal para o veículo:");
		valoresDiarias[0] = sc.nextFloat();
		System.out.println("Digite o valor da diária reduzida para o veículo:");
		valoresDiarias[1] = sc.nextFloat();
		System.out.println("Digite o valor da diária empresarial para o veículo:");
		valoresDiarias[2] = sc.nextFloat();
		System.out.println("Digite o valor da mensal para o veículo:");
		valoresDiarias[3] = sc.nextFloat();		
		return valoresDiarias;
	}


	public static int buscaLocatarioNome(ArrayList<PessoaJuridica> pessoaJuridica, ArrayList<PessoaFisica> pessoaFisica, Scanner sc){
		boolean encontrou = false;
		String buscaNome;
		int excecao_achar = 1;
		System.out.println("Insira o nome do locatário que deseja buscar: ");
		buscaNome = sc.next();

		for (int i = 0; i < pessoaFisica.size(); i++) { // Busca nome pessoa fisica
			if(pessoaFisica.get(i).getNomeCompleto().contains(buscaNome)){
				System.out.println("Nome: " +pessoaFisica.get(i).getNomeCompleto());
				System.out.println("Email: "+pessoaFisica.get(i).getEmail());
				System.out.println("CPF: " +pessoaFisica.get(i).getCpf());
				encontrou=true;
				return i;
			}
		}
		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome pessoa juridica
			if(pessoaJuridica.get(i).getNomeSocial().contains(buscaNome)){
				System.out.println("Nome: " +pessoaJuridica.get(i).getNomeSocial());
				System.out.println("Email: "+pessoaJuridica.get(i).getEmail());
				System.out.println("CNPJ: " +pessoaJuridica.get(i).getCnpj());
				encontrou=true;
				return i;
			}
		}

		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome de funcionarios
			// System.out.println(pessoaJuridica.size() + "SIZEEEEE");
			for (int j = 0; j < pessoaJuridica.get(i).listaFuncionarios.size(); j++) {
				if(pessoaJuridica.get(i).getListaFuncionarios(j).contains(buscaNome)){
					System.out.println("Funcinario ligado a empresa:" + pessoaJuridica.get(i).getNomeSocial());
					System.out.println("Nome: " +pessoaJuridica.get(i).listaFuncionarios.get(j).getNomeCompleto());
					System.out.println("Email: "+pessoaJuridica.get(i).listaFuncionarios.get(j).getEmail());
					System.out.println("CPF: " +pessoaJuridica.get(i).listaFuncionarios.get(j).getCpf());
					encontrou=true;
					return i;
				}
			}
		}

		ObjetoNaoEncontradoException verificandoBusca = new ObjetoNaoEncontradoException(encontrou);	
		 
		 try{				
			excecao_achar = verificandoBusca.verificandoObjetoNaoEncontrado(encontrou);
		}catch(ObjetoNaoEncontradoException t) {
			if(encontrou == false) {
				encontrou = true;
			}
			System.out.println("Exceção detectada: Nenhum item com essa descrição foi encontrado.\n");		
		}finally {
			
		
		}	
		 return -1;
	}

	public static int buscaLocatarioCPF_CNPJ(ArrayList<PessoaJuridica> pessoaJuridica, ArrayList<PessoaFisica> pessoaFisica, Scanner sc){
		boolean encontrou = false;
		String buscaDoc;
		int excecao_achar = 1;
		System.out.println("Insira o CNPJ ou CPF do locatário que deseja buscar: ");
		buscaDoc = sc.next();

		for (int i = 0; i < pessoaFisica.size(); i++) { // Busca CPF pessoa fisica
			if(pessoaFisica.get(i).getCpf().contains(buscaDoc)){
				System.out.println("Nome: " +pessoaFisica.get(i).getNomeCompleto());
				System.out.println("Email: "+pessoaFisica.get(i).getEmail());
				System.out.println("CPF: " +pessoaFisica.get(i).getCpf());
				encontrou=true;
				return i;
			}
		}

		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca CNPJ pessoa juridica
			if(pessoaJuridica.get(i).getCnpj().contains(buscaDoc)){
				System.out.println("Nome: " +pessoaJuridica.get(i).getNomeSocial());
				System.out.println("Email: "+pessoaJuridica.get(i).getEmail());
				System.out.println("CNPJ: " +pessoaJuridica.get(i).getCnpj());
				encontrou=true;
				return i;
			}
		}

		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome de funcionarios
			// System.out.println(pessoaJuridica.size() + "SIZEEEEE");
			for (int j = 0; j < pessoaJuridica.get(i).listaFuncionarios.size(); j++) {
				if(pessoaJuridica.get(i).getListaFuncionariosCPF(j).contains(buscaDoc)){
					System.out.println("Funcinario ligado a empresa:" + pessoaJuridica.get(i).getNomeSocial());
					System.out.println("Nome: " +pessoaJuridica.get(i).listaFuncionarios.get(j).getNomeCompleto());
					System.out.println("Email: "+pessoaJuridica.get(i).listaFuncionarios.get(j).getEmail());
					System.out.println("CPF: " +pessoaJuridica.get(i).listaFuncionarios.get(j).getCpf());
					encontrou=true;
					return i;
				}
			}
		}


		ObjetoNaoEncontradoException verificandoBusca = new ObjetoNaoEncontradoException(encontrou);	
		 
		 try{				
			excecao_achar = verificandoBusca.verificandoObjetoNaoEncontrado(encontrou);
		}catch(ObjetoNaoEncontradoException t) {
			if(encontrou == false) {
				encontrou = true;
			}
			System.out.println("Exceção detectada: Nenhum item com essa descrição foi encontrado.\n");		
		}finally {
			
		}	
		 return -1;
	}

	public static int buscaLocatarioEmail(ArrayList<PessoaJuridica> pessoaJuridica, ArrayList<PessoaFisica> pessoaFisica, Scanner sc){
		boolean encontrou = false;
		String buscaEmail;
		int excecao_achar = 1;
		System.out.println("Insira o email do locatário que deseja buscar: ");
		buscaEmail = sc.next();

		for (int i = 0; i < pessoaFisica.size(); i++) { // Busca nome pessoa fisica
			if(pessoaFisica.get(i).getEmail().contains(buscaEmail)){
				System.out.println("Nome: " +pessoaFisica.get(i).getNomeCompleto());
				System.out.println("Email: "+pessoaFisica.get(i).getEmail());
				System.out.println("CPF: " +pessoaFisica.get(i).getCpf());
				encontrou=true;
				return i;
			}
		}
		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome pessoa juridica
			if(pessoaJuridica.get(i).getEmail().contains(buscaEmail)){
				System.out.println("Nome: " +pessoaJuridica.get(i).getNomeSocial());
				System.out.println("Email: "+pessoaJuridica.get(i).getEmail());
				System.out.println("CNPJ: " +pessoaJuridica.get(i).getCnpj());
				encontrou=true;
				return i;
			}
		}

		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome de funcionarios
			// System.out.println(pessoaJuridica.size() + "SIZEEEEE");
			for (int j = 0; j < pessoaJuridica.get(i).listaFuncionarios.size(); j++) {
				if(pessoaJuridica.get(i).getListaFuncionariosEmail(j).contains(buscaEmail)){
					System.out.println("Funcinario ligado a empresa:" + pessoaJuridica.get(i).getNomeSocial());
					System.out.println("Nome: " +pessoaJuridica.get(i).listaFuncionarios.get(j).getNomeCompleto());
					System.out.println("Email: "+pessoaJuridica.get(i).listaFuncionarios.get(j).getEmail());
					System.out.println("CPF: " +pessoaJuridica.get(i).listaFuncionarios.get(j).getCpf());
					encontrou=true;
					return i;
				}
			}
		}

		ObjetoNaoEncontradoException verificandoBusca = new ObjetoNaoEncontradoException(encontrou);	
		 
		 try{				
			excecao_achar = verificandoBusca.verificandoObjetoNaoEncontrado(encontrou);
		}catch(ObjetoNaoEncontradoException t) {
			if(encontrou == false) {
				encontrou = true;
			}
			System.out.println("Exceção detectada: Nenhum item com essa descrição foi encontrado.\n");		
		}finally {
			
		}	
		return -1;
	}
	
	public static int buscaVeiculo(ArrayList<Veiculo> veiculo, Scanner sc){
		boolean encontrou = false;
		String buscaMarca, buscaRenavam, buscaModelo;
		int escolha, excecao_achar = 1;
		
		do {
	
			System.out.println("-----------------------------------------------------------------------");
		    System.out.println(" Menu Pesquisa de Veículos\n");
		        
		    System.out.println(" 1) Pesquisar veículo pela marca\n");
		    System.out.println(" 2) Pesquisar veículo pelo RENAVAM\n");
		    System.out.println(" 3) Pesquisar veículo por modelo\n");
		    escolha = sc.nextInt();
		    
		}while (escolha < 1 || escolha > 3);
		
		switch(escolha) {
		
		case 1:
			
			System.out.println("Insira a marca do veículo que deseja buscar: ");
			buscaMarca = sc.next();

			for (int i = 0; i < veiculo.size(); i++) { // Busca nome pessoa fisica
				if(veiculo.get(i).getMarca().contains(buscaMarca)){
					System.out.println("Marca: "+veiculo.get(i).getMarca());
					System.out.println("Modelo: "+veiculo.get(i).getModelo());
					System.out.println("Renavam: "+veiculo.get(i).getRenavam());
					encontrou=true;
					return i;
				}
			}
			

			ObjetoNaoEncontradoException verificandoBusca = new ObjetoNaoEncontradoException(encontrou);	
			 
			 try{				
				excecao_achar = verificandoBusca.verificandoObjetoNaoEncontrado(encontrou);
			}catch(ObjetoNaoEncontradoException t){
				if(encontrou == false){
					encontrou = true;
				}
				System.out.println("Exceção detectada: Nenhum item com essa descrição foi encontrado.\n");		
			}finally{
				 
			}	
			 return -1;
		
		
		case 2:
			
			System.out.println("Insira o RENAVAM do veículo que deseja buscar: ");
			buscaRenavam = sc.next();

			for (int i = 0; i < veiculo.size(); i++) { // Busca nome pessoa fisica
				if(veiculo.get(i).getRenavam().contains(buscaRenavam)){
					System.out.println("Marca: "+veiculo.get(i).getMarca());
					System.out.println("Modelo: "+veiculo.get(i).getModelo());
					System.out.println("Renavam: "+veiculo.get(i).getRenavam());
					encontrou=true;
					return i;
				}
			}
			

			ObjetoNaoEncontradoException verificandoBusca2 = new ObjetoNaoEncontradoException(encontrou);	
			 
			 try{				
				excecao_achar = verificandoBusca2.verificandoObjetoNaoEncontrado(encontrou);
			}catch(ObjetoNaoEncontradoException t){
				if(encontrou == false){
					encontrou = true;
				}
				System.out.println("Exceção detectada: Nenhum item com essa descrição foi encontrado.\n");		
			}finally{
				 
			}	
			 return -1;
			
		case 3:
			
			System.out.println("Insira o modelo do veículo que deseja buscar: ");
			buscaModelo = sc.next();

			for (int i = 0; i < veiculo.size(); i++) { // Busca nome pessoa fisica
				if(veiculo.get(i).getModelo().contains(buscaModelo)){
					System.out.println("Marca: "+veiculo.get(i).getMarca());
					System.out.println("Modelo: "+veiculo.get(i).getModelo());
					System.out.println("Renavam: "+veiculo.get(i).getRenavam());
					encontrou=true;
					return i;
				}
			}
			

			ObjetoNaoEncontradoException verificandoBusca3 = new ObjetoNaoEncontradoException(encontrou);
			
			try{				
				excecao_achar = verificandoBusca3.verificandoObjetoNaoEncontrado(encontrou);
			}catch(ObjetoNaoEncontradoException t){
				if(encontrou == false){
					encontrou = true;
				}
				System.out.println("Exceção detectada: Nenhum item com essa descrição foi encontrado.\n");		
			}finally{
				 
			}	
			 return -1;
			
		
		default:
			
		break;
		
		}
		return escolha;
		
	}

	//----------------------------------------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------------------------------------
	// Funções de Alteração
	
	public static void alterarDadosLocatario(ArrayList<PessoaJuridica> pessoaJuridica, ArrayList<PessoaFisica> pessoaFisica, Scanner sc){
		
		boolean encontrou = false;
		int excecao_achar = 1;
		String buscaNome = null;
		
		System.out.println("--------------------------------------------------------------------------\n");
		System.out.println("				   ALTERAÇÃO DE DADOS DE LOCATÁRIO\n");
		System.out.println("Insira o nome do locatário que deseja alterar: \n");
		buscaNome = sc.next();
	
		System.out.println("O que deseja alterar?\n1-Nome\n2-Email\n3-CPF/CNPJ\n4-Telefone\n");
		int opcao = sc.nextInt();

		
		
		for (int i = 0; i < pessoaFisica.size(); i++) { // Busca nome pessoa fisica
			if(opcao == 1){
				if(pessoaFisica.get(i).getNomeCompleto().contains(buscaNome)){
					encontrou=true;
					pessoaFisica.get(i).setNomeCompleto(lerNome(sc));
					System.out.println(pessoaFisica.get(i).getNomeCompleto());
				}
			}
			if(opcao == 2){
				if(pessoaFisica.get(i).getNomeCompleto().contains(buscaNome)){
					encontrou=true;
					pessoaFisica.get(i).setEmail(lerEmail(sc));
					System.out.println(pessoaFisica.get(i).getEmail());
				}
			}
			if(opcao == 3){
				if(pessoaFisica.get(i).getNomeCompleto().contains(buscaNome)){
					encontrou=true;
					pessoaFisica.get(i).setCpf(lerCpf(sc));
					System.out.println(pessoaFisica.get(i).getCpf());
				}
			}
			if(opcao == 4){
				if(pessoaFisica.get(i).getNomeCompleto().contains(buscaNome)){
					encontrou=true;
					pessoaFisica.get(i).setTelefone(lerTelefone(sc));
					System.out.println(pessoaFisica.get(i).getTelefone());
				}
		    }	
			
		}
		
		for (int k = 0; k < pessoaJuridica.size(); k++) { // Busca nome pessoa juridica
			// System.out.println("O que deseja alterar?\n1-Nome\n2-Email\n3-CNPJ\n4-Telefone\n");
			// int opcao = sc.nextInt();
			if(opcao == 1){
				if(pessoaJuridica.get(k).getNomeSocial().contains(buscaNome)){
					encontrou=true;
					pessoaJuridica.get(k).setNomeSocial(lerNome(sc));
					System.out.println(pessoaJuridica.get(k).getNomeSocial());
				}
			}
			if(opcao == 2){
				if(pessoaJuridica.get(k).getNomeSocial().contains(buscaNome)){
					encontrou=true;
					pessoaJuridica.get(k).setEmail(lerEmail(sc));
					System.out.println(pessoaJuridica.get(k).getEmail());
				}
				}
			if(opcao == 3){
				if(pessoaJuridica.get(k).getNomeSocial().contains(buscaNome)){
					encontrou=true;
					pessoaJuridica.get(k).setCnpj(lerCnpj(sc));
					System.out.println(pessoaJuridica.get(k).getCnpj());
				}
    		}
			
			if(opcao == 4){
				if(pessoaJuridica.get(k).getNomeSocial().contains(buscaNome)){
					encontrou=true;
					pessoaJuridica.get(k).setTelefone(lerTelefone(sc));
					System.out.println(pessoaJuridica.get(k).getTelefone());
				}
			}
		

		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome de funcionarios
			// System.out.println("O que deseja alterar?\n1-Nome\n2-Email\n3-CPF\n4-Telefone\n");
			// int opcao = sc.nextInt();
			if(opcao == 1){
				for (int j = 0; j < pessoaJuridica.get(i).listaFuncionarios.size(); j++) {
					if(pessoaJuridica.get(i).getListaFuncionarios(j).contains(buscaNome)){
						encontrou=true;
						pessoaJuridica.get(i).listaFuncionarios.get(j).setNomeCompleto(lerNome(sc));
						System.out.println(pessoaJuridica.get(i).listaFuncionarios.get(j).getNomeCompleto());
					}
				}
			}
			if(opcao == 2){
				for (int j = 0; j < pessoaJuridica.get(i).listaFuncionarios.size(); j++) {
					if(pessoaJuridica.get(i).getListaFuncionarios(j).contains(buscaNome)){
						encontrou=true;
						pessoaJuridica.get(i).listaFuncionarios.get(j).setEmail(lerEmail(sc));
						System.out.println(pessoaJuridica.get(i).listaFuncionarios.get(j).getEmail());
					}
				}
			}
			if(opcao == 3){
				for (int j = 0; j < pessoaJuridica.get(i).listaFuncionarios.size(); j++) {
					if(pessoaJuridica.get(i).getListaFuncionarios(j).contains(buscaNome)){
						encontrou=true;
						pessoaJuridica.get(i).listaFuncionarios.get(j).setCpf(lerCpf(sc));
						System.out.println(pessoaJuridica.get(i).listaFuncionarios.get(j).getCpf());
					}
				}
			}
			if(opcao == 4){
				for (int j = 0; j < pessoaJuridica.get(i).listaFuncionarios.size(); j++) {
					if(pessoaJuridica.get(i).getListaFuncionarios(j).contains(buscaNome)){
						encontrou=true;
						pessoaJuridica.get(i).listaFuncionarios.get(j).setTelefone(lerTelefone(sc));
						System.out.println(pessoaJuridica.get(i).listaFuncionarios.get(j).getTelefone());
					}
				}
			}
			}			
		}
		
		ObjetoNaoEncontradoException verificandoBusca = new ObjetoNaoEncontradoException(encontrou);
		
		try{				
			excecao_achar = verificandoBusca.verificandoObjetoNaoEncontrado(encontrou);
		}catch(ObjetoNaoEncontradoException t){
			if(encontrou == false){
				encontrou = true;
			}
			System.out.println("Exceção detectada: Nenhum item com essa descrição foi encontrado.\n");		
		}finally{
			 
		}	
			
	}
	
public static void alterarDadosVeiculo(ArrayList<Veiculo> veiculo, Scanner sc){
		
		boolean encontrou = false;
		String buscaNome = null;
		int excecao_achar = 1;
		
		System.out.println("-----------------------------------------------------------------\n");
		System.out.println("	       ALTERAÇÃO DE DADOS DE VEÍCULO\n");
		System.out.println(" Insira a marca do veículo que deseja alterar: \n");
		buscaNome = sc.next();
	
		System.out.println( "O que deseja alterar?\n1-Marca\n2-Modelo\n3-RENAVAM\n");
		int opcao = sc.nextInt();

		
		for (int i = 0; i < veiculo.size(); i++) { // Busca nome pessoa fisica
			if(opcao == 1){
				if(veiculo.get(i).getMarca().contains(buscaNome)){
					encontrou=true;
					veiculo.get(i).setMarca(lerMarca(sc));
					System.out.println(veiculo.get(i).getMarca());
				}
			}
			if(opcao == 2){
				if(veiculo.get(i).getMarca().contains(buscaNome)){
					encontrou=true;
					veiculo.get(i).setModelo(lerModelo(sc));
					System.out.println(veiculo.get(i).getModelo());
				}
			}
			if(opcao == 3){
				if(veiculo.get(i).getMarca().contains(buscaNome)){
					encontrou=true;
					veiculo.get(i).setRenavam(lerRenavam(sc));
					System.out.println(veiculo.get(i).getRenavam());
				}
			}			
			
		}
		
		
		ObjetoNaoEncontradoException verificandoBusca = new ObjetoNaoEncontradoException(encontrou);
		
		try{				
			excecao_achar = verificandoBusca.verificandoObjetoNaoEncontrado(encontrou);
		}catch(ObjetoNaoEncontradoException t){
			if(encontrou == false){
				encontrou = true;
			}
			System.out.println("Exceção detectada: Nenhum item com essa descrição foi encontrado.\n");		
		}finally{
			 
		}	
			
	}

	//----------------------------------------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------------------------------------
	// Funções de Deletar
	public static void deletarLocatarioNome(ArrayList<PessoaJuridica> pessoaJuridica, ArrayList<PessoaFisica> pessoaFisica, Scanner sc){
		boolean encontrou = false;
		String buscaNome;
		int excecao_achar = 1;
		System.out.println("Insira o nome do locatário que deseja deletar: ");
		buscaNome = sc.next();

		for (int i = 0; i < pessoaFisica.size(); i++) { // Busca nome pessoa fisica
			if(pessoaFisica.get(i).getNomeCompleto().contains(buscaNome)){
				pessoaFisica.remove(i);
				System.out.println("Pessoa física deletada com sucesso!\n");
				encontrou=true;
			}
		}

		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome pessoa juridica
			if(pessoaJuridica.get(i).getNomeSocial().contains(buscaNome)){
				pessoaJuridica.remove(i);
				encontrou=true;
				System.out.println("Pessoa jurídica deletada com sucesso!\n");
			}
		}
			
		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome de funcionarios
			// System.out.println(pessoaJuridica.size() + "SIZEEEEE");
			for (int j = 0; j < pessoaJuridica.get(i).listaFuncionarios.size(); j++) {
				if(pessoaJuridica.get(i).getListaFuncionarios(j).contains(buscaNome)){
					// System.out.println("Funcinario ligado a empresa:" + pessoaJuridica.get(i).getNomeSocial());
					pessoaJuridica.get(i).listaFuncionarios.remove(j);
					encontrou=true;
					System.out.println("Funcionário deletado com sucesso!\n");
				}
			}
		}

		ObjetoNaoEncontradoException verificandoBusca = new ObjetoNaoEncontradoException(encontrou);
		
		try{				
			excecao_achar = verificandoBusca.verificandoObjetoNaoEncontrado(encontrou);
		}catch(ObjetoNaoEncontradoException t){
			if(encontrou == false){
				encontrou = true;
			}
			System.out.println("Exceção detectada: Nenhum item com essa descrição foi encontrado.\n");		
		}finally{
			 
		}	
	}
	
	public static void deletarVeiculo(ArrayList<Veiculo> veiculo, Scanner sc){
		boolean encontrou = false;
		String buscaNome;
		int excecao_achar = 1;
		System.out.println("Insira a marca do veículo que deseja deletar: ");
		buscaNome = sc.next();

		for (int i = 0; i < veiculo.size(); i++) { // Busca nome pessoa fisica
			if(veiculo.get(i).getMarca().contains(buscaNome)){
				veiculo.remove(i);
				System.out.println("Veículo deletado com sucesso!\n");
				encontrou=true;
			}
		}


		ObjetoNaoEncontradoException verificandoBusca = new ObjetoNaoEncontradoException(encontrou);
		
		try{				
			excecao_achar = verificandoBusca.verificandoObjetoNaoEncontrado(encontrou);
		}catch(ObjetoNaoEncontradoException t){
			if(encontrou == false){
				encontrou = true;
			}
			System.out.println("Exceção detectada: Nenhum item com essa descrição foi encontrado.\n");		
		}finally{
			 
		}	
	}

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
	
	 static String lerNome(Scanner sc){
		String nome;
		int verifException;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o nome completo da pessoa fisica.\n");
		
	
		nome = sc.next();		
				
		return nome;
	}

	static String lerEmail(Scanner sc){
		String email;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o email da pessoa fisica.\n");
		email = sc.next();

		return email;
	}

	String lerEstadoCivil(Scanner sc){
		String estadoCivil;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o estado civil da pessoa fisica.\n");
		estadoCivil = sc.next();

		return estadoCivil;
	}

	static String lerCpf(Scanner sc){
		String cpf;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o cpf da pessoa fisica.\n");
		cpf = sc.next();

		return cpf;
	}
	
	private static String lerCnpj(Scanner sc) {
		String cnpj;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o cnpj da pessoa jurídica.\n");
		cnpj = sc.next();

		return cnpj;
	}

	static String lerTelefone(Scanner sc){
		String telefone;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o telefone da pessoa fisica.\n");
		telefone = sc.next();

		return telefone;
	}
	
	static String lerMarca(Scanner sc){
		String marca;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira a nova marca do veículo.\n");
		marca = sc.next();

		return marca;
	}
	
	static String lerModelo(Scanner sc){
		String modelo;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o novo modelo do veículo.\n");
		modelo = sc.next();

		return modelo;
	}
	
	static String lerRenavam(Scanner sc){
		String renavam;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o novo RENAVAM do veículo.\n");
		renavam = sc.next();

		return renavam;
	}
 }
//---------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------------			
