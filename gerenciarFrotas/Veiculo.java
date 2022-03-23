/**
 * 
 */
package gerenciarFrotas;

import java.util.Scanner;

public class Veiculo {

    String marca, modelo;
    int anoFabricacao, anoModelo, renavam, capacidadeTanque;

    // Referência "diariaVeiculo" do tipo ValoresAluguel.
    //---------------------------------------------------------------------
    public void escolherDiaria(){
        Scanner sc  = new Scanner(System.in);

       ValoresAluguel diariaVeiculo;
       diariaVeiculo = new ValoresAluguel();
    
   }
    
    // A partir daqui, estão todos os métodos.
    //---------------------------------------------------------------------
    public String getMarca(){
        Scanner sc  = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite a marca desejada.\n");
        marca = sc.next();

        return marca;

    }

    public String getModelo(){
        Scanner sc  = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite o modelo desejado.\n");
        modelo = sc.next();

        return modelo;

    }

    public int getAnoFabricacao(){
        Scanner sc  = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite o ano de fabricação do veículo.\n");
        anoFabricacao = sc.nextInt();

        return anoFabricacao;

    }

    public int getAnoModelo(){
        Scanner sc  = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite o ano do modelo do veículo.\n");
        anoModelo = sc.nextInt();

        return anoModelo;

    }

    public int setRenavam(){
        Scanner sc  = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite renavam do veículo.\n");
        renavam = sc.nextInt();

        return renavam;

    }
    
    public int setCapacidadeTanque(){
        Scanner sc  = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println(" Por favor, digite qual a capacidade do tanque do veículo.\n");
        capacidadeTanque = sc.nextInt();

        return capacidadeTanque;
    }
    
    
    
}
   	