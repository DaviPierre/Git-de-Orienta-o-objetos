package gerenciarFrotas;

import java.util.Scanner;

public class V_utilitario extends Veiculo {
	Scanner sc = new Scanner(System.in);
	
	int capacidadeCarga;
	
	public int getCapacidadeCarga() {
		
		
		System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite a capacidade de carga do veículo utilitário.\n");
        capacidadeCarga = sc.nextInt();
		
		
		return capacidadeCarga;
	}
}
