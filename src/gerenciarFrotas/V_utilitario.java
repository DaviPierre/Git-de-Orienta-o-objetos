package gerenciarFrotas;

import java.util.Scanner;

public class V_utilitario extends Veiculo {
	// Scanner sc = new Scanner(System.in);
	String marca, modelo, renavam;

public V_utilitario() {

}

public V_utilitario(String marca, String modelo, String renavam) {
	setMarca(marca);
	setModelo(modelo);
	setRenavam(renavam);
}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		// System.out.println(marca);
		return marca;
	}

	// int capacidadeCarga;
	
	// public int getCapacidadeCarga() {
		
		
	// 	System.out.println("-------------------------------------");
  //       System.out.println(" Por favor, digite a capacidade de carga do veículo utilitário.\n");
  //       capacidadeCarga = sc.nextInt();
		
		
	// 	return capacidadeCarga;
	// }
}
