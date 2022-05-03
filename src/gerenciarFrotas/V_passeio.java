package gerenciarFrotas;

//Preparando o enum
enum categoriaPasseio {
	Compacto, Luxo, Sedan, SUV
}
//---------------------------------------------------------------------------
public class V_passeio extends Veiculo {

	boolean arCondicionado, direcaoHidraulica, cambioAutomatico;
  float diariaN, diariaR, diariaE, valorMensal;

	public V_passeio(){

	}

	public V_passeio(String marca, String modelo, String renavam, int anoFabricacao, int anoModelo, int capacidadeTanque, boolean arCondicionado, boolean direcaoHidraulica, boolean cambioAutomatico, float[] valoresDiarias) {
		setMarca(marca);
		setModelo(modelo);
		setRenavam(renavam);
		setAnoFabricacao(anoFabricacao);
		setAnoModelo(anoModelo);
		setCapacidadeTanque(capacidadeTanque);
		setArCondicionado(arCondicionado);
		setDirecaoHidraulica(direcaoHidraulica);
		setCambioAutomatico(cambioAutomatico);
    setDiariaN(valoresDiarias[0]);
    setDiariaR(valoresDiarias[1]);
    setDiariaE(valoresDiarias[2]);
    setValorMensal(valoresDiarias[3]);
    // valoresAluguel.setDiariaN(valoresDiarias[0]);
    // valoresAluguel.setDiariaR(valoresDiarias[1]);
    // valoresAluguel.setDiariaE(valoresDiarias[2]);
    // valoresAluguel.setValorMensal(valoresDiarias[3]);
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public boolean getArCondicionado() {
		return arCondicionado;
	}

	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}
	public boolean getDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}
	public boolean getCambioAutomatico() {
		return cambioAutomatico;
	}

}









	// static Scanner sc  = new Scanner(System.in);
	
	// boolean arCondicionado, direcaoHidraulica, cambioAutomatico;
	
	
//Preparando o vetor de strings do Enum	
	// String[] categoriaPasseio = {"Compacto", "Luxo", "Sedan", "SUV"};

	// public void escolherCategoriaPasseio() {		

	// }
	
	// public boolean arCondicionado(){
  //       int sel;
        
  //       do {
  //       	System.out.println("-------------------------------------");
  //       	System.out.println(" O veículo possui arcondicionado?.\n");
  //       	System.out.println(" 1) Sim.\n");
  //       	System.out.println(" 2) Não.\n");
  //       	sel = sc.nextInt(); 
  //       }while(sel > 2 || sel < 1);
        
  //       if(sel == 1){
  //       	 arCondicionado = true;
  //       }
        
  //       if(sel == 2){
  //       	arCondicionado = false;
  //       }
		
  //       return arCondicionado;
	// }
	
	// public boolean direcaoHidraulica(){
  //       int sel;
        
  //       do {
  //       	System.out.println("-------------------------------------");
  //       	System.out.println(" O veículo possui direção hidráulica?.\n");
  //       	System.out.println(" 1) Sim.\n");
  //       	System.out.println(" 2) Não.\n");
  //       	sel = sc.nextInt(); 
  //       }while(sel > 2 || sel < 1);
        
  //       if(sel == 1){
  //       	 direcaoHidraulica = true;
  //       }
        
  //       if(sel == 2){
  //       	direcaoHidraulica = false;
  //       }
		
  //       return direcaoHidraulica;
	// }
	
	// public boolean cambioAutomatico(){
  //       int sel;
        
  //       do {
  //       	System.out.println("-------------------------------------");
  //       	System.out.println(" O veículo possui câmbio automático?.\n");
  //       	System.out.println(" 1) Sim.\n");
  //       	System.out.println(" 2) Não.\n");
  //       	sel = sc.nextInt(); 
  //       }while(sel > 2 || sel < 1);
        
  //       if(sel == 1){
  //       	 cambioAutomatico = true;
  //       }
        
  //       if(sel == 2){
  //       	cambioAutomatico = false;
  //       }
		
  //       return cambioAutomatico;
	// }
	
	
  // }