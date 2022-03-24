package gerenciarFrotas;

import java.util.Scanner;

public class V_passageiro extends V_utilitario{
	Scanner sc  = new Scanner(System.in);
	
	int maxOcupantes;
	boolean arCondicionado, direcaoHidraulica, tv;
	
	public int getMaxOcupantes(){
        

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite o número máximo de ocupantes.\n");
        maxOcupantes = sc.nextInt();
        
        // capacidadeCarga recebe maxOcupantes se o veículo utilitário for classificado como veículo de passageiro.
        capacidadeCarga = maxOcupantes;
        
        return maxOcupantes;
        
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
	
	public boolean tv(){
        int sel;
        
        do {
        	System.out.println("-------------------------------------");
        	System.out.println(" O veículo possui televisão?.\n");
        	System.out.println(" 1) Sim.\n");
        	System.out.println(" 2) Não.\n");
        	sel = sc.nextInt(); 
        }while(sel > 2 || sel < 1);
        
        if(sel == 1){
        	 tv = true;
        }
        
        if(sel == 2){
        	tv = false;
        }
		
        return tv;
	}
}
