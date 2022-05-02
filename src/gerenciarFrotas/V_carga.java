package gerenciarFrotas;

import java.util.Scanner;

//Preparando o enum
enum categoriaCarga {
	Bau, Graneleiro, Basculante
}
//---------------------------------------------------------------------------
public class V_carga extends V_utilitario {
	static Scanner sc  = new Scanner(System.in);
	
	int maxPeso, taraVeiculo, tamCargaLitros;
	
	
//Preparando o vetor de strings do Enum	
	static String[] categoriaCarga = {"Bau", "Graneleiro", "Basculante"};
	
	public V_carga(String marca, String modelo, String renavam, int anoFabricacao, int anoModelo, int capacidadeTanque) {
		setMarca(marca);
		setModelo(modelo);
		setRenavam(renavam);
        setAnoFabricacao(anoFabricacao);
        setAnoModelo(anoModelo);
        setCapacidadeTanque(capacidadeTanque);
	}

	public static String escolherCategoriaCarga() {		
		int sel;
		do {
			System.out.println("-------------------------------------");
        	System.out.println(" Por favor, digite o tipo de carga.\n");
        	System.out.println(" 1 - Baú\n");
        	System.out.println(" 2 - Graneleiro\n");
        	System.out.println(" 3 - Basculante\n");
        	sel = sc.nextInt();
		}while(sel > 3 || sel < 1);
		
		System.out.println(categoriaCarga[sel-1]);
		return  categoriaCarga[sel-1];
	}
	
	public int setTaraVeiculo(){


        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite a tara do veículo.\n");
        taraVeiculo = sc.nextInt();

        return taraVeiculo;
        
     
    }
	
	public int setTamCargaLitros(){

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite o tamanho da carga, em litros.\n");
        tamCargaLitros = sc.nextInt();

        return tamCargaLitros;
        
     
    }
	
	public int setMaxPeso(){

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite o peso máximo.\n");
        maxPeso = sc.nextInt();
        
     //capacidadeCarga recebe maxPeso se o veículo utilitário for classificado como veículo de cargo.
        // capacidadeCarga = maxPeso;

        return maxPeso;
        
        
    }
	
	
  }


