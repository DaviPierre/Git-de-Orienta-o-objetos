package gerenciarFrotas;

import java.util.Scanner;

//Preparando o enum
enum categoriaPasseio {
	Compacto, Luxo, Sedan, SUV
}
//---------------------------------------------------------------------------
public class V_passeio extends Veiculo {
	static Scanner sc  = new Scanner(System.in);
	
	boolean arCondicionado, direcaoHidraulica, cambioAutomatico;
	
	
//Preparando o vetor de strings do Enum	
	static String[] categoriaPasseio = {"Compacto", "Luxo", "Sedan", "SUV"};

	public static String escolherCategoriaPasseio() {		
		int sel;
		do {
			System.out.println("-------------------------------------");
        	System.out.println(" Por favor, digite o tipo do seu veículo de passeio.\n");
        	System.out.println(" 1 - Compacto\n");
        	System.out.println(" 2 - Luxo\n");
        	System.out.println(" 3 - Sedan\n");
        	System.out.println(" 4 - SUV\n");
        	sel = sc.nextInt();
		}while(sel > 4 || sel < 1);
		
		System.out.println(categoriaPasseio[sel-1]);
		return  categoriaPasseio[sel-1];
	}
	
	public boolean arCondicionado(){
        int sel;
        
        do {
        	System.out.println("-------------------------------------");
        	System.out.println(" O veículo possui arcondicionado?.\n");
        	System.out.println(" 1) Sim.\n");
        	System.out.println(" 2) Não.\n");
        	sel = sc.nextInt(); 
        }while(sel > 2 || sel < 1);
        
        if(sel == 1){
        	 arCondicionado = true;
        }
        
        if(sel == 2){
        	arCondicionado = false;
        }
		
        return arCondicionado;
	}
	
	public boolean direcaoHidraulica(){
        int sel;
        
        do {
        	System.out.println("-------------------------------------");
        	System.out.println(" O veículo possui direção hidráulica?.\n");
        	System.out.println(" 1) Sim.\n");
        	System.out.println(" 2) Não.\n");
        	sel = sc.nextInt(); 
        }while(sel > 2 || sel < 1);
        
        if(sel == 1){
        	 direcaoHidraulica = true;
        }
        
        if(sel == 2){
        	direcaoHidraulica = false;
        }
		
        return direcaoHidraulica;
	}
	
	public boolean cambioAutomatico(){
        int sel;
        
        do {
        	System.out.println("-------------------------------------");
        	System.out.println(" O veículo possui câmbio automático?.\n");
        	System.out.println(" 1) Sim.\n");
        	System.out.println(" 2) Não.\n");
        	sel = sc.nextInt(); 
        }while(sel > 2 || sel < 1);
        
        if(sel == 1){
        	 cambioAutomatico = true;
        }
        
        if(sel == 2){
        	cambioAutomatico = false;
        }
		
        return cambioAutomatico;
	}
	
	
  }