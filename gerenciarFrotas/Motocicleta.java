package gerenciarFrotas;

import java.util.Scanner;

enum motoPilotagem{Cidade, Estrada, Sport, OffRoad}

	public class Motocicleta extends Veiculo{
	 Scanner sc  = new Scanner(System.in);
   
	 public boolean setControleTracao(){
        boolean controleTracao = false;
        controleTracao = sc.nextBoolean();
        return controleTracao;
    }
    public boolean setFreiosABS(){
        boolean freiosABS;
        freiosABS = sc.nextBoolean();
        return freiosABS;
    }
    public boolean setPilotoAutomático(){
        boolean pilotoAutomatico;
        pilotoAutomatico =  sc.nextBoolean();
        return pilotoAutomatico;
    }
    
    static String[] motoPilotagem = {"Cidade", "Estrada", "Sport", "OffRoad"};
   
    public int setMotoPilotagem(){
        int tipoPilotagem;
        tipoPilotagem = sc.nextInt();
        return tipoPilotagem;        
    }
    
}