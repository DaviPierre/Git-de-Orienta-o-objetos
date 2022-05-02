package gerenciarReservas;

import java.util.Scanner;

import gerenciarFrotas.Veiculo; // Esse imports são necessários para realizar as referências.

import gerenciarLocatarios.Locatario;
import gerenciarLocatarios.PessoaFisica;
import gerenciarLocatarios.PessoaJuridica;

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
	int numeroDiarias, numeroIdentificador;
	String horarioInicioReserva, horarioFimReserva;
	float valorTotalN, valorTotalR, valorTotalE, valorTotalM, valorTotalEscolhido;
	
	ValoresAdicionais impostos; //Aqui a referência impostos puxa da Classe ValoresAdicionais pra, no código, poder aplicar.
	
	static String[] tipoReserva = {"Normal", "Reduzida", "Empresarial", "Mensal"};

	public Reserva(){

	}

	public Reserva(Veiculo veiculoReservado, Locatario pessoaReserva, int numeroDiarias, String horarioInicioReserva, String horarioFimReserva, int numeroIdentificador) {
		this.veiculoReservado = veiculoReservado;
		this.pessoaReserva = pessoaReserva;
		this.numeroDiarias = numeroDiarias;
		this.horarioInicioReserva = horarioInicioReserva;
		this.numeroIdentificador = numeroIdentificador;
	}

	public int getNumeroDiarias() {
		return numeroDiarias;
	}

	public void emitirRelatorioConsolidado(){
		System.out.println("-------------------------------------");
		System.out.println("Reserva: " + numeroIdentificador);
		System.out.println("Inicio: " + horarioInicioReserva);
		System.out.println("Fim: " + horarioFimReserva);
		System.out.println(" Veículo: " + "Marca - " + veiculoReservado.getMarca() + "Modelo - " + veiculoReservado.getModelo());
		System.out.println("Valor seguro terceiros: " + ((Veiculo) veiculoReservado).getDiariaN() + "R$");
		// System.out.println("Valor seguro proprio: " + veiculoReservado.getValorSeguroProprio());
		// System.out.println("Valor impostos: " + impostos.getValorImpostos());
		System.out.println("Valor total: " + valorTotalEscolhido);

		// System.out.println(" Locatário: " + ((PessoaFisica) pessoaReserva).getNomeCompleto());
		// System.out.println(" Locatário email: " + pessoaReserva.getEmail());
		// System.out.println(" Número de diárias: " + numeroDiarias);
		// System.out.println(" Horário de início da reserva: " + horarioInicioReserva);
		// System.out.println(" Número de identificador: " + numeroIdentificador);
		System.out.println("-------------------------------------");
	}
	
	
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
	
	public float calcValorTotal() {
		
		// valorTotalN = Veiculo.getdVeiculoN() * numeroDiarias ;
		// valorTotalR = Veiculo.getdVeiculoR() * numeroDiarias; 
		// valorTotalE = Veiculo.getdVeiculoE() * numeroDiarias ;
		// valorTotalM = Veiculo.getdVeiculoM() * numeroDiarias ;
		
		
		return valorTotalEscolhido;
	}
	
	public void cadastraReserva() {		
		
	}

}
