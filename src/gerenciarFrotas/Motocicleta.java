package gerenciarFrotas;

import java.util.Scanner;

enum motoPilotagem{Cidade, Estrada, Sport, OffRoad}

	public class Motocicleta extends Veiculo{
	    Scanner sc  = new Scanner(System.in);
   
        boolean controleTracao, freiosABS, pilotoAutomatico;

        public Motocicleta() {
            
        }
        
        public Motocicleta(String marca){
            setMarca(marca);
        }
        
        public boolean setControleTracao(){
            boolean controleTracao = false;
            int decisao;
            System.out.println("--------------------------");
            System.out.println("Sua motocicleta tem controle de tração?: \n Digite 1 para sim e 2 para não:\n");
            decisao = sc.nextInt();
            while (decisao != 1 && decisao != 2){
            if (decisao == 1) {controleTracao = true;}
            if (decisao == 2) {controleTracao = false;}
            else{
            System.out.println("Erro, por favor tente novamente: \n");
            decisao = sc.nextInt();
                }
            }
            return controleTracao;
        }
            
        public boolean setFreiosABS(){
            boolean freiosABS = false;
            int decisao;
            System.out.println("--------------------------");
            System.out.println("Sua motocicleta tem freio ABS?: \n Digite 1 para sim e 2 para não:\n");
            decisao = sc.nextInt();
            while (decisao != 1 && decisao != 2){
            if (decisao == 1) {freiosABS = true;}
            if (decisao == 2) {freiosABS = false;}
            else{
            System.out.println("Erro, por favor tente novamente: \n");
            decisao = sc.nextInt();
            }
            }
            return freiosABS;
        }
            
        public boolean setPilotoAutomatico(){
            boolean pilotoAutomatico = false;
            int decisao;
            System.out.println("--------------------------");
            System.out.println("Sua motocicleta tem piloto automático?: \n Digite 1 para sim e 2 para não:\n");
            decisao = sc.nextInt();
            while (decisao != 1 && decisao != 2){
            if (decisao == 1) {pilotoAutomatico = true;}
            if (decisao == 2) {pilotoAutomatico = false;}
            else{
            System.out.println("Erro, por favor tente novamente: \n");
            decisao = sc.nextInt();
            }
            }
            return pilotoAutomatico;
        }
        
        static String[] motoPilotagem = {"Cidade", "Estrada", "Sport", "OffRoad"};
    
        public String setMotoPilotagem(){
            int tipoPilotagem;
            do{
            System.out.println("--------------------------");
            System.out.println("Por favor insira o tipo de terreno da sua motocicleta:"
                            + "\nDigite 1 para Cidade"
                            + "\nDigite 2 para Estrada"
                            + "\nDigite 3 para Sport"
                            + "\nDigite 4 para OffRoad");
            tipoPilotagem = sc.nextInt();
            }while(tipoPilotagem > 4 || tipoPilotagem < 1);
            System.out.println(motoPilotagem[tipoPilotagem - 1]);
            return motoPilotagem[tipoPilotagem - 1];        
        }
    
}
