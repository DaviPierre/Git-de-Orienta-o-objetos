package app;

import java.util.Scanner;

import gerenciarLocatarios.Locatario;
import gerenciarLocatarios.PessoaFisica;
import gerenciarLocatarios.PessoaJuridica;
import gerenciarFrotas.Motocicleta;
import gerenciarFrotas.V_carga;
import gerenciarFrotas.V_passageiro;
import gerenciarFrotas.V_passeio;
import gerenciarFrotas.V_utilitario;
import gerenciarFrotas.Veiculo;

import java.util.ArrayList; // Esse import vai servir para registrar diversos usuários, veículos e reservas

public class Locadora1 {
	
	// Esses ArrayLists são as listas de array que vão guardar os dados e número de objetos cadastrados, usados depois para listar os elementos.
	
	
// O menu principal contido na função main - aqui que vai acontecer tudo	
	public static void main(String[] args) {
		
	    ArrayList<PessoaFisica> pessoaFisica = new ArrayList<PessoaFisica>(); 
			ArrayList<PessoaJuridica> pessoaJuridica = new ArrayList<PessoaJuridica>(); 
	    
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
									selec = sc.nextInt();
								}while(selec < 1 || selec > 2);
								if(selec==1){
									buscaLocatarioNome(pessoaJuridica, pessoaFisica, sc);
								}
								if(selec==2){

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
        System.out.println(" 4) Sair do Programa");
	}	
	
	public static void printarGerenciarLocatarios() {
		System.out.println("-----------------------------------------------------------------------");
        System.out.println(" Menu Locatários\n");
        
        System.out.println(" 1) Cadastrar Locatários");
        System.out.println(" 2) Buscar locatário");
        System.out.println(" 3) Editar Locatário");
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

	public static void cadastroPessoaFisica(ArrayList<PessoaFisica> pessoaFisica) {
		Scanner sc = new Scanner(System.in);

		PessoaFisica newPessoaFisica = new PessoaFisica(lerNome(sc), lerEmail(sc), lerCpf(sc), lerTelefone(sc));

		pessoaFisica.add(newPessoaFisica);

		for(PessoaFisica listaPessoaFisica: pessoaFisica) {
			listaPessoaFisica.listarPessoaFisica();
		}
	}

	public static int buscaLocatarioNome(ArrayList<PessoaJuridica> pessoaJuridica, ArrayList<PessoaFisica> pessoaFisica, Scanner sc){
		boolean encontrou = false;
		String buscaNome;
		System.out.println("Insira o nome do locatário que deseja buscar: ");
		buscaNome = sc.next();

		for (int i = 0; i < pessoaFisica.size(); i++) { // Busca nome pessoa fisica
			if(pessoaFisica.get(i).getNomeCompleto().contains(buscaNome)){
				System.out.println(pessoaFisica.get(i).getEmail());
				encontrou=true;
				return i;
			}
		}
		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome pessoa juridica
			if(pessoaJuridica.get(i).getNomeSocial().contains(buscaNome)){
				System.out.println(pessoaJuridica.get(i).getEmail());
				encontrou=true;
				return i;
			}
		}

		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome de funcionarios
			// System.out.println(pessoaJuridica.size() + "SIZEEEEE");
			for (int j = 0; j < pessoaJuridica.get(i).listaFuncionarios.size(); j++) {
				if(pessoaJuridica.get(i).getListaFuncionarios(j).contains(buscaNome)){
					System.out.println("Funcinario ligado a empresa:" + pessoaJuridica.get(i).getNomeSocial());
					System.out.println(pessoaJuridica.get(i).listaFuncionarios.get(j).getEmail());
					encontrou=true;
					return i;
				}
			}
		}

		if(!encontrou){
			System.out.println("Não foi encontrado nenhum locatário com esse nome.");
		}
		return -1;
	}

	public static void alterarDadosLocatario(ArrayList<PessoaJuridica> pessoaJuridica, ArrayList<PessoaFisica> pessoaFisica, Scanner sc){
		boolean encontrou = false;
		String buscaNome;
		System.out.println("Insira o nome do locatário que deseja alterar: ");
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
			} else {
				System.out.println("Não implementado ainda");
			}


		}
		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome pessoa juridica
			// System.out.println("O que deseja alterar?\n1-Nome\n2-Email\n3-CNPJ\n4-Telefone\n");
			// int opcao = sc.nextInt();
			if(opcao == 1){
				if(pessoaJuridica.get(i).getNomeSocial().contains(buscaNome)){
					encontrou=true;
					pessoaJuridica.get(i).setNomeSocial(lerNome(sc));
					System.out.println(pessoaJuridica.get(i).getNomeSocial());
				}
			} else {
				System.out.println("Não implementado ainda");
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
			} else {
				System.out.println("Não implementado ainda");
			}
		}

		if(!encontrou){
			System.out.println("Não foi encontrado nenhum locatário com esse nome.");
		}
	}

	public static void deletarLocatarioNome(ArrayList<PessoaJuridica> pessoaJuridica, ArrayList<PessoaFisica> pessoaFisica, Scanner sc){
		boolean encontrou = false;
		String buscaNome;
		System.out.println("Insira o nome do locatário que deseja deletar: ");
		buscaNome = sc.next();

		for (int i = 0; i < pessoaFisica.size(); i++) { // Busca nome pessoa fisica
			if(pessoaFisica.get(i).getNomeCompleto().contains(buscaNome)){
				System.out.println(pessoaFisica.remove(i));
				encontrou=true;
			}
		}

		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome pessoa juridica
			if(pessoaJuridica.get(i).getNomeSocial().contains(buscaNome)){
				System.out.println(pessoaJuridica.remove(i));
				encontrou=true;
			}
		}
			
		for (int i = 0; i < pessoaJuridica.size(); i++) { // Busca nome de funcionarios
			// System.out.println(pessoaJuridica.size() + "SIZEEEEE");
			for (int j = 0; j < pessoaJuridica.get(i).listaFuncionarios.size(); j++) {
				if(pessoaJuridica.get(i).getListaFuncionarios(j).contains(buscaNome)){
					// System.out.println("Funcinario ligado a empresa:" + pessoaJuridica.get(i).getNomeSocial());
					System.out.println(pessoaJuridica.get(i).listaFuncionarios.remove(j));
					encontrou=true;
				}
			}
		}

		if(!encontrou){
			System.out.println("Não foi encontrado nenhum locatário com esse nome.");
		}
	}

	public static void cadastroPessoaJuridica(ArrayList<PessoaJuridica> pessoaJuridica, ArrayList<PessoaFisica> pessoaFisica) {
		Scanner sc = new Scanner(System.in);

		String email, nomeSocial, cnpj;
		int telefone, numeroFuncionarios;

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
		telefone = sc.nextInt();

		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o número de funcionários da empresa.\n");
		numeroFuncionarios = sc.nextInt();
		
		PessoaJuridica newPessoaJuridica = new PessoaJuridica(nomeSocial, email, cnpj, telefone, numeroFuncionarios);
		pessoaJuridica.add(newPessoaJuridica);

		for(PessoaJuridica listaPessoaJuridica: pessoaJuridica) {
			listaPessoaJuridica.listarPessoaJuridica();
		}

		boolean novoCadastro = true;
		do{
			System.out.println("---------------------------------------\n");
			System.out.println(" Deseja adicionar um novo cadastro de funcionario?\n");
			System.out.println(" 1 - Sim  | 2 - Nao \n");
			int opcao = sc.nextInt();

			if(opcao == 1) {
				PessoaFisica novoFuncionario = new PessoaFisica(lerNome(sc), lerEmail(sc), lerCpf(sc), lerTelefone(sc));
				newPessoaJuridica.insereFuncionario(novoFuncionario);
				novoCadastro = true;
			} else {
				novoCadastro = false;
			}
		} while(novoCadastro == true);

		newPessoaJuridica.listaFuncionarios();
	}
	
	 static String lerNome(Scanner sc){
		String nome;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o nome completo da pessoa fisica\n");
		nome = sc.next();

		return nome;
	}

	static String lerEmail(Scanner sc){
		String email;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o email da pessoa fisica\n");
		email = sc.next();

		return email;
	}

	String lerEstadoCivil(Scanner sc){
		String estadoCivil;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o estado civil da pessoa fisica\n");
		estadoCivil = sc.next();

		return estadoCivil;
	}

	static String lerCpf(Scanner sc){
		String cpf;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o cpf da pessoa fisica\n");
		cpf = sc.next();

		return cpf;
	}

	static int lerTelefone(Scanner sc){
		int telefone;
		System.out.println("---------------------------------------\n");
		System.out.println("Insira o telefone da pessoa fisica\n");
		telefone = sc.nextInt();

		return telefone;
	}
	
	public static void cadastrarVeiculo(ArrayList<Veiculo> veiculo) {

		// int i=0;
		// while(i != 2){
		// 	Veiculo passeio = new V_passeio("AAA" + i,"b","c",true, true, false);
		// 	System.out.println(((V_passeio) passeio).getMarca());
		// 	veiculo.add(passeio);
		// 	i++;
		// }

		// for(Veiculo listaPasseio:veiculo) {
		// 	System.out.println(((V_passeio) listaPasseio).getMarca() + "DEu");
		// }

		Scanner sc = new Scanner(System.in);
		

		String marca, modelo, renavam;
		int tipoDeCarro, anoFabricacao, anoModelo, capacidadeTanque;

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


			Veiculo newV_passeio = new V_passeio(marca, modelo, renavam, anoFabricacao, anoModelo, capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
			veiculo.add(newV_passeio);
			
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
				System.out.println("Cadastro de veículo de carga");
				Veiculo newV_carga = new V_carga();
				veiculo.add(newV_carga);
			}

			if(tipoDeUtilitario == 2){ //Veiculo de passageiro
				System.out.println("Cadastro de veículo de passageiro");
				Veiculo newV_passageiro = new V_passageiro();
				veiculo.add(newV_passageiro);
			}

		}

		if(tipoDeCarro == 3){
			System.out.println("Cadastro moto");
			Veiculo newV_moto = new Motocicleta(marca);
			veiculo.add(newV_moto);
		}

		for(Veiculo listaPasseio:veiculo) { // listagem veiculos
			if(listaPasseio.getClass().getSimpleName().contains("V_passeio")){
				System.out.println(((V_passeio) listaPasseio).getMarca());
			}
			if(listaPasseio.getClass().getSimpleName().contains("V_carga")){
				
			}
			if(listaPasseio.getClass().getSimpleName().contains("V_passageiro")){
				
			}
			if(listaPasseio.getClass().getSimpleName().contains("Motocicleta")){

			}

		}

		// // Por fim, criamos uma classe "listaPessoa" que imprima os atributos por meio dos métodos/funções "get".
		// for(Veiculo listaVeiculo:veiculo) {
		// 	System.out.println("---------------------------------------\n");
		
		// 	System.out.print("MARCA:\n");
		// 	listaVeiculo.getMarca();
		// 	System.out.print("MODELO:\n");
		// 	listaVeiculo.getModelo();
		// 	System.out.print("RENAVAM:\n");
		// 	listaVeiculo.getRenavam();
		// 	}
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
