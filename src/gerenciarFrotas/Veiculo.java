/**
 * 
 */
package gerenciarFrotas;

public class Veiculo {
	//  Scanner sc  = new Scanner(System.in);

    String marca, modelo, renavam;
    int anoFabricacao, anoModelo, capacidadeTanque;
    float diariaN, diariaR, diariaE, valorMensal;
    ValoresAluguel valoresAluguel;
    

    public Veiculo() {
        
    }

    public Veiculo(String marca, String modelo, String renavam, int anoFabricacao, int anoModelo, int capacidadeTanque) {
        setMarca(marca);
		setModelo(modelo);
		setRenavam(renavam);
        setAnoFabricacao(anoFabricacao);
        setAnoModelo(anoModelo);
        setCapacidadeTanque(capacidadeTanque);
        setDiariaN(diariaN);
        setDiariaR(diariaR);
        setDiariaE(diariaE);
        setValorMensal(valorMensal);
    }


    public void setDiariaN(float diariaN) {
        this.diariaN = diariaN;
    }
    public float getDiariaN() {
        return diariaN;
    }

    public void setDiariaR(float diariaR) {
        this.diariaR = diariaR;
    }
    public float getDiariaR() {
        return diariaR;
    }

    public void setDiariaE(float diariaE) {
        this.diariaE = diariaE;
    }
    public float getDiariaE() {
        return diariaE;
    }

    public void setValorMensal(float valorMensal) {
        this.valorMensal = valorMensal;
    }
    public float getValorMensal() {
        return valorMensal;
    }


    public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public String getRenavam() {
		return renavam;
	}

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoModelo() {
        return anoModelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }


    // public String getMarca() {
    //     return marca;
    // }


    // public String getModelo() {
    //     return modelo;
    // }

    
//     // A partir daqui, estão todos os métodos.
//     //---------------------------------------------------------------------
// 	public Veiculo(String marca, String modelo, String renavam) { 
// 		setMarca(marca); 
// 		setModelo(modelo);
// 		setRenavam(renavam);
// 	}
	
	
// 	public String getMarca() {
// 		System.out.println(marca);
// 		return marca;
// 	}  
// 	public String getModelo() {
// 		System.out.println(modelo);
// 		return modelo;
// 	}	
// 	public String getRenavam() {
// 		System.out.println(renavam);
// 		return renavam;
// 	}
//     public int getAnoFabricacao(){
//     	System.out.println(anoFabricacao);
//         return anoFabricacao;
//     }
//     public int getAnoModelo(){
//     	System.out.println(anoModelo);
//         return anoModelo;
//     }

//     //---------------------------------------------------------------------------------------------------------------------------------------------------------
//     public void setRenavam(String renavam){
//         this.renavam = renavam;
//     }
//     public void setModelo(String modelo){
//         this.modelo = modelo;
//     }
//     public void setMarca(String marca){
//         this.marca = marca;
//     } 
//     public int setCapacidadeTanque(){

//         System.out.println("-------------------------------------");
//         System.out.println(" Por favor, digite qual a capacidade do tanque do veículo.\n");
//         capacidadeTanque = sc.nextInt();

//         return capacidadeTanque;
//     }
    
//     public static float getdVeiculoN(){


//         return dVeiculoN;

//     }
    
//     public static float getdVeiculoR(){


//         return dVeiculoR;

//     }
    
//     public static float getdVeiculoE(){


//         return dVeiculoE;

//     }
    
//     public static float getdVeiculoM(){


//         return dVeiculoM;

//     }
    
//     public void cadastrarVeiculo() { //Aqui que os veículo(s) serão registrados, com uma referência para quando necessitar de referir a eles para pesquisa.
    	
//     }

//     public void cadastraValoresAluguel(){
       
       
    
//    }
    
//     // Referência "diariaVeiculo" do tipo ValoresAluguel.
//     //---------------------------------------------------------------------
//     public void escolherDiaria(){
       
    
//    }
    
}
   	
