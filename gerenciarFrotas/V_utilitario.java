package gerenciarFrotas;

import java.util.Scanner;

public class V_utilitario extends Veiculo {
 	
	float capacidadeCarga;
	
	public float getCapacidadeCarga() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite a capacidade de carga do veículo utilitário.\n");
        capacidadeCarga = sc.nextFloat();
		
		
		return capacidadeCarga;
	}
}
