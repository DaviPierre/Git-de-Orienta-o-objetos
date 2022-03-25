package gerenciarReservas;

import java.util.Scanner;

public class ValoresAdicionais {
	Scanner sc = new Scanner(System.in);
	float impostoValorLocacao, seguroProtecaoTerceiros, seguroProtecaoCarro;
	boolean pagaOuNao;

	public float getImpostoValorLocacao() {
		
		impostoValorLocacao =  12/100;
		
		return impostoValorLocacao;
	}
	
	public float getSeguroProtecaoTerceiros() {
		
		 seguroProtecaoTerceiros= 8/100;
		
		return seguroProtecaoTerceiros;
	}

	public boolean pagaSeguroProtecaoCarro() {
		
		System.out.println("---------------------------------------\n");
		System.out.println(" O locatário vai pagar o seguro de proteção de carros?.\n");
		pagaOuNao = sc.nextBoolean();
		
		return pagaOuNao;
	}	
	
	public float getSeguroProtecaoCarro() {
	
		seguroProtecaoCarro = 12/100;
	
		return seguroProtecaoCarro;
}
	
	
	
}
