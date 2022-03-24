/**
 * 
 */
package gerenciarFrotas;

import java.util.Scanner;

public class Veiculo {
	 Scanner sc  = new Scanner(System.in);
	
    String marca, modelo;
    int anoFabricacao, anoModelo, renavam, capacidadeTanque;

    // Referência "diariaVeiculo" do tipo ValoresAluguel.
    //---------------------------------------------------------------------
    public void escolherDiaria(){
       

       ValoresAluguel diariaVeiculo;
       diariaVeiculo = new ValoresAluguel();
       diariaVeiculo.setDiariaN();
       diariaVeiculo.setDiariaR();
       diariaVeiculo.setDiariaE();
       diariaVeiculo.setValorMensal();
    
   }
    
    // A partir daqui, estão todos os métodos.
    //---------------------------------------------------------------------
    public String getMarca(){

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite a marca desejada.\n");
        marca = sc.next();

        return marca;

    }

    public String getModelo(){

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite o modelo desejado.\n");
        modelo = sc.next();

        return modelo;

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

    public int setRenavam(){

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite renavam do veículo.\n");
        renavam = sc.nextInt();

        return renavam;

    }
    
    public int setCapacidadeTanque(){

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite qual a capacidade do tanque do veículo.\n");
        capacidadeTanque = sc.nextInt();

        return capacidadeTanque;
    }
    
    
    
}
   	