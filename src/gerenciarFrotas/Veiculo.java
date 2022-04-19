/**
 * 
 */
package gerenciarFrotas;

import java.util.Scanner;

public class Veiculo {
	 Scanner sc  = new Scanner(System.in);
	
    String marca, modelo, renavam;
    int anoFabricacao, anoModelo, capacidadeTanque;
    
    static float dVeiculoN;

	static float dVeiculoR;

	static float dVeiculoE;

	static float dVeiculoM;

   
    
    // A partir daqui, estão todos os métodos.
    //---------------------------------------------------------------------
	public Veiculo(String marca, String modelo, String renavam) { 
		setMarca(marca); 
		setModelo(modelo);
		setRenavam(renavam);
	}
	
	
	public String getMarca() {
		System.out.println(marca);
		return marca;
	}

   

	public String getModelo() {
		System.out.println(modelo);
		return modelo;
	}
	
	public String getRenavam() {
		System.out.println(renavam);
		return renavam;
	}

    public int getAnoFabricacao(){

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite o ano de fabricação do veículo.\n");
        anoFabricacao = sc.nextInt();

        return anoFabricacao;

    }

    public int getAnoModelo(){

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite o ano do modelo do veículo.\n");
        anoModelo = sc.nextInt();

        return anoModelo;

    }

    //---------------------------------------------------------------------------------------------------------------------------------------------------------
    public void setRenavam(String renavam){
        this.renavam = renavam;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int setCapacidadeTanque(){

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite qual a capacidade do tanque do veículo.\n");
        capacidadeTanque = sc.nextInt();

        return capacidadeTanque;
    }
    
    public static float getdVeiculoN(){


        return dVeiculoN;

    }
    
    public static float getdVeiculoR(){


        return dVeiculoR;

    }
    
    public static float getdVeiculoE(){


        return dVeiculoE;

    }
    
    public static float getdVeiculoM(){


        return dVeiculoM;

    }
    
    public void cadastrarVeiculo() { //Aqui que os veículo(s) serão registrados, com uma referência para quando necessitar de referir a eles para pesquisa.
    	
    }

    public void cadastraValoresAluguel(){
       
       
    
   }
    
    // Referência "diariaVeiculo" do tipo ValoresAluguel.
    //---------------------------------------------------------------------
    public void escolherDiaria(){
       
    
   }
    
}
   	
