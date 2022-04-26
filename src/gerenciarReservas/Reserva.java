package gerenciarReservas;

import java.util.Scanner;

import gerenciarFrotas.Veiculo; // Esse imports são necessários para realizar as referências.

import gerenciarLocatarios.Locatario;

enum tipoReserva {
	Normal, Reduzida, Empresarial, Mensal
}

public class Reserva {
	Scanner sc = new Scanner(System.in);
	
	// Referência da Classe Veículo que vai apontar pra um veículo reservado. 
	Veiculo veiculoReservado;	
	// Referência da Classe Locatário que vai apontar pra uma pessoa, física ou jurídica, que faz a reserva.
	Locatario pessoaReserva;
	// O código completo vai pegar os lugares pra onde essas referências apontam pra poder associar um "Locatario" e um "Veiculo" em uma reserva.
	int numeroDiarias, horarioInicioReserva, numeroIdentificador;
	float valorTotalN, valorTotalR, valorTotalE, valorTotalM, valorTotalEscolhido;
	
	ValoresAdicionais impostos; //Aqui a referência impostos puxa da Classe ValoresAdicionais pra, no código, poder aplicar.
	
	static String[] tipoReserva = {"Normal", "Reduzida", "Empresarial", "Mensal"};
	
	
	public static String escolherTipoReserva() {	
		Scanner sc = new Scanner(System.in);
		int sel;
		do {
			System.out.println("-------------------------------------");
        	System.out.println(" Por favor, digite o tipo da reserva que o locatário deseja.\n");
        	System.out.println(" 1 - Normal\n");
        	System.out.println(" 2 - Reduzida\n");
        	System.out.println(" 3 - Empresarial\n");
        	System.out.println(" 4 - Mensal\n");
        	sel = sc.nextInt();
		}while(sel > 5 || sel < 1);
		
		System.out.println(tipoReserva[sel-1]); 
		return  tipoReserva[sel-1];
	}
	
	public int getNumeroDiarias() {
		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o número de dias que o carro será alugado.\n");
		numeroDiarias = sc.nextInt();
		
		
		return numeroDiarias;
	}
	
	public int getHorarioInicioReserva() {
		System.out.println("---------------------------------------\n");
		System.out.println(" Insira o horário em que o carro vai ser alugado.\n");
		horarioInicioReserva = sc.nextInt();
		
		
		return horarioInicioReserva;
	}
	
	public int PreparartNumeroDaReserva() {
		
		
		
		return numeroIdentificador;
	}
	
	public float calcValorTotal() {
		
		// valorTotalN = Veiculo.getdVeiculoN() * numeroDiarias ;
		// valorTotalR = Veiculo.getdVeiculoR() * numeroDiarias; 
		// valorTotalE = Veiculo.getdVeiculoE() * numeroDiarias ;
		// valorTotalM = Veiculo.getdVeiculoM() * numeroDiarias ;
		
		
		return valorTotalEscolhido;
	}
	
	public void  cadastrarReservas() {
		
	}
}
